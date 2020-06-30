package mapfre.automationTestsMcc.steps.automaisOnline;

import java.util.ArrayList;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ValorSeguro extends TestCommon {
	
	@Então("^Auto - Calculo - clicar no botao Imprimir$")
	public void clicar_no_botao_Imprimir() {
		clicar(By.id("frmCalculoCotacao:btImprimir"));
	}

	@Quando("^Auto - Calculo - clicar no botão fechar popup Banco Maior Relacionamento$")
	public void clicar_no_botão_fechar_popup_Banco_Maior_Relacionamento() {
		clicar(By.xpath("//*[@id=\"modalAlertBancoRelacionado\"]/div/div[3]/a"));
	}
	
	@Quando("^Auto - Calculo - preencher o campo Banco de Maior Relacionamento \"(.*?)\"$")
	public void preencher_campo_banco_relacionamento(String valor) {
		preencherInput(By.id("frmCalculoCotacao:nomeBancoInput"), valor);
	}
	
	@Quando("^Auto - Calculo - preencher o campo Grupo de Afinidade \"(.*?)\"$")
	public void preencher_campo_grupo_afinidade(String valor) {		
		preencherSelect(By.id("frmCalculoCotacao:grupos"), valor);
	}
	
	@Quando("^Auto - Calculo - preencher o campo Operador \"(.*?)\"$")
	public void preencher_campo_operador(String valor) {		
		preencherSelect(By.id("frmCalculoCotacao:operadores"), valor);
	}
	
	@Quando("^Auto - Calculo - preencher o campo Operacao \"(.*?)\"$")
	public void preencher_campo_operacao(String valor) {
		preencherInput(By.id("frmCalculoCotacao:codigoComissao"), valor);
	}

	@Quando("^Auto - Calculo - clicar na opção de franquia \"(.*?)\"$")
	public void clicar_na_opção_de_franquia(String opcaoFranquia) {
		if (opcaoFranquia.trim().toLowerCase().equals("normal")) {
			clicar(By.xpath("//*[@tabindex='43']"));
		} else if (opcaoFranquia.trim().toLowerCase().equals("reduzida")) {
			clicar(By.xpath("//*[@tabindex='44']"));
		} else {
			clicar(By.xpath("//*[@tabindex='45']"));
		}
	}

	@Então("^Auto - Calculo - clicar no botão proposta")
	public void clicar_no_botao_proposta(){
		clicar(By.id("frmCalculoCotacao:btnProposta"));
	}

	@Então("^Auto - Calculo - troca de aba e clicar no botão Imprimir$")
	public void troca_de_aba_e_clicar_no_botão_Imprimir() {
		ArrayList<String> outraAbas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(outraAbas.get(1));
		timeout(3);
		WebElement botaoImprimirOutraAba = driver.findElement(By.id("formImpressao:btImprimir"));
		botaoImprimirOutraAba.click();
		timeout(20);
	}

	@Então("^Auto - Calculo - troca de aba e clicar no botão Salvar PDF$")
	public void troca_de_aba_e_clicar_no_botão_Salvar_PDF() {
		ArrayList<String> outraAbas = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(outraAbas.get(1));
		timeout(3);
		WebElement botaoImprimirOutraAba = driver.findElement(By.id("formImpressao:btSalvarPDF"));
		botaoImprimirOutraAba.click();
		timeout(20);
	}
	
	@Então("^Auto - Calculo - clicar no botao Calcular$")
	public void clicar_no_botao_Calcular() {
		clicar(By.id("frmCalculoCotacao:btnCalcular"));
	}
			
	@Então("^Auto - Calculo - clicar no botao Sim Modal Sem Aceitacao$")
	public void clicarBotaoSimModalSemAceitacao() {
		clicar(By.id("formSubscricaoExcepcionSimNao:btnSimSubscricaoExcepcion"));
	}

	@Então("^Auto - Calculo - preencher chassi Modal Sem Aceitacao \"(.*?)\"$")
	public void preencherChassiModalSemAceitacao(String chassi) {
		preencherInput(By.className("subscricaoChassi"), chassi);
	}
	
	@Então("^Auto - Calculo - preencher apolice anterior Modal Sem Aceitacao \"(.*?)\"$")
	public void preencherApoliceAnteriorModalSemAceitacao(String apoliceAnterior) {		
		preencherInput(By.className("subscricaoNumeroApolice"), apoliceAnterior);
	}
	
	@Então("^Auto - Calculo - preencher numero item apolice Modal Sem Aceitacao \"(.*?)\"$")
	public void preencherNumeroItemApoliceModalSemAceitacao(String numItem) {		
		preencherInput(By.className("subscricaoItemApolice"), numItem);
	}

	@Então("^Auto - Calculo - preencher observacao Modal Sem Aceitacao \"(.*?)\"$")
	public void preencherObservacaoModalSemAceitacao(String obs) {
		preencherInput(By.xpath("//*/textarea[contains(@name, 'formSubscricaoExcepcion')]"), obs);
	}

	@Então("^Auto - Calculo - clicar no botao Enviar Modal Sem Aceitacao$")
	public void clicarEnviarModalSemAceitacao() {
		clicar(By.id("formSubscricaoExcepcion:btnEnviarBackOffice"));
	}

	@Então("^Auto - Calculo - clicar no botao Cancelar Modal Sem Aceitacao$")
	public void clicarCancelarModalSemAceitacao() {
		clicar(By.id("formSubscricaoExcepcion:btCancelar"));
	}
	
	@Então("^Auto - Calculo - clicar botao fechar Modal Sem Aceitacao$")
	public void clicarBotaoFecharModalSemAceitacao() {
		clicar(By.xpath("//*[@id='subscricaoExcepcion']/span"));
	}
	
	@Quando("^Auto - Calculo - clicar no botao repique$")
	public void clicarBotaoRepique(){
		clicar(By.xpath("//*/a[contains(text(), 'Repique')]"));
	}
	
	@Quando("^Auto - Veiculo - preencher congenere modal repique \"(.*?)\"$")
	public void preencherCongenereModalRepique(String congenereRepique){
		preencherSelect(By.id("formRepique:grupos"), congenereRepique);
	}
	
	@Quando("^Auto - Veiculo - preencher comissao modal repique \"(.*?)\"$")
	public void preencherComissaoModalRepique(String comissao){
		preencherInput(By.className("repiqueComissao"), comissao);
	}
	@Quando("^Auto - Veiculo - preencher premio liquido modal repique \"(.*?)\"$")
	public void preencherPremioLiquidoModalrepique(String premioLiquido){
		preencherInput(By.className("repiquePremioLiquido"), premioLiquido);
	}
	
	@Quando("^Auto - Veiculo - preencher premio total modal repique \"(.*?)\"$")
	public void preencherPremioTotalModalrepique(String premioTotal){
		preencherInput(By.className("repiquePremioTotal"),premioTotal);
	}
	
	@Quando("^Auto - Veiculo - preencher apólice a renovar modal repique \"(.*?)\"$")
	public void preencherApoliceRenovarModalrepique(String apoliceRenovar){
		preencherInput(By.id("formRepique:numeroApoliceAnterior"), apoliceRenovar);
	}
	
	@Quando("^Auto - Veiculo - preencher Observacao modal repique \"(.*?)\"$")
	public void preencherObservacaoModalrepique(String observacao){
		preencherInput(By.className("repiqueObservacao"), observacao);
	}
	
	@Quando("^Auto - Veiculo - clicar no botao salvar modal repique$")
	public void clicarBotaoSalvarModalRepique(){
		clicar(By.id("formRepique:btSalvar"));
	}
	
	@Quando("^Auto - Calculo - clicar no botao franquia \"(.*?)\"$")
	public void clicarBotaoFranquia(String franquia){
		((JavascriptExecutor)driver).executeScript("$(\"label:contains('" + franquia + "'),label:contains('" + franquia.toLowerCase() + "')\").closest(\".widget\").find(\"input\").click().click()");
		timeout(3);
	}
	
}
