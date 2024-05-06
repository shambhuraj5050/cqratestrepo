package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import propertiesutils.propertiesutils;

import java.io.IOException;
import java.util.Properties;

import static Browser.BrowserDriverConfig.getwebdriver;

public class BaseClass {
    static Properties properties=null;
    static WebDriver driver;

        public static void intitialsetup() throws IOException {
            properties = propertiesutils.getapplicationproperties();
            String url = (String) properties.get("application_url");
            WebDriverManager.chromedriver().setup();

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless"); // Add headless argument directly

            driver = new ChromeDriver(options);

            driver.get(url);
            driver.manage().window().maximize();
        }


        public static void closemethod(){
        driver.quit();
        }
    }

