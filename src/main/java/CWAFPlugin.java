import org.openqa.selenium.By;

/**
 * Created by adyachenko on 27.05.16.
 */
public class CWAFPlugin {
    public static final By TAB_Main             = By.id("ui-id-1");
    public static final By TAB_Config           = By.id("ui-id-2");
    public static final By TAB_Security         = By.id("ui-id-3");
    public static final By TAB_Userdata         = By.id("ui-id-4");
    public static final By TAB_Feedback         = By.id("ui-id-5");
    public static final By TAB_Catalog          = By.id("ui-id-6");
    public static final By TAB_ProtectionWizard = By.id("ui-id-7");
    public static final By TAB_cWATCH           = By.id("ui-id-8");

    public static final By TBL_Main_CurrRuleVer      = By.xpath("/html/body/div[1]/div[5]/div[1]/table/tbody/tr[1]/td[2]");
    public static final By TBL_Main_CWAFPlugVer      = By.xpath("/html/body/div[1]/div[5]/div[1]/table/tbody/tr[2]/td[2]");
    public static final By TBL_Security_SecEng      = By.id("secengine");
    public static final By TXT_Config_NetworkToken  = By.id("cwatch_network_id");

    public static By getTBL_Main_CurrRuleVer() {
        return TBL_Main_CurrRuleVer;
    }

    public static By getTBL_Main_CWAFPlugVer() {
        return TBL_Main_CWAFPlugVer;
    }

    public static By getTBL_Security_SecEng() {
        return TBL_Security_SecEng;
    }

    public static By getTXT_Config_NetworkToken() {
        return TXT_Config_NetworkToken;
    }

    public static By getTAB_Main() {
        return TAB_Main;
    }

    public static By getTAB_Config() {
        return TAB_Config;
    }

    public static By getTAB_Security() {
        return TAB_Security;
    }

    public static By getTAB_Userdata() {
        return TAB_Userdata;
    }

    public static By getTAB_Feedback() {
        return TAB_Feedback;
    }

    public static By getTAB_Catalog() {
        return TAB_Catalog;
    }

    public static By getTAB_ProtectionWizard() {
        return TAB_ProtectionWizard;
    }

    public static By getTAB_cWATCH() {
        return TAB_cWATCH;
    }
}
