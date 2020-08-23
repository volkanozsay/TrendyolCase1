package com.volkanozsay.trendyol.objects;

import org.openqa.selenium.By;

public class LoginObjects {
    public static final By popupClose = By.cssSelector("[class='fancybox-item fancybox-close']");
    public static final By accountBttn = By.cssSelector("[id='accountBtn']");
    public static final By emailInput = By.cssSelector("input[id='email']");
    public static final By passwordInput = By.cssSelector("[id='password']");
    public static final By loginBttn = By.cssSelector("[id='loginSubmit']");
    public static final By loginSucces = By.cssSelector("span[id='logged-in-container']");
    public static final By modelClose = By.cssSelector("div[class='modal-close']");
}
