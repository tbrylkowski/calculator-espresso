package com.simplemobiletools.calculator.tests.activity

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.page_segment.AppBar
import com.simplemobiletools.calculator.pageobject.page_segment.ThemeViewPickerList
import com.simplemobiletools.calculator.pageobject.pages.CustomizeColorsPage
import com.simplemobiletools.commons.activities.CustomizationActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CustomizationActivityTest {

    @get:Rule
    val testRule = ActivityTestRule(CustomizationActivity::class.java)

    @Test
    fun changeAppThemeToLight_cancelThemeChange() {
        BaseObject.on<CustomizeColorsPage>()
                .clickChangeTheme()
                .on<ThemeViewPickerList>()
                .clickLightTheme()
                .on<AppBar>()
                .cancelCustomThemeAndNavigateBackToSettingPage()
    }

    @Test
    fun changeAppThemeToDark_cancelThemeChange() {
        BaseObject.on<CustomizeColorsPage>()
                .clickChangeTheme()
                .on<ThemeViewPickerList>()
                .clickDarkTheme()
                .on<AppBar>()
                .cancelCustomThemeAndNavigateBackToSettingPage()
    }

    @Test
    fun changeAppThemeToDarkRed_cancelThemeChange() {
        BaseObject.on<CustomizeColorsPage>()
                .clickChangeTheme()
                .on<ThemeViewPickerList>()
                .clickDarkRedTheme()
                .on<AppBar>()
                .cancelCustomThemeAndNavigateBackToSettingPage()
    }

    @Test
    fun changeAppThemeToBlackAndWhite_cancelThemeChange() {
        BaseObject.on<CustomizeColorsPage>()
                .clickChangeTheme()
                .on<ThemeViewPickerList>()
                .clickBlackAndWhiteTheme()
                .on<AppBar>()
                .cancelCustomThemeAndNavigateBackToSettingPage()
    }

    @Test
    fun changeAppThemeToCustom_cancelThemeChange() {
        BaseObject.on<CustomizeColorsPage>()
                .clickChangeTheme()
                .on<ThemeViewPickerList>()
                .clickCustomTheme()
                .on<AppBar>()
                .cancelCustomThemeAndNavigateBackToSettingPage()
    }
}