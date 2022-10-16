package StellaMakahaubeUjianMingguTiga.pageobject;

import StellaMakahaubeUjianMingguTiga.pageobject.drivers.DriverSingleton;
import StellaMakahaubeUjianMingguTiga.pageobject.pages.WebTables;
import StellaMakahaubeUjianMingguTiga.pageobject.utils.Constants;
import org.openqa.selenium.WebDriver;

public class MainApp {
    public static void main(String[] args) {

        DriverSingleton.getInstance(Constants.CHROME);
        WebDriver driver = DriverSingleton.getDriver();
        driver.get(Constants.URL);

        WebTables webTables = new WebTables();
        webTables.registrationForm("StellaMakahaube", "makahaubes@gmail.com", "00000000");
        webTables.loginForm("StellaMakahaube", "00000000");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}