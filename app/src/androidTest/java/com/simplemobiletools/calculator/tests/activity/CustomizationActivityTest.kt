package com.simplemobiletools.calculator.tests.activity

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.page_segment.AppBarSegment
import com.simplemobiletools.calculator.pageobject.page_segment.ThemeViewPicker
import com.simplemobiletools.calculator.pageobject.pages.CustomizeColorsPage
import com.simplemobiletools.commons.activities.CustomizationActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)


class CustomizationActivityTest {

    @get:Rule
    val testRule = ActivityTestRule<CustomizationActivity>(CustomizationActivity::class.java)

    @Test
    fun changeAppThemeToDark() {
        BaseObject.on<CustomizeColorsPage>()
                .changeTheme()
                .on<ThemeViewPicker>()
                .setDarkTheme()
                .on<AppBarSegment>()
                .saveCustomThemeAndNavigateBackToSettingPage()
    }

    @Test
    fun changeAppThemeToLight() {
        BaseObject.on<CustomizeColorsPage>()
                .changeTheme()
                .on<ThemeViewPicker>()
                .setLightTheme()
                .on<AppBarSegment>()
                .saveCustomThemeAndNavigateBackToSettingPage()
    }

    @Test
    fun pickTheme_cancelThemeChange() {
        BaseObject.on<CustomizeColorsPage>()
                .changeTheme()
                .on<ThemeViewPicker>()
                .setBlackAndWhite()
                .on<AppBarSegment>()
                .cancelCustomThemeAndNavigateBackToSettingPage()
    }
}