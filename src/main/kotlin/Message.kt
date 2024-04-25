package org.example

class ErrorMsg : Msg {
    override fun msg() {
        println("Error : 입력을 확인해주세요")
    }
}

class NumMsg : Msg {
    override fun msg() {
        println("숫자를 입력하세요")
    }
}

class SymMsg : Msg {
    override fun msg() {
        println("알맞은 기호를 입력하세요 ( + , - , * , / , % )")
    }
}


