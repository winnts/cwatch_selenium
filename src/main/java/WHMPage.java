import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by adyachenko on 26.05.16.
 */
public class WHMPage {
    public static final By LNK_CWAF = By.id("plugins_comodo_waf");

    public static void openCWAF (WebDriver driver) {
        WebElement cwaf = driver.findElement(LNK_CWAF);
        cwaf.click();
    }
}
