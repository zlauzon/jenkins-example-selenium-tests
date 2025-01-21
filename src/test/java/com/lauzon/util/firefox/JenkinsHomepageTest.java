package com.lauzon.util.firefox;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.lauzon.util.abstracts.AbstractJenkinsHomepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JenkinsHomepageTest extends AbstractJenkinsHomepage {
    @BeforeAll
    static void setupClass() {
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    void setupTest() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
    }
}