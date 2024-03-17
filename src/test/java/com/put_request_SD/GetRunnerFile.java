package com.put_request_SD;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/put_request_FF"},
		glue={"com.put_request_SD"},
		tags="@regression",
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report11.json",
		}
		)
public class GetRunnerFile {

}
