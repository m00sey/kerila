package database

trait Databasing {
  def get(key: String): Array[Byte]

  def put(key: String, array: Array[Byte])
}


