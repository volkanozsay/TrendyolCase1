package com.volkanozsay.trendyol;

import com.volkanozsay.trendyol.objects.ButiqueObjects;
import com.volkanozsay.trendyol.objects.ContentsOfTheTabsObjects;
import com.volkanozsay.trendyol.objects.LoginObjects;
import com.volkanozsay.trendyol.pageData.LoginPageData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class TrendyolWebPageTest {

    private WebDriver driver;

    @BeforeClass
    public void init() {
        DriverUnit driverUnit = new DriverUnit();
        this.driver = driverUnit.setUpDriver("chrome");
    }

    @Test(enabled = true, description = "Trendyol user login screen test scenario")
    public void testActualUserInfoEntryWhenLoginSucces() {
        driver.get(LoginPageData.LOGINURL);
        driver.findElement(LoginObjects.popupClose).click();
        driver.findElement(LoginObjects.accountBttn).click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.findElement(LoginObjects.emailInput).sendKeys(LoginPageData.EMAIL);
        driver.findElement(LoginObjects.passwordInput).sendKeys(LoginPageData.PASSWORD);
        driver.findElement(LoginObjects.loginBttn).click();
        Boolean isSucces = driver.findElement(LoginObjects.loginSucces).isEnabled();
        if (isSucces) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }

    @Test(enabled = true, description = "Testing the contents of the tabs on the Trendyol homepage")
    public void testContentsOfTheTabs() {
        driver.get(LoginPageData.LOGINURL);
        driver.findElement(LoginObjects.popupClose).click();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(LoginObjects.accountBttn).click();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginObjects.emailInput));
        driver.findElement(LoginObjects.emailInput).sendKeys(LoginPageData.EMAIL);
        driver.findElement(LoginObjects.passwordInput).sendKeys(LoginPageData.PASSWORD);
        driver.findElement(LoginObjects.loginBttn).click();
        Boolean isSucces = driver.findElement(LoginObjects.loginSucces).isEnabled();
        if (isSucces) {
            System.out.println("Login Success");
        } else {
            System.out.println("Login Failed");
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(LoginObjects.loginSucces));

        Boolean isClassActive;

        WebElement catWoman = driver.findElement(ContentsOfTheTabsObjects.categoryWoman);
        catWoman.click();
        catWoman = driver.findElement(ContentsOfTheTabsObjects.categoryWoman);
        isClassActive = catWoman.getAttribute("class").contains("active");
        List<WebElement> womanButiqueList = new ArrayList<>();
        if (isClassActive) {
            womanButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : womanButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catMan = driver.findElement(ContentsOfTheTabsObjects.categoryMan);
        catMan.click();
        catMan = driver.findElement(ContentsOfTheTabsObjects.categoryMan);
        isClassActive = catMan.getAttribute("class").contains("active");
        List<WebElement> manButiqueList = new ArrayList<>();
        if (isClassActive) {
            manButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : manButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catChild = driver.findElement(ContentsOfTheTabsObjects.categoryChild);
        catChild.click();
        catChild = driver.findElement(ContentsOfTheTabsObjects.categoryChild);
        isClassActive = catChild.getAttribute("class").contains("active");
        List<WebElement> childButiqueList = new ArrayList<>();
        if (isClassActive) {
            childButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : childButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catHomeAndLife = driver.findElement(ContentsOfTheTabsObjects.categoryHomeAndLife);
        catHomeAndLife.click();
        catHomeAndLife = driver.findElement(ContentsOfTheTabsObjects.categoryHomeAndLife);
        isClassActive = catHomeAndLife.getAttribute("class").contains("active");
        List<WebElement> homeAndLifeButiqueList = new ArrayList<>();
        if (isClassActive) {
            homeAndLifeButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : homeAndLifeButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catMarket = driver.findElement(ContentsOfTheTabsObjects.categoryMarket);
        catMarket.click();
        catMarket = driver.findElement(ContentsOfTheTabsObjects.categoryMarket);
        isClassActive = catMarket.getAttribute("class").contains("active");
        List<WebElement> marketButiqueList = new ArrayList<>();
        if (isClassActive) {
            marketButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : marketButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catCosmetics = driver.findElement(ContentsOfTheTabsObjects.categoryCosmetics);
        catCosmetics.click();
        catCosmetics = driver.findElement(ContentsOfTheTabsObjects.categoryCosmetics);
        isClassActive = catCosmetics.getAttribute("class").contains("active");
        List<WebElement> cosmeticsButiqueList = new ArrayList<>();
        if (isClassActive) {
            cosmeticsButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : cosmeticsButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catShoes = driver.findElement(ContentsOfTheTabsObjects.categoryShoes);
        catShoes.click();
        catShoes = driver.findElement(ContentsOfTheTabsObjects.categoryShoes);
        isClassActive = catShoes.getAttribute("class").contains("active");
        List<WebElement> shoesButiqueList = new ArrayList<>();
        if (isClassActive) {
            shoesButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : shoesButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catAccessory = driver.findElement(ContentsOfTheTabsObjects.categoryAccessory);
        catAccessory.click();
        catAccessory = driver.findElement(ContentsOfTheTabsObjects.categoryAccessory);
        isClassActive = catAccessory.getAttribute("class").contains("active");
        List<WebElement> accessoryButiqueList = new ArrayList<>();
        if (isClassActive) {
            accessoryButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : accessoryButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement catElectronic = driver.findElement(ContentsOfTheTabsObjects.categoryElectronic);
        catElectronic.click();
        catElectronic = driver.findElement(ContentsOfTheTabsObjects.categoryElectronic);
        isClassActive = catElectronic.getAttribute("class").contains("active");
        List<WebElement> electronicButiqueList = new ArrayList<>();
        if (isClassActive) {
            electronicButiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueImgList);
            for (WebElement butique : electronicButiqueList) {
                String srcContent = butique.getAttribute("src");
                if (srcContent.contains(".png")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
        } else {
            System.out.println("The page could not be opened");
        }
    }

    @Test(enabled = true, description = "Test scenario of loading product images by going to a random boutique and add random product in basket")
    public void testIsLoadingProductImageWhenRandomBoutique() {
        driver.get(LoginPageData.LOGINURL);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.findElement(LoginObjects.popupClose).click();
        if (driver.getCurrentUrl().equals("https://www.trendyol.com/")) {
            System.out.println("Actual page opened.");
            List<WebElement> butiqueList = driver.findElements(ContentsOfTheTabsObjects.butiqueList);
            butiqueList.get(0).click();
            List<WebElement> butiqueProductsImgs= driver.findElements(ButiqueObjects.butiqueProductImgs);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            for (WebElement butiqueProductImg : butiqueProductsImgs){
                String srcContent = butiqueProductImg.getAttribute("src");
                if (srcContent.contains("/Content/images/defaultThumb.jpg")) {
                    System.out.println("Sources couldnt be installed correct " + srcContent);
                } else if (srcContent.contains(".jpg")) {
                    System.out.println("Sources are installed correct " + srcContent);
                }
            }
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            butiqueProductsImgs.get(0).click();
            driver.findElement(ButiqueObjects.addBasket).click();

        } else {
            System.out.println("Actual page not opened.");
        }
    }
}