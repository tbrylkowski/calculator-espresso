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
import com.simplemobiletools.calculator.pageobject.pages.AboutPage
import com.simplemobiletools.calculator.pageobject.pages.SettingsPage
import org.hamcrest.CoreMatchers

class AppBarSegment : BaseObject() {
    override fun verify() {
        //verify if any app bar is displayed
        onView(withId(R.id.action_bar)).check(matches(isDisplayed()))
    }

    companion object {
        const val SettingsPageString = "Settings"
        const val AboutPageString = "About"
    }

    fun navigateToSettingsPage(): SettingsPage {
        // open toolbar menu
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry
                .getInstrumentation().targetContext)

        //click in 'setting' toolbar item
        onView(CoreMatchers.allOf(withText(SettingsPageString),
                isDisplayed())).perform(click())
        return SettingsPage()
    }

    fun navigateToAboutPage(): AboutPage {
        // open toolbar menu
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry
                .getInstrumentation().targetContext)

        // click in 'about' toolbar item
        onView(CoreMatchers.allOf(withText(AboutPageString),
                isDisplayed())).perform(click())
        return AboutPage()
    }

    fun pressBackButton(): AppBarSegment {
        // don't use in root activity
        Espresso.pressBack()
        return this
    }

    fun cancelCustomThemeAndNavigateBackToSettingPage(): SettingsPage {
        // navigate up in CustomizeColorsPage view
        onView(withContentDescription("Navigate up")).perform(click())
        return SettingsPage()
    }

    fun saveCustomThemeAndNavigateBackToSettingPage(): SettingsPage {
        // save changes in CustomizeColorsPage view
        onView(withContentDescription("Save")).perform(click())
        return SettingsPage()
    }


}