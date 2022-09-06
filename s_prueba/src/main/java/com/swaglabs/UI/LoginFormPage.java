package com.swaglabs.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginFormPage {
    public static final Target TXT_USERNAME = Target.the("enter username value")
            .located(By.id("user-name"));
    public static final Target TXT_PASSWORD = Target.the("enter password value")
            .located(By.id("password"));
    public static final Target BTN_LOGIN =  Target.the("click the button log in")
            .located(By.id("login-button"));
}
