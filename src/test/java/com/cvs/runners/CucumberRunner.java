package com.cvs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue="com/cvs/step_definitions",
        dryRun=false, //checking the codes if any missing steps (true=dont run)
        tags="@positive_test_user1", //specifying which tests to run
        plugin ={"html:target/default-cucumber-reports"} //html reports to be saved
)
public class CucumberRunner {

}
