package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

    static WebDriver driver;

    @BeforeClass
    public static void openURL() {
        Reporter.log("=====Browser Session Started=====", true);
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
    }

//    @AfterClass
//
//    public void closeApplication() {
//        driver.quit();
//        Reporter.log("=====Browser Session End=====", true);
//
//    }
}
