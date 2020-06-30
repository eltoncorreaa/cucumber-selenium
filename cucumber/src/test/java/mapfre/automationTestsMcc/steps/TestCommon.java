package mapfre.automationTestsMcc.steps;

import mapfre.automationTestsMcc.utils.config.Config;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class TestCommon {

	protected WebDriver driver;
	public static final int MAX_SEGUNDOS = 30; 
	
	public TestCommon() {
		driver = Config.driver;
	}
	
	public void timeout(int tempo) {
		try {
			Thread.sleep(tempo * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
			
	/**
	 * Método responsável em fazer a seleção do IFrame
	 */
	public void selecionarIFrame(String id, WebDriver driver) {
		(new WebDriverWait(driver, 60)).until(ExpectedConditions.elementToBeClickable(By.id(id)));
		driver.switchTo().frame(driver.findElement(By.id(id)));
	}
			
	/**
	 * Método responsável pelo preenchimento de campos do tipo INPUT.
	 * Utiliza o By para localizar o componente.
	 * @return Retorna o componente alterado.
	 */
	public WebElement preencherInput(By by, String valor) {
		int i = 0;
		WebElement element = null;
		Exception e = null;
		
		while (i++ < MAX_SEGUNDOS) {
			timeout(1);
			try {
				
				element = findElement(by);
				element.click();
				element.clear();
				element.sendKeys(valor);
				
				e = null;
				i = MAX_SEGUNDOS;
			} catch (WebDriverException | NullPointerException ex) {
				
				// Tratamento de scroll da tela para preenchimento de campos ocultos atras do wizard.
				if (ex instanceof WebDriverException
						&& !(ex instanceof StaleElementReferenceException || ex instanceof InvalidElementStateException)) {
					if (ex.getMessage().contains("Element is not clickable at point")) {
						element = findElement(by);
						((JavascriptExecutor) driver)
								.executeScript("$(\"html\").scrollTop("
										+ (element.getLocation().getY() - 150)
										+ ")");
					}
				}
				
				e = ex;
				continue;
			}
		}
		
		if (e != null) {
			System.out.println("TIMEOUT: A busca pelo elemento excedeu o limite de espera de " + MAX_SEGUNDOS*2 + " segundos.");
			e.printStackTrace();
		}
			
		return element;
	}
	
	/**
	 * Método responsável pelo preenchimento de campos do tipo SELECT.
	 * Utiliza o By para localizar o componente.
	 * @return Retorna o componente alterado.
	 */
	public Select preencherSelect(By by, String opcao) {
		int i = 0;
		WebElement element = null;
		Select select = null;
		Exception e = null;
		
		while (i++ < MAX_SEGUNDOS) {
			timeout(1);
			try {
				
				element = findElement(by);
				select = new Select(element);
				select.selectByVisibleText(opcao);
				
				e = null;
				i = MAX_SEGUNDOS;
			} catch (WebDriverException
					| NullPointerException ex) {
				
				// Tratamento de scroll da tela para preenchimento de campos ocultos atras do wizard.
				if (ex instanceof WebDriverException
						&& !(ex instanceof StaleElementReferenceException
								|| ex instanceof InvalidElementStateException 
								|| ex instanceof org.openqa.selenium.NoSuchElementException)) {
					if (ex.getMessage().contains("Element is not clickable at point")) {
						element = findElement(by);
						((JavascriptExecutor) driver)
								.executeScript("$(\"html\").scrollTop("
										+ (element.getLocation().getY() - 150)
										+ ")");
					}
				}
				
				e = ex;
				continue;				
			}
		}
		
		if (e != null) {
			System.out.println("TIMEOUT: A busca pelo elemento excedeu o limite de espera de " + MAX_SEGUNDOS*2 + " segundos.");
			e.printStackTrace();
		}
		
		return select;
	}
	
	/**
	 * Método responsável pela execução do clique no componente.
	 * Utiliza o By informado para localizar o componente.
	 * @return Retorna o componente clicado.
	 */
	public WebElement clicar(By by) {			
		int i = 0;
		WebElement element = null;
		Exception e = null;
		
		while (i++ < MAX_SEGUNDOS) {
			timeout(1);
			try {
				
				element = findElement(by);			
				element.click();
				
				e = null;
				i = MAX_SEGUNDOS;
			} catch (WebDriverException
					| NullPointerException ex) {
				
				// Tratamento de scroll da tela para preenchimento de campos ocultos atras do wizard.
				if (ex instanceof WebDriverException
						&& !(ex instanceof StaleElementReferenceException || ex instanceof InvalidElementStateException)) {
					if (ex.getMessage().contains("Element is not clickable at point")) {
						element = findElement(by);
						((JavascriptExecutor) driver)
								.executeScript("$(\"html\").scrollTop("
										+ (element.getLocation().getY() - 150)
										+ ")");
					}
				}
				
				e = ex;
				continue;
			}
		}
		
		if (e != null) {
			System.out.println("TIMEOUT: A busca pelo elemento excedeu o limite de espera de " + MAX_SEGUNDOS*2 + " segundos.");
			e.printStackTrace();
		}
		
		return element;
	}
	
	/**
	 * Método responsável pela localização do componente.
	 * Utiliza o By informado para localizar o componente.
	 * @return Retorna o componente clicado.
	 */
	public WebElement findElement(By by) {
		int i = 0;
		WebElement element = null;
		Exception e = null;
		
		while (i++ < MAX_SEGUNDOS) {
			timeout(1);
			try {
				
				element = driver.findElement(by);
				
				e = null;
				i = MAX_SEGUNDOS;
			} catch (org.openqa.selenium.NoSuchElementException | NoSuchWindowException ex) {
				e = ex;
				continue;
			}
		}
		
		if (e != null) {
			System.out.println("TIMEOUT: A busca pelo elemento excedeu o limite de espera de " + MAX_SEGUNDOS + " segundos.");
			e.printStackTrace();
		}

		return element;
	}
	
}
