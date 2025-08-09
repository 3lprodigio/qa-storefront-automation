package com.project.qa.pages;

import java.beans.Visibility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    
    WebDriver driver;

    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.id("login-button")

    Login(WebDriver driver){
        this.driver = driver;
    }

    public void open(){
        driver.get("https://www.saucedemo.com");
        new WebDriverWait(driver, ExpectedConditions.ofSeconds(1)).until(visibilityOfElementLocated(usernameInput));
    }
}
