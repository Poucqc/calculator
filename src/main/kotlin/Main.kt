package org.example


fun oper(z: Char, x: Double, y: Double) {
    val Add = Add()
    val Sub = Sub()
    val Mul = Mul()
    val Div = Div()
    val Mod = Mod()
    when (z) {
        '+' -> Add.operate(x, y)
        '-' -> Sub.operate(x, y)
        '*' -> Mul.operate(x, y)
        '/' -> Div.operate(x, y)
        '%' -> Mod.operate(x, y)
    }
}

    fun main() {
        println("계산기입니다")

        val errorMsg = ErrorMsg()
        val numMsg = NumMsg()
        val symMsg = SymMsg()
        val numfilt = NumberFilter()
        val symfilt = SymbolFilter()

        numMsg.msg()
        var x = numfilt.filter()

        symMsg.msg()
        var z = symfilt.filter()

        numMsg.msg()
        var y: Double = numfilt.filter()

        val answer = oper(z, x, y)
        println(answer)
    }
