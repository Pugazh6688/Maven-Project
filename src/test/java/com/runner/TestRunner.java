package com.runner;

import Com.baseclass.BaseClass;
import org.openqa.selenium.By;
import pageobjectmanager.PageObjectManager;

import java.io.IOException;

public class TestRunner extends BaseClass {
    public static void main(String[] args) throws IOException, InterruptedException {
        launchBrowse(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("browser"));
        passingURL(PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("url"));
        implicitWait(10000);
        PageObjectManager.getPageObjectManager().getLoginpage().validLogin();


//       passingInput(driver.findElement(By.xpath("//input[@id= 'username']")), "Pugazh");
//       passingInput(driver.findElement(By.xpath("//input[@id= 'password']")), "Welcome@6688");
//        clickelement(driver.findElement(By.xpath("//select[@id=  'fruits']")));
//        Acceptalert();
//        dismissAlert();
//        promptText("Prompt added");
//        singleSelect(driver.findElement(By.xpath("//select[@id=  'fruits']")),"Apple"  );
//        getoption(driver.findElement(By.xpath("//select[@id='fruits']")));
//        navigateToPage("https://letcode.in/test");
//        navigateBack();
//        mousemoveToElement(driver.findElement(By.xpath("(//a[@class= 'navbar-link'])[1]")));
//        mousemoveToElementClick(driver.findElement(By.xpath("//a[text() =' LetXPath ']")));
//        dragAndDropElement(driver.findElement(By.xpath("//div[@id='draggable']")), driver.findElement(By.xpath("//div[@id='droppable']")));
//        doubleClickElement(driver.findElement(By.xpath("//button[text()='Copy Text']")));
//        isEnabledElement(driver.findElement(By.xpath("//input[@id='field2']")));
//        isElementSelected(driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")));
//        isDisplayed(driver.findElement(By.xpath("//input[@id='field1']")));
//        screenShot("ScreenShot");


    }
}
