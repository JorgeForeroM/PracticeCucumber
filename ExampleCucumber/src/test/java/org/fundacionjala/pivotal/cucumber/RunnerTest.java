package org.fundacionjala.pivotal.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Created by jorge on 10/01/2017.
 */

@CucumberOptions(features = "src\\test\\resource\\LoginPivotalTest.feature",
        format = {"pretty"}
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
