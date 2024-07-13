import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By mail = By.name("email");
    private WebElement mailElement;
    private  By password = By.xpath("//input[@type = 'password']");
    private WebElement passwordElement;
    private By LoginButton =By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/div[4]/form/button");
    private WebElement LoginButtonElement;
    private By ForgetPassword =By.linkText("Forgot Password");
    private WebElement ForgetPasswordElement;
    private By GoogleButton =By.linkText("#icon-google");
    private WebElement GoogleButtonElement;

    public void enter_email(String mails){
        mailElement = driver.findElement(mail);
        HomePage.SendText(mailElement , mails);
    }
    public void enter_password(String pass){
        passwordElement = driver.findElement(password);
        HomePage.SendText(passwordElement , pass);
    }
    public void press_login(){
        LoginButtonElement = driver.findElement(LoginButton);
        HomePage.clicking(LoginButtonElement);
    }
    public void press_ForgetPassword(){
        ForgetPasswordElement = driver.findElement(ForgetPassword);
        HomePage.clicking(ForgetPasswordElement);
    }
    public void press_GoogleButton(){
        GoogleButtonElement = driver.findElement(GoogleButton);
        HomePage.clicking(GoogleButtonElement);
    }
}


