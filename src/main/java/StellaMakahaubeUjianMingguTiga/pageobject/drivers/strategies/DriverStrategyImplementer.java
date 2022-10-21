package StellaMakahaubeUjianMingguTiga.pageobject.drivers.strategies;

import StellaMakahaubeUjianMingguTiga.pageobject.utils.Constants;

public class DriverStrategyImplementer {
    public static DriverStrategy chooseStrategy(String strategy) {
            switch (strategy) {
                case Constants.CHROME:
                    return new Chrome();

            default:
                return null;
        }
    }
}