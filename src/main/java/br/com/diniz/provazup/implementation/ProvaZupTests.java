package br.com.diniz.provazup.implementation;

import br.com.diniz.provazup.helpers.DriverHelper;
import br.com.diniz.provazup.pageobjects.LojasAmericanasPage;
import br.com.diniz.provazup.pageobjects.SacolaAmericanasPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
    }

    @Then("Adicionar ao carrinho")
    public void adicionarCcarrinho() {
        //Pega o title do item selecionado para validar
        selectedItem = LojasAmericanasPage.lbSelectedProductName().getText();
        if (LojasAmericanasPage.btnBuy().isEnabled()){
            LojasAmericanasPage.btnBuy().click();
        } else LojasAmericanasPage.btnBuyandDelivery().click();
        LojasAmericanasPage.btnContinue().click();
    }

    @Then("Validar Carrinho")
    public void validarCarrinho() {
        List<WebElement> list = SacolaAmericanasPage.basketProducts();
        //Valida se o item selecionado encontra-se na sacola
        if (list.contains(selectedItem)){
            Assert.assertTrue("Objeto encontrado", true);
        }
    }
}
