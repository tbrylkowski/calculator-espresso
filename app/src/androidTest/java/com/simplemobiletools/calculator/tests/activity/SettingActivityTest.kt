package com.simplemobiletools.calculator.tests.activity

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.simplemobiletools.calculator.activities.SettingsActivity
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.pages.SettingsPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SettingActivityTest {

    @get:Rule
    val testRule = ActivityTestRule<SettingsActivity>(SettingsActivity::class.java)

    @Test
    fun checkToggleButtons() {
        BaseObject.on<SettingsPage>()
                .toggleNewsSwitch()

    }
}
