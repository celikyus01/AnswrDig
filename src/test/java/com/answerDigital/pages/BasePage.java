package com.answerDigital.pages;

import com.answerDigital.utilities.BrowserUtils;
import com.answerDigital.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    /**
     * @param mainMenu: the text of the main menu
     * @param subMenu:  the text of the sub menu
     */
    public void navigatesTo(String mainMenu, String subMenu) {

        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//h5[.='" + mainMenu + "']")));
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//span[.='" + subMenu + "']")));

    }


    public void sendKeys(String identifier, String value) {

        try {
            Driver.get().findElement(By.xpath("//input[@placeholder='" + identifier + "']")).sendKeys(value);
        } catch (NoSuchElementException e) {
            Driver.get().findElement(By.xpath("//label[.='" + identifier + "']/../..//input")).sendKeys(value);
        }
    }


    public void clickButton(String identifier) {

        try {
            try {
                Driver.get().findElement(By.xpath("//button[.='" + identifier + "']")).click();
            } catch (ElementClickInterceptedException e) {
                BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//button[.='" + identifier + "']")));
            }
        } catch (NoSuchElementException e) {
            try {
                Driver.get().findElement(By.xpath("//a[.='" + identifier + "']")).click();
            } catch (ElementClickInterceptedException f) {
                BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//a[.='" + identifier + "']")));
            }
        }

    }

    public void clickAnyWebElement(String identifier) {
        try {
            Driver.get().findElement(By.xpath("//*[.='" + identifier + "']")).click();
        } catch (ElementClickInterceptedException e) {
            BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//button[.='" + identifier + "']")));
        }
    }


}
