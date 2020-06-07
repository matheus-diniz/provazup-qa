package br.com.diniz.provazup.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverHelper {

    private static DriverHelper singletonInstance = null;

    private WebDriver driver;

    private DriverHelper() {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDrivers\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    public static WebDriver getDriver(){
        if (singletonInstance == null){
            singletonInstance = new DriverHelper();
        }
        return singletonInstance.driver;
    }

}
