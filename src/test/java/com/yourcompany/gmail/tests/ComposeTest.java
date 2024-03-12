package com.yourcompany.gmail.tests;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features",
        glue = "com.yourcompany.gmail.stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports"})


public class ComposeTest {
}