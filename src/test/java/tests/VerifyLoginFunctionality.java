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
        //it's better to check something on PersonalPage UI.
        // But if you want just current url, then the PersonalPage object itself is not needed. just write: "new MainPage.openHomePa......
        Assert.assertEquals(driver.getCurrentUrl(), "https://stage.4frag.ru/my-account/");
    }
}
