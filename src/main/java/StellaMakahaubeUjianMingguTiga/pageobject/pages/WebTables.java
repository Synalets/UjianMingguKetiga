package StellaMakahaubeUjianMingguTiga.pageobject.pages;

import StellaMakahaubeUjianMingguTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTables {
    private WebDriver driver;

    public WebTables() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "myAccount")
    WebElement btnAdd;
    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "emailAddress")
    WebElement emailAddress;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "register")
    WebElement register;

    @FindBy(id = "logIn")
    WebElement logIn;

    //Page Object
    public void registrationForm(String userName, String emailAddress, String password){
        btnAdd.click();
        this.userName.sendKeys(userName);
        this.emailAddress.sendKeys(emailAddress);
        this.password.sendKeys(password);
        register.click();
    }

    public void loginForm (String userName, String password){
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        logIn.click();
    }
}
