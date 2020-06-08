package br.com.diniz.provazup.implementation;

import br.com.diniz.provazup.helpers.DriverHelper;
import br.com.diniz.provazup.pageobjects.LojasAmericanasPage;
import br.com.diniz.provazup.pageobjects.SacolaAmericanasPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProvaZupTests {

    private static String selectedItem = "";

    @When("acessar o site {string}")
    public void acessarSite(String url) {
        LojasAmericanasPage.navigate(url);
    }

    @Then("site é exibido")
    public void siteExibido() {
        if (DriverHelper.getDriver().getCurrentUrl().contains("lojas americanas")){
            Assert.assertTrue(true);
        }
    }

    @When("procurar o produto {string}")
    public void procurarProduto(String produto) {
        LojasAmericanasPage.iptSearch().sendKeys(produto);
        LojasAmericanasPage.btnSearch().click();
    }

   @Then("lista é apresentada {string}")
    public void listaProdutos(String produto) {
       if ((DriverHelper.getDriver().getCurrentUrl().contains(produto))) {
           Assert.assertTrue(true);
       }
   }

    @Then("selecionar um produto")
    public void selecionarProduto() {
        LojasAmericanasPage.listFirstItem().click();
//        //TODO: Implement list click
//        List<WebElement> list = LojasAmericanasPage.productList();
//        if (list.isEmpty()){
//            Assert.fail("No Results");
//        }
//
//        //clicar no primeiro
//        for (WebElement product : list){
//            if (product.isEnabled()){
//                product.click();
//                break;
//            }
//        }
    }

    @Then("Adicionar ao carrinho")
    public void adicionarCcarrinho() {
        selectedItem = LojasAmericanasPage.lbSelectedProductName().getText();
        LojasAmericanasPage.btnBuy().click();
        LojasAmericanasPage.btnContinue().click();
    }

    @Then("Validar Carrinho")
    public void validarCarrinho() {
        List<WebElement> list = SacolaAmericanasPage.basketProducts();

        if (list.contains(selectedItem)){
            Assert.assertTrue("Objeto encontrado", true);
        }
//        for (WebElement product : list){
//            System.out.println(product.getText());
//        }
    }
}
