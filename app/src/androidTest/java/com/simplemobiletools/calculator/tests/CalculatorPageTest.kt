package com.simplemobiletools.calculator.tests

import com.simplemobiletools.calculator.activities.MainActivity
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.simplemobiletools.calculator.pageobject.CalculatorPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*


@RunWith(AndroidJUnit4::class)
class CalculatorPageTest {
    private val firstNumber = Random().nextInt(10)
    private val secondNumber = Random().nextInt(10)

    @Rule
    @JvmField
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun addTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(firstNumber)
                .plus(secondNumber)
                .checkResult(firstNumber + secondNumber)
    }

    @Test
    fun minusTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(firstNumber)
                .minus(secondNumber)
                .checkResult(firstNumber - secondNumber)
    }

    @Test
    fun divideTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(8)
                .divide(4)
                .checkResult(2)
    }

    @Test
    fun multiplyTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(firstNumber)
                .multiply(secondNumber)
                .checkResult(firstNumber * secondNumber)
    }

    @Test
    fun clearTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(3)
                .checkResult(3)
                .clear()
                .checkResult(0)
    }

    @Test
    fun commaTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(3)
                .comma()
                .enter(2)
                .plus(2)
                .checkResult(5.2)
    }

    @Test
    fun powerTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(4)
                .power(4)
                .checkResult(256)
    }

    @Test
    fun rootTest() {
        val calculatorPage = CalculatorPage()
        calculatorPage
                .enter(1)
                .enter(6)
                .root()
                .checkResult(4)
    }

}
