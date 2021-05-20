package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastrarNovoEnderecoPage;
import utils.Utils;

public class CadastrarNovoEnderecoPageTest {

    private WebDriver driver;
    private CadastrarNovoEnderecoPage cadastrarNovoEnderecoPage;
    private Utils utils;

    @Before
    public void inicializa(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        cadastrarNovoEnderecoPage = new CadastrarNovoEnderecoPage(driver);

    }

    @Test
    public void cadastrarNovoEnderecoPage(){
        cadastrarNovoEnderecoPage.cadastrarNovoEndereco();
        utils.esperarQueOElementoSejaVisivel(driver, By.cssSelector("a[title='Update'] span"));
        WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
        Assert.assertEquals("Back to your addresses",validaTexto.getText());

    }

    @After
    public void afterCenario() {
        driver.quit();
    }
}
