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
    val numfilt = NumberFilter()
    val symfilt = SymbolFilter()

    println("계산기입니다")

    while (true) {
        val x = numfilt.filter()
        val z = symfilt.filter()
        val y: Double = numfilt.filter()

        val answer = oper(z, x, y)
        println("답 : $answer ")

        println("계속 계산하시려면 '1'을 종료하시려면 아무 키나 입력해 주세요")
        val input: String = readln()
        if (input != "1") {
            break
        }
    }
}