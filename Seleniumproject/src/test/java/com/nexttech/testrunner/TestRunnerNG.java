package com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerNG {
	//feature folder and Stepdef can communicate through TestRunner
	@CucumberOptions(
			features= {"Features"} ,
			glue = {"com.nexttech.stepdef"} 
			
			//tags = {"@userLogin"},
			)
	
	
class TestRunner extends AbstractTestNGCucumberTests{
		
	}
	
	
}
