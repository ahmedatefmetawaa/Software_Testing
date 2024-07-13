import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    private HomePage homepage;
    private LoginPage loginPage;

    @Test
    public void ValidRegisterTC() throws InterruptedException {
        homepage = new HomePage(driver);
        loginPage = homepage.ClickLoginButton();
        Thread.sleep(3000);
        loginPage.enter_email("ahmedatef07718@gmail.com");
        loginPage.enter_password("ahmed123@@@@@");
        loginPage.press_login();
        loginPage.press_ForgetPassword();
        loginPage.press_GoogleButton();
    }
}
