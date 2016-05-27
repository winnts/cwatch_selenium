import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by adyachenko on 26.05.16.
 */
public class CheckCWAF {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        LoginPage.login(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10); //seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topFrame")));
        driver.switchTo().frame(driver.findElement(By.id("commander")));
//        String element = driver.getPageSource();
//        System.out.println(element);
        WHMPage.openCWAF(driver);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mainFrame")));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.id("mainFrame")));
//        System.out.println(driver.getPageSource());
        System.out.println("Current Rules version: " + driver.findElement(CWAFPlugin.getTBL_Main_CurrRuleVer()).getText());
        System.out.println("Current CWAF version: " + driver.findElement(CWAFPlugin.getTBL_Main_CWAFPlugVer()).getText());

        driver.findElement(CWAFPlugin.getTAB_Security()).click();
        Select securityStatus = new Select(driver.findElement(CWAFPlugin.getTBL_Security_SecEng()));
        System.out.println("Current Security Status: " + securityStatus.getFirstSelectedOption().getText());

        driver.findElement(CWAFPlugin.getTAB_cWATCH()).click();
        System.out.println("Network Token: " + driver.findElement(CWAFPlugin.getTXT_Config_NetworkToken()).getText());
        driver.close();

    }
}
