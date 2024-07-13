import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase {


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private  By fullName = By.name("fullname");
    private WebElement fullnameElement;
    private  By mail = By.name("email");
    private WebElement mailElement;
    private  By password = By.name("password");
    private WebElement passwordElement;
    private By SignUpButton =By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div/main/div/div/form/div[6]/button");
    private WebElement SignUpButtonElement;
    private By captchu =By.xpath("//input[@type = 'checkbox']");
    private WebElement capatchuElement;

    public void enterFullName(String name){
        fullnameElement = driver.findElement(fullName);
        HomePage.SendText(fullnameElement , name);
    }
    public void enterMail(String email){
        mailElement = driver.findElement(mail);
        HomePage.SendText(mailElement , email);
    }
    public void enterPassword(String pass){
        passwordElement = driver.findElement(password);
        HomePage.SendText(passwordElement , pass);
    }

    public void ClickONSignUpButton (){
        SignUpButtonElement = driver.findElement(SignUpButton);
        HomePage.clicking(SignUpButtonElement);
    }

    public void ClickONCaptchu(){
        capatchuElement = driver.findElement(captchu);
        HomePage.clicking(capatchuElement);
    }


}
