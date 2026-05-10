package com.runner;

import Utility.ReadExcelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTestRunner {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        String username = ReadExcelData.getParticularData(0, 0);
        driver.findElement(By.name("email")).sendKeys(username);

        String password = ReadExcelData.getParticularData(1, 1);
        driver.findElement(By.name("pass")).sendKeys(password);

    }
}


