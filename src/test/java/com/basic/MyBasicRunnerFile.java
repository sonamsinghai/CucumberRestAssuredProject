package com.basic;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/basic/MyBasicFeatureFile.feature"},
		glue={"com.basic"},//java file path
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report5.json",
		}
		)
public class MyBasicRunnerFile {

}
