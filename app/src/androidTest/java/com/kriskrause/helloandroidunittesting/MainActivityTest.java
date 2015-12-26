package com.kriskrause.helloandroidunittesting;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

/**
 * Created by kkrause on 12/26/15.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void able_to_click_button() {

        onView(withId(R.id.txtHello))
                .check(matches(withText("")));

        onView(withId(R.id.btnHello))
                .check(matches(withText(R.string.clickme)))
                .perform(click());

        onView(withId(R.id.txtHello))
                .check(matches(withText(R.string.helloworld)));

        onView(withId(R.id.btnHello))
                .check(matches(not(isEnabled())));
    }
}
