package StellaMakahaubeUjianMingguTiga.pageobject.pages;
import StellaMakahaubeUjianMingguTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoCart {

    private WebDriver driver;

    public AddtoCart() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/h3")
    WebElement itemClick;

    @FindBy(id = "pa_color")
    WebElement colorOption;

    @FindBy(id = "pa_size")
    WebElement sizeOption;

    @FindBy(xpath = "//*[@id=\"product-1184\"]/div[1]/div[2]/form/div/div[2]/div/div/button[1]")
    WebElement itemQty;

    @FindBy(xpath = "//*[@id=\"product-1184\"]/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnAddCart;

    @FindBy(id = "nav-menu-item-cart")
    WebElement btnViewCart;

    public void browserProduct() {
        itemClick.click();
        System.out.println("Click Item");
    }

    public void addToCart() {
        Select selectMenuColor = new Select(this.colorOption);
        Select selectMenuSize = new Select(this.sizeOption);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        selectMenuColor.selectByValue("red");
        System.out.println("Select Menu Color");
        selectMenuSize.selectByValue("Medium");
        System.out.println("Choose Menu Size");
        clickQty.click();
        System.out.println("Click button qty");
        btnAddCart.click();
        System.out.println("Click button addcart");
        btnViewCart.click();
        System.out.println("Click icon cart");
        js.executeScript("window.scrollBy(0,500)");
    }
}