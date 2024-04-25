package org.example


fun oper(z: Char, x: Double, y: Double): Double {
    val Add = Add()
    val Sub = Sub()
    val Mul = Mul()
    val Div = Div()
    val Mod = Mod()
    return when (z) {
        '+' -> Add.operate(x, y)
        '-' -> Sub.operate(x, y)
        '*' -> Mul.operate(x, y)
        '/' -> Div.operate(x, y)
        '%' -> Mod.operate(x, y)
        else -> throw IllegalArgumentException("$z")
    }
}

    fun main() {
        val errorMsg = ErrorMsg()
        val numfilt = NumberFilter()
        val symfilt = SymbolFilter()

        println("계산기입니다")

        var x = numfilt.filter()
        var z = symfilt.filter()
        var y: Double = numfilt.filter()

        val answer  = oper(z, x, y)
        println(answer)
    }
