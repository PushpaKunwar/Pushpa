package stepdefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.class)
@CucumberOptions(features="OrangeHRMApplication",glue="stepdefination")

public class TestRunner {

}
