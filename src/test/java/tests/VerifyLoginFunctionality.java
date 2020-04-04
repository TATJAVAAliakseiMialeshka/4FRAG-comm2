package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PersonalAreaPage;


public class VerifyLoginFunctionality extends MainPage {


    @Test
    public void testLoginOption() throws InterruptedException {
        PersonalAreaPage personalArea = new MainPage()
                .openHomePage()
                .openLoginPage()
                .fillOutEmailField()
                .fillOutPasswordField();
        Assert.assertEquals(driver.getCurrentUrl(), "https://stage.4frag.ru/my-account/");
    }
}
