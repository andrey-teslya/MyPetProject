package pages;

/**
 * Created by ateslya on 1/3/2018.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage{
    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }

    //*********Page Variables*********
    String baseURL = "https://www.wikipedia.org/";

    //*********Web Elements*********
    String privacyPolicyLink = "/html[@class='js-enabled']/body[@id='www-wikipedia-org']/p[@class='site-license']/small[@class='jsl10n'][3]/a";


    //*********Page Methods*********

    //Go to Homepage
    public void openHomePage(){
        driver.get(baseURL);
        //driver.navigate().to(baseURL);
    }

    //Go to Customer Service Page
    public void goToPrivacyPolicyPage(){
        WebDriverWait wait;
        //wait = new WebDriverWait(driver,15);
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        click(By.xpath(privacyPolicyLink));
    }
}
