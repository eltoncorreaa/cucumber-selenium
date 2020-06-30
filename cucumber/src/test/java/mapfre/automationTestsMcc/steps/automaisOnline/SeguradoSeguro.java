package mapfre.automationTestsMcc.steps.automaisOnline;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class SeguradoSeguro extends TestCommon {
			
	@Dado("^Auto - Segurado/Seguro - a url do sistema$")
	public void urlSistema() {		
		//driver.get("http://hmlj1:8684/novo-portal-web-1604/cotacao/index.xhtml?cod_cotacao=0&cod_corretor=86790&Acao=novo");
		driver.get("https://homolog2.mapfreconnect.com.br/novo-portal-web-1604/cotacao/index.xhtml?cod_cotacao=0&cod_corretor=86790&Acao=novo");
		//driver.get("http://hmlj3:8684/novo-portal-web-1604/cotacao/index.xhtml?cod_cotacao=0&cod_corretor=86790&Acao=novo");
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo cpf/cpnj \"(.*?)\"$")
	public void preencherCampoCpfCnpj(String valor) {
		WebElement element = preencherInput(By.id("formSeguroSegurado:cpfCnpj"), valor);
		element.sendKeys(Keys.TAB);	
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Nome Completo \"(.*?)\"$")
	public void preencherCampoNomeCompleto(String valor) {
		preencherInput(By.id("formSeguroSegurado:nomeProponente"), valor);	
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo Nome Empresa \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Nome_Empresa(String valor) {
		preencherInput(By.id("formSeguroSegurado:nomeEmpresa"), valor);
	}
	
	@Quando("^Auto - Segurado/Seguro - clicar na opção de orgao publico \"(.*?)\"$")
	public void preencherCampoOrgaoPublico(String valor) {		
		if (valor.equalsIgnoreCase("sim")) {
			clicar(By.id("formSeguroSegurado:orgaoPublico:0"));
		} else {
			clicar(By.id("formSeguroSegurado:orgaoPublico:1"));
		}		
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Data Nascimento \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Data_Nascimento(String valor) {
		clicar(By.id("formSeguroSegurado:dataNascimento"));		
		preencherInput(By.id("formSeguroSegurado:dataNascimento"), valor);		
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo DDD Celular \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_DDD_Celular(String ddd) {
		preencherInput(By.id("formSeguroSegurado:dddCelular"), ddd);
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Numero Celular \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Numero_Celular(String numeroCelular) {
		preencherInput(By.id("formSeguroSegurado:telefoneCelular"), numeroCelular);
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo DDD Residencial \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_DDD_residencial(String ddd) {
		preencherInput(By.id("formSeguroSegurado:dddResidencial"), ddd);
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Numero Residencial \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Numero_Residencial(String numeroCelular) {
		preencherInput(By.id("formSeguroSegurado:telefoneResidencial"), numeroCelular);
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo DDD Comercial \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_DDD_comercial(String ddd) {
		preencherInput(By.id("formSeguroSegurado:dddComercial"), ddd);
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Numero Comercial \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Numero_Comercial(String numeroCelular) {
		preencherInput(By.id("formSeguroSegurado:telefoneComercial"), numeroCelular);
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo DDD Outros \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_DDD_outros(String ddd) {
		preencherInput(By.id("formSeguroSegurado:dddOutros"), ddd);
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Numero Outros \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Numero_outros(String numeroCelular) {
		preencherInput(By.id("formSeguroSegurado:telefoneOutros"), numeroCelular);
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Tipo de Seguro \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Tipo_de_Seguro(String tipoSeguro) {
		preencherSelect(By.id("formSeguroSegurado:tipoSeguro"), tipoSeguro);

	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Tipo de Calculo \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Tipo_de_Calculo(String tipoCalculo) {
		preencherSelect(By.id("formSeguroSegurado:tipoCalculo"), tipoCalculo);
	}

	@Quando("^Auto - Segurado/Seguro - preencher o campo Inicio Vigencia \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_Inicio_Vigencia(String inicioVigencia) {
		WebElement element = null; 
		
		if (inicioVigencia.equalsIgnoreCase("Data atual")) {
			element = preencherInput(By.id("formSeguroSegurado:inicioVigencia"), getDateTime());
		} else {
			element = preencherInput(By.id("formSeguroSegurado:inicioVigencia"), inicioVigencia);
		}
		
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo Sinistro Ultima Vigencia \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_sinistro_ultima_vigencia(String renovacaoCorretor) {
		timeout(2);
		if(renovacaoCorretor.equalsIgnoreCase("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguroSegurado:selectSinistroUltimaVigencia:0']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguroSegurado:selectSinistroUltimaVigencia:1']\").click().click()");			
		}		
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo Nova Classe Bonus \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_classe_bonus(String classeBonus) {
		preencherSelect(By.id("formSeguroSegurado:classeBonus"), classeBonus);
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo Seguradora Anterior \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_seguradora_anterior(String seguradora) {
		preencherSelect(By.id("formSeguroSegurado:seguradoraAnterior"), seguradora);
	}
			
	@Quando("^Auto - Segurado/Seguro - preencher o campo Renovacao Propio Corretor \"(.*?)\"$")
	public void segurado_seguro_preencher_o_campo_renovacao_propio_corretor(String renovacaoCorretor) {
		if(renovacaoCorretor.equalsIgnoreCase("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[tabindex='20']\").click().click()");
		}		
	}

	@Então("^Auto - Segurado/Seguro - clicar no botao Iniciar Calculo$")
	public void segurado_seguro_clicar_no_botao_Iniciar_Calculo() {
		clicar(By.id("formSeguroSegurado:btoProximo"));
		timeout(3);
	}
	
	@Quando("^Auto - Segurado/Seguro - preencher o campo Numero Apolice Anterior \"(.*?)\"$")
	public void preencher_o_campo_Apolice_Anterior(String apoliceAnterior) throws InterruptedException {
		WebElement element = preencherInput(By.id("formSeguroSegurado:numeroApoliceAnterior"), apoliceAnterior);
		element.sendKeys(Keys.TAB);
	}
	
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

}
