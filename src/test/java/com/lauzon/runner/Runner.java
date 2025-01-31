package com.lauzon.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\Features",
		glue={"com.lauzon.stepDefinition"},
		publish=true,plugin= {"html:target/cucumber.html","junit:target/cucumber.xml","pretty,json:target/cucumber.json"})

public class Runner {

}
