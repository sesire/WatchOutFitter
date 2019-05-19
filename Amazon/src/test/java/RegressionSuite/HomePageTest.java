package RegressionSuite;

import Regression.Homepage;
import org.testng.annotations.Test;

public class HomePageTest extends Homepage {
    @Test
    public void loginWithValidPass(){
        clickAccount();
        writeUserName();
        writePassword();
    }

}
