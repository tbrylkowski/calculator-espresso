package com.simplemobiletools.calculator.pageobject.page_segment

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import com.simplemobiletools.calculator.R
import com.simplemobiletools.calculator.pageobject.BaseObject
import org.hamcrest.CoreMatchers

class AppBarSegment : BaseObject() {
    override fun verify() {
        onView(withId(R.id.action_bar)).check(matches(isDisplayed()))
    }

    companion object {
        const val SettingsPageString = "Settings"
        const val AboutPageString = "About"
    }

    fun navigateToSettingsPage(): AppBarSegment {
        // open toolbar menu
        Espresso.openActionBarOverflowOrOptionsMenu(InstrumentationRegistry
                .getInstrumentation().targetContext)

        //click in 'setting' toolbar item
        onView(CoreMatchers.allOf(ViewMatchers.withText(SettingsPageString),
                isDisplayed())).perform(ViewActions.click())
        return this
    }

    fun navigateToAboutPage(): AppBarSegment {
        // open toolbar menu
        Espresso.openActionBarOverflowOrOptionsMenu(InstrumentationRegistry
                .getInstrumentation().targetContext)

        // click in 'about' toolbar item
        onView(CoreMatchers.allOf(ViewMatchers.withText(AboutPageString),
                isDisplayed())).perform(ViewActions.click())
        return this
    }

    fun pressBackButton(): AppBarSegment {
        // don't use in root activity
        Espresso.pressBack()
        return this
    }


}