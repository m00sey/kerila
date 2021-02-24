import com.google.crypto.tink.Aead
import com.google.crypto.tink.subtle.Ed25519Sign
import derivation.Derivation

private class key(val PublicKey: Array[Byte],
                  val PrivateKey: Array[Byte],
                  val PrivateKeyDerivation: Derivation,
                  val Signer: Ed25519Sign) {
}

class KeyManager(db: database.Databasing, secrets: Array[String], aead: Aead) {
  println(db.get("hihi"))
}