package pageobjectmodule;

import Com.baseclass.BaseClass;
import interfaceElements.LoginInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjectmanager.PageObjectManager;

import java.io.IOException;

public class LoginPage extends BaseClass implements LoginInterfaceElements {

    @FindBy(id = login_ID)
    private static WebElement login;

    @FindBy(xpath  = username_Xpath)
    private static WebElement username;

    @FindBy(xpath  = password_Xpath)
    private static WebElement password;

    @FindBy(xpath  = login_Xpath)
    private static WebElement Signin;

    @FindBy(xpath = get_xpath)
    private static WebElement getText;

    @FindBy(xpath = laptop_xpath)
    private  static WebElement clickvalue;

    @FindBy(xpath = Sonyi5_xpath)
    private static WebElement clickprod;

    @FindBy(xpath = cart_xpath)
    private static WebElement addCart;

    @FindBy(xpath = cart_Id)
    private static  WebElement cart;

    @FindBy(xpath = PlaceOrder_xpath)
    private  static WebElement placeOrder;

    @FindBy(xpath = name_xpath)
    private static WebElement ordername;

    @FindBy(xpath = contry_xpath)
    private static WebElement contry;

    @FindBy(xpath = city_xpath)
    private static WebElement city;

    @FindBy(xpath = card_xpath)
    private static WebElement card;

    @FindBy(xpath = month_xpath)
    private static WebElement month;

    @FindBy(xpath = year_xpath)
    private static WebElement year;

    @FindBy(xpath = purchanse_xpath)
    private static WebElement Purchase;

    @FindBy(xpath = ok_xpath)
    private static WebElement ok;

    @FindBy(xpath = logOut_xpath)
    private static WebElement logout;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public static void validLogin() throws IOException, InterruptedException {
        implicitWait(5000);
        clickelement(login);
        passingInput(username, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("username"));
        passingInput(password, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("password"));
        clickelement(Signin);
        getTextValue(getText);
        screenShot("location");
        clickelement(clickvalue);
        clickelement(clickprod);
        clickelement(addCart);
        explicitWaitAlertIsPresent();
        alertText();
        Acceptalert();
        clickelement(cart);
        Thread.sleep(2000);
        screenShot("location");
        clickelement(placeOrder);
        passingInput(ordername, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("ordername"));
        passingInput(contry, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("contry"));
        passingInput(city, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("city"));
        passingInput(card, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("card"));
        passingInput(month, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("month"));
        passingInput(year, PageObjectManager.getPageObjectManager().getFileReaderManager().getProperty("year"));
        clickelement(Purchase);
        Thread.sleep(1000);
        screenShot("location");
        clickelement(ok);
        clickelement(logout);


    }
}
