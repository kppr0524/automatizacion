package co.com.choucair.certification.retochoucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/user_register.feature",
glue = "co.com.choucair.certification.retochoucair.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class UserRegister {
}
