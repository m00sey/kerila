package derivation

import derivation.Code.Ed25519Seed
import org.scalatest.funsuite.AnyFunSuite

class DerivationSpec extends AnyFunSuite {
  test("AsPrefix") {
    Ed25519Seed.isSelfAddressing
    Code.isSelfAddressing
    val d = Code.Ed25519
    d.isInstanceOf
  }
}
