package com.swaglabs.tasks;

import com.swaglabs.UI.LoginFormPage;
import io.cucumber.java.an.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickInteraction;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterCredentialsLogin implements Task {

    private final Map<String,String> credentials;

    public EnterCredentialsLogin(Map<String, String> credentials) {
        this.credentials = credentials;
    }

    public static EnterCredentialsLogin loginForm(Map<String,String> credentials){
        return instrumented(EnterCredentialsLogin.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(credentials.get("username")).into(LoginFormPage.TXT_USERNAME),
                Enter.theValue(credentials.get("password")).into(LoginFormPage.TXT_PASSWORD),
                Click.on(LoginFormPage.BTN_LOGIN)
        );
    }
}
