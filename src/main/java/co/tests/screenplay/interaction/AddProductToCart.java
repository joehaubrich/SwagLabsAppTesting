package co.tests.screenplay.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.tests.screenplay.userinterface.SwagLabsHome.SAUCE_LABS_BACKPACK_ATC;

public class AddProductToCart implements Interaction {

    public static AddProductToCart addSauceBackPackToCart() {
        return Tasks.instrumented(AddProductToCart.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SAUCE_LABS_BACKPACK_ATC)
        );
    }

}
