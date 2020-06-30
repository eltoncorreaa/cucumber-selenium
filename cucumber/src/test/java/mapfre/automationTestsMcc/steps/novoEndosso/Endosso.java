package mapfre.automationTestsMcc.steps.novoEndosso;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Endosso extends TestCommon{
		
	@Dado("^Endosso - url do sistema$")
	public void urlSistema() {		
		driver.get("https://homolog2.mapfreconnect.com.br/novo-endosso-web/paginaPrincipal.xhtml?cod_corretor=79170");	
	}
	
	@Dado("^Endosso - login no sistema \"(.*?)\"$")
	public void loginSistema(String corretor) {		
		driver.get("http://hmlj1:9000/novo-endosso-web/paginaPrincipal.xhtml?cod_corretor=" + corretor);		
	}
	
	@Então("^Endosso - clicar no menu Novo Endosso$")
	public void clicarMenuNovoEndosso() {
		clicar(By.id("formPrincipal:formMenuGeralEndosso:btNovoEndosso"));
		selecionarIFrame("ifrConteudoDown", driver);
	}
	
	@Quando("^Endosso - preencher o campo apolice \"(.*?)\"$")
	public void preencherCampoApolice(String apolice) {		
		preencherInput(By.id("formNovoEndosso:apolice"), apolice);		
	}
	
	@Quando("^Endosso - preencher o campo CPF/CNPJ \"(.*?)\"$")
	public void preencherCampoCpfCnpj(String cpfCnpj) {
		preencherInput(By.id("formNovoEndosso:cpfCnpj"), cpfCnpj);
	}
	
	@Quando("^Endosso - preencher o campo nome \"(.*?)\"$")
	public void preencherCampoNome(String nome) {
		preencherInput(By.id("formNovoEndosso:nomeSegurado"), nome);
	}
	
	@Quando("^Endosso - preencher o campo placa \"(.*?)\"$")
	public void preencherCampoPlaca(String placa) {
		preencherInput(By.id("formNovoEndosso:placa"), placa);
	}
	
	@Quando("^Endosso - preencher o campo chassi \"(.*?)\"$")
	public void preencherCampoChassi(String chassi) {
		preencherInput(By.id("formNovoEndosso:chassi"), chassi);
	}
	
	@Então("^Endosso - clicar no botao Localizar Apolice$")
	public void clicarBotaoLocalizarApolice() {
		clicar(By.id("formNovoEndosso:localizar"));
	}
	
	@Então("^Endosso - clicar no botao Alterar Apolice$")
	public void clicarBotaoAlterarApolice() {
		clicar(By.id("formNovoEndosso:botaoAlterar"));
	}
	
	@Então("^Endosso - clicar no botao Cancelar Apolice$")
	public void clicarBotaoCancelarApolice() {
		clicar(By.id("formNovoEndosso:cancelarApolice"));
	}
	
	@Então("^Endosso - clicar no botao Excluir Item$")
	public void clicarBotaoExcluirItem() {
		clicar(By.id("formNovoEndosso:excluirItem"));
	}
	
	@Então("^Endosso - clicar no passo do wizard \"(.*?)\"$")
	public void clicarWizard(String passo) {
		clicar(By.xpath("//*/span[@class='step' and contains(.,'" + passo + "')]"));
	}
	
}
