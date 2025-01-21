package com.lauzon.util.abstracts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DriverUtilities {
    public WebDriver driver;

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void test() {
        driver.get("https://www.jenkins.io/");
        Assertions.assertEquals("Jenkins", driver.getTitle());
    }
}