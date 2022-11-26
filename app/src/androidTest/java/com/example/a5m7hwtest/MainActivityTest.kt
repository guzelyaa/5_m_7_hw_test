package com.example.a5m7hwtest

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        Espresso.onView(withId(R.id.num1)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.num2)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_Result))
            .check(ViewAssertions.matches(ViewMatchers.withText("10")))
    }
    @Test
    fun simpleDivide() {
        Espresso.onView(withId(R.id.num1)).perform(ViewActions.typeText("10"))
        Espresso.onView(withId(R.id.num2)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.btnDivide)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_Result))
            .check(ViewAssertions.matches(ViewMatchers.withText("2")))
    }

}