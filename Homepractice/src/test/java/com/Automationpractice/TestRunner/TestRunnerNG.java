package com.Automationpractice.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerNG {
	
	

	
	@CucumberOptions(
			features= {"Features"} ,
			glue = {"com.Automationpractice.StepDef"} 
			
			//tags = {"@userLogin"},
			)
	
	
	class TestRunner extends AbstractTestNGCucumberTests{
		
	
	}
	

}
