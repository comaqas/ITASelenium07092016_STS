package Core;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by user on 25.08.2016.
 */
public class TestBase {
   //protected WebDriver driver;

    @BeforeTest
    public  void setup(){


//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//        System.setProperty("selenide.browser", "chrome");
        open("https://mail.ru");



    }

//    @AfterTest
//    public void teardown(){
//        driver.quit();
//
//    }
}
