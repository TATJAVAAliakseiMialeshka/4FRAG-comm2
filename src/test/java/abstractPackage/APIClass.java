package abstractPackage;

import org.openqa.selenium.WebDriver;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

//overall, this level of abstraction looks redundant. these methods could be just located in BasePageClass
public abstract class APIClass {

    protected static WebDriver driver;


    public abstract WebDriver getDriver();

    public void open(String url) {
        getDriver().get(url);
    }

//remove unused delay method
    public void delay(long millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
           LOGGER.info(e.getMessage());
        }
    }

    public void maximizeWindow() {
        driver.manage().window().maximize();
    }
}
