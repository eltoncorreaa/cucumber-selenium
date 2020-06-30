package mapfre.automationTestsMcc.steps.novoEndosso;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Segurado extends TestCommon{
				
	@Quando("^Endosso - Segurado - preencher o campo Data Nascimento \"(.*?)\"$")
	public void preencher_o_campo_Data_Nascimento(String dataNascimento) {
		preencherInput(By.id("formSegurado:dtNascimento"), dataNascimento);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Sexo Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Sexo_Principal_Condutor(String sexo) {
		if (sexo.equals("Feminino")) {
			clicar(By.id("formSegurado:sexo:0"));
		} else {
			clicar(By.id("formSegurado:sexo:1"));
		}
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Nome Completo \"(.*?)\"$")
	public void preencher_o_campo_Nome_Completo(String nomeCompleto) {
		preencherInput(By.id("formSegurado:nomeCompleto"), nomeCompleto);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Estado Civil Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Estado_Civil_Principal_Condutor(String estadoCivil) {
		preencherSelect(By.id("formSegurado:codEstadoCivil"), estadoCivil);
	}
	
	@Quando("^Endosso - Segurado - preencher campo renda mensal \"(.*?)\"$")
	public void preencher_o_campo_Renda_Mensal(String rendaMensal) {
		preencherSelect(By.id("formSegurado:codRendaMensal"), rendaMensal);
	}
	
	@Quando("^Endosso - Segurado - Profissao Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Profissao_Principal_Condutor(String profissao) {
		preencherSelect(By.id("formSegurado:codProfissao"), profissao);
	}
	
	@Quando("^Endosso - Segurado - preencher pais de residencia \"(.*?)\"$")
	public void preencher_o_campo_Pais_de_Residencia(String paisResidencia) {
		preencherSelect(By.id("formSegurado:codPais"), paisResidencia);
	}

	@Quando("^Endosso - Segurado - preencher o campo DDD Celular \"(.*?)\"$")
	public void preencher_o_campo_DDD_Celular(String ddd) {
		preencherInput(By.id("formSegurado:dddCelular"), ddd);
	}

	@Quando("^Endosso - Segurado - preencher o campo Numero Celular \"(.*?)\"$")
	public void preencher_o_campo_Numero_Celular(String numero) {
		WebElement element = findElement(By.id("formSegurado:telefoneCelular"));		
		element.clear();
		timeout(1);
		element = findElement(By.id("formSegurado:telefoneCelular"));
		element.sendKeys(numero);
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo DDD Residencial \"(.*?)\"$")
	public void preencher_o_campo_DDD_residencial(String ddd) {
		preencherInput(By.id("formSegurado:dddResidencial"), ddd);
	}

	@Quando("^Endosso - Segurado - preencher o campo Numero Residencial \"(.*?)\"$")
	public void preencher_o_campo_Numero_Residencial(String numero) {
		WebElement element = findElement(By.id("formSegurado:telefoneResidencial"));		
		element.clear();
		timeout(1);
		element = findElement(By.id("formSegurado:telefoneResidencial"));
		element.sendKeys(numero);
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo DDD Comercial \"(.*?)\"$")
	public void preencher_o_campo_DDD_comercial(String ddd) {
		preencherInput(By.id("formSegurado:dddComercial"), ddd);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Numero Comercial \"(.*?)\"$")
	public void preencher_o_campo_Numero_Comercial(String numero) {
		WebElement element = findElement(By.id("formSegurado:telefoneComercial"));		
		element.clear();
		timeout(1);
		element = findElement(By.id("formSegurado:telefoneComercial"));
		element.sendKeys(numero);
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo DDD Outros \"(.*?)\"$")
	public void preencher_o_campo_DDD_Outros(String ddd) {
		preencherInput(By.id("formSegurado:dddOutros"), ddd);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Numero Outros \"(.*?)\"$")
	public void preencher_o_campo_Numero_Outros(String numero) {
		WebElement element = findElement(By.id("formSegurado:telefoneOutros"));		
		element.clear();
		timeout(1);
		element = findElement(By.id("formSegurado:telefoneOutros"));
		element.sendKeys(numero);
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Endosso - Segurado - preencher tipo de documento \"(.*?)\"$")
	public void preencher_o_campo_Tipo_Do_Documento(String tipoDocumento) {
		preencherSelect(By.id("formSegurado:codTipoDocumento"), tipoDocumento);
	}

	@Quando("^Endosso - Segurado - preencher numero do documento \"(.*?)\"$")
	public void preencher_o_campo_Numero_Do_Documento(String numeroDocumento) {
		preencherInput(By.id("formSegurado:numeroDocumento"), numeroDocumento);
	}
	
	@Quando("^Endosso - Segurado - preencher orgao expedidor \"(.*?)\"$")
	public void preencher_o_campo_Orgao_Expedidor(String orgaoExpedidor) {
		preencherSelect(By.id("formSegurado:codOrgaoExpedidor"), orgaoExpedidor);
	}
	
	@Quando("^Endosso - Segurado - preencher data de expedicao \"(.*?)\"$")
	public void preencher_o_campo_Data_De_Expedicao(String dataExpedicao) {
		preencherInput(By.id("formSegurado:dataExpedicao"), dataExpedicao);
	}
	
	@Quando("^Endosso - Segurado - preencher e-mail \"(.*?)\"$")
	public void preencher_o_campo_Email(String email) {
		preencherInput(By.id("formSegurado:email"), email);
	}
	
	@Quando("^Endosso - Segurado - preencher cep \"(.*?)\"$")
	public void preencher_o_campo_Cep(String cep) {
		WebElement txtCep = findElement(By.id("formSegurado:cep"));
		
		if (!txtCep.getAttribute("value").isEmpty()) {
			txtCep.clear();
			timeout(4);		
			txtCep = findElement(By.id("formSegurado:cep"));
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);
		} else {
			txtCep.click();
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);	
		}		
		
	}
	
	@Quando("^Endosso - Segurado - preencher numero \"(.*?)\"$")
	public void preencher_o_campo_Numero(String numero) {
		preencherInput(By.id("formSegurado:numero"), numero);
	}
	
	@Quando("^Endosso - Segurado - preencher complemento \"(.*?)\"$")
	public void preencher_o_campo_Complemento_Endereco(String complemento) {
		preencherInput(By.id("formSegurado:complemento"), complemento);
	}
	
	@Então("^Endosso - Segurado - clicar no botao proximo$")
	public void clicar_no_botao_Iniciar() {
		clicar(By.id("formSegurado:btnProximo"));
	}
	
	@Então("^Endosso - Segurado - clicar no botao popup$")
	public void clicar_no_Alert_PopUp(){
		clicar(By.id("formModalAlerta:btOkModalAlerta"));
	}
	
	@Então("^Endosso - Segurado - clicar no botao Nao sei o CEP$")
	public void clicarBotaoNaoSeiCEP() {
		clicar(By.id("formSegurado:linkModal"));
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Estado \"(.*?)\"$")
	public void preencherCampoEstado(String opcao) {	
		preencherSelect(By.id("cepForm:estado"), opcao);
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Cidade \"(.*?)\"$")
	public void preencherCampoCidade(String texto) {	
		preencherInput(By.id("cepForm:cidadeInput"), texto);		
	}
	
	@Quando("^Endosso - Segurado - preencher o campo Logradouro \"(.*?)\"$")
	public void preencherCampoLogradouro(String texto) {	
		preencherInput(By.id("cepForm:logradouro"), texto);		
	}
	
	@Então("^Endosso - Segurado - clicar no botao Pesquisar CEP$")
	public void clicarBotaoPesquisarCEP() {
		clicar(By.id("cepForm:btnPesquisar"));
	}
	
	@Então("^Endosso - Segurado - selecionar o CEP$")
	public void selecionarCEP() {
		((JavascriptExecutor)driver).executeScript("$(\".select-box .even\").click()");
	}
	
	@Então("^Endosso - Segurado - clicar no botao Confirmar CEP$")
	public void clicarBotaoConfirmarCEP() {
		clicar(By.id("cepForm:btConfirmar"));
	}
	
	@Quando("^Endosso - Segurado - preencher Nome da Empresa \"(.*?)\"$")
	public void preencherCampoNomeEmpresa(String nomeEmpresa) {
		preencherInput(By.id("formSegurado:nomeEmpresa"), nomeEmpresa);
	}
	
	@Quando("^Endosso - Segurado - preencher Atividade que Empresa Exerce \"(.*?)\"$")
	public void preencherCampoAtividadeEmpresa(String atividade) {
		preencherSelect(By.id("formSegurado:codAtividade"), atividade);
		
	}
}
