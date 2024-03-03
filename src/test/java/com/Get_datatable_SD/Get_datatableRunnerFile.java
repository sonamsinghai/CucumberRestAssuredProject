package com.Get_datatable_SD;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/com/Get_datatable_FF/Get_datatableFeatureFile.feature"},
		glue={"com.Get_datatable_SD"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
		}
		)
public class Get_datatableRunnerFile {

}
