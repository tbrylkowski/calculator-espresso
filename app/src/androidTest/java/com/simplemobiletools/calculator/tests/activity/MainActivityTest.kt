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
    private val firstNumber = Random().nextInt(10)
    private val secondNumber = Random().nextInt(10)

    @Rule
    val testRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun addTest() {
        BaseObject.on<CalculatorPage>()
                .enter(firstNumber)
                .plus(secondNumber)
                .checkResult(firstNumber + secondNumber)
    }

    @Test
    fun minusTest() {
        BaseObject.on<CalculatorPage>()
                .enter(firstNumber)
                .minus(secondNumber)
                .checkResult(firstNumber - secondNumber)
    }

    @Test
    fun divideTest() {
        BaseObject.on<CalculatorPage>()
                .enter(8)
                .divide(4)
                .checkResult(2)
    }

    @Test
    fun multiplyTest() {
        BaseObject.on<CalculatorPage>()
                .enter(firstNumber)
                .multiply(secondNumber)
                .checkResult(firstNumber * secondNumber)
    }

    @Test
    fun clearTest() {
        BaseObject.on<CalculatorPage>()
                .enter(3)
                .checkResult(3)
                .clear()
                .checkResult(0)
    }

    @Test
    fun commaTest() {
        BaseObject.on<CalculatorPage>()
                .enter(3)
                .comma()
                .enter(2)
                .plus(2)
                .checkResult(5.2)
    }

    @Test
    fun powerTest() {
        BaseObject.on<CalculatorPage>()
                .enter(4)
                .power(4)
                .checkResult(256)
    }

    @Test
    fun rootTest() {
        BaseObject.on<CalculatorPage>()
                .enter(1)
                .enter(6)
                .root()
                .checkResult(4)
    }

}
