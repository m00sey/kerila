package derivation

import enumeratum._

sealed abstract class Code(val name: String,
                           val string: String,
                           val dataLength: Int,
                           val prefixBase64Length: Int,
                           val prefixDataLength: Int,
                           val selfAddressing: Boolean = false,
                           val selfSigning: Boolean = false,
                           val basic: Boolean = false,
                           val attachedSignature: Boolean = false,
                          ) extends EnumEntry {

  def length: Int = {
    this.string.length
  }

  def default: String = {
    "#" * this.prefixBase64Length
  }
}

case object Code extends Enum[Code] {
  val values = findValues

  case object Ed25519Seed extends Code(name = "Ed25519Seed", string = "A", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33)

  case object Ed25519NT extends Code(name = "Ed25519NT", string = "B", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33, basic = true)

  case object X25519 extends Code(name = "X25519", string = "C", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33)

  case object Ed25519 extends Code(name = "Ed25519", string = "D", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33, basic = true)

  case object Blake3256 extends Code(name = "Blake3256", string = "E", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33, selfAddressing = true)

  case object Blake2b256 extends Code(name = "Blake2b256", string = "F", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33, selfAddressing = true)

  case object Blake2s256 extends Code(name = "Blake2s256", string = "G", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33, selfAddressing = true)

  case object SHA3256 extends Code(name = "SHA3256", string = "H", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33, selfAddressing = true)

  case object SHA2256 extends Code(name = "SHA2256", string = "I", dataLength = 32, prefixBase64Length = 44, prefixDataLength = 33, selfAddressing = true)

  case object RandomSeed128 extends Code(name = "RandomSeed128", string = "0A", dataLength = 16, prefixBase64Length = 24, prefixDataLength = 18)

  case object Ed25519Sig extends Code(name = "Ed25519Sig", string = "0B", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64, selfSigning = true)

  case object EcDSASig extends Code(name = "EcDSASig", string = "0C", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64)

  case object Blake3512 extends Code(name = "Blake3512", string = "0D", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64, selfAddressing = true)

  case object SHA3512 extends Code(name = "SHA3512", string = "0E", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64, selfAddressing = true)

  case object Blake2b512 extends Code(name = "Blake2b512", string = "0F", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64, selfAddressing = true)

  case object SHA2512 extends Code(name = "SHA2512", string = "0G", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64, selfAddressing = true)

  case object Ed25519Attached extends Code(name = "Ed25519Attached", string = "AX", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64, attachedSignature = true)

  case object EcDSAAttached extends Code(name = "EcDSAAttached", string = "BX", dataLength = 64, prefixBase64Length = 88, prefixDataLength = 64, attachedSignature = true)

}