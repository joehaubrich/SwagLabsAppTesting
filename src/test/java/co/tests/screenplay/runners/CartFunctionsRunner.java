package co.tests.screenplay.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/product_cart_functionality.feature",
        glue = "co.tests.screenplay.stepdefinitions"
)

public class CartFunctionsRunner {
}
