package br.com.diniz.provazup.pageobjects;

import br.com.diniz.provazup.helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LojasAmericanasPage {

    private static WebDriverWait wait = new WebDriverWait(DriverHelper.getDriver(), 30);
    private static String idIptSearch = "h_search-input";
    private static String classBtnSearch = "src-btn";
    private static String xpathProductItem = "//*[@id=\"content-middle\"]/div[6]/div/div/div/div[1]/div[1]/div/div[2]";
    private static String xpathBtnBuy = "//*[@id=\"offer-5cc6f49ff216c95bded19914\"]/div/div[2]/div/div/div[2]/div[1]";
    private static String xpathBtnComprareBuscar = "//*[@id=\"content\"]/div/div/div[2]/div/section/div/div[2]/div[2]/div/div/div[4]/div/button";
    private static String selectorBtnContinue = "#btn-continue";
    private static String idProductName = "product-name-default";

    public static void navigate(String url){
        DriverHelper.getDriver().get(url);
    }

    public static WebElement iptSearch(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idIptSearch)));
    }

    public static WebElement btnSearch(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classBtnSearch)));
    }

    public static WebElement listFirstItem(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathProductItem)));
    }

    public static WebElement btnBuy(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathBtnBuy)));
    }

    public static WebElement btnBuyandDelivery(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathBtnComprareBuscar)));
    }

    public static WebElement btnContinue(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectorBtnContinue)));
    }

    public static WebElement lbSelectedProductName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(idProductName)));
    }
}
