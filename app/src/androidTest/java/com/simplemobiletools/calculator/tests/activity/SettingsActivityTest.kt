package com.simplemobiletools.calculator.tests.activity

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.simplemobiletools.calculator.activities.SettingsActivity
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.page_segment.AppBar
import com.simplemobiletools.calculator.pageobject.pages.SettingsPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SettingsActivityTest {

    @get:Rule
    val testRule = ActivityTestRule(SettingsActivity::class.java)

    @Test
    fun navigateToCustomizeColorsPage_andBackToSettingPage() {
        BaseObject.on<SettingsPage>()
                .navigateToCustomizeColorPage()
                .on<AppBar>()
                .pressBackButton()
                .on<SettingsPage>()
    }

    @Test
    fun switchOnOffToggle_VibrateOnPress() {
        BaseObject.on<SettingsPage>()
                .toggleOnVibrationOnPress()
                .toggleOffVibrationOnPress()
    }

    @Test
    fun switchOnOffToggle_AvoidWhatNew() {
        BaseObject.on<SettingsPage>()
                .toggleOnAvoidWhatsNewSwitch()
                .toggleOffAvoidWhatsNewSwitch()
    }

    @Test
    fun switchOnOffToggle_SleepMode() {
        BaseObject.on<SettingsPage>()
                .toggleOnSleepMode()
                .toggleOffSleepMode()
    }
}
