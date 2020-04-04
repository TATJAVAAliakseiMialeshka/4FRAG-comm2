package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;


public class VerifyHeaderButtonsAreClickable extends MainPage {

    @Parameters({"Вход/регистрация"})
    @Test
    public void testLoginButtonIsClickable(){
        Boolean isLoginPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Вход/регистрация");
        Assert.assertTrue(isLoginPageDisplayed);
    }

    @Parameters({"Доставка"})
    @Test
    public void testDeliveryButtonIsClickable(){
        Boolean isDeliveryPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Доставка");
        Assert.assertTrue(isDeliveryPageDisplayed);
    }

    @Parameters({"Оплата"})
    @Test
    public void testPaymentButtonIsClickable(){
        Boolean isPaymentPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Оплата");
        Assert.assertTrue(isPaymentPageDisplayed);

    }

    @Parameters({"Система скидок"})
    @Test
    public void testDiscountSystemButtonIsClickable(){
        Boolean isDiscountSystemPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Система скидок");
        Assert.assertTrue(isDiscountSystemPageDisplayed);
    }


    @Parameters({"Гарантия"})
    @Test
    public void testWarrantyButtonIsClickable(){
        Boolean isWarrantyPageDisplayed = new MainPage()
                .openHomePage()
                .openTabPage("Гарантия");
        Assert.assertTrue(isWarrantyPageDisplayed);
    }

    @Parameters({"Закладки"})
    @Test
    public void testBookmarksButtonIsClickable(){
       Boolean isBookmarksPage = new MainPage()
                .openHomePage()
                .openTabPage("Закладки");
        Assert.assertTrue(isBookmarksPage);
    }


    @Parameters({"Сравнение товаров"})
    @Test
    public void testComparasionOfProductsButtonIsClickable(){
        Boolean isComparasionListPage = new MainPage()
                .openHomePage()
                .openTabPage("Cравнение товаров");
        Assert.assertTrue(isComparasionListPage);
    }

    @Parameters({"Корзина"})
    @Test
    public void testBasketButtonIsClickable(String basket){
          Boolean isBasketPageDisplayed = new MainPage()
                  .openHomePage()
                  .openTabPage(basket);
          Assert.assertTrue(isBasketPageDisplayed);
        }
    }






