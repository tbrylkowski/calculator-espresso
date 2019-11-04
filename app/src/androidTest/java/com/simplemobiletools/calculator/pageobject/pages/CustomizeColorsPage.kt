package com.simplemobiletools.calculator.pageobject.pages

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.widget.TextView
import com.simplemobiletools.calculator.R
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.page_segment.ThemeViewPicker
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.instanceOf

class CustomizeColorsPage : BaseObject() {

    override fun verify() {
        onView(allOf(instanceOf(TextView::class.java),
                withParent(withId(R.id.action_bar))))
                .check(matches(withText(CustomizeColorsTitle)))
    }

    companion object {
        const val CustomizeColorsTitle = "Customize colors"
    }

    private val themeTextView = onView(allOf(withId(R.id.customization_theme_label),
            withParent(withId(R.id.customization_theme_holder))))

    fun changeTheme(): ThemeViewPicker {
        themeTextView.perform(click())
        return ThemeViewPicker()
    }
}