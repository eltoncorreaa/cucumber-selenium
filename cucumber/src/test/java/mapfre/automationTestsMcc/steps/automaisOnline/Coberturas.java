package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Coberturas extends TestCommon{
	
	@Quando("^Auto - Coberturas - preencher o campo Pacotes de Coberturas \"(.*?)\"$")
	public void preencherPacoteCoberturas(String valor) {
		preencherSelect(By.xpath("//*/select[contains(@id, 'formCoberturas:idPacoteCobertura_')]"), valor);		
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Cobertura de Casco \"(.*?)\"$")
	public void preencherCoberturaCasco(String valor) {
		preencherSelect(By.xpath("//*/select[contains(@id, 'formCoberturas:idCobertura_')]"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Franquia \"(.*?)\"$")
	public void preencherFranquia(String valor) {
		preencherSelect(By.xpath("//*/select[contains(@id, 'formCoberturas:idFranquia_')]"), valor);
		timeout(2);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo IS Casco \"(.*?)\"$")
	public void preencherCampoISCasco(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Casco - Colisão e Incêndio']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo RCF Danos Morais e Esteticos \"(.*?)\"$")
	public void preencherCampoRCFDanosMoraisEsteticos(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Danos Morais / Estéticos']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo RCF Danos Materiais \"(.*?)\"$")
	public void preencherCampoRCFDanosMateriais(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Danos Materiais']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo RCF Danos Corporais \"(.*?)\"$")
	public void preencherCampoRCFDanosCorporais(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Danos Corporais']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo RCF Objetos Transportados \"(.*?)\"$")
	public void preencherCampoRCFObjetosTransportados(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Objetos Transportados']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Assistência AutoMais 250 km \"(.*?)\"$")
	public void preencherCampoAssistencia250km(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Assistência AutoMais 250 km']"), valor);
	}	
	
	@Quando("^Auto - Coberturas - preencher o campo Assistencia AutoMais Gold 400 km \"(.*?)\"$")
	public void preencherCampoAssistenciaGold400km(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Assistência AutoMais Gold 400 km']"), valor);
	}	
	
	@Quando("^Auto - Coberturas - preencher o campo Vidros \"(.*?)\"$")
	public void preencherVidros(String valor) {
		preencherSelect(By.xpath("//*/select[@title='Vidros']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Carro Reserva \"(.*?)\"$")
	public void preencherCampoExtensaoCarroReserva(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Carro Reserva']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Carro Reserva Gold \"(.*?)\"$")
	public void preencherCampoExtensaoCarroReservaGold(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Carro Reserva Gold']"), valor);
	}		
	
	@Quando("^Auto - Coberturas - preencher o campo APO Morte \"(.*?)\"$")
	public void preencherCampoAPOMorte(String valor) {		
		preencherInput(By.xpath("//*/input[@title='APO - Morte ( por Ocupante )']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo APO Invalidez \"(.*?)\"$")
	public void preencherCampoAPOInvalidez(String valor) {		
		preencherInput(By.xpath("//*/input[@title='APO - Invalidez (por Ocupante)']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo APO Decessos \"(.*?)\"$")
	public void preencherCampoAPODecessos(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='APO - Decessos']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo APO DMH \"(.*?)\"$")
	public void preencherCampoAPODMH(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='APO - DMH (por ocupante)']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Extensao Reboque \"(.*?)\"$")
	public void preencherCampoExtensaoReboque(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Extensão Reboque']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Automais Casa \"(.*?)\"$")
	public void preencherCampoExtensaoAutomaisCasa(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Automais Casa']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Reembolso Despesas Extras \"(.*?)\"$")
	public void preencherCampoReembolsoDespesasExtras(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Reembolso de Despesas Extras ']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Indenizacao por Imobilizacao \"(.*?)\"$")
	public void preencherCampoIndenizacaoImobilizacao(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Indenização por Imobilização']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Extensao Garantia Veiculo \"(.*?)\"$")
	public void preencherCampoExtensaoGarantiaVeiculo(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Extensão Garantia Veiculo']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Garantia de Cobertura \"(.*?)\"$")
	public void preencherCampoGarantiaCobertura(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Garantia de Cobertura']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Seguro da Franquia \"(.*?)\"$")
	public void preencherCampoSeguroFranquia(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Seguro da Franquia']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo GAP \"(.*?)\"$")
	public void preencherCampoGAP(String valor) {		
		preencherInput(By.xpath("//*/input[@title='GAP - Reposição de valor de nota fiscal 12 meses.']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Blindagem \"(.*?)\"$")
	public void preencherCampoBlindagem(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Blindagem']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Kit a Gas \"(.*?)\"$")
	public void preencherCampoKitGas(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Kit a Gás']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Equipamentos \"(.*?)\"$")
	public void preencherCampoEquipamentos(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Equipamentos']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Acessorios Referentes a Som e Imagem \"(.*?)\"$")
	public void preencherCampoAcessoriosSomImagem(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Acessorios Referentes a Som e Imagem']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Garantia Reposicao 0km \"(.*?)\"$")
	public void preencherCampoGarantiaReposicaoZeroKm(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Garantia de reposição pelo valor de novo para veículo 0 km']"), valor);
	}	
	
	@Quando("^Auto - Coberturas - preencher o campo Asistencia Basica \"(.*?)\"$")
	public void preencherCampoAssistenciaBasica(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Assistência básica']"), valor);
	}	
	
	@Quando("^Auto - Coberturas - preencher o campo Carrocerias \"(.*?)\"$")
	public void preencherCampoCarrocerias(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Carrocerias']"), valor);
	}	
	
	@Quando("^Auto - Coberturas - preencher o campo Eixo Adicional \"(.*?)\"$")
	public void preencherCampoEixoAdicional(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Eixo Adicional']"), valor);
	}
	
	@Então("^Auto - Coberturas - clicar no link para Especificar o Eixo Adicional$")
	public void especificarEixoAcidional() {		
		clicar(By.xpath("//*/a[contains(@href, 'eixoAdicional')]"));
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Eixo Adicionado \"(.*?)\"$")
	public void preencherCampoEixoAdicionado(String valor) {		
		preencherSelect(By.id("formEixoAdicional:selectEixoAdicional"), valor);
	}
	
	@Então("^Auto - Coberturas - clicar no botão Salvar Eixo Adicional$")
	public void clicarBotaoSalvarEixo() {		
		clicar(By.id("formEixoAdicional:btSalvar"));
	}	
	
	@Então("^Auto - Coberturas - clicar no botão Cancelar Eixo Adicional$")
	public void clicarBotaoCancelarEixo() {		
		clicar(By.id("formEixoAdicional:btCancelar"));
	}		
	
	@Quando("^Auto - Coberturas - preencher o campo Caminhao Basculando \"(.*?)\"$")
	public void preencherCampoCaminhaoBasculando(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Caminhão Basculando']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Cobertura para o Estado de Sao Paulo \"(.*?)\"$")
	public void preencherCampoCoberturaEstadoSP(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Cobertura para o Estado de São Paulo']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Extensao da Cob. para Veiculos Rebocados \"(.*?)\"$")
	public void preencherCampoExtCobVeiculosRebocados(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Extensão da Cob. para VeÍculos Rebocados']"), valor);
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Indenizacao por Perda de Faturamento \"(.*?)\"$")
	public void preencherCampoIndPerdaFaturamento(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Indenização por Perda de Faturamento']"), valor);
	}
	
	@Então("^Auto - Coberturas - clicar no link para Especificar a Indenizacao por Perda de Faturamento$")
	public void especificarIndPerdaFaturamento() {		
		clicar(By.xpath("//*/a[contains(@href, 'indenizacaoPorPerdaFaturamento')]"));
	}
	
	@Quando("^Auto - Coberturas - preencher o campo Quantidade de Diaria \"(.*?)\"$")
	public void preencherCampoQtdDiaria(String valor) {		
		preencherSelect(By.id("formIndenizacaoPorPerdaFaturamento:selectQuantidadeDiaria"), valor);
	}
	
	@Então("^Auto - Coberturas - clicar no botão Salvar Indenizacao por Perda de Faturamento$")
	public void clicarBotaoSalvarIndPerdaFaturamento() {		
		clicar(By.id("formIndenizacaoPorPerdaFaturamento:btSalvar"));
	}	
	
	@Então("^Auto - Coberturas - clicar no botão Cancelar Indenizacao por Perda de Faturamento$")
	public void clicarBotaoCancelarIndPerdaFaturamento() {		
		clicar(By.id("formIndenizacaoPorPerdaFaturamento:btCancelar"));
	}	
	
	@Quando("^Auto - Coberturas - preencher o campo Extensao Garantia Veiculo Novo \"(.*?)\"$")
	public void preencherCampoExtGarantiaVeiculoNovo(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Extensão Garantia Veículo Novo']"), valor);
	}		
	
	@Então("^Auto - Coberturas - clicar no botão Proximo$")
	public void clicarBotaoProximo() {
		clicar(By.id("formCoberturas:save"));
	}	
	
}
