package com.swaglabs.questions;

import com.swaglabs.UI.HomePage;
import com.swaglabs.UI.LoginFormPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class HomePageCompare {

    public static Question<String> lblProducts(){
        return actor -> TextContent.of(HomePage.LBL_PRODUCTS).answeredBy(actor).toLowerCase();
    }
    public static Question<String> lblProductBackPack(){
        return actor -> TextContent.of(HomePage.LBL_PRODUCT_BACKPACK).answeredBy(actor).toLowerCase();
    }
}
