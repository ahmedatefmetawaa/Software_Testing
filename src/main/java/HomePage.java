import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    By loginButton = By.xpath("//a[@data-purpose = 'header-login']");
    By registerButton = By.xpath("//a[@data-purpose = 'header-signup']");
    private By SearchBar = By.xpath("//input[@placeholder='Search for anything']");
    private By search = By.xpath("//button[@type='submit']");

    WebElement registerButtonElement;
    WebElement loginButtonElement;
    WebElement SearchBarElement;
    WebElement searchElement;
    public RegisterPage ClickRegisterButton(){
        registerButtonElement = driver.findElement(registerButton);
       clicking(registerButtonElement);
    return new RegisterPage(driver);
    }
    public LoginPage ClickLoginButton(){
        registerButtonElement = driver.findElement(loginButton);
        clicking(loginButtonElement);
    return new LoginPage(driver);
    }
    public void ClickSearchButton(String element){
        SearchBarElement = driver.findElement(SearchBar);
        searchElement = driver.findElement(search);
        clicking(SearchBarElement);
        SendText(SearchBarElement , element);
        clicking(searchElement);
    }

}
