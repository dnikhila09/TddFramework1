package com.valuemomentum.cucumber.tddfw.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/valuemomentum/cucumber/tddfw/Login.feature",
plugin = {"pretty","html:target/cucumber"})
public class Runner {
	

}
