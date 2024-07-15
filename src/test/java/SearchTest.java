import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchTest extends TestBase {



    HomePage homePage;

        public void VerifySearchingTC () {
        homePage = new HomePage(driver);
        homePage.ClickSearchButton("Development");
        homePage.ClickSearchButton("Web-Development");
        homePage.ClickSearchButton("c++");
        homePage.ClickSearchButton("Tarek Roshdy");
        homePage.ClickSearchButton("Black Box Technique");
        homePage.ClickSearchButton("Webentwicklung");
    }

    }

