package mapfre.automationTestsMcc.steps.residencial;

import mapfre.automationTestsMcc.steps.TestCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Coberturas extends TestCommon{
	
	@Quando("^Residencial - Coberturas - Clicar na opção Assistência Perfil Plus$")
	public void ClicarOpcaoAssistenciaPerfilPlus(){
		WebElement perfilPlus = driver.findElement(By.id("formCoberturasRE:j_idt80:0:check_"));
		perfilPlus.click();
	}	
	
	@Quando("^Residencial - Coberturas - Clicar na opção Assistência Perfil Top Plus$")
	public void ClicarOpcaoAssistenciaPerfilTopPlus(){
		WebElement perfilTopPlus = driver.findElement(By.id("formCoberturasRE:j_idt80:1:check_"));
		perfilTopPlus.click();
	}		
			
	@Quando("^Residencial - Coberturas - Clicar na opção Assistência Perfil Gold Casa$")
	public void ClicarOpcaoAssistenciaPerfilGoldCasa(){
		WebElement perfilGoldCasa = driver.findElement(By.id("formCoberturasRE:j_idt80:2:check_"));
		perfilGoldCasa.click();
	}		

	@Quando("^Residencial - Coberturas - Clicar na opção Proteção Garagem$")
	public void ClicarOpcaoProtecaoGaragem(){
		WebElement protecaoGaragem = driver.findElement(By.id("formCoberturasRE:j_idt99:0:j_idt101:0:check_"));
		protecaoGaragem.click();
	}
	
	@Então("^Residencial - Coberturas - Clicar Botão Fechar modal Proteção Garagem$")
	public void clicarBotaoFecharModalProtecaoGaragem() {	
		clicar(By.xpath("//*[@id='check_3']/span[1]"));
	}
	
	@Quando("^Residencial - Coberturas - Clicar na opção Suporte Tecnico Informatica Plus$")
	public void ClicarOpcaoSupoteTecnicoInformaticaPlus(){
		WebElement spInfoPlus = driver.findElement(By.id("formCoberturasRE:j_idt99:1:j_idt101:0:check_"));
		spInfoPlus.click();
	}
	
	@Então("^Residencial - Coberturas - Clicar Botão Fechar modal Suporte Tecnico Informatica Plus$")
	public void clicarBotaoFecharSuporteTecnicoInformaticaPlus() {	
		clicar(By.xpath("//*[@id='check_2']/span[1]"));
	}
	
	@Quando("^Residencial - Coberturas - Clicar na opção Suporte Tecnico Informatica Top Plus$")
	public void ClicarOpcaoSupoteTecnicoInformaticaTopPlus(){
		WebElement spInfoTopPlus = driver.findElement(By.id("formCoberturasRE:j_idt99:1:j_idt101:1:check_"));
		spInfoTopPlus.click();
	}
		
	@Então("^Residencial - Coberturas - Clicar Botão Fechar modal Suporte Tecnico Informatica Top Plus$")
	public void clicarBotaoFecharSuporteTecnicoInformaticaTopPlus() {	
		clicar(By.xpath("//*[@id='check_1']/span[1]"));
	}
	
	@Então("^Residencial - Coberturas - Clicar Botão Outras$")
	public void clicarBotaoOutras() {	
		clicar(By.id("div_coberturas_adicionais_icon"));
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Danos Elétricos \"(.*?)\"$")
	public void preencherValorDanosEletricos(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:0:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Veículo Em Garagem \"(.*?)\"$")
	public void preencherValorVeículoGaragem(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:10:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Danos Rompimento Tubulações \"(.*?)\"$")
	public void preencherValorDanosRompimentoTubulacoes(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:1:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Hole-in-One \"(.*?)\"$")
	public void preencherValorHoleInOne(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:2:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Paisagismo \"(.*?)\"$")
	public void preencherValorPaisagismo(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:4:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Perda Pagamento Aluguel \"(.*?)\"$")
	public void preencherValorPerdaPagamentoAluguel(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:5:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Quebra Vidros Espelhos \"(.*?)\"$")
	public void preencherValorQuebraVidrosEspelhos(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:6:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Responsabilidade Civil Imóvel Familiar \"(.*?)\"$")
	public void preencherValorResponsabilidadeCivilImovelFamiliar(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:8:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Franquia Automóvel \"(.*?)\"$")
	public void preencherValorFranquiaAutomovel(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:9:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Roubo Furto Verba Única \"(.*?)\"$")
	public void preencherValorRouboFurtoVerbaUnica(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:11:j_idt192"), valor);
	}
	
	@Quando("^Residencial - Coberturas - Preencher valor Roubo Furto Jóias Objetos Artísticos Históricos \"(.*?)\"$")
	public void preencherValorRouboFurtoJoiasObjetosArtisticosHistoricos(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:12:j_idt192"), valor);
	}

	@Quando("^Residencial - Coberturas - Preencher valor Vendaval Impacto Veículo \"(.*?)\"$")
	public void preencherValorVendavalImpactoVeiculo(String valor) {
		preencherInput(By.id("formCoberturasRE:coberturasAdicionais:13:j_idt192"), valor);
	}

	@Então("^Residencial - Coberturas - Clicar Botão Proximo$")
	public void clicarBotaoProximo() {	
		clicar(By.id("formCoberturasRE:save"));
	}	
}