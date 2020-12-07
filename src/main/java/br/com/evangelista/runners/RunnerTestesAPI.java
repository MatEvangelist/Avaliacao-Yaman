package br.com.evangelista.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static br.com.evangelista.core.web.DriverFactory.killDriver;
import static io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/featuresAPI/",
        glue = {"br.com.evangelista.stepsAPI", "br/com/evangelista/core/restAPI"},
        plugin = "pretty",
        monochrome = true,
        snippets = SnippetType.CAMELCASE)

public class RunnerTestesAPI {

}
