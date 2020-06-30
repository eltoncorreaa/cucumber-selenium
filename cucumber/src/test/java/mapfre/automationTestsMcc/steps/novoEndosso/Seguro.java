package mapfre.automationTestsMcc.steps.novoEndosso;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Seguro extends TestCommon {
			
	@Então("^Endosso/Seguro - preencher o campo Inicio Vigencia Endosso \"(.*?)\"$")
	public void seguro_preencher_o_campo_inicio_vigencia_endosso(String dataVigencia) {
		WebElement element = null;
		 
		if (dataVigencia.equalsIgnoreCase("Data atual")) {
			element = preencherInput(By.id("formSeguro:inicioVigenciaEndosso"), getDateTime());
		} else {
			element = preencherInput(By.id("formSeguro:inicioVigenciaEndosso"), dataVigencia);
		}
		
		element.sendKeys(Keys.TAB);
	}
	
	@Então("^Endosso/Seguro - preencher o campo Controle de identificação \"(.*?)\"$")
	public void seguro_preencher_o_campo_controle_identificacao(String controleIdentificacao) {
		preencherInput(By.id("formSeguro:codigoIdentificacao"), controleIdentificacao);
	}
	
	@Então("^Endosso/Seguro - preencher o campo data Apolice Anterior \"(.*?)\"$")
	public void seguro_preencher_o_campo_data_apolice_anterior(String dataApoliceAnterior) {
		preencherInput(By.id("formSeguro:dataApoliceAnterior"), dataApoliceAnterior);
	}
		
	@Quando("^Endosso/Seguro - pergunta Renovação do próprio corretor \"(.*?)\"$")
	public void preencher_pergunta_renovacao_proprio_corretor(String renovacao_proprio_corretor){			
		if(renovacao_proprio_corretor.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:renovacaoProprioCorretor:0']\").click().click()"); 
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:renovacaoProprioCorretor:1']\").click().click()"); 
		}			
	}
	
	@Então("^Endosso/Seguro - clicar no botao Adicionar Item$")
	public void clicarBotaoAdicionarItem() {
		clicar(By.id("frmCalculoCotacao:panelBotaoAdicionarItem"));
	}
	
	@Então("^Endosso/Seguro - preencher o campo Tipo Seguro \"(.*?)\"$")
	public void preencherCampoTipoSeguro(String tipoSeguro) {
		preencherSelect(By.xpath("//*[@id='formSeguro:tipoSeguro']"), tipoSeguro);
	}
	
	@Então("^Endosso/Seguro - preencher o campo Seguradora Anterior \"(.*?)\"$")
	public void preencherCampoSeguradoraAnteior(String SeguradoraAnterior) {
		preencherSelect(By.xpath("//*[@id='formSeguro:seguradoraAnterior']"), SeguradoraAnterior);
	}
	
	@Então("^Endosso/Seguro - preencher o campo Numero Apolice Anterior \"(.*?)\"$")
	public void seguro_preencher_o_campo_numero_apolice_anterior(String apoliceAnterior) {
		preencherInput(By.id("formSeguro:numeroApoliceAnterior"), apoliceAnterior);
	}
	
	@Então("^Endosso - Seguro - clicar no botao Proximo Dados do Seguro$")
	public void clicar_no_botao_Proximo_Dados_do_Seguro_Complemento() {
		clicar(By.id("formSeguro:botao"));
	}
		
	@Então("^Endosso/Seguro - preencher o campo Numero Item Apolice \"(.*?)\"$")
	public void seguro_preencher_o_campo_numero_item_apolice(String itemApolice) {
		preencherInput(By.id("formSeguro:numeroItemApolice"), itemApolice);
	}	
	
	@Quando("^Endosso/Seguro - pergunta Sinistro na Ultima Vigencia \"(.*?)\"$")
	public void preencher_pergunta_sinistro_ultima_vigencia(String sinistro_ultima_vigencia){		
		if(sinistro_ultima_vigencia.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:selectSinistroUltimaVigencia:0']\").click().click()"); 
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:selectSinistroUltimaVigencia:1']\").click().click()"); 
		}	
	}

	@Então("^Endosso/Seguro - preencher o campo Nova Classe Bonus \"(.*?)\"$")
	public void preencher_campo_nova_classe_bonus(String classeBonus) {
		preencherSelect(By.xpath("//*[@id='formSeguro:classeBonus']"), classeBonus);
	}
	
	@Quando("^Endosso/Seguro - pergunta o veículo é o mesmo da apólice anterior \"(.*?)\"$")
	public void preencher_pergunta_veiculo_mesmo_apolice_anterior(String mesmo_veiculo_apolice_anterior){		
		if(mesmo_veiculo_apolice_anterior.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:respostaVeiculo:0']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:respostaVeiculo:1']\").click().click()");
		}	
	}
	
	@Quando("^Endosso/Seguro - pergunta foram incluidas corbeturas opicionais diferentes da apolice anterior \"(.*?)\"$")
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
			// Kit Gas
			clicar(By.xpath("//*[@id='formSeguro:j_idt188:4:coberturas']/label/table/tbody/tr/td[2]"));			
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id='formSeguro:respostaCobertura:1']\").click().click()");
		}	
	}
	
	@Quando("^Endosso - preencher o campo tipo de seguro \"(.*?)\"$")
	public void preencher_o_campo_tipo_de_seguro_por_id(String tipoSeguro) {
		preencherSelect(By.id("formSeguro:tipoSeguro"), tipoSeguro);
	}
	
	@Quando("^Endosso - preencher o campo seguradora anterior \"(.*?)\"$")
	public void preencher_o_campo_segurada_anterior_por_id(String seguradaAnterior) {
		preencherSelect(By.id("formSeguro:seguradoraAnterior"), seguradaAnterior);
	}
	
	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
}