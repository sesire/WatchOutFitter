package RegressionSuite;

import Regression.LogInPage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInPageTest extends CommonApi {
    LogInPage objOfLogInPage = null;
    @BeforeMethod
    public void initializationOfElements(){
        objOfLogInPage = PageFactory.initElements(driver,LogInPage.class);
    }
    @Test
    public void SignInBox(){
        objOfLogInPage.SignInBox();
        System.out.println("Invalid Password");

    }
}
