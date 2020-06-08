package br.com.diniz.provazup.pageobjects;

import br.com.diniz.provazup.helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SacolaAmericanasPage {

    private static WebDriverWait wait = new WebDriverWait(DriverHelper.getDriver(), 30);
    private static String xpathBasketProductItems = "//*[@id=\"app\"]/section/section/div[1]/section/ul";

    public static List<WebElement> basketProducts(){
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpathBasketProductItems)));
    }

}
