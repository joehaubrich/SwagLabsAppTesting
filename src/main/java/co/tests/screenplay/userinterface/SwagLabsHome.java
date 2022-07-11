package co.tests.screenplay.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SwagLabsHome {
    public static final Target SAUCE_LABS_BACKPACK_ATC = Target.the("Sauce Labs Backpack add to cart button").located(AppiumBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]"));
}
