package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;
import cucumber.api.java.pt.Dado;

public class Index extends TestCommon{
	
	@Dado("^Auto - a url do sistema para nova cotacao \"(.*?)\"$")
	public void loginSistema(String corretor) {			
		driver.get("http://hmlj1:8684/novo-portal-web-1604/cotacao/index.xhtml?cod_cotacao=0&cod_corretor=" + corretor + "&Acao=novo");
		//driver.get("https://homolog2.mapfreconnect.com.br/novo-portal-web-1604/cotacao/index.xhtml?cod_cotacao=0&cod_corretor=" + corretor + "&Acao=novo");
	}
	
	@Dado("^Auto - a url do sistema para cotacao existente \"(.*?)\" \"(.*?)\"$")
	public void loginSistema(String corretor, String cotacao) {
		driver.get("https://homolog2.mapfreconnect.com.br/novo-portal-web-1604/cotacao/index.xhtml?cod_cotacao=" + cotacao + "&cod_corretor=" + corretor);
	}
	
}
