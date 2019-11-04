package com.simplemobiletools.calculator.pageobject

open class BaseObject {

    companion object {
        inline fun <reified T : BaseObject> on(): T {
            return BaseObject().on()
        }
    }

    inline fun <reified T : BaseObject> on(): T {
        val page = T::class.constructors.first().call()
        page.verify()
        return page
    }

    open fun verify() {}
}