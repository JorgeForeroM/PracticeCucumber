package org.fundacionjala.pivotal.cucumber.stepdefinition.login;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Created by jorge on 10/01/2017.
 */

@CucumberOptions(features = "src\\test\\features\\login\\LoginPivotalTest.feature",
        format = {"pretty", "html:reports/cucumberReport"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {}
