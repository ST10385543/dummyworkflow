package com.example.workflow

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RecyclerViewTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testRecyclerViewDisplay() {
        // Verify RecyclerView is displayed
        onView(withId(R.id.recyclerView))
            .check(matches(isDisplayed()))

        // Verify first item exists
        onView(withText("Task 1 - Complete project setup"))
            .check(matches(isDisplayed()))
    }

    @Test
    fun testRecyclerViewScroll() {
        // Scroll to position 4 and verify text
        onView(withId(R.id.recyclerView))
            .perform(RecyclerViewActions.scrollToPosition<SimpleAdapter.ViewHolder>(4))

        onView(withText("Task 5 - Deploy the app"))
            .check(matches(isDisplayed()))
    }
}