package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class CardPage extends BasePageClass {


    private static final String SET_UP_ORDER_XPATH = "//a[text()='%s']";



    public CardPage initiateOrder(String linkText) {
        WebElement buyButton =  waitForExpectedElement(By.xpath(String.format(SET_UP_ORDER_XPATH, linkText)));
        buyButton.click();
        return this;
    }
}
