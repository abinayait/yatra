package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features="G:/Learning/Abinaya R/workspace_Festival/hyderabad/src/test/resources/Features",glue={"StepDefinition"},
	monochrome= true , plugin={"pretty", "junit:target/JunitReports/reports.xml"})
	//plugin={"pretty", "html:target/HtmlReports"})

	public class TestRunner {
			
			
		
	
}
