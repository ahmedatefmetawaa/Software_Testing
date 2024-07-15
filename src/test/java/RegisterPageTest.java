import org.testng.annotations.Test;



public class RegisterPageTest extends TestBase {

    private HomePage homepage;
    private RegisterPage registerpage;

    @Test
    public  void ValidRegisterTC () throws InterruptedException {
    homepage = new HomePage(driver);
    registerpage = homepage.ClickRegisterButton();
    Thread.sleep(3000);
    registerpage.ClickONCaptchu();
    registerpage.enterFullName("Ahmed Atef Ahmed");
    registerpage.enterMail("ahmedatef07718@gmail.com");
    registerpage.enterPassword("ahmed123@@@@@@");
    registerpage.ClickONSignUpButton();
    }
}
