package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/tawhidurislam/WebAutoPro/Generic/drivers/chromedriver 3");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

}
