package co.tests.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.tests.screenplay.userinterface.LoginScreen.PASSWORD_TEXTBOX;
import static co.tests.screenplay.userinterface.LoginScreen.USERNAME_TEXTBOX;

public class FillLoginInfo implements Task {
    private String userName;
    private String password;

    public FillLoginInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static FillLoginInfo loginToSwagLabs(String userName, String password) {
        return Tasks.instrumented(FillLoginInfo.class, userName, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(userName).into(USERNAME_TEXTBOX),
            Enter.theValue(password).into(PASSWORD_TEXTBOX)
        );
    }

}
