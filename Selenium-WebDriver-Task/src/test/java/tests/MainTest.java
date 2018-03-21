package tests;

import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductOperationsPage;
import utils.AbstractTest;

public class MainTest extends AbstractTest{
	@Test
	public void TestPages() {
		HomePage homePage = new HomePage(driver);
		homePage.getPage();
		if(homePage.isDisplayPage()) {
			System.out.println("Anasayfa Açıldı");
			homePage.clickSignIn();
			
			System.out.println("Login Page Açıldı");
			LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("seleniumwebdriver25@gmail.com","s14789652");
	        System.out.println("Login Yapıldı");
	        
	        ProductOperationsPage productOperationsPage = new ProductOperationsPage(driver);
	        productOperationsPage.searchProduct("Samsung");
	        System.out.println("Arama Yapıldı");
	        
	        if(productOperationsPage.isAnyProductDisplayed()) {
	        	System.out.println("Sonuçlar Listelendi");
	        	productOperationsPage.getSecondPage();
	        	if(productOperationsPage.isAnyProductDisplayed()) {
	        		System.out.println("Takip Edilen Ürün Bulundu");
	        		productOperationsPage.addFavoriteProduct();
	        		if(productOperationsPage.isAnyProductDisplayed()) {
	        			System.out.println("Takip Edilen Ürün Favorilerime Eklendi");
	        			productOperationsPage.deleteFavoriteProduct();
	        			System.out.println("Takip Edilen Ürün Favorilerimden Kaldırıldı");
	        		}else {
	        			System.out.println("Takip Edilen Ürün Bulunamadı!!!");
	        		}
		        }else {
	        		System.out.println("İkinci Sayfada Sonuç Bulunamadı!!!");
	        	}
	        }
	        else {
	        	System.out.println("Sonuç Bulunamadı!!!");
	        }
		}else {
			System.out.println("Sayfa Açılamadı");
		}        
	}	
}
