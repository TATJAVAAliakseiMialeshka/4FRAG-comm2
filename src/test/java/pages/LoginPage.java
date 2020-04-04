package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class LoginPage extends BasePageClass {

    private static final String EMAIL_FIELD_XPATH = "//input[@id = 'exampleInputEmail1']";

    private static final String PASSWORD_FIELD_XPATH = "//input[@id = 'exampleInputPassword1']";


    public String getParamFromProperty(String propertyName) {
        FileInputStream fis;
        Properties properties = new Properties();
        String emailFromPropertyFile = "";
        try {
            fis = new FileInputStream("./src/test/java/resources/application.properties");
            properties.load(fis);
            emailFromPropertyFile = properties.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            LOGGER.warning("Check out file's path");
        } catch (IOException e) {
            LOGGER.warning(e.getMessage());
        }
        return emailFromPropertyFile;
    }


    public LoginPage fillOutEmailField() throws InterruptedException {
        WebElement emailField = waitForExpectedElement(By.xpath(String.format(EMAIL_FIELD_XPATH)));
        //I know that sleepers are very bad practice, but how I can set ExplicitWait there, currently have no ideas
        Thread.sleep(2000);
        emailField.sendKeys(getParamFromProperty("email"), Keys.ENTER);
        return this;
    }


    public PersonalAreaPage fillOutPasswordField() throws InterruptedException {
        WebElement passwordField = waitForExpectedElement(By.xpath(String.format(PASSWORD_FIELD_XPATH)));
        passwordField.sendKeys(getParamFromProperty("password"), Keys.ENTER);
        return new PersonalAreaPage();
    }
}
