package br.com.evangelista.core.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver webDriver;
    private static WebDriverWait wait;

    public static WebDriver driver() {
        if (webDriver == null) {
            //System.setProperty("webdriver.chrome.driver", ...\\chromedriver.exe);
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            wait = new WebDriverWait(webDriver, 10);
        }
        return webDriver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static void killDriver() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }

}
