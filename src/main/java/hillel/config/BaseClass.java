package hillel.config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    static private WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null){driver = DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);}
        return driver;
    }
}
