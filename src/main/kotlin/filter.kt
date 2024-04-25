package org.example

abstract class Filter {
    abstract fun filter () : Any?
}

class NumberFilter : Filter() {
    override fun filter () : Double {
        var input: Double? = null
        while (input == null) {
            val nm = NumMsg()
            nm.msg()
            input = readln().toDoubleOrNull()
        }
        return input
    }
}

class SymbolFilter : Filter() {
    override fun filter () : Char {
        var input: Char? = null
        val em = ErrorMsg()
        while (input == null || input != '+' && input != '-' && input != '*' && input != '/' && input != '%' ) {
            val sm = SymMsg()
            sm.msg()
            input = readln().firstOrNull()
        }
        em.msg()
        return input
    }
}