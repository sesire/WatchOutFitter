package Regression;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends CommonApi {
    CommonApi objOfCommonApi;

    @FindBy(linkText = "Sign in")
    WebElement SighInTab;

    @FindBy(xpath = "//*[@id='userid']")
    WebElement UserNameField;

    @FindBy(xpath = "//*[@id='pass']")
    WebElement PasswordField;

    @FindBy(id ="sgnBt")
    WebElement SignInButton;

    public void SignInBox(){
        SighInTab.click();
        UserNameField.sendKeys("username", Keys.ENTER);
        PasswordField.sendKeys("password", Keys.ENTER);
        SignInButton.click();



    }

}

