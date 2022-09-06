package com.swaglabs.stepsdefinitions;

import com.swaglabs.navigation.NavegateTo;
import com.swaglabs.questions.HomePageCompare;
import com.swaglabs.tasks.EnterCredentialsLogin;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinition {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
    }
    @Given("that the user has an account")
    public void thatTheUserHasAnAccount() {
        theActorInTheSpotlight().wasAbleTo(NavegateTo.theSwagLabsLoginPage());
    }
    @When("the user enters the credentials")
    public void theUserEntersTheCredentials(Map<String,String > dataTable) {
        theActorInTheSpotlight().attemptsTo(EnterCredentialsLogin.loginForm(dataTable));

    }
    @Then("the user must see the products")
    public void theUserMustSeeTheProducts(Map<String,String> dataTable) {
        theActorInTheSpotlight().should(
                seeThat("the displayed products", HomePageCompare.lblProducts(), equalTo(dataTable.get("lbl_products"))),
                seeThat("the displayed product back pack", HomePageCompare.lblProductBackPack(), equalTo(dataTable.get("lbl_product_backpack")))
        );
    }
}
