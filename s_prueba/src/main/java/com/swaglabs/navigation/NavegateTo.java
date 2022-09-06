package com.swaglabs.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegateTo {

    public static Performable theSwagLabsLoginPage(){
        return Task.where(
                "the opens swag labs login page",
                Open.browserOn().the(GoToLoginPage.class)
        );
    }
}
