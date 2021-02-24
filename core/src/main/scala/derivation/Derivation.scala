package derivation

class Derivation(val Code: Int,
                 val deriver: Array[Byte] => (Array[Byte], Error),
                 val Raw: Array[Byte],
                 val KeyIndex: Int) {

}