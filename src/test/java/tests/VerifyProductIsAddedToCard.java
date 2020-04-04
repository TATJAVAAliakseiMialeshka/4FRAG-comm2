package tests;

import abstractPackage.BasePageClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.CardPage;
import pages.MainPage;

public class VerifyProductIsAddedToCard extends MainPage{


    @Test
    public void testAdditionProductToCard()   {
       CardPage mainPage = new MainPage()
            .openHomePage()
            .addProductToCard()
             .closePopUpWindow()
            .goToTheCardPage();
           //    .initiateOrder("Оформить заказ");





    }
}
