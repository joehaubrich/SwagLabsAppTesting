package co.tests.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.tests.screenplay.userinterface.LoginScreen.*;

public class LogInToSwagLabs implements Task {
    private String userName = "standard_user";
    private String password = "secret_sauce";

    public static LogInToSwagLabs logInToApplication() {
        return Tasks.instrumented(LogInToSwagLabs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(USERNAME_TEXTBOX),
                Enter.theValue(password).into(PASSWORD_TEXTBOX),
                Click.on(LOGIN_BUTTON)
        );
    }

}
