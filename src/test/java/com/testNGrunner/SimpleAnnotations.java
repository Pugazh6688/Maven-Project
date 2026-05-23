package com.testNGrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SimpleAnnotations {
    WebDriver driver;
@BeforeSuite
public void browsersetup(){
    System.out.println("Browser setup is Done");
     driver = new ChromeDriver();
    driver.manage().window().maximize();
}
@BeforeTest
    public void lanuchAmazon(){
    System.out.println(" Amazon launched successfully");
    driver.get("https://www.amazon.in/");
}
@BeforeClass
    public void searchProduct(){
    WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
    searchbox.sendKeys("oneplus");
    WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
    searchBtn.click();
    System.out.println("The Product search Successfully");
}
@BeforeMethod
    public void verifyProduct(){
    WebElement verify = driver.findElement(By.xpath("(//span[contains(text(),'oneplus')])[1]"));
    String text = verify.getText();
    System.out.println("Here is the displayed product: " + text);
}
@Test
    public void addCart(){
    WebElement cart = driver.findElement(By.xpath("(//button[@name = 'submit.addToCart'])[1]"));
    cart.click();
    System.out.println("Product added to Cart");
}
@AfterMethod
    public void checkCart(){
    WebElement viewCart = driver.findElement(By.xpath("//div[@id = 'nav-cart-count-container']"));
    viewCart.click();
    System.out.println("Open the Cart");
}
@AfterClass
    public void buyProd(){
    WebElement buy = driver.findElement(By.xpath("//input[@name = 'proceedToRetailCheckout']"));
    buy.click();
    System.out.println("Processing to Buy");
    }
@AfterTest
    public void CloseAmazonUrl(){
    driver.close();
    System.out.println("The amazon tab should close");
    }
@AfterSuite
    public void closeChrome(){
    driver.quit();
    System.out.println("The Chrome browser should close");
}


}
