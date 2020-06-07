package br.com.diniz.provazup.pageobjects;

import br.com.diniz.provazup.helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LojasAmericanasPage {

    private static WebDriverWait wait = new WebDriverWait(DriverHelper.getDriver(), 30);
    private static String idIptSearch = "h_search-input";
    private static String idBtnSearch = "h_search-btn";
    private static String classBtnSearch = "src-btn";
    private static String classDataSearchQuery = "h1 page-title";
    private static String classProductItem = "RippleContainer-sc-1rpenp9-0 dMCfqq";
    private static String xpathProductItem = "//*[@id=\"content-middle\"]/div[6]/div/div/div/div[1]/div[1]/div/div[2]";
    private static String xpathBtnBuy = "//*[@id=\"btn-buy\"]";
    private static String idBtnContinue = "btn-continue";
    private static String classBasketProducts = "basket-products";
    private static String classSelectedProductName = "product-title__TitleUI-sc-116vf1e-3 hCKbLB TitleH1-sc-1wh9e1x-0 kSKgXt";
    private static String idProductName = "product-name-default";

    public static void navigate(String url){
        DriverHelper.getDriver().get(url);
    }

    public static WebElement iptSearch(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idIptSearch)));
    }

    public static WebElement btnSearch(){
        //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idBtnSearch)));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classBtnSearch)));
    }

    public static WebElement dataQueryComponent(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classDataSearchQuery)));
    }

    public static WebElement itenFirstProduct(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathProductItem)));
    }

    public static WebElement btnBuy(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathBtnBuy)));
    }

    public static WebElement btnContinue(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idBtnContinue)));
    }

    public static WebElement lbSelectedProductName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idProductName)));
    }



}
