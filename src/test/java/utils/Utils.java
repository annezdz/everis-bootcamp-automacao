package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	private WebDriver driver;

	public Utils(WebDriver driver) {
		this.driver = driver;
	}



	public void preencheCampoPorId(String id_campo, String value) {

		driver.findElement(By.id(id_campo)).sendKeys(value);
	}

	/***
	 * Método criado para ser implementado no método do @after para dar um rollback no email informado
	 * no teste.
	 * @param email_create
	 */
	public void rollbackEmail(WebElement email_create){
		driver.findElements(By.id(String.valueOf(email_create))).clear();
	}

	public void preencheCampoPorCss(String id_campo, String value) {

		driver.findElement(By.cssSelector(id_campo)).sendKeys(value);
	}

	public void clickPorCss(String css_campo) {

		driver.findElement(By.cssSelector(css_campo)).click();
	}

	public void clickPorxpath(String xpath_campo){
		driver.findElement(By.xpath(xpath_campo)).click();

	}


	public void clickPorNome(String name_campo) {

		driver.findElement(By.name(name_campo)).click();
	}

	public void clickPorId(String id_campo) {

		driver.findElement(By.id(id_campo)).click();
	}

	/**
	 * Método para aguardar o elemento aparecer na página
	 * Alterei no método o ExpectedConditions de presenceOfElementLocated para visibilityOfElementLocated
	 * pois esse método garante além da presença a visibilidade do elemento
	 * na página,sendo que a altura e largura sejam maiores que 0.
	 * @param driver
	 * @param locatorObject
	 */

	public void esperarQueOElementoSejaVisivel(WebDriver driver,By locatorObject){
		WebDriverWait wait = new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locatorObject));
	}


}