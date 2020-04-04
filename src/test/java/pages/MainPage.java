package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class MainPage extends BasePageClass {


    private static final String APPLICATION_URL = "https://stage.4frag.ru/";

    private static final String MAX_PRICE_VALUE = "16000";

    private static final String DPI_AND_CPI_RESOLUTION_VALUE = "23000";

    private static final String BUY_PRODUCT_XPATH = "//a[text()='Купить']";

    private static final String CLOSE_BUTTON_WINDOW_LOCATOR = "//div[@id='notification-type']//button[contains(@class,'close')]";

    private static final String CARD_BUTTON_XPATH = "//span[text() = 'Корзина']";

    private static final String LOGIN_PAGE_XPATH = "//a[text() = 'Вход/регистрация']";

    private static final String ADD_TO_CAMPARASION_LIST_ICON_XPATH = "//div[contains(@class,'center-block')]//a[contains(@class,'item-compare-btn')]";

    private static final String CATEGORY_SECTION_XPATH = "//span[contains(text(), 'Игровые мыши')]";

    private static final String CHACKBOX_BRAND_OF_CHOSEN_PRODUCT_XPATH = "//div[contains(@class, 'checkbox checkbox-success')]//input[1]";

    private static final String INPUT_MAX_PRICE_XPATH = "//input[contains(@id, 'price-max')]";

    private static final String PRODUCT_TYPE_DROPDOWN_XPATH = "//div[contains(@class, 'col-filter-div')]//select";

    private static final String OPTION_FROM_PRODUCT_TYPE_XPATH = "//div[contains(@class, 'col-filter-div')]//select//option[contains(text(), 'Лазерный')]";

    private static final String INPUT_DPI_AND_CPI_RESOLUTION_XPATH = "//input[contains(@id, 'at52-max')]";

    private static final String SUB_CATEGORY_OPTION_XPATH = "//div[contains(@class, 'brands-list')]//div//a[1]";

    private static final String ADDO_TO_WISH_LIST_BUTTON_XPATH = "//div[contains(@class, 'center-block')]//a[2]";

     private static final String WISH_LIST_PAGE_XPATH = "//span[contains(text(), 'Закладки')]";

    private static final String ELEMENT_WITH_TEXT = "//*[contains(text(),'%s')]";

    public MainPage openHomePage() {
        open(APPLICATION_URL);
        return this;
    }


    public MainPage addProductToCard() {
        WebElement buyButton = waitForExpectedElement(By.xpath(String.format(BUY_PRODUCT_XPATH)));
        buyButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
}

    public MainPage closePopUpWindow() {
        WebElement closeButton = waitForExpectedElement(By.xpath(String.format(CLOSE_BUTTON_WINDOW_LOCATOR)));
        closeButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }



    public CardPage goToTheCardPage() {
        WebElement closeButton = waitForExpectedElement(By.xpath(String.format(CARD_BUTTON_XPATH)));
        closeButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new CardPage();
    }


    public LoginPage openLoginPage() {
        WebElement loginPage = waitForExpectedElement(By.xpath(String.format(LOGIN_PAGE_XPATH)));
        loginPage.click();
        maximizeWindow();
        return new LoginPage();
    }


    public MainPage addItemToComparasionList() {
        WebElement comparasionButton = waitForExpectedElement(By.xpath(String.format(ADD_TO_CAMPARASION_LIST_ICON_XPATH)));
        comparasionButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }


    public MainPage chooseProductCategory() {
        WebElement sectionProductButton = waitForExpectedElement(By.xpath(String.format(CATEGORY_SECTION_XPATH)));
        sectionProductButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }


    public MainPage checkBrandOfChosenProduct() {
        WebElement chooseBrandCheckbox = waitForExpectedElement(By.xpath(String.format(CHACKBOX_BRAND_OF_CHOSEN_PRODUCT_XPATH)));
        chooseBrandCheckbox.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage filloutInputFormaxPrice() {
        WebElement fillOutMaxPrice = waitForExpectedElement(By.xpath(String.format(INPUT_MAX_PRICE_XPATH)));
        fillOutMaxPrice.sendKeys(MAX_PRICE_VALUE, Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage clickOnTheProductTypeDropDown() {
        WebElement productTypeDropDown = waitForExpectedElement(By.xpath(String.format(PRODUCT_TYPE_DROPDOWN_XPATH)));
        productTypeDropDown.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;

    }

    public MainPage chooseProductFromProductTypeDropDown() {
        WebElement productFromProductTypeDropDown = waitForExpectedElement(By.xpath(String.format(OPTION_FROM_PRODUCT_TYPE_XPATH)));
        productFromProductTypeDropDown.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage filloutInputDPIAndCPIResolutionValue() {
        WebElement fillOutDPIAndCPIResolutionValue = waitForExpectedElement(By.xpath(String.format(INPUT_DPI_AND_CPI_RESOLUTION_XPATH)));
        fillOutDPIAndCPIResolutionValue.sendKeys(DPI_AND_CPI_RESOLUTION_VALUE, Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;

    }


    public MainPage chooseProductSubCategoryFromResultList() {
        WebElement subcategoryOption = waitForExpectedElement(By.xpath(String.format(SUB_CATEGORY_OPTION_XPATH)));
        subcategoryOption.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage addProductToWishListFromResultList() {
        WebElement wishListButton = waitForExpectedElement(By.xpath(String.format(ADDO_TO_WISH_LIST_BUTTON_XPATH)));
        wishListButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public WishListPage openProductInTheWishListPage() {
        WebElement wishListPage = waitForExpectedElement(By.xpath(String.format(WISH_LIST_PAGE_XPATH)));
        wishListPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new WishListPage();
    }

    public boolean openTabPage(String tabItem) {
        maximizeWindow();
        WebElement pageButton = waitForExpectedElement(By.xpath(String.format(ELEMENT_WITH_TEXT, tabItem)));
        waitPageIsLoadedAndJQueryIsProcessed();
        return pageButton.isDisplayed();
    }
}

