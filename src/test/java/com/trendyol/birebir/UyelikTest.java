package com.trendyol.birebir;

import org.testng.annotations.Test;

public class UyelikTest extends BaseTest {

    @Test
    public void register(){
        UyelikPage uyelikPage = new UyelikPage(webDriver);

        User user = UserPool.getUser();
        HomePage homePage = uyelikPage.uyelik(user);
//        homePage.waitForLoad();
//        homePage.popupClose();


    }
}
