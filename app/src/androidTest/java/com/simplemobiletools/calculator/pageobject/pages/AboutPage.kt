package com.simplemobiletools.calculator.pageobject.pages

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.widget.TextView
import com.simplemobiletools.calculator.R
import com.simplemobiletools.calculator.pageobject.BaseObject
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.instanceOf

class AboutPage: BaseObject() {

    override fun verify() {
        onView(allOf(instanceOf(TextView::class.java), withParent(withId(R.id.action_bar))))
                .check(matches(withText(AboutPageTitle)))
    }
    companion object {
        const val AboutPageTitle = "About"
    }
}