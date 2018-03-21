package utils;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractTest {
	protected static WebDriver driver;

    @BeforeClass
    public static void openWebsite() {
        System.setProperty("webdriver.gecko.driver",".\\src\\test\\java\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeWebsite(){
        try {
			driver.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
}