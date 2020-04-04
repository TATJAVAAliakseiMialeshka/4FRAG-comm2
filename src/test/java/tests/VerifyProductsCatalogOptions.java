package tests;

import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductPage;
import pages.WishListPage;

public class VerifyProductsCatalogOptions extends MainPage {

    @Test
    public void testChooseProductFromCatalog(){

        //some UI controlls was clicked, but nothing is checked in the end.
        WishListPage productPage = new MainPage()
                .openHomePage()
                .chooseProductCategory()
                .checkBrandOfChosenProduct()
                .filloutInputFormaxPrice()
                .clickOnTheProductTypeDropDown()
                .chooseProductFromProductTypeDropDown()
                .filloutInputDPIAndCPIResolutionValue()
                .chooseProductSubCategoryFromResultList()
                .addProductToWishListFromResultList()
                .closePopUpWindow()
                .openProductInTheWishListPage();
    }
}
