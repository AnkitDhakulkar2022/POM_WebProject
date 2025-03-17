package TestNGRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {
	
	
	@CucumberOptions(
		    features = {"src/test/resource/com/features"},
		    glue = {"Stepdefination","Hooks"},
		   // strict = true,  // 'strict' is removed in Cucumber 7+, so it's safe to remove
		    dryRun = false,
		   // tags = "@Login",
		    plugin = {
		        "pretty",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		    },
		    monochrome = true
		)
		public class TestNGAppRunner extends AbstractTestNGCucumberTests {
		
//		@Override
//	    @DataProvider(parallel = true)  // Enables parallel execution
//	    public Object[][] scenarios() {
//	        return super.scenarios();
//	    }
		
		}

}
