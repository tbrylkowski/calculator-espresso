package com.simplemobiletools.calculator.tests.activity

import com.simplemobiletools.calculator.activities.MainActivity
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.simplemobiletools.calculator.pageobject.pages.CalculatorPage
import com.simplemobiletools.calculator.pageobject.BaseObject
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val testRule = ActivityTestRule(MainActivity::class.java)

    private val firstNumber = Random().nextInt(10)
    private val secondNumber = Random().nextInt(10)

    @Test
    fun addTest() {
        BaseObject.on<CalculatorPage>()
                .press(firstNumber)
                .plus(secondNumber)
                .checkResult(firstNumber + secondNumber)
                .checkFormula("$firstNumber+$secondNumber")
    }

    @Test
    fun minusTest() {
        BaseObject.on<CalculatorPage>()
                .press(firstNumber)
                .minus(secondNumber)
                .checkResult(firstNumber - secondNumber)
                .checkFormula("$firstNumber-$secondNumber")
    }

    @Test
    fun divideTest() {
        BaseObject.on<CalculatorPage>()
                .press(8)
                .divide(4)
                .checkResult(2)
                .checkFormula("8/4")
    }

    @Test
    fun multiplyTest() {
        BaseObject.on<CalculatorPage>()
                .press(firstNumber)
                .multiply(secondNumber)
                .checkResult(firstNumber * secondNumber)
                .checkFormula("$firstNumber*$secondNumber")
    }

    @Test
    fun clearTest() {
        BaseObject.on<CalculatorPage>()
                .press(3)
                .checkResult(3)
                .clear()
                .checkResult(0)
    }

    @Test
    fun commaTest() {
        BaseObject.on<CalculatorPage>()
                .press(3)
                .comma()
                .press(2)
                .checkResult("3.2")
                .plus(2)
                .checkResult(5.2)
                .checkFormula("3.2+2")
    }

    @Test
    fun powerTest() {
        BaseObject.on<CalculatorPage>()
                .press(4)
                .power(4)
                .checkResult(256)
                .checkFormula("4^4")
    }

    @Test
    fun rootTest() {
        BaseObject.on<CalculatorPage>()
                .press(1)
                .press(6)
                .root()
                .checkResult(4)
                .checkFormula("√16")
    }

    @Test
    fun percentTest() {
        BaseObject.on<CalculatorPage>()
                .press(1)
                .press(0)
                .percent(2)
                .checkResult(0.2)
                .checkFormula("10%2")
    }

    @Test
    fun checkNumbersTest() {
        for (x in 1 until 10) {
            BaseObject.on<CalculatorPage>()
                    .press(x)
        }
        BaseObject.on<CalculatorPage>()
                .press(0)
                .checkResult("1,234,567,890")
    }

    @Test
    fun clearFormulaTest() {
        BaseObject.on<CalculatorPage>()
                .press(1)
                .multiply(4)
                .checkFormula("1*4")
                .clearLongPress()
                .checkFormula("")
    }
}
