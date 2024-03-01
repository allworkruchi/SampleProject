package parallelTestRunner;

import io.cucumber.testng.CucumberOptions;


import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= "src/test/resources/features", 
				 glue = {"stepDefinition"},
				 plugin = {"Pretty", "html:target/cucumber-reports", "json:target/cucumber-reports"},
				 monochrome = true,
				 publish = true
		)

	
public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}