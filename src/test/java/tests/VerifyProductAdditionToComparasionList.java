package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.ComparasionListPage;
import pages.MainPage;

public class VerifyProductAdditionToComparasionList extends MainPage {

    //same. test don't check whether page is displayed.
    @Parameters({"Сравнение товаров"})
    @Test
    public void testProductAdditionToTheList(){
      boolean isComparasionListPage = new MainPage()
                .openHomePage()
                .addItemToComparasionList()
                .closePopUpWindow()
                .openTabPage("Сравнение товаров");
       Assert.assertTrue(isComparasionListPage);
    }
}
