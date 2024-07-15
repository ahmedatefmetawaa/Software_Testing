import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    By loginButton = By.xpath("//a[@data-purpose = 'header-login']");
    By registerButton = By.xpath("//a[@data-purpose = 'header-signup']");

    By Search = By.xpath("//input[@id='u323-search-form-autocomplete--3']");
    By Searchicon = By.xpath("//*[@id=\"udemy\"]/div[1]/div[1]/div[4]/div[2]/form/button");

    WebElement SearchElement;
    WebElement SearchiconElement;
    WebElement registerButtonElement;
    WebElement loginButtonElement;

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
    public  SortPage  ClickSearchButton(String name){
        SearchElement = driver.findElement(Search);
        SearchiconElement = driver.findElement(Searchicon);
        clicking(SearchElement);
        SendText(SearchElement , name);
        clicking(SearchiconElement);
    return new SortPage(driver);
    }

}
