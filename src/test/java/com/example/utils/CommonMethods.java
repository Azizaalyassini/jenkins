package com.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {
    private WebDriver driver;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver configureChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAAuto\\Downloads\\chromedriver.exe");
        return new ChromeDriver();
    }

    public void click(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }
}
