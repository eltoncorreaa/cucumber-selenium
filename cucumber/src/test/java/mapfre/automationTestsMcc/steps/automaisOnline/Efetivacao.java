package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Efetivacao extends TestCommon {
		
	@Quando("^Auto - Efetivacao - preencher o campo Segurado Responsavel Pagamento \"(.*?)\"$")
	public void preencherCampoSeguradoResponsavelPagamento(String opcao) {	
		if (opcao.equalsIgnoreCase("Sim")) {
			clicar(By.id("formEfetivacao:seguradoResponsavel:0"));		
		} else {
			clicar(By.id("formEfetivacao:seguradoResponsavel:1"));			
		}				
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo CPF CNPJ \"(.*?)\"$")
	public void preencherCampoCpfCnpj(String valor) {	
		WebElement element = preencherInput(By.id("formEfetivacao:cpfCnpj"), valor);
		element.sendKeys(Keys.TAB);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Data Nascimento \"(.*?)\"$")
	public void preencherCampoDataNascimento(String valor) {	
		preencherInput(By.id("formEfetivacao:dtNascimento"), valor);		
	}	
	
	@Quando("^Auto - Efetivacao - preencher o campo Sexo \"(.*?)\"$")
	public void preencherCampoSexo(String opcao) {	
		if (opcao.equalsIgnoreCase("Feminino")) {
			clicar(By.id("formEfetivacao:sexo:0"));
		} else {
			clicar(By.id("formEfetivacao:sexo:1"));		
		}				
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Nome Completo \"(.*?)\"$")
	public void preencherCampoCampoCompleto(String valor) {	
		preencherInput(By.id("formEfetivacao:nomeCompleto"), valor);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Estado Civil \"(.*?)\"$")
	public void preencherCampoEstadoCivil(String opcao) {			
		preencherSelect(By.id("formEfetivacao:estadoCivil"), opcao);	
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo renda mensal \"(.*?)\"$")
	public void preencherCampoRendaMensal(String opcao) {			
		preencherSelect(By.id("formSegurado:rendaMensal"), opcao);	
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Atividade do Segurado \"(.*?)\"$")
	public void preencherCampoAtividadeSegurado(String opcao) {			
		preencherSelect(By.id("formEfetivacao:profissao"), opcao);	
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Atividade da Empresa \"(.*?)\"$")
	public void preencherCampoAtividadeEmpresa(String opcao) {			
		preencherSelect(By.id("formEfetivacao:atividade"), opcao);			
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Pais de Residencia \"(.*?)\"$")
	public void preencherCampoPais(String opcao) {		
		preencherSelect(By.id("formEfetivacao:pais"), opcao);			
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo DDD Celular \"(.*?)\"$")
	public void preencherCampoDDDCelular(String valor) {	
		preencherInput(By.id("formEfetivacao:dddCelular"), valor);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Fone Celular \"(.*?)\"$")
	public void preencherCampoFoneCelular(String valor) {	
		preencherInput(By.id("formEfetivacao:foneCelular"), valor);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo DDD Residencial \"(.*?)\"$")
	public void preencherCampoDDDResidencial(String valor) {	
		preencherInput(By.id("formEfetivacao:dddResidencial"), valor);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Fone Residencial \"(.*?)\"$")
	public void preencherCampoFoneResidencial(String valor) {	
		preencherInput(By.id("formEfetivacao:foneResidencial"), valor);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo DDD Comercial \"(.*?)\"$")
	public void preencherCampoDDDComercial(String valor) {	
		preencherInput(By.id("formEfetivacao:dddComercial"), valor);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Fone Comercial \"(.*?)\"$")
	public void preencherCampoFoneComercial(String valor) {	
		preencherInput(By.id("formEfetivacao:foneComercial"), valor);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo DDD Outros \"(.*?)\"$")
	public void preencherCampoDDDOutros(String valor) {	
		preencherInput(By.id("formEfetivacao:dddOutros"), valor);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Fone Outros \"(.*?)\"$")
	public void preencherCampoFoneOutros(String valor) {	
		preencherInput(By.id("formEfetivacao:foneOutros"), valor);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Tipo de Documento \"(.*?)\"$")
	public void preencherCampoTipoDocumento(String opcao) {	
		preencherSelect(By.id("formEfetivacao:tipoDocumento"), opcao);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Numero do Documento \"(.*?)\"$")
	public void preencherCampoNumeroDocumento(String valor) {
		preencherInput(By.id("formEfetivacao:documento"), valor);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Orgao Expedidor \"(.*?)\"$")
	public void preencherCampoOrgaoExpedidor(String opcao) {			
		preencherSelect(By.id("formEfetivacao:orgaoExpedidor"), opcao);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Data Expedicao \"(.*?)\"$")
	public void preencherCampoDataExpedicao(String valor) {
		preencherInput(By.id("formEfetivacao:dtExpedicao"), valor);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Email \"(.*?)\"$")
	public void preencherCampoEmail(String valor) {	
		preencherInput(By.id("formEfetivacao:email"), valor);
	}	
	
	@Quando("^Auto - Efetivacao - preencher o campo CEP \"(.*?)\"$")
	public void preencherCampoCep(String texto) {	
		WebElement element = findElement(By.id("formEfetivacao:cep"));		
		element.click();	
		element.sendKeys(texto);
		element.sendKeys(Keys.TAB);
	}
	
	@Então("^Auto - Efetivacao - clicar no botao Nao sei o CEP$")
	public void clicarBotaoNaoSeiCEP() {
		clicar(By.id("formEfetivacao:linkModal"));
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Estado \"(.*?)\"$")
	public void preencherCampoEstado(String opcao) {
		preencherSelect(By.id("cepForm:estado"), opcao);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Cidade \"(.*?)\"$")
	public void preencherCampoCidade(String valor) {
		preencherInput(By.id("cepForm:cidadeInput"), valor);
	}	
	
	@Quando("^Auto - Efetivacao - preencher o campo Logradouro \"(.*?)\"$")
	public void preencherCampoLogradouro(String valor) {	
		preencherInput(By.id("cepForm:logradouro"), valor);
	}
	
	@Então("^Auto - Efetivacao - clicar no botao Pesquisar CEP$")
	public void clicarBotaoPesquisarCEP() {
		clicar(By.id("cepForm:btnPesquisar"));
	}
	
	@Então("^Auto - Efetivacao - selecionar o CEP$")
	public void selecionarCEP() {
		((JavascriptExecutor)driver).executeScript("$(\".select-box .even\").click()");
	}
	
	@Então("^Auto - Efetivacao - clicar no botao Confirmar CEP$")
	public void clicarBotaoConfirmarCEP() {
		clicar(By.id("cepForm:btConfirmar"));		
	}	
	
	@Quando("^Auto - Efetivacao - preencher o campo Numero do Endereco \"(.*?)\"$")
	public void preencherCampoNumeroEndereco(String valor) {
		preencherInput(By.id("formEfetivacao:numero"), valor);		
	}	
	
	@Quando("^Auto - Efetivacao - preencher o campo Complemento \"(.*?)\"$")
	public void preencherCampoComplemento(String valor) {	
		preencherInput(By.id("formEfetivacao:complemento"), valor);
	}

	@Quando("^Auto - Efetivacao - preencher o campo Forma de Pagamento \"(.*?)\"$")
	public void preencherCampoFormaPagamento(String opcao) {		
		preencherSelect(By.id("formEfetivacao:formaPagamento"), opcao);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Quantidade de Parcelas \"(.*?)\"$")
	public void preencherCampoQtdParcelas(String opcao) {
		preencherSelect(By.id("formEfetivacao:qtdeParcelas"), opcao);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Dia preferencial para vencimento \"(.*?)\"$")
	public void preencherCampoDiaPagamento(String opcao) {
		preencherSelect(By.id("formEfetivacao:diaPreferencial"), opcao);	
	}	
	
	@Quando("^Auto - Efetivacao - preencher o campo Banco \"(.*?)\"$")
	public void preencherCampoBanco(String valor) {			
		WebElement element = preencherInput(By.id("formEfetivacao:bancoInput"), valor);
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Agencia \"(.*?)\"$")
	public void preencherCampoAgencia(String valor) {	
		preencherInput(By.id("formEfetivacao:agenciaNumero"), valor);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Digito Agencia \"(.*?)\"$")
	public void preencherCampoDigitoAgencia(String valor) {	
		preencherInput(By.id("formEfetivacao:agenciaDigito"), valor);			
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Conta Corrente \"(.*?)\"$")
	public void preencherCampoContaCorrente(String valor) {	
		preencherInput(By.id("formEfetivacao:contaNumero"), valor);	
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Digito Conta \"(.*?)\"$")
	public void preencherCampoDigitoConta(String valor) {	
		preencherInput(By.id("formEfetivacao:contaDigito"), valor);		
	}
	
	@Quando("^Auto - Efetivacao - preencher o campo Operacao Conta \"(.*?)\"$")
	public void preencherCampoOperacaoConta(String valor) {	
		preencherInput(By.id("formEfetivacao:contaOperacao"), valor);
	}	
	
	@Então("^Auto - Efetivacao - clicar no botao Efetivar$")
	public void clicarBotaoEfetivacao() {
		clicar(By.id("formEfetivacao:btnEfetivar"));
	}
	
	@Então("^Auto - Efetivacao - clicar no botao Adicionar Item$")
	public void clicarBotaoAdicionarItem() {
		clicar(By.className("add-new-icon"));
	}
}
