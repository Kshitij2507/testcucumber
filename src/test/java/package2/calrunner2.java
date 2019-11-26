package package2;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:src/test/java/package2/output/cucumber1.json"})
public class calrunner2 {

}
