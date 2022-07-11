package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.tasks.FillLoginInfo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.tests.screenplay.userinterface.LoginScreen.LOGIN_BUTTON;

public class LoginFunctionalityStepDefinitions {
    @Given("he enters a valid username and password")
    public void he_enters_a_valid_username_and_password() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillLoginInfo.loginToSwagLabs("standard_user", "secret_sauce")
        );
    }
    @Then("he is logged in to the application")
    public void he_is_logged_into_the_application() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LOGIN_BUTTON)
        );
    }

    @Given("the username and password he uses is invalid")
    public void the_username_and_password_he_uses_is_invalid() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillLoginInfo.loginToSwagLabs("test", "12345")
        );
    }
    @Then("he is unable to log in to the application")
    public void he_is_unable_to_log_in_to_the_application() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LOGIN_BUTTON)
        );
    }

}
