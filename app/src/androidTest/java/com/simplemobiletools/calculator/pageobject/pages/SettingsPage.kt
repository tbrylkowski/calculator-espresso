package com.simplemobiletools.calculator.pageobject.pages

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.widget.TextView
import com.simplemobiletools.calculator.R
import com.simplemobiletools.calculator.pageobject.BaseObject
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.instanceOf


class SettingsPage : BaseObject() {

    override fun verify() {
        onView(allOf(instanceOf(TextView::class.java), withParent(withId(R.id.action_bar))))
                .check(matches(withText(SettingsPageTitle)))
    }

    companion object {
        const val SettingsPageTitle = "Settings"
    }

    private val customizeColorTextView = onView(withId(R.id.settings_customize_colors_label))
    private val customizeWidgetColorsTextView = onView(withId(
            R.id.settings_customize_widget_colors_label))
    private val avoidWhatsNewSwitch = onView(withId(R.id.settings_avoid_whats_new))
    private val setVibrateSwitch = onView(withId(R.id.settings_vibrate))
    private val sleepModeSwitch = onView(withId(R.id.settings_prevent_phone_from_sleeping_holder))

    fun toggleNewsSwitch(): SettingsPage {
        avoidWhatsNewSwitch.perform(click())
        return this
    }

    fun toggleVibrationOnPress(): SettingsPage {
        setVibrateSwitch.perform(click())
        return this
    }

    fun toogleSleepMode(): SettingsPage {
        sleepModeSwitch.perform(click())
        return this
    }

    fun navigateToCustomizeColorPage(): SettingsPage {
        customizeColorTextView.perform(click())
        return this
    }

    fun navigateToCustomizeWidgetColorsPage(): SettingsPage {
        customizeWidgetColorsTextView.perform(click())
        return this
    }
}