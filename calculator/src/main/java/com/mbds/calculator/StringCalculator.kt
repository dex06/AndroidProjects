package com.mbds.calculator

class StringCalculator {

    fun calculate(calculationList: List<String>): Double {
        var currentOp: String = ""
        var currentNumber = 0.00

            calculationList.forEach { token ->
                when {
                    token.equals("+")
                            || token.equals("/")
                            || token.equals("÷")
                            || token.equals("*")
                            || token.equals("-") -> currentOp = token

                    currentOp.equals("-") -> currentNumber -= token.toDouble()

                    currentOp.equals("/") -> currentNumber /= token.toDouble()
                    currentOp.equals("÷") -> currentNumber /= token.toDouble()



                    currentOp.equals("*") -> currentNumber *= token.toDouble()
                    else -> currentNumber += token.toDouble()

                }
            }


        return currentNumber
    }
}