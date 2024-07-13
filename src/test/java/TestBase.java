import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

protected WebDriver driver;
HomePage homePage;

@BeforeTest

public void OpenBrowser () throws InterruptedException {

    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.udemy.com/");
    Thread.sleep(4000);
}

//@Test

 //   public void HomePageTest(){

   // homePage = new HomePage(driver);
   // homePage.ClickRegisterButton();
//}

//@AfterTest
  //  public void quit (){

  //  driver.quit();
//}



}
