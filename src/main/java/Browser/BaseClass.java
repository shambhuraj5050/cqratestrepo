package Browser;

import org.openqa.selenium.WebDriver;
import propertiesutils.propertiesutils;

import java.io.IOException;
import java.util.Properties;

import static Browser.BrowserDriverConfig.getwebdriver;

public class BaseClass {
    static Properties properties=null;
    static WebDriver driver;
    public static void intitialsetup() throws IOException {

            properties= propertiesutils.getapplicationproperties();
            String url =(String)properties.get("application_url");
            driver = getwebdriver("chrome");
            driver.get(url);
            driver.manage().window().maximize();
        }
        public static void closemethod(){
        driver.quit();
        }
    }

