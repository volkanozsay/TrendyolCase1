package com.volkanozsay.trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverUnit {

    private WebDriver driver;

    public WebDriver setUpDriver(String driverName) {
        if (driverName.equals("chrome")) {
            String driverPath = System.getProperty("user.dir");
            System.out.println("Project path : " + driverPath);
            System.setProperty("webdriver.chrome.driver", driverPath + "/driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (driverName.equals("firefox")) {
            String driverPath = System.getProperty("user.dir");
            System.out.println("Project path : " + driverPath);
            System.setProperty("webdriver.gecko.driver", driverPath + "/driver/geckomedriver.exe");
            driver = new FirefoxDriver();
        } else {
            String driverPath = System.getProperty("user.dir");
            System.out.println("Project path : " + driverPath);
            System.setProperty("webdriver.chrome.driver", driverPath + "/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
