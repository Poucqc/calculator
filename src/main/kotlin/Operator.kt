package org.example

class Add : Operator() {
    override fun operate(x: Double, y: Double): Double {
        return x + y
    }
}

class Sub : Operator() {
    override fun operate(x: Double, y: Double): Double {
        return x - y
    }
}

class Mul : Operator() {
    override fun operate(x: Double, y: Double): Double {
        return x * y
    }
}

class Div : Operator() {
    override fun operate(x: Double, y: Double): Double {
        try {
            return x / y
        } catch (e: Exception) {
            print("분모는 0이 될 수 없습니다")
            return 0.0
        }
    }
}

class Mod : Operator() {
    override fun operate(x: Double, y: Double): Double {
        try {
            return x % y
        } catch (e: Exception) {
            print("분모는 0이 될 수 없습니다")
            return 0.0
        }
    }
}