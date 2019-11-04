package com.simplemobiletools.calculator.tests.intents

import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.espresso.intent.rule.IntentsTestRule
import com.simplemobiletools.calculator.activities.MainActivity
import com.simplemobiletools.calculator.activities.SettingsActivity
import com.simplemobiletools.calculator.activities.WidgetConfigureActivity
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.page_segment.AppBar
import com.simplemobiletools.calculator.pageobject.pages.CalculatorPage
import com.simplemobiletools.calculator.pageobject.pages.SettingsPage
import com.simplemobiletools.commons.activities.AboutActivity
import com.simplemobiletools.commons.activities.CustomizationActivity
import org.junit.Rule
import org.junit.Test

class IntentsTest {

    @Rule
    @JvmField
    val mainActivityRule = IntentsTestRule(MainActivity::class.java)

    @Test
    fun mainActivity_launchSettingActivityTest() {
        BaseObject.on<CalculatorPage>()
                .on<AppBar>()
                .navigateToSettingsPage()
        intended(hasComponent(SettingsActivity::class.java.name))
    }

    @Test
    fun mainActivity_launchAboutActivityTest() {
        BaseObject.on<CalculatorPage>()
                .on<AppBar>()
                .navigateToAboutPage()
        intended(hasComponent(AboutActivity::class.java.name))
    }

    @Test
    fun mainActivity_launchWidgetConfigureActivity() {
        BaseObject.on<CalculatorPage>()
                .on<AppBar>()
                .navigateToSettingsPage()
                .on<SettingsPage>()
                .navigateToCustomizeWidgetColorsPage()
        intended(hasComponent(WidgetConfigureActivity::class.java.name))
    }

    @Test
    fun mainActivity_launchCustomizationActivity() {
        BaseObject.on<CalculatorPage>()
                .on<AppBar>()
                .navigateToSettingsPage()
                .on<SettingsPage>()
                .navigateToCustomizeColorPage()
        intended(hasComponent(CustomizationActivity::class.java.name))
    }

}