package Regression;

import base.CommonApi;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends CommonApi {
    CommonApi objOfCommonApi;

    @FindBy
            (how = How.ID, using = "gh-ac")
    public WebElement searchBox;


    @FindBy
            (how = How.ID,using = "gh-btn")
    public WebElement searchButton;


    public void searchBox(){
        searchBox.sendKeys("Tissot", Keys.ENTER);
        searchButton.click();
    }

}
