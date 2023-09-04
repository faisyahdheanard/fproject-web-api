package com.dean.web.step_definition;

import com.dean.web.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTest {
    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterclass() {
        quitDriver();
    }
}
