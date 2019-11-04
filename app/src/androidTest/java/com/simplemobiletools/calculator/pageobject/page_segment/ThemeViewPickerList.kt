package com.simplemobiletools.calculator.pageobject.page_segment

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import com.simplemobiletools.calculator.R
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.pages.CustomizeColorsPage

class ThemeViewPickerList : BaseObject() {
    override fun verify() {
        onView(withId(R.id.dialog_radio_holder)).check(matches(isDisplayed()))
    }

    companion object {
        const val lightTheme = "Light"
        const val darkTheme = "Dark"
        const val darkRedTheme = "Dark red"
        const val blackAndWithTheme = "Black & White"
        const val custom = "Custom"
    }


    fun clickLightTheme(): CustomizeColorsPage {
        onView(withText(lightTheme)).perform(click())
        return CustomizeColorsPage()
    }

    fun clickDarkTheme(): CustomizeColorsPage {
        onView(withText(darkTheme)).perform(click())
        return CustomizeColorsPage()
    }

    fun clickDarkRedTheme(): CustomizeColorsPage {
        onView(withText(darkRedTheme)).perform(click())
        return CustomizeColorsPage()
    }

    fun clickBlackAndWhiteTheme(): CustomizeColorsPage {
        onView(withText(blackAndWithTheme)).perform(click())
        return CustomizeColorsPage()
    }

    fun clickCustomTheme(): CustomizeColorsPage {
        onView(withText(custom)).perform(click())
        return CustomizeColorsPage()
    }
}