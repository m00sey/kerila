import com.google.crypto.tink.aead.{AeadConfig, AesGcmKeyManager}
import com.google.crypto.tink.{Aead, KeysetHandle}
import database.RocksDBService
import direct.Client

object Bob extends App {
  val secrets = Array(
    "ArwXoACJgOleVZ2PY7kXn7rA0II0mHYDhc6WrBH8fDAc",
    "A6zz7M08-HQSFq92sJ8KJOT2cZ47x7pXFQLPB0pckB3Q",
    "AcwFTk-wgk3ZT2buPRIbK-zxgPx-TKbaegQvPEivN90Y",
    "Alntkt3u6dDgiQxTATr01dy8M72uuaZEf9eTdM-70Gk8",
    "A1-QxDkso9-MR1A8rZz_Naw6fgaAtayda8hrbkRVVu1E",
    "AKuYMe09COczwf2nIoD5AE119n7GLFOVFlNLxZcKuswc",
    "AxFfJTcSuEE11FINfXMqWttkZGnUZ8KaREhrnyAXTsjw",
    "ALq-w1UKkdrppwZzGTtz4PWYEeWm0-sDHzOv5sq96xJY",
  )

  val db = new RocksDBService("keri-bob")

  AeadConfig.register()
  val aead = KeysetHandle.generateNew(AesGcmKeyManager.aes256GcmTemplate).getPrimitive(classOf[Aead])

  val km = new KeyManager(db, secrets, aead)

//  val dc = new Client("127.0.0.1:4675", )

  //initialize direct mode

  println(km)
}
