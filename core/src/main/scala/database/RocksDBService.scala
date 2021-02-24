package database

import org.rocksdb.util.SizeUnit
import org.rocksdb.{CompactionStyle, CompressionType, Options, RocksDB}

import java.io.File

class RocksDBService(dbName: String) extends Databasing {

  val UTF8: String = "UTF-8"
  var isOpen: Boolean = false
  private val tmpFile = File.createTempFile(dbName + "-rocksdb", ".db")
  private val tmpFileName = tmpFile.getAbsolutePath
  tmpFile.delete

  RocksDB.loadLibrary()

  private val options = new Options().setCreateIfMissing(true)
    .createStatistics()
    .setWriteBufferSize(200 * SizeUnit.MB)
    .setMaxWriteBufferNumber(3)
    .setMaxBackgroundCompactions(10)
    .setCompressionType(CompressionType.SNAPPY_COMPRESSION)
    .setCompactionStyle(CompactionStyle.UNIVERSAL)

  private val store = RocksDB.open(options, tmpFileName)

  override def get(key: String): Array[Byte] = {
    println(key)
    testy
    store.get(key.getBytes)
  }

  override def put(key: String, value: Array[Byte]): Unit = {
    println(key)
    println(value.mkString("Array(", ", ", ")"))
    store.put(key.getBytes, value)
  }

  def testy ={
    println("testy")
    store.put("k1".getBytes, "foo".getBytes)
    store.put("k1".getBytes , "bar".getBytes)

    val out = store.get("k1".getBytes)
    println((out.map(_.toChar)).mkString)
    println("hihihi")
  }
}
