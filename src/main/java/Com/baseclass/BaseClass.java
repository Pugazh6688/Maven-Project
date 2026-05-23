package Com.baseclass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;


public abstract class BaseClass {
    public static WebDriver driver;
    public static ExtentReports extendReport;
    public static File file;

    //Launch Browser
    protected static WebDriver launchBrowse(String browserName) {
        try {
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            }
            driver.manage().window().maximize();
        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING Launching Browser ");
        }
        return driver;
    }

    //Wait
    protected static void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

    }

    protected static void explicitWaitAlertIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }


    //Passing URL
    protected static void passingURL(String URL) {
        try {
            driver.get(URL);
        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING PASSING URL ");
        }
    }

    //Passing Value
    protected static void passingInput(WebElement element, String value) {
        try {
            element.sendKeys(value);
        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING PASSING INPUT ");
        }
    }

    //Click Event
    protected static void clickelement(WebElement element) {
        try {
            element.click();
        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING CLICK ");
        }
    }

    //Acceptalert
    protected static void Acceptalert() {
        try {
            driver.switchTo().alert().accept();

        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING ACCEPTALERT ");
        }

    }

    protected static void alertText() {
        try {

            String text = driver.switchTo().alert().getText();
            System.out.println(text);

        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING GETTING TEXT FROM ALERT ");
        }

    }

    //dismissAlert
    protected static void dismissAlert() {

        try {
            driver.switchTo().alert().dismiss();
        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING DISMISSALERT ");
        }
    }

    //promptText
    protected static void promptText(String Prompt) {
        try {
            driver.switchTo().alert().sendKeys(Prompt);
        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING PROMPTTEXT ");
        }
    }

    //singleSelect
    protected static void singleSelect(WebElement element, String visibleTest) {
        try {
            Select singleselect = new Select(element);
            singleselect.selectByVisibleText(visibleTest);
        } catch (Exception a) {
            Assert.fail("ERROR: OCCURE DURING SINGLESELECT ");
        }

    }

    protected static void getoption(WebElement element) {
        Select allOptions = new Select(element);
        List<WebElement> options = allOptions.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }

    //navigateTo
    protected static void navigateToPage(String navURL) {

        driver.navigate().to(navURL);
    }

    //back
    protected static void navigateBack() {

        driver.navigate().back();
    }

    //forward
    protected static void navigateForward() {

        driver.navigate().forward();
    }

    //refresh
    protected static void navigateRefresh() {

        driver.navigate().refresh();
    }

    //close
    protected static void closePage() {

        driver.close();
    }

    //quit
    protected static void quitPage() {

        driver.quit();
    }

    //mouse moveToElement
    protected static void mousemoveToElement(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    //mouse  ToElement Click
    protected static void mousemoveToElementClick(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

    //dragAndDropElement
    protected static void dragAndDropElement(WebElement source, WebElement target) {
        Actions action = new Actions(driver);
        action.dragAndDrop(source, target).perform();
    }

    //doubleClickElement
    protected static void doubleClickElement(WebElement element) {
        Actions action = new Actions(driver);
        action.doubleClick(element).perform();
    }

    //isEnabled
    protected static void isEnabledElement(WebElement fieldValue) {

        Boolean field2 = fieldValue.isEnabled();
        if (field2) {
            System.out.println("Field is enabled " + field2);
        } else {
            System.out.println("Field is disabled " + field2);
        }
    }

    //isSelected
    protected static void isElementSelected(WebElement option) {

        Boolean value = option.isSelected();
        if (value) {
            System.out.println("Field isSelected " + value);
        } else {
            System.out.println("Field Not Selected " + value);
        }
    }

    protected static void isDisplayed(WebElement fieldValue) {

        Boolean field = fieldValue.isDisplayed();
        if (field) {
            System.out.println("is Displayed " + field);
        } else {
            System.out.println("is not  Displayed " + field);
        }
    }

    protected static void screenShot(String location) throws IOException {
        try {
            Date currentDate = new Date();
            System.out.println(currentDate);
            String dateFile = currentDate.toString().replace(" ", "").replace(":", "");
            System.out.println(dateFile);
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(screenshot, new File(location + dateFile + ".png"));

        } catch (Exception e) {
            Assert.fail("ERROR : OCCURE DURING SCREENSHORT");
        }
    }

    protected static void getTextValue(WebElement element) {
        System.out.println(element.getText());

    }

//    public static void extendReportStart(String location) {
//        extentReports = new ExtentReports();
//        file = new File(Location);
//        ExtentSparkReporter spark Report = new ExtendSparkReport(file);
//        extentReport.attachReport(sparkReport);
//        extenrReport.setSystemInfo("OS", System.getProperty("java.version"));
//    }
//
//    public static void extendReportTearDown(String location) {
//        extendReports.flush();
//        file = newFile(location);
//        Destop.getDesktop().browse((file).toURI());
//    }
//
//    public static takeScreenshot() {
//        TakesScreenshot screenshot = (TakesScreenshot) driver;
//        String timeStamp = new SimpleDataFormat("yyyymmdd_HHmmss").format(new date());
//        File scrfile = screenshot.getScreenshotAs()
//    }


}




