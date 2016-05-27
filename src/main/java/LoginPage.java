import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by adyachenko on 26.05.16.
 */
public class LoginPage {
    public static final By FLD_User = By.id("user");
    public static final By FLD_Pass = By.id("pass");
    public static final By BTN_Login = By.id("login_submit");
    public static final String URL = "https://10.8.3.18:2087";

    public static void login (WebDriver driver){
        driver.get(URL);
        WebElement user = driver.findElement(FLD_User);
        user.sendKeys(new Credentials().getUser());
        WebElement pass = driver.findElement(FLD_Pass);
        pass.sendKeys(new Credentials().getPass());
        WebElement login = driver.findElement(BTN_Login);
        login.click();
    }



}
