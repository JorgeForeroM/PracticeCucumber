package org.fundacionjala.pivotal.cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Administrator on 1/9/2017.
 */
@CucumberOptions(features = "src\\test\\features\\login\\LoginPivotalTest.feature",
        format = {"pretty"}
)
public class LoginRunner extends AbstractTestNGCucumberTests{}