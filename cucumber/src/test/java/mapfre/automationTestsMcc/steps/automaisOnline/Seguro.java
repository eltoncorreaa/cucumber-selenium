package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Seguro extends TestCommon {

	@Então("^Auto - Seguro - clicar no botao proximo$")
	public void seguro_clicar_no_botao_proximo() {
		clicar(By.id("formSeguro:botao"));
	}
	
	@Quando("^Auto - Seguro - preencher campo controle identificacao \"(.*?)\"$")
	public void preencher_campo_nome_completo(String controleIdentificacao) {
		preencherInput(By.id("formSeguro:codigoIdentificacao"), controleIdentificacao);
	}
	
	@Então("^Auto - Seguro - preencher o campo Numero Apolice Anterior \"(.*?)\"$")
	public void seguro_preencher_o_campo_numero_apolice_anterior(String apoliceAnterior) {
		preencherInput(By.id("formSeguro:numeroApoliceAnterior"), apoliceAnterior);
	}

	@Então("^Auto - Seguro - preencher o campo Numero Item Apolice \"(.*?)\"$")
	public void seguro_preencher_o_campo_numero_item_apolice(String itemApolice) {
		preencherInput(By.id("formSeguro:numeroItemApolice"), itemApolice);
	}

	@Quando("^Auto - Seguro - pergunta o veículo é o mesmo da apólice anterior \"(.*?)\"$")
	public void preencher_pergunta_veiculo_mesmo_apolice_anterior(String mesmo_veiculo_apolice_anterior){		
		if(mesmo_veiculo_apolice_anterior.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:respostaVeiculo:0']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:respostaVeiculo:1']\").click().click()");
		}	
	}
	
	@Quando("^Auto - Seguro - pergunta foram incluidas corbeturas opicionais diferentes da apolice anterior \"(.*?)\"$")
	public void preencher_pergunta_coberturas_adicionais_apolice_anterior(String coberturasAdicionaisApoliceAnterior){	
		
		if(coberturasAdicionaisApoliceAnterior.equals("Sim")){
			WebElement radioSim = findElement(By.id("formSeguro:respostaCobertura:0"));
			radioSim.click();
		}else{
			WebElement radioNao = findElement(By.id("formSeguro:respostaCobertura:1"));
			radioNao.click();
		}	
	}
	     
	@Quando("^Auto - Seguro - pergunta foram incluídas coberturas opcionais diferentes da apólice anterior \"(.*?)\"$")
	public void preencher_pergunta_veiculo_foram_incluidas_corbeturas(String foram_incluidos_corbeturas){		
		if(foram_incluidos_corbeturas.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:respostaCobertura:0']\").click().click()");
			// Acessorios
			clicar(By.xpath("//*[@id='formSeguro:j_idt188:0:coberturas']/label/table/tbody/tr/td[2]"));
			// Equipamentos
			clicar(By.xpath("//*[@id='formSeguro:j_idt188:3:coberturas']/label/table/tbody/tr/td[2]"));
			// Blindagem
			clicar(By.xpath("//*[@id='formSeguro:j_idt188:1:coberturas']/label/table/tbody/tr/td[2]"));
			// Casco
			clicar(By.xpath("//*[@id='formSeguro:j_idt188:2:coberturas']/label/table/tbody/tr/td[2]"));
			//Kit Gas
			clicar(By.xpath("//*[@id='formSeguro:j_idt188:4:coberturas']/label/table/tbody/tr/td[2]"));
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:respostaCobertura:1']\").click().click()");
		}	
	}

	@Então("^Auto - Seguro - preencher campo data Apolice Anterior \"(.*?)\"$")
	public void seguro_preencher_o_campo_data_apolice_anterior_data_ontem(String data) {
		preencherInput(By.id("formSeguro:dataApoliceAnterior"), data);
	}
}
