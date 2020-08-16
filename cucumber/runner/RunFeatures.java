package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= {"src/test/java/features"},
				 glue= {"steps"},
				 monochrome=true,
				 plugin = {"pretty","html:report"},
				// tags = {"@regression"}, //to execute only regression
				// tags = {"~@regression"} // to execute test cases other than regression
				 tags = {"@regression,@smoke"} //or condition 
				// tags =   {"@functional","@smoke"} // and condition

				// dryRun = true,
				// snippets = SnippetType.CAMELCASE
				 )
public class RunFeatures extends AbstractTestNGCucumberTests {

}
