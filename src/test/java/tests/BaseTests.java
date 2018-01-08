package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;

/**
 * Created by ateslya on 1/3/2018.
 */
public class BaseTests{

    public WebDriver driver;

    @BeforeClass
    public void setup() {
        //Create a Chrome driver. All test and page classes use this driver.
        //ChromeOptions options = new ChromeOptions();
        //options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
        driver = new ChromeDriver();

        //Maximize Window
        driver.manage().window().maximize();
    }

    @Test
    public void openingCustomerServicePage() {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);

        //*************PAGE METHODS********************
        //Open HomePage
        homePage.openHomePage();
        homePage.goToPrivacyPolicyPage();
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
