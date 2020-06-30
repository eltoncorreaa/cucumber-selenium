package mapfre.automationTestsMcc.steps.novoEndosso;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Coberturas extends TestCommon{
		
	@Quando("^Endosso - Coberturas - preencher o campo Cobertura de Casco \"(.*?)\"$")
	public void preencherCoberturaCasco(String valor) {		
		preencherSelect(By.xpath("//*/select[contains(@id, 'formCoberturas:idCobertura_')]"), valor);		
	}
		
	@Quando("^Endosso - Coberturas - preencher o campo Franquia \"(.*?)\"$")
	public void preencherFranquia(String valor) {		
		preencherSelect(By.xpath("//*/select[contains(@id, 'formCoberturas:idFranquia_')]"), valor);	
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo IS Casco \"(.*?)\"$")
	public void preencherCampoISCasco(String valor) {		
		preencherSelect(By.xpath("//*/input[@title='Casco - Colisão, Incêndio, Roubo e Furto']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo RCF Danos Morais e Esteticos \"(.*?)\"$")
	public void preencherCampoRCFDanosMoraisEsteticos(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Danos Morais / Estéticos']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo RCF Danos Materiais \"(.*?)\"$")
	public void preencherCampoRCFDanosMateriais(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Danos Materiais']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo RCF Danos Corporais \"(.*?)\"$")
	public void preencherCampoRCFDanosCorporais(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Danos Corporais']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo RCF Objetos Transportados \"(.*?)\"$")
	public void preencherCampoRCFObjetosTransportados(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='RCF - Objetos Transportados']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Assistência AutoMais 250 km \"(.*?)\"$")
	public void preencherCampoAssistencia250km(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Assistência AutoMais 250 km']"), valor);
	}	
	
	@Quando("^Endosso - Coberturas - preencher o campo Vidros \"(.*?)\"$")
	public void preencherCampoVidros(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Vidros']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Extensao Reboque \"(.*?)\"$")
	public void preencherCampoExtensaoReboque(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Extensão Reboque']"), valor);
	}	
	
	@Quando("^Endosso - Coberturas - preencher o campo Carro Reserva \"(.*?)\"$")
	public void preencherCampoExtensaoCarroReserva(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Carro Reserva']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Automais Casa \"(.*?)\"$")
	public void preencherCampoExtensaoAutomaisCasa(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Automais Casa']"), valor);
	}
		
	@Quando("^Endosso - Coberturas - preencher o campo APO Morte \"(.*?)\"$")
	public void preencherCampoAPOMorte(String valor) {		
		preencherInput(By.xpath("//*/input[@title='APO - Morte (por Ocupante)']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo APO Invalidez \"(.*?)\"$")
	public void preencherCampoAPOInvalidez(String valor) {		
		preencherInput(By.xpath("//*/input[@title='APO - Invalidez (por Ocupante)']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo APO Decessos \"(.*?)\"$")
	public void preencherCampoAPODecessos(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='APO - Decessos']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo APO DMH \"(.*?)\"$")
	public void preencherCampoAPODMH(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='APO - DMH (por ocupante)']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Reembolso Despesas Extras \"(.*?)\"$")
	public void preencherCampoReembolsoDespesasExtras(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Reembolso de Despesas Extras']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Indenizacao por Imobilizacao \"(.*?)\"$")
	public void preencherCampoIndenizacaoImobilizacao(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Indenização por Imobilização']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Extensao Garantia Veiculo \"(.*?)\"$")
	public void preencherCampoExtensaoGarantiaVeiculo(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Extensão Garantia Veiculo']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Garantia de Cobertura \"(.*?)\"$")
	public void preencherCampoGarantiaCobertura(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Garantia de Cobertura']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Seguro da Franquia \"(.*?)\"$")
	public void preencherCampoSeguroFranquia(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Seguro da Franquia']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo GAP \"(.*?)\"$")
	public void preencherCampoGAP(String valor) {		
		preencherInput(By.xpath("//*/input[@title='GAP - Reposição de valor de nota fiscal 12 meses.']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Blindagem \"(.*?)\"$")
	public void preencherCampoBlindagem(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Blindagem']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Kit a Gas \"(.*?)\"$")
	public void preencherCampoKitGas(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Kit a Gás']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Equipamentos \"(.*?)\"$")
	public void preencherCampoEquipamentos(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Equipamentos']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Acessorios Referentes a Som e Imagem \"(.*?)\"$")
	public void preencherCampoAcessoriosSomImagem(String valor) {		
		preencherInput(By.xpath("//*/input[@title='Acessorios Referentes a Som e Imagem']"), valor);
	}
	
	@Quando("^Endosso - Coberturas - preencher o campo Garantia Reposicao 0km \"(.*?)\"$")
	public void preencherCampoGarantiaReposicaoZeroKm(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Garantia de reposição pelo valor de novo para veículo 0 km']"), valor);
	}	
	
	@Quando("^Endosso - Coberturas - preencher o campo Asistencia Basica \"(.*?)\"$")
	public void preencherCampoAssistenciaBasica(String valor) {		
		preencherSelect(By.xpath("//*/select[@title='Assistência básica']"), valor);
	}	
	
	@Então("^Endosso - Coberturas - clicar no botao Proximo$")
	public void clicarBotaoProximo() {
		clicar(By.id("formCoberturas:save"));
	}	
	
}
