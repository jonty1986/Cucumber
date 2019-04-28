package com.testing.cucumber.cucumberDemo;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "Feature"
 ,glue={"stepDefinition"}
 ,format = {"json:target/cucumber.json"}
 )
 
public class TestRunner {

}
