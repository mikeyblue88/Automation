package org.example.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();

    @Before//from cucumber api
    public void setup(){
        driverFactory.openBrowser();
    }
    @After
    public void teardown(){
        driverFactory.closeBrowser();
    }
}
