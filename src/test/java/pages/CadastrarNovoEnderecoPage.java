package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import tests.RealizarLoginPageTest;
import utils.Utils;


public class CadastrarNovoEnderecoPage {

    private WebDriver driver;
    private Utils util;
    private RealizarLoginPage loginPage;


    public CadastrarNovoEnderecoPage(WebDriver driver) {
        util = new Utils(driver);
        this.driver = driver;
    }


    public void cadastrarNovoEndereco() {

        util.clickPorxpath("//a[@title='Addresses']");
        util.clickPorxpath("//a[@title='Add an address']");
        util.preencheCampoPorId("address1", "address1");
        util.preencheCampoPorId("address2", "U.S. Route 491");
        util.preencheCampoPorId("city", "Salt Lake City");
        util.preencheCampoPorId("id_state", "Utah");
        util.preencheCampoPorId("postcode", "96815");
        util.preencheCampoPorId("id_country", "United States");
        util.preencheCampoPorId("phone", "9999999999");
        util.preencheCampoPorId("phone_mobile", "9999999998");
        util.preencheCampoPorId("alias","abc");
        util.clickPorId("submitAddress");

    }
}

