package derivation

import derivation.Code.Ed25519
import org.scalatest.funsuite.AnyFunSuite

class CodeSpec extends AnyFunSuite {
  test("Ed25519Seed is correct") {
    assert(Code.Ed25519Seed.name.equals("Ed25519Seed"))
    assert(Code.Ed25519Seed.string.equals("A"))
    assert(Code.Ed25519Seed.dataLength.equals(32))
    assert(Code.Ed25519Seed.prefixBase64Length.equals(44))
    assert(Code.Ed25519Seed.prefixDataLength.equals(33))
    assert(Code.Ed25519Seed.length.equals(1))
    assert(Code.Ed25519Seed.default.equals("############################################"))
  }

  test("Ed25519NT is correct") {
    assert(Code.Ed25519NT.name.equals("Ed25519NT"))
    assert(Code.Ed25519NT.string.equals("B"))
    assert(Code.Ed25519NT.dataLength.equals(32))
    assert(Code.Ed25519NT.prefixBase64Length.equals(44))
    assert(Code.Ed25519NT.prefixDataLength.equals(33))
    assert(Code.Ed25519NT.length.equals(1))
    assert(Code.Ed25519NT.default.equals("############################################"))
  }

  test("X25519 is correct") {
    assert(Code.X25519.name.equals("X25519"))
    assert(Code.X25519.string.equals("C"))
    assert(Code.X25519.dataLength.equals(32))
    assert(Code.X25519.prefixBase64Length.equals(44))
    assert(Code.X25519.prefixDataLength.equals(33))
    assert(Code.X25519.length.equals(1))
    assert(Code.X25519.default.equals("############################################"))
  }

  test("Ed25519 is correct") {
    assert(Code.Ed25519.name.equals("Ed25519"))
    assert(Code.Ed25519.string.equals("D"))
    assert(Code.Ed25519.dataLength.equals(32))
    assert(Code.Ed25519.prefixBase64Length.equals(44))
    assert(Code.Ed25519.prefixDataLength.equals(33))
    assert(Code.Ed25519.length.equals(1))
    assert(Code.Ed25519.default.equals("############################################"))
  }

  test("Blake3256 is correct") {
    assert(Code.Blake3256.name.equals("Blake3256"))
    assert(Code.Blake3256.string.equals("E"))
    assert(Code.Blake3256.dataLength.equals(32))
    assert(Code.Blake3256.prefixBase64Length.equals(44))
    assert(Code.Blake3256.prefixDataLength.equals(33))
    assert(Code.Blake3256.length.equals(1))
    assert(Code.Blake3256.default.equals("############################################"))
  }

  test("Blake2b256 is correct") {
    assert(Code.Blake2b256.name.equals("Blake2b256"))
    assert(Code.Blake2b256.string.equals("F"))
    assert(Code.Blake2b256.dataLength.equals(32))
    assert(Code.Blake2b256.prefixBase64Length.equals(44))
    assert(Code.Blake2b256.prefixDataLength.equals(33))
    assert(Code.Blake2b256.length.equals(1))
    assert(Code.Blake2b256.default.equals("############################################"))
  }

  test("Blake2s256 is correct") {
    assert(Code.Blake2s256.name.equals("Blake2s256"))
    assert(Code.Blake2s256.string.equals("G"))
    assert(Code.Blake2s256.dataLength.equals(32))
    assert(Code.Blake2s256.prefixBase64Length.equals(44))
    assert(Code.Blake2s256.prefixDataLength.equals(33))
    assert(Code.Blake2s256.length.equals(1))
    assert(Code.Blake2s256.default.equals("############################################"))
  }

  test("SHA3256 is correct") {
    assert(Code.SHA3256.name.equals("SHA3256"))
    assert(Code.SHA3256.string.equals("H"))
    assert(Code.SHA3256.dataLength.equals(32))
    assert(Code.SHA3256.prefixBase64Length.equals(44))
    assert(Code.SHA3256.prefixDataLength.equals(33))
    assert(Code.SHA3256.length.equals(1))
    assert(Code.SHA3256.default.equals("############################################"))
  }

  test("SHA2256 is correct") {
    assert(Code.SHA2256.name.equals("SHA2256"))
    assert(Code.SHA2256.string.equals("I"))
    assert(Code.SHA2256.dataLength.equals(32))
    assert(Code.SHA2256.prefixBase64Length.equals(44))
    assert(Code.SHA2256.prefixDataLength.equals(33))
    assert(Code.SHA2256.length.equals(1))
    assert(Code.SHA2256.default.equals("############################################"))
  }

