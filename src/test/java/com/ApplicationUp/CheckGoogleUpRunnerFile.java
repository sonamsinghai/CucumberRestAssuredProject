package com.ApplicationUp;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/ApplicationUp/CheckGoogleUpFeatureFile.feature"},
		glue={"com.ApplicationUp"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report4.json",
		}
		)
public class CheckGoogleUpRunnerFile {

}
