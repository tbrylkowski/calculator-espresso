package com.simplemobiletools.calculator.pageobject

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.ViewInteraction
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.instanceOf
import android.support.test.espresso.matcher.ViewMatchers.withParent
import android.widget.TextView
import com.simplemobiletools.calculator.R

abstract class AbstractPageClass(name: String) {

    init {
        /**
         * Check if given class name parameter match the text in action bar.
         */
        onView(allOf(instanceOf(TextView::class.java), withParent(withId(R.id.action_bar))))
                .check(matches(withText(name)))
    }

    /**
     * Perform the click action on element view.
     * @param element the element to click.
     */
    fun press(element: ViewInteraction?) = element?.perform(click())
}