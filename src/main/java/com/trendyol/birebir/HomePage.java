package com.trendyol.birebir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    By popup = By.className("modal-close");
    By elektronikBy = By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[9]/a"); // zaman kısıtından adam akıllı xpath yazamadım yoksa böyle yazılmaz biliyorum :)

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void popupClose(){
        click(popup,5);
    }

    public void waitForLoad() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(popup));
    }

    public void elektronik(){
        click(elektronikBy,5);
    }
}
