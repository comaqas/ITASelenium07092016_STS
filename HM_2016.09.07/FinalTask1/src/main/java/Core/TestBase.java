package Core;

import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by user on 29.08.2016.
 */
public class TestBase {

    @BeforeTest
    public  void setup(){


//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stelmak\\chromedriver.exe");
//        System.setProperty("selenide.browser", "chrome");
        open("http://automationpractice.com/index.php");
        //Configuration.holdBrowserOpen = true;
    }

//    @AfterTest
//    public void teardown(){
//        driver.quit();
//
//    }
}

