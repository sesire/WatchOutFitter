package RegressionSuite;
import Regression.SearchPage;
import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchPageTest extends CommonApi {
    SearchPage objOfSearchPage = null;

    @BeforeMethod
    public void initializationOfElements() {
        objOfSearchPage = PageFactory.initElements(driver, SearchPage.class);

    }
    @Test
    public void searchBoxTest(){
        objOfSearchPage.searchBox();
        System.out.println("Passed");
    }
}
