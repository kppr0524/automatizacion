package co.com.choucair.certification.retochoucair.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.choucair.certification.retochoucair.tasks.UserRegisterReto;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class UserRegisterStepdefinition {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Katherine");
    }

    @Given("^user on the home page$")
    public void userOnTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://utest.com/"));
    }

    @When("^user creates an account$")
    public void userCreatesAnAccount() {
        theActorInTheSpotlight().attemptsTo(UserRegisterReto.makeinformation());
    }

    @Then("^user view your username$")
    public void userViewYourUsername() {

    }
}