  test("RandomSeed128 is correct") {
    assert(Code.RandomSeed128.name.equals("RandomSeed128"))
    assert(Code.RandomSeed128.string.equals("0A"))
    assert(Code.RandomSeed128.dataLength.equals(16))
    assert(Code.RandomSeed128.prefixBase64Length.equals(24))
    assert(Code.RandomSeed128.prefixDataLength.equals(18))
    assert(Code.RandomSeed128.length.equals(2))
    assert(Code.RandomSeed128.default.equals("########################"))

  }

  test("Ed25519Sig is correct") {
    assert(Code.Ed25519Sig.name.equals("Ed25519Sig"))
    assert(Code.Ed25519Sig.string.equals("0B"))
    assert(Code.Ed25519Sig.dataLength.equals(64))
    assert(Code.Ed25519Sig.prefixBase64Length.equals(88))
    assert(Code.Ed25519Sig.prefixDataLength.equals(64))
    assert(Code.Ed25519Sig.length.equals(2))
    assert(Code.Ed25519Sig.default.equals("########################################################################################"))
  }

  test("EcDSASig is correct") {
    assert(Code.EcDSASig.name.equals("EcDSASig"))
    assert(Code.EcDSASig.string.equals("0C"))
    assert(Code.EcDSASig.dataLength.equals(64))
    assert(Code.EcDSASig.prefixBase64Length.equals(88))
    assert(Code.EcDSASig.prefixDataLength.equals(64))
    assert(Code.EcDSASig.length.equals(2))
    assert(Code.EcDSASig.default.equals("########################################################################################"))
  }

  test("Blake3512 is correct") {
    assert(Code.Blake3512.name.equals("Blake3512"))
    assert(Code.Blake3512.string.equals("0D"))
    assert(Code.Blake3512.dataLength.equals(64))
    assert(Code.Blake3512.prefixBase64Length.equals(88))
    assert(Code.Blake3512.prefixDataLength.equals(64))
    assert(Code.Blake3512.length.equals(2))
    assert(Code.Blake3512.default.equals("########################################################################################"))
  }

  test("SHA3512 is correct") {
    assert(Code.SHA3512.name.equals("SHA3512"))
    assert(Code.SHA3512.string.equals("0E"))
    assert(Code.SHA3512.dataLength.equals(64))
    assert(Code.SHA3512.prefixBase64Length.equals(88))
    assert(Code.SHA3512.prefixDataLength.equals(64))
    assert(Code.SHA3512.length.equals(2))
    assert(Code.SHA3512.default.equals("########################################################################################"))
  }

  test("Blake2b512 is correct") {
    assert(Code.Blake2b512.name.equals("Blake2b512"))
    assert(Code.Blake2b512.string.equals("0F"))
    assert(Code.Blake2b512.dataLength.equals(64))
    assert(Code.Blake2b512.prefixBase64Length.equals(88))
    assert(Code.Blake2b512.prefixDataLength.equals(64))
    assert(Code.Blake2b512.length.equals(2))
    assert(Code.Blake2b512.default.equals("########################################################################################"))
  }

  test("SHA2512 is correct") {
    assert(Code.SHA2512.name.equals("SHA2512"))
    assert(Code.SHA2512.string.equals("0G"))
    assert(Code.SHA2512.dataLength.equals(64))
    assert(Code.SHA2512.prefixBase64Length.equals(88))
    assert(Code.SHA2512.prefixDataLength.equals(64))
    assert(Code.SHA2512.length.equals(2))
    assert(Code.SHA2512.default.equals("########################################################################################"))
  }

  test("Ed25519Attached is correct") {
    assert(Code.Ed25519Attached.name.equals("Ed25519Attached"))
    assert(Code.Ed25519Attached.string.equals("AX"))
    assert(Code.Ed25519Attached.dataLength.equals(64))
    assert(Code.Ed25519Attached.prefixBase64Length.equals(88))
    assert(Code.Ed25519Attached.prefixDataLength.equals(64))
    assert(Code.Ed25519Attached.length.equals(2))
    assert(Code.Ed25519Attached.default.equals("########################################################################################"))
  }

  test("EcDSAAttached is correct") {
    assert(Code.EcDSAAttached.name.equals("EcDSAAttached"))
    assert(Code.EcDSAAttached.string.equals("BX"))
    assert(Code.EcDSAAttached.dataLength.equals(64))
    assert(Code.EcDSAAttached.prefixBase64Length.equals(88))
    assert(Code.EcDSAAttached.prefixDataLength.equals(64))
    assert(Code.EcDSAAttached.length.equals(2))
    assert(Code.EcDSAAttached.default.equals("########################################################################################"))
  }

  test("self addressing") {
    Code.Ed25519.is
    assert(Ed2551)
  }
}