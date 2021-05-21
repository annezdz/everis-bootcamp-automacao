package pages;

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

//    public void RealizarLogin() {
//
//        WebDriverWait wait = new WebDriverWait(driver, 400);
//
//        driver.get("http://automationpractice.com/index.php");
//
//        util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
//        util.preencheCampoPorId("email", "everisbootcamp@qabeginner.com");
//        util.preencheCampoPorId("passwd", "QA@everis213");
//        util.clickPorNome("SubmitLogin");
//
//    }


    public void cadastrarNovoEndereco() {

        //driver.get("http://automationpractice.com/index.php");
        //loginPage.RealizarLogin();

        //util.clickPorxpath("//span[contains(@class, 'icon-building')and text()='Addresses']");
        util.clickPorxpath("//a[@title='Addresses']");
        util.clickPorxpath("//a[@title='Add an address']");
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

