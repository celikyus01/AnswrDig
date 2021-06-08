package com.answerDigital.step_definitions;

import com.answerDigital.utilities.BrowserUtils;
import com.answerDigital.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    // select secound before whoch is bbelongs to cucumber
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image.png", "screenshot");
        }
        BrowserUtils.waitFor(3);
        Driver.closeDriver();
    }

    @Before("@db")
    public void OpenDb(){
        System.out.println("\tdatabase from BEFORE");
    }
    @After("@db")
    public void closeDb(){
        System.out.println("\tdatabase from AFTER");
    }


}
