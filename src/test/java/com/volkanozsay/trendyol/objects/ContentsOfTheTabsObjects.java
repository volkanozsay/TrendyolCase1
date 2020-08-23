package com.volkanozsay.trendyol.objects;

import org.openqa.selenium.By;

public class ContentsOfTheTabsObjects {
    public static final By categoryWoman = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[1]");
    public static final By categoryMan = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[2]");
    public static final By categoryChild = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[3]");
    public static final By categoryHomeAndLife = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[4]");
    public static final By categoryMarket = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[5]");
    public static final By categoryCosmetics = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[6]");
    public static final By categoryShoes = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[7]");
    public static final By categoryAccessory = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[8]");
    public static final By categoryElectronic = By.xpath("//*[@id='navigation-wrapper']/nav/ul/li[9]");
    public static final By butiqueImgList = By.cssSelector("div[class='component-list component-big-list'] article span[class='image-container'] img");
    public static final By butiqueList = By.cssSelector("div[class='component-list component-big-list'] a");

}
