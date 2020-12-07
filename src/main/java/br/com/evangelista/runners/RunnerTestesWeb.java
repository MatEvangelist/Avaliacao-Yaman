package br.com.evangelista.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static br.com.evangelista.core.web.DriverFactory.killDriver;
import static io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/featuresWeb/",
        glue = "br.com.evangelista.stepsWeb",
        plugin = "pretty",
        monochrome = true,
        snippets = SnippetType.CAMELCASE)

public class RunnerTestesWeb {


    @AfterClass
    public static void finalizaDriver() {
        killDriver();
    }
}
