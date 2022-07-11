package co.tests.screenplay.stepdefinitions;

import co.tests.screenplay.interaction.AddProductToCart;
import co.tests.screenplay.tasks.LogInToSwagLabs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.tests.screenplay.userinterface.SwagLabsHome.SAUCE_LABS_BACKPACK_ATC;

public class CartFunctionalityStepDefinitions {
    @Given("he is on the main product page")
    public void he_is_on_the_main_product_page() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LogInToSwagLabs.logInToApplication()
        );
    }
    @Then("he can add a product to his cart")
    public void he_can_add_a_product_to_his_cart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddProductToCart.addSauceBackPackToCart()
        );
    }
}
