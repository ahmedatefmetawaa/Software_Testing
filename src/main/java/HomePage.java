import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    By loginButton = By.xpath("//a[@data-purpose = 'header-login']");
    By registerButton = By.xpath("//a[@data-purpose = 'header-signup']");

    WebElement registerButtonElement;
    WebElement loginButtonElement;

    public void ClickRegisterButton(){
        registerButtonElement = driver.findElement(registerButton);
       clicking(registerButtonElement);

    }
    public void ClickLoginButton(){
        registerButtonElement = driver.findElement(loginButton);
        clicking(loginButtonElement);

    }

}
