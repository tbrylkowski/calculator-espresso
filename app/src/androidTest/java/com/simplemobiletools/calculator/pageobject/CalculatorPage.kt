package com.simplemobiletools.calculator.pageobject

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.simplemobiletools.calculator.R


class CalculatorPage() : AbstractPageClass(CalculatorPageTitle) {
    private val equalButton = onView(withId(R.id.btn_equals))
    private val divideButton = onView(withId(R.id.btn_divide))
    private val minuButton = onView(withId(R.id.btn_minus))
    private val multiplyButton = onView(withId(R.id.btn_multiply))
    private val plusButton = onView(withId(R.id.btn_plus))
    private val percentButton = onView(withId(R.id.btn_percent))
    private val powerButton = onView(withId(R.id.btn_power))
    private val rootButton = onView(withId(R.id.btn_root))
    private val clearButton = onView(withId(R.id.btn_clear))
    private val decimalButton = onView(withId(R.id.btn_decimal))

    private val zeroButton = onView(withId(R.id.btn_0))
    private val oneButton = onView(withId(R.id.btn_1))
    private val twoButton = onView(withId(R.id.btn_2))
    private val threeButton = onView(withId(R.id.btn_3))
    private val fourButton = onView(withId(R.id.btn_4))
    private val fiveButton = onView(withId(R.id.btn_5))
    private val sixButton = onView(withId(R.id.btn_6))
    private val sevenButton = onView(withId(R.id.btn_7))
    private val eighthButton = onView(withId(R.id.btn_8))
    private val nineButton = onView(withId(R.id.btn_9))

    private val numbers = mapOf<Int, ViewInteraction>(
            0 to zeroButton,
            1 to oneButton,
            2 to twoButton,
            3 to threeButton,
            4 to fourButton,
            5 to fiveButton,
            6 to sixButton,
            7 to sevenButton,
            8 to eighthButton,
            9 to nineButton)

    fun checkResult(number: Any): CalculatorPage {
        onView(withId(R.id.result)).check(matches(withText(number.toString())))
        return this
    }

    fun enter(number: Int): CalculatorPage {
        press(numbers[number])
        return this
    }

    fun plus(number: Int): CalculatorPage {
        calculate(number, operationButton = plusButton)
        return this
    }

    fun minus(number: Int): CalculatorPage {
        calculate(number, operationButton = minuButton)
        return this
    }

    fun divide(number: Int): CalculatorPage {
        calculate(number, operationButton = divideButton)
        return this
    }

    fun multiply(number: Int): CalculatorPage {
        calculate(number, operationButton = multiplyButton)
        return this
    }

    fun clear(): CalculatorPage{
        press(clearButton)
        return this
    }

    fun comma(): CalculatorPage {
        press(decimalButton)
        return this
    }

    fun power(number: Int): CalculatorPage {
        calculate(number, operationButton = powerButton)
        return this
    }

    fun root(): CalculatorPage {
        press(rootButton)
        return this
    }

    private fun calculate(number: Int, operationButton: ViewInteraction): CalculatorPage {
        press(operationButton)
        press(numbers[number])
        press(equalButton)
        return this
    }


    companion object {
        const val CalculatorPageTitle = "Calculator_debug"
    }
}

