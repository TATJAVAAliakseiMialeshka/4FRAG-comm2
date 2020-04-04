package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;


public class VerifyHeaderButtonsAreClickable extends MainPage {

    //all these tests don't check whether page is displayed. I see checks that some object of page was created. it tells nothing.
    // it's just an empty object which will be created anyway. even if after click on a tab nothing is happened.
    // you need to check specifically something on a pege.
    //ex: LoginFormPage loginFormPage = new MainPage()
    //                .openHomePage()
    //                .openTabPage("Вход/регистрация");
    // AssertTrue(loginFormPage.isLoginFormDisplayed(String formName));
    // loginFormPage.isLoginPageUrlDisplayed(String url));
    // etc.....

    //if you have parameters, it should be in parameter, not hardcoded in openTabPage(....
    //same for all places

    //@parameters ann works not like this - it sends annos from xml. google it.
    @Test
    @Parameters("Вход/регистрация")
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
        // AssertTrue(deliveryPage.isDeliveryPageOpened(some UI el is loaded, previous form disappeared, successful message shown, page url is expected etc)
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
                .openTabPage("Сравнение товаров");
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






