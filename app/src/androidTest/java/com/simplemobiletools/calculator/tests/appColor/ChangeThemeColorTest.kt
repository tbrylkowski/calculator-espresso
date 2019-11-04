package com.simplemobiletools.calculator.tests.appColor

import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.simplemobiletools.calculator.activities.MainActivity
import com.simplemobiletools.calculator.pageobject.BaseObject
import com.simplemobiletools.calculator.pageobject.page_segment.AppBar
import com.simplemobiletools.calculator.pageobject.page_segment.ThemeViewPickerList
import com.simplemobiletools.calculator.pageobject.pages.CalculatorPage
import com.simplemobiletools.calculator.pageobject.pages.CustomizeColorsPage
import com.simplemobiletools.calculator.pageobject.pages.SettingsPage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeThemeColorTest {

    @get:Rule
    val testRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun changeAppThemeToDarkInSettings_navigateBackToMainScreen() {
        BaseObject.on<CalculatorPage>()
                .on<AppBar>()
                .navigateToSettingsPage()
                .on<SettingsPage>()
                .navigateToCustomizeColorPage()
                .on<CustomizeColorsPage>()
                .clickChangeTheme()
                .on<ThemeViewPickerList>()
                .clickDarkTheme()
                .on<AppBar>()
                .saveCustomThemeAndNavigateBackToSettingPage()
                .on<SettingsPage>()
                .validateDarkTheme()
                .on<AppBar>()
                .pressBackButton()
    }

    @Test
    fun changeAppThemeToLightInSettings_navigateBackToMainScreen() {
        BaseObject.on<CalculatorPage>()
                .on<AppBar>()
                .navigateToSettingsPage()
                .on<SettingsPage>()
                .navigateToCustomizeColorPage()
                .on<CustomizeColorsPage>()
                .clickChangeTheme()
                .on<ThemeViewPickerList>()
                .clickLightTheme()
                .on<AppBar>()
                .saveCustomThemeAndNavigateBackToSettingPage()
                .on<SettingsPage>()
                .validateLightTheme()
                .on<AppBar>()
                .pressBackButton()
    }
}