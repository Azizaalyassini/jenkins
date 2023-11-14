package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.example.pages.GoogleSearchPage;
import com.example.utils.CommonMethods;

public class GoogleSearchTest {
    private WebDriver driver;
    private GoogleSearchPage googleSearchPage;
    private CommonMethods commonMethods;

    @BeforeClass
    public void setUp() {
        // Configure ChromeDriver
        commonMethods = new CommonMethods(driver);
        driver = commonMethods.configureChromeDriver();
        googleSearchPage = new GoogleSearchPage(driver);
    }

    @Test
    public void testGoogleSearch() {
        googleSearchPage.openGoogle();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
