package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.pt.Então;

public class Comum extends TestCommon {
		
	@Então("^Auto - Comum - acessar passo \"(.*?)\"$")
	public void acessarPasso(String passo) {
		String script = ((JavascriptExecutor)driver).executeScript("return $(\"a:contains('" + passo + "')\").attr(\"onclick\")").toString();
		((JavascriptExecutor)driver).executeScript(script);
	}
			
}
