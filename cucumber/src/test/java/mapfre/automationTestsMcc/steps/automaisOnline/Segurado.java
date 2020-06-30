package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Segurado extends TestCommon {
		
	@Então("^Auto - Segurado - preencher o sexo \"(.*?)\"$")
	public void preencher_o_campo_sexo(String sexo) {
		if (sexo.equalsIgnoreCase("Masculino")) {
			clicar(By.id("formSegurado:sexo:1"));
		} else {
			clicar(By.id("formSegurado:sexo:0"));
		}
	}
	
	@Quando("^Auto - Segurado - preencher campo nome completo \"(.*?)\"$")
	public void preencher_campo_nome_completo(String nomeCompleto) {
		preencherInput(By.id("formSegurado:nomeCompleto"), nomeCompleto);
	}
	
	@Quando("^Auto - Segurado - preencher campo estado civil \"(.*?)\"$")
	public void preencher_campo_estado_civil(String estadoCivil) {
		preencherSelect(By.id("formSegurado:estadoCivil"), estadoCivil);
	}

	@Quando("^Auto - Segurado - preencher campo renda mensal \"(.*?)\"$")
	public void preencher_campo_renda_mensal(String rendaMensal) {
		preencherSelect(By.id("formSegurado:rendaMensal"), rendaMensal);
	}
	
	@Quando("^Auto - Segurado - preencher campo profissao \"(.*?)\"$")
	public void preencher_campo_profissao(String profissao) {
		preencherSelect(By.id("formSegurado:profissao"), profissao);
	}
	
	@Quando("^Auto - Segurado - preencher campo Atividade que empresa exerce \"(.*?)\"$")
	public void preencher_campo_atividade_empresa_exerce(String atividade) {
		preencherSelect(By.id("formSegurado:atividade"), atividade);
	}

	@Quando("^Auto - Segurado - preencher pais de residencia \"(.*?)\"$")
	public void preencher_pais_de_residencia(String pais_residencia){
		preencherSelect(By.id("formSegurado:pais"), pais_residencia);
	}
	
	@Quando("^Auto - Segurado - preencher o campo DDD Celular \"(.*?)\"$")
	public void preencher_o_campo_DDD_Celular(String ddd) {
		preencherInput(By.id("formSegurado:dddCelular"), ddd);
	}

	@Quando("^Auto - Segurado - preencher o campo Numero Celular \"(.*?)\"$")
	public void preencher_o_campo_Numero_Celular(String numeroCelular) {
		preencherInput(By.id("formSegurado:telefoneCelular"), numeroCelular);
	}
	
	@Quando("^Auto - Segurado - preencher o campo DDD Residencial \"(.*?)\"$")
	public void preencher_o_campo_DDD_residencial(String ddd) {
		preencherInput(By.id("formSegurado:dddResidencial"), ddd);
	}

	@Quando("^Auto - Segurado - preencher o campo Numero Residencial \"(.*?)\"$")
	public void preencher_o_campo_Numero_Residencial(String numeroResidencial) {
		preencherInput(By.id("formSegurado:telefoneResidencial"), numeroResidencial);
	}
	
	@Quando("^Auto - Segurado - preencher o campo DDD Comercial \"(.*?)\"$")
	public void preencher_o_campo_DDD_comercial(String ddd) {
		preencherInput(By.id("formSegurado:dddComercial"), ddd);
	}

	@Quando("^Auto - Segurado - preencher o campo Numero Comercial \"(.*?)\"$")
	public void preencher_o_campo_Numero_Comercial(String numeroComercial) {
		preencherInput(By.id("formSegurado:telefoneComercial"), numeroComercial);
	}
	
	@Quando("^Auto - Segurado - preencher o campo DDD Outros \"(.*?)\"$")
	public void preencher_o_campo_DDD_outros(String ddd) {
		preencherInput(By.id("formSegurado:dddOutros"), ddd);
	}

	@Quando("^Auto - Segurado - preencher o campo Numero Outros \"(.*?)\"$")
	public void preencher_o_campo_Numero_outros(String numeroOutros) {
		preencherInput(By.id("formSegurado:telefoneOutros"), numeroOutros);
	}

	@Quando("^Auto - Segurado - preencher tipo de documento \"(.*?)\"$")
	public void preencher_tipo_de_documento(String tipo_documento){
		preencherSelect(By.id("formSegurado:tipoDocumento"), tipo_documento);
	}

	@Quando("^Auto - Segurado - preencher numero do documento \"(.*?)\"$")
	public void preencher_numero_de_documento(String numero_documento){
		preencherInput(By.id("formSegurado:documento"), numero_documento);
	}

	@Quando("^Auto - Segurado - preencher orgao expedidor \"(.*?)\"$")
	public void preencher_orgao_expedidor(String orgao_expedidor){
		preencherSelect(By.id("formSegurado:orgaoExpedidor"), orgao_expedidor);
	}

	@Quando("^Auto - Segurado - preencher data de expedicao \"(.*?)\"$")
	public void preencher_data_de_expedicao(String data_de_expedicao){
		WebElement inputDate= findElement(By.id("formSegurado:dtExpedicao"));
		inputDate.click();
		preencherInput(By.id("formSegurado:dtExpedicao"), data_de_expedicao);
	}

	@Quando("^Auto - Segurado - preencher e-mail \"(.*?)\"$")
	public void preencher_email(String email){
		preencherInput(By.id("formSegurado:email"), email);
	}

	@Quando("^Auto - Segurado - preencher cep \"(.*?)\"$")
	public void preencher_cep(String cep){
		WebElement campoCep = findElement(By.id("formSegurado:cep"));
		campoCep.click();
		campoCep.sendKeys(cep);
		//campoCep.sendKeys(Keys.TAB);
	}

	@Quando("^Auto - Segurado - preencher numero \"(.*?)\"$")
	public void preencher_numero(String numero_endereco){		
		WebElement campoNumero = findElement(By.id("formSegurado:numero"));
		campoNumero.click();
		preencherInput(By.id("formSegurado:numero"), numero_endereco);
	}
	
	@Quando("^Auto - Segurado - preencher complemento \"(.*?)\"$")
	public void preencher_complemento(String complemento){
		preencherInput(By.id("formSegurado:complemento"), complemento);
	}

	@Então("^Auto - Segurado - clicar no botao proximo$")
	public void clicar_no_botao_proximo() {
		clicar(By.id("formSegurado:btnProximo"));
	}
}
