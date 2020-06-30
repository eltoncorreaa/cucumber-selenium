package mapfre.automationTestsMcc.steps.novoEndosso;

import java.util.ArrayList;

import mapfre.automationTestsMcc.steps.TestCommon;
import mapfre.automationTestsMcc.utils.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CalculoEfetivacao extends TestCommon {
		
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Banco de Maior Relacionamento \"(.*?)\"$")
	public void preencherCampoBancoRelacionamento(String texto) {
		preencherInput(By.id("frmCalculoCotacao:nomeBancoInput"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Grupo de Afinidade \"(.*?)\"$")
	public void preencherCampoGrupoAfinidade(String opcao) {		
		preencherSelect(By.id("frmCalculoCotacao:grupos"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Operador \"(.*?)\"$")
	public void preencherCampoOperador(String opcao) {		
		preencherSelect(By.id("frmCalculoCotacao:operadores"), opcao);
	}
		
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Operacao \"(.*?)\"$")
	public void preencherCampoOperacao(String texto) {
		preencherInput(By.id("frmCalculoCotacao:codigoComissao"), texto);
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botao Calcular$")
	public void clicarBotaoCalcular() {
		clicar(By.id("frmCalculoCotacao:btnCalcular"));
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas \"(.*?)\"$")
	public void confirmarAlteracoesRealizadas(String opcao) {
		if (opcao.equalsIgnoreCase("Sim")) {
			clicar(By.id("frmCalculoCotacao:confirmacaoAlteracoes:0"));
		} else {
			clicar(By.id("frmCalculoCotacao:confirmacaoAlteracoes:1"));
		}
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo$")
	public void clicarBotaoConfirmarCalculo() {
		clicar(By.id("frmCalculoCotacao:calcularEndosso"));
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botao Duplicar Cotacao$")
	public void clicarBotaoDuplicarCotacao() {
		clicar(By.className("documents-icon"));
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item$")
	public void clicarBotaoAdicionarItem() {
		clicar(By.className("add-new-icon"));
	}
			
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Segurado Responsavel Pagamento \"(.*?)\"$")
	public void preencherCampoSeguradoResponsavelPagamento(String opcao) {	
		if (opcao.equalsIgnoreCase("Sim")) {
			((JavascriptExecutor)driver).executeScript("$(\"input[id='frmCalculoCotacao:seguradoResponsavel:0']\").click().click()");			
		} else {
			((JavascriptExecutor)driver).executeScript("$(\"input[id='frmCalculoCotacao:seguradoResponsavel:1']\").click().click()");			
		}				
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo CPF CNPJ \"(.*?)\"$")
	public void preencherCampoCpfCnpj(String texto) {	
		WebElement element = preencherInput(By.id("frmCalculoCotacao:cpfCnpj"), texto);		
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Data Nascimento \"(.*?)\"$")
	public void preencherCampoDataNascimento(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:dtNascimento"), texto);		
	}	
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Sexo \"(.*?)\"$")
	public void preencherCampoSexo(String opcao) {		
		if (opcao.equalsIgnoreCase("Feminino")) {
			clicar(By.id("frmCalculoCotacao:sexo:0"));
		} else {
			clicar(By.id("frmCalculoCotacao:sexo:1"));
		}				
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Nome Completo \"(.*?)\"$")
	public void preencherCampoCampoCompleto(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:nomeCompleto"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Estado Civil \"(.*?)\"$")
	public void preencherCampoEstadoCivil(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:estadoCivil"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Renda Mensal \"(.*?)\"$")
	public void preencherCampoRendaMensal(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:codRendaMensal"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Atividade do Segurado \"(.*?)\"$")
	public void preencherCampoAtividadeSegurado(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:profissao"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Atividade da Empresa \"(.*?)\"$")
	public void preencherCampoAtividadeEmpresa(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:atividade"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Pais de Residencia \"(.*?)\"$")
	public void preencherCampoPais(String opcao) {			
		preencherInput(By.id("frmCalculoCotacao:pais"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo DDD Celular \"(.*?)\"$")
	public void preencherCampoDDDCelular(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:dddCelular"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Fone Celular \"(.*?)\"$")
	public void preencherCampoFoneCelular(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:foneCelular"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo DDD Residencial \"(.*?)\"$")
	public void preencherCampoDDDResidencial(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:dddResidencial"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Fone Residencial \"(.*?)\"$")
	public void preencherCampoFoneResidencial(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:foneResidencial"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo DDD Comercial \"(.*?)\"$")
	public void preencherCampoDDDComercial(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:dddComercial"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Fone Comercial \"(.*?)\"$")
	public void preencherCampoFoneComercial(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:foneComercial"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo DDD Outros \"(.*?)\"$")
	public void preencherCampoDDDOutros(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:dddOutros"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Fone Outros \"(.*?)\"$")
	public void preencherCampoFoneOutros(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:foneOutros"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Tipo de Documento \"(.*?)\"$")
	public void preencherCampoTipoDocumento(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:tipoDocumento"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Numero do Documento \"(.*?)\"$")
	public void preencherCampoNumeroDocumento(String texto) {
		preencherInput(By.id("frmCalculoCotacao:documento"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Orgao Expedidor \"(.*?)\"$")
	public void preencherCampoOrgaoExpedidor(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:orgaoExpedidor"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Data Expedicao \"(.*?)\"$")
	public void preencherCampoDataExpedicao(String texto) {
		preencherInput(By.id("frmCalculoCotacao:dtExpedicao"), texto);		
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Email \"(.*?)\"$")
	public void preencherCampoEmail(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:email"), texto);		
	}	
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo CEP \"(.*?)\"$")
	public void preencherCampoCep(String cep) {	
		WebElement txtCep = findElement(By.id("frmCalculoCotacao:cep"));		
				
		if (!txtCep.getAttribute("value").isEmpty()) {
			txtCep.clear();
			timeout(4);		
			txtCep = findElement(By.id("frmCalculoCotacao:cep"));
			txtCep.click();
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);
		} else {
			txtCep.click();
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);	
		}	
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botao Nao sei o CEP$")
	public void clicarBotaoNaoSeiCEP() {
		clicar(By.id("frmCalculoCotacao:linkModal"));
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Estado \"(.*?)\"$")
	public void preencherCampoEstado(String opcao) {	
		preencherSelect(By.id("cepForm:estado"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Cidade \"(.*?)\"$")
	public void preencherCampoCidade(String texto) {	
		preencherInput(By.id("cepForm:cidadeInput"), texto);		
	}	
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Logradouro \"(.*?)\"$")
	public void preencherCampoLogradouro(String texto) {	
		preencherInput(By.id("cepForm:logradouro"), texto);		
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botao Pesquisar CEP$")
	public void clicarBotaoPesquisarCEP() {
		clicar(By.id("cepForm:btnPesquisar"));
	}
	
	@Então("^Endosso - Calculo/Efetivacao - selecionar o CEP$")
	public void selecionarCEP() {
		((JavascriptExecutor)driver).executeScript("$(\".select-box .even\").click()");
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botao Confirmar CEP$")
	public void clicarBotaoConfirmarCEP() {
		clicar(By.id("cepForm:btConfirmar"));
	}	
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Numero do Endereco \"(.*?)\"$")
	public void preencherCampoNumeroEndereco(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:numero"), texto);		
	}	
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Complemento \"(.*?)\"$")
	public void preencherCampoComplemento(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:complemento"), texto);		
	}	
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento \"(.*?)\"$")
	public void preencherCampoFormaPagamento(String opcao) {		
		preencherSelect(By.id("frmCalculoCotacao:formaPagamento"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas \"(.*?)\"$")
	public void preencherCampoQtdParcelas(String opcao) {	
		preencherSelect(By.id("frmCalculoCotacao:qtdeParcelas"), opcao);
	}	
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Dia Vencimento \"(.*?)\"$")
	public void preencherCampoDiaVencimento(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:diaPreferencial"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Banco \"(.*?)\"$")
	public void preencherCampoBanco(String texto) {	
		WebElement element = preencherInput(By.id("frmCalculoCotacao:bancoInput"), texto);
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Agencia \"(.*?)\"$")
	public void preencherCampoAgencia(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:agenciaNumero"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Digito Agencia \"(.*?)\"$")
	public void preencherCampoDigitoAgencia(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:agenciaDigito"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Conta Corrente \"(.*?)\"$")
	public void preencherCampoContaCorrente(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:contaNumero"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Digito Conta \"(.*?)\"$")
	public void preencherCampoDigitoConta(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:contaDigito"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Operacao Conta \"(.*?)\"$")
	public void preencherCampoOperacaoConta(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:contaOperacao"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Bandeira \"(.*?)\"$")
	public void preencherCampoBandeira(String opcao) {			
		preencherSelect(By.id("frmCalculoCotacao:bandeira"), opcao);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Nome Titular \"(.*?)\"$")
	public void preencherCampoNomeTitular(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:nomeTitular"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Numero do Cartao \"(.*?)\"$")
	public void preencherCampoNumeroCartao(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:numeroCartao"), texto);
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo Validade do Cartao \"(.*?)\"$")
	public void preencherCampoValidadeCartao(String texto) {	
		preencherInput(By.id("frmCalculoCotacao:validadeCartao"), texto);
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botão Imprimir Calculo$")
	public void clicarBotãoImprimirCalculo() {
		((JavascriptExecutor)driver).executeScript("$(\"a[id='frmCalculoCotacao:btImprimir']\").click();");
		timeout(2);
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar no botão Imprimir Proposta$")
	public void clicarBotãoImprimirProposta() {
		((JavascriptExecutor)driver).executeScript("$(\"a[id='frmCalculoCotacao:imprimirProposta']\").click();");
		timeout(2);
	}
	
	@Então("^Endosso - Calculo/Efetivacao - print impressao$")
	public void voltarAba() {
		Utils utils = new Utils();
		ArrayList<String> outraAbas = new ArrayList<String>(driver.getWindowHandles());
		
		try {
			
		driver.switchTo().window(outraAbas.get(1));
			timeout(1);
			utils.tirar_um_print_screen_impressao();
			timeout(2);
		driver.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		driver.switchTo().window(outraAbas.get(0));
		selecionarIFrame("ifrConteudoDown", driver);
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clicar Efetivar Proposta$")
	public void clicarEfetivarProposta() {	
		clicar(By.id("frmCalculoCotacao:btnEfetivar"));
	}
	
	@Quando("^Endosso - Calculo/Efetivacao - preencher o campo chassi do modal no momento de efetivar \"(.*?)\" \"(.*?)\"$")
	public void preencherChassiEmBrancoQuandoForEfetivar(String texto, String numItem) {	
		preencherInput(By.id("frmCalculoCotacao:listaChassiPlaca:" + numItem +  ":chassi"), texto);
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clico botao salvar modal de chassi obrigatorio$")
	public void clicarBotaoSalvarModalChassi() {	
		clicar(By.id("frmCalculoCotacao:btOk"));
	}
	
	@Então("^Endosso - Calculo/Efetivacao - clico botao fechar modal de chassi obrigatorio$")
	public void clicarBotaoFecharModalChassi() {	
		clicar(By.id("frmCalculoCotacao:btCancelarPlacaChassi"));
	}		
	
}
