package pages;

import org.openqa.selenium.WebDriver;

import utils.Utils;


public class CadastrarNovoEnderecoPage {

    private WebDriver driver;
    private Utils util;

    public CadastrarNovoEnderecoPage(WebDriver driver) {
        util = new Utils(driver);
        this.driver = driver;
    }

    public void cadastrarNovoEndereco(){

        driver.get("http://automationpractice.com/index.php?controller=address");

        util.clickPorCss("btn btn-default button button-medium");
        util.preencheCampoPorId("firstname", "customer_firstname");
        util.preencheCampoPorId("lastname", "customer_lastname");
        util.preencheCampoPorId("address1", "address1");
        util.preencheCampoPorId("address2", "U.S. Route 491");
        util.preencheCampoPorId("city", "Salt Lake City");
        util.preencheCampoPorId("id_state", "Utah");
        util.preencheCampoPorId("postcode", "96815");
        util.preencheCampoPorId("id_country", "United States");
        util.preencheCampoPorId("phone", "9999999999");
        util.preencheCampoPorId("phone_mobile", "9999999998");
        util.clickPorId("submitAddress");

    }
}
