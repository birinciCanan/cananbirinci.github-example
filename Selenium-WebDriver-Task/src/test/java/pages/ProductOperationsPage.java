package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductOperationsPage {
	WebDriver driver;
	
	public ProductOperationsPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void searchProduct(String productName) {
    	driver.findElement(By.id("searchData")).sendKeys(productName);
    	driver.findElement(By.className("searchBtn")).click();
    }
    
    public void getSecondPage() {
    	driver.findElement(By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[3]/a[2]")).click();
    }
    
    public void addFavoriteProduct() {
        driver.findElement(By.xpath("//*[@id='view/ul/li[3]/div/div[1]/a']")).click();
    	driver.findElement(By.xpath("//*[@id='skuArea/fieldset/select/option[2]']")).click();
        driver.findElement(By.id("getWishList")).click();
        try {
      	   Thread.sleep(5000);
         } catch (InterruptedException e) {
      	   e.printStackTrace();
         }
        driver.findElement(By.id("addToFavouriteWishListBtn")).click();
        driver.get("https://www.n11.com/hesabim/favorilerim");
    }
    
    public void deleteFavoriteProduct() {
    	try {
       	   Thread.sleep(3000);
        } catch (InterruptedException e) {
       	   e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"view\"]/ul/li/div/div[3]/span")).click();
        try {
       	   Thread.sleep(3000);
        } catch (InterruptedException e) {
       	   e.printStackTrace();
        }
    }
    
    public boolean isAnyProductDisplayed() {
    	return !driver.findElements(By.id("view")).isEmpty();
    }
    // bu projeyi nereden buldun böyle :) 
    // çok mu kötü :D bunları yazabildin mi bilmiyorum da 
    // burada bir hata var o da skuArea ile başlayan ve fieldset/select bunla giden dizin
    // altında option[2] indexli elemanını bulamıyor.  burayı 
    /*
     *  şöyle kurtarabiliriz diye umuyorum 
     *  eğer option boşsa urun eklemesin veya ne yapıyorsa kodun akışında artık .
     *  Takip edilen ürün bulundu mesajı verip ürünü bulamıyor gibi bir hata sanırım 
     *  
     * 
     */
}
