package StellaMakahaubeUjianMingguTiga.pageobject.drivers.strategies;

import StellaMakahaubeUjianMingguTiga.pageobject.utils.Constants;

public class DriverStrategyImplementer {
    public static StellaMakahaubeUjianMingguTiga.pageobject.drivers.strategies.DriverStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new StellaMakahaubeUjianMingguTiga.pageobject.drivers.strategies.Chrome();

            default:
                return null;
        }
    }
}