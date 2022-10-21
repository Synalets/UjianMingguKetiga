package StellaMakahaubeUjianMingguTiga.pageobject;

import StellaMakahaubeUjianMingguTiga.pageobject.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import StellaMakahaubeUjianMingguTiga.pageobject.pages.AddtoCart;
import StellaMakahaubeUjianMingguTiga.pageobject.pages.Dashboard;
import StellaMakahaubeUjianMingguTiga.pageobject.pages.Login;
import StellaMakahaubeUjianMingguTiga.pageobject.pages.Register;
import StellaMakahaubeUjianMingguTiga.pageobject.utils.Constants;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Dashboard dashboard = new Dashboard();
        driver.get(Constants.URL);
        dashboard.dashboard();

        Register register = new Register();
        driver.get(Constants.LOGURL);
        register.registerForm("Stelany", "makahaubes@gmail.com", "desember2016");
        driver.navigate().back();
        driver.navigate().refresh();

        Login login = new Login();
        login.loginForm("makahaubes@gmail.com", "desember2016");


        AddtoCart addCart = new AddtoCart();
        driver.get(Constants.SHOPURL);
        js.executeScript("window.scrollBy(0,600)");
        addCart.browserProduct();



        driver.get(Constants.URLITEM);
        js.executeScript("window.scrollBy(0,500)");
        addCart.addToCart();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}