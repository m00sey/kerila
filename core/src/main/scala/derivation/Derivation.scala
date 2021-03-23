package derivation

import java.util.Base64

object Derivation {
  def FromPrefix(str: String): Array[Byte] = {
    Array[Byte]()
  }
}

class Derivation(val Code: Code,
                 val deriver: BasicDeriver,
                 var Raw: Array[Byte],
                 val KeyIndex: Int) {

  def Derive(derive: Array[Byte] => Array[Byte]): Array[Byte] = {
    derive(this.Raw)
  }

  def AsPrefix(): String = {
    Code.string + Base64.getEncoder.encodeToString(Raw).substring(0, Code.prefixBase64Length - Code.length)
  }: String
}

trait Deriver {
  def deriver(raw: Array[Byte]): Array[Byte]
}

trait BasicDeriver extends Deriver {
  def deriver(raw: Array[Byte]): Array[Byte] = {
    raw
  }
}