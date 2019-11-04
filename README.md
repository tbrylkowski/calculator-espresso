# calculator-espresso
Simple calculator with androidTest written in kotlin and espresso with page object pattern.

# How to run app
1. Clone or download zip file.
2. Don't upgrade build to newer version. This app and tests work only with max API level 27. 
3. Start emulator or device with API level 27. 
5. Run app on device. (on MacOS -> ^R + Ok) 
4. Go to android view and start tests from androidTest folder. 
  - tests path: app/src/androidTest/java/com/simplemobiletools/calculator/tests 
  - page object models path: app/src/androidTest/java/com/simplemobiletools/calculator/pageobject
  
# How to add new tests in this repository with page object pattern and espresso. 
 1. Create new class that represents page or just one element of page like searchBox, under pageobject folder. 
 2. Inherit from BaseObject class that handles generating object instance. 
 3. Override BaseObject.verify() method to check, if you setup your page/element correctly with help of espresso framework.
 4. Create methods that will handle action and check for this page/element with espresso framework.
 5. Create new tests. 
 
# Test example with page object: 
    @Test
    fun navigateToSettingPage() {
        BaseObject.on<CalculatorPage>()     // Start by using BaseObject.on() to generate class of type CalculatorPage. 
                .on<AppBar>()               // Then generate instance of app bar by using .on<AppBar>() method 
                .navigateToSettingsPage()   // AppBar class has AppBar.navigateToSettingsPage() method so we can use it
                .on<SettingsPage>()         // By calling .on<ClassName>() we always run in background ClassName.verify()
                                            // method to do default verification of page/element on screen. 
    }
    
# Implement page object method with help of espresso framework.       
    fun navigateToSettingsPage(): AppBar {                          
        openActionBarOverflowOrOptionsMenu(InstrumentationRegistry.  // open appbar menu 
                .getInstrumentation().targetContext)
        onView(CoreMatchers.allOf(withText('Settings'),              //click in 'Settings' from appbar menu 
                isDisplayed())).perform(click())
        return this                                               // by 'return this', you're able to chain methods in test
    }                                                            
   
 
 # What tests could be added:
   - tests to handle user custome settings,
   - tests to check about page 

 
  
