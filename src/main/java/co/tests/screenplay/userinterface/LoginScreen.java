package co.tests.screenplay.userinterface;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginScreen {
    public static final Target USERNAME_TEXTBOX = Target.the("Username textbox").located(AppiumBy.accessibilityId("test-Username"));
    public static final Target PASSWORD_TEXTBOX = Target.the("Password textbox").located(AppiumBy.accessibilityId("test-Password"));
    public static final Target LOGIN_BUTTON = Target.the("LOGIN button").located(AppiumBy.accessibilityId("test-LOGIN"));
}
