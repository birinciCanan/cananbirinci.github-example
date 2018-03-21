package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
    String pageUrl = "https://www.n11.com";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void getPage() {
        driver.get(pageUrl);
    }
    
    public boolean isDisplayPage() {
    	return driver.findElement(By.className("btnSignIn")).isEnabled();
    }
    
    public void clickSignIn() {
    	 driver.findElement(By.className("btnSignIn")).click();
    }
}
