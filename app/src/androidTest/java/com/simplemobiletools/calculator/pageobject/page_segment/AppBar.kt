package com.simplemobiletools.calculator.pageobject.page_segment

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.simplemobiletools.calculator.R
import com.simplemobiletools.calculator.pageobject.BaseObject
import org.hamcrest.CoreMatchers

class AppBar : BaseObject() {
    override fun verify() {
        //verify if any app bar is displayed
        onView(withId(R.id.action_bar)).check(matches(isDisplayed()))
    }

    companion object {
        const val SettingsPageString = "Settings"
        const val AboutPageString = "About"
    }

    fun navigateToSettingsPage(): AppBar {
        // open appbar menu
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry
                .getInstrumentation().targetContext)

        //click in appbar item with text 'Settings'
        onView(CoreMatchers.allOf(withText(SettingsPageString),
                isDisplayed())).perform(click())
        return this
    }

    fun navigateToAboutPage(): AppBar {
        // open appbar menu
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry
                .getInstrumentation().targetContext)

        // click in appbar item with text 'About'
        onView(CoreMatchers.allOf(withText(AboutPageString),
                isDisplayed())).perform(click())
        return this
    }

    fun pressBackButton(): AppBar {
        // don't use in root activity
        Espresso.pressBack()
        return this
    }

    fun cancelCustomThemeAndNavigateBackToSettingPage(): AppBar {
        // navigate up in CustomizeColorsPage view
        onView(withContentDescription("Navigate up")).perform(click())
        return this
    }

    fun saveCustomThemeAndNavigateBackToSettingPage(): AppBar {
        // save changes in CustomizeColorsPage view
        onView(withContentDescription("Save")).perform(click())
        return this
    }


}