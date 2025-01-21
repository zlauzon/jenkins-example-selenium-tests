package com.lauzon.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.lauzon.util.DriverUtilities;

import io.cucumber.java.Before;

public class websiteAvailabilityStepDef {
    private DriverUtilities driverUtilities;
    private WebDriver driver;

    @Before
    public void init() {
        driverUtilities = DriverUtilities.getInstance();
        driver = driverUtilities.getDriver();
    }
}