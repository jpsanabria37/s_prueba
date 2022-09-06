package com.swaglabs.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target LBL_PRODUCTS = Target.the("displayed label products")
            .located(By.xpath("//span[text() = \"Products\"]"));

    public static final Target LBL_PRODUCT_BACKPACK = Target.the("displayed label product back pakc")
            .located(By.xpath("//div[text() = \"Sauce Labs Backpack\"]"));
}
