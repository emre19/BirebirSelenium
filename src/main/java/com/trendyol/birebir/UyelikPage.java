package com.trendyol.birebir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UyelikPage extends BasePage {

    By emailBy = By.id("register-email");
    By passwordBy = By.name("register-password");
    By genderBy = By.cssSelector(".q-secondary.q-fluid.q-button-medium");
    By submitBy = By.cssSelector(".q-primary.q-fluid");

    public UyelikPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage uyelik(User user){
        sendKeys(emailBy, user.getEmail());
        sendKeys(passwordBy, user.getPassword());
        //click(genderBy,5);
        click(submitBy,5);
        return new HomePage(webDriver);
    }
}
