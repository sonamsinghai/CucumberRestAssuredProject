package com.ApplicationUp;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/ApplicationUp/CheckFacebookUpFeatureFile.feature"},
		glue={"com.ApplicationUp"},//java file path
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2.json",
		}
		)

public class CheckFacebookUpRunnerFile {

}
