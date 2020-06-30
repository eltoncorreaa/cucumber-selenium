package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class VeiculoCondutor extends TestCommon {
		
	@Quando("^Auto - Veiculo/Condutor - preencher o campo Chassi \"(.*?)\"$")
	public void veiculo_condutor_preencher_o_chassi(String chassi) {
		preencherInput(By.id("formVeiculo:chassi"), chassi);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo Placa \"(.*?)\"$")
	public void veiculo_condutor_preencher_o_campo_placa(String placa) {
		preencherInput(By.id("formVeiculo:placa"), placa);
		timeout(3);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo Renavam \"(.*?)\"$")
	public void preencher_o_campo_Renavam(String renavam) {
		preencherInput(By.id("formVeiculo:renavan"), renavam);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo Certificado do veiculo \"(.*?)\"$")
	public void preencher_o_campo_Certificado_do_veiculo(String certificadoVeiculo) {
		preencherInput(By.id("formVeiculo:certificado"), certificadoVeiculo);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo Alienacao Fiduciaria \"(.*?)\"$")
	public void preencher_o_campo_Alienacao_fiduciaria(String alienacaoFiduciaria) {
		preencherInput(By.id("formVeiculo:alienado"), alienacaoFiduciaria);
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar ABS \"(.*?)\"$")
	public void check_campo_ABS(String abs) {
		WebElement txtabs = findElement(By.xpath("//*/label[@class='max' and contains(.,'ABS')]"));
		if (abs.equalsIgnoreCase("sim")) {
			if (!txtabs.findElement(By.tagName("input")).isSelected()) {
				txtabs.click();
			}
		} else {
			if (txtabs.findElement(By.tagName("input")).isSelected()) {
				txtabs.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Cambio automatico \"(.*?)\"$")
	public void check_campo_Cambio_Automatico(String cambioAutomatico) {
		WebElement txtCambioAutomatico = findElement(By.xpath("//*/label[@class='max' and contains(.,'Cambio automático')]"));
		if (cambioAutomatico.equalsIgnoreCase("sim")) {
			if (!txtCambioAutomatico.findElement(By.tagName("input")).isSelected()) {
				txtCambioAutomatico.click();
			}
		} else {
			if (txtCambioAutomatico.findElement(By.tagName("input")).isSelected()) {
				txtCambioAutomatico.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Retrovisor eletrico \"(.*?)\"$")
	public void check_campo_Retrovisor_Eletrico(String retrovisorEletrico) {
		WebElement txtRetrovisorEletrico = findElement(By.xpath("//*/label[@class='max' and contains(.,'Retrovisor elétrico')]"));
		if (retrovisorEletrico.equalsIgnoreCase("sim")) {
			if (!txtRetrovisorEletrico.findElement(By.tagName("input")).isSelected()) {
				txtRetrovisorEletrico.click();
			}
		} else {
			if (txtRetrovisorEletrico.findElement(By.tagName("input")).isSelected()) {
				txtRetrovisorEletrico.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Travas eletricas \"(.*?)\"$")
	public void check_campo_Travas_Eletricas(String travasEletricas) {
		WebElement txtTravasEletricas = findElement(By.xpath("//*/label[@class='max' and contains(.,'Travas elétricas')]"));
		if (travasEletricas.equalsIgnoreCase("sim")) {
			if (!txtTravasEletricas.findElement(By.tagName("input")).isSelected()) {
				txtTravasEletricas.click();
			}
		} else {
			if (txtTravasEletricas.findElement(By.tagName("input")).isSelected()) {
				txtTravasEletricas.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Air bag \"(.*?)\"$")
	public void check_campo_Air_Bag(String airBag) {
		WebElement txtAirBag = findElement(By.xpath("//*/label[@class='max' and contains(.,'Air bag')]"));
		if (airBag.equalsIgnoreCase("sim")) {
			if (!txtAirBag.findElement(By.tagName("input")).isSelected()) {
				txtAirBag.click();
			}
		} else {
			if (txtAirBag.findElement(By.tagName("input")).isSelected()) {
				txtAirBag.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Computador de bordo \"(.*?)\"$")
	public void check_campo_Computador_de_Bordo(String computadorDeBordo) {
		WebElement txtComputadorBordo = findElement(By.xpath("//*/label[@class='max' and contains(.,'Computador de bordo')]"));
		if (computadorDeBordo.equalsIgnoreCase("sim")) {
			if (!txtComputadorBordo.findElement(By.tagName("input")).isSelected()) {
				txtComputadorBordo.click();
			}
		} else {
			if (txtComputadorBordo.findElement(By.tagName("input")).isSelected()) {
				txtComputadorBordo.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Rodas de liga leve \"(.*?)\"$")
	public void check_campo_Rodas_liga_leve(String rodasLigaLeve) {
		WebElement txtRodasLigaLeve = findElement(By.xpath("//*/label[@class='max' and contains(.,'Rodas de liga leve')]"));
		if (rodasLigaLeve.equalsIgnoreCase("sim")) {
			if (!txtRodasLigaLeve.findElement(By.tagName("input")).isSelected()) {
				txtRodasLigaLeve.click();
			}
		} else {
			if (txtRodasLigaLeve.findElement(By.tagName("input")).isSelected()) {
				txtRodasLigaLeve.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Vidros eletricos \"(.*?)\"$")
	public void check_campo_Vidros_Eletricos(String vidrosEletricos) {
		WebElement txtVidrosEletricos = findElement(By.xpath("//*/label[@class='max' and contains(.,'Vidros elétricos')]"));
		if (vidrosEletricos.equalsIgnoreCase("sim")) {
			if (!txtVidrosEletricos.findElement(By.tagName("input")).isSelected()) {
				txtVidrosEletricos.click();
			}
		} else {
			if (txtVidrosEletricos.findElement(By.tagName("input")).isSelected()) {
				txtVidrosEletricos.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Ar condicionado \"(.*?)\"$")
	public void check_campo_Ar_Condicionado(String arCondicionado) {
		WebElement txtArCondicionado = findElement(By.xpath("//*/label[@class='max' and contains(.,'Ar condicionado')]"));
		if (arCondicionado.equalsIgnoreCase("sim")) {
			if (!txtArCondicionado.findElement(By.tagName("input")).isSelected()) {
				txtArCondicionado.click();
			}
		} else {
			if (txtArCondicionado.findElement(By.tagName("input")).isSelected()) {
				txtArCondicionado.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Direcao eletrica \"(.*?)\"$")
	public void check_campo_Direcao_Eletrica(String direcaoEletrica) {
		WebElement txtDirecaoEletrica = findElement(By.xpath("//*/label[@class='max' and contains(.,'Direção elétrica')]"));
		if (direcaoEletrica.equalsIgnoreCase("sim")) {
			if (!txtDirecaoEletrica.findElement(By.tagName("input")).isSelected()) {
				txtDirecaoEletrica.click();
			}
		} else {
			if (txtDirecaoEletrica.findElement(By.tagName("input")).isSelected()) {
				txtDirecaoEletrica.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Sensor de estacionamento \"(.*?)\"$")
	public void check_campo_Sensor_Estacionamento(String sensorEstacionamento) {
		WebElement txtSensorEstacionamento = findElement(By.xpath("//*/label[@class='max' and contains(.,'Sensor de estacionamento')]"));
		if (sensorEstacionamento.equalsIgnoreCase("sim")) {
			if (!txtSensorEstacionamento.findElement(By.tagName("input")).isSelected()) {
				txtSensorEstacionamento.click();
			}
		} else {
			if (txtSensorEstacionamento.findElement(By.tagName("input")).isSelected()) {
				txtSensorEstacionamento.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Banco de couro \"(.*?)\"$")
	public void check_campo_Banco_Couro(String bancoCouro) {
		WebElement txtBancoCouro = findElement(By.xpath("//*/label[@class='max' and contains(.,'Banco de couro')]"));
		if (bancoCouro.equalsIgnoreCase("sim")) {
			if (!txtBancoCouro.findElement(By.tagName("input")).isSelected()) {
				txtBancoCouro.click();
			}
		} else {
			if (txtBancoCouro.findElement(By.tagName("input")).isSelected()) {
				txtBancoCouro.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Direcao hidraulica \"(.*?)\"$")
	public void check_campo_Direcao_Hidraulica(String direcaoHidraulica) {
		WebElement txtDirecaoHidraulica = findElement(By.xpath("//*/label[@class='max' and contains(.,'Direção hidráulica')]"));
		if (direcaoHidraulica.equalsIgnoreCase("sim")) {
			if (!txtDirecaoHidraulica.findElement(By.tagName("input")).isSelected()) {
				txtDirecaoHidraulica.click();
			}
		} else {
			if (txtDirecaoHidraulica.findElement(By.tagName("input")).isSelected()) {
				txtDirecaoHidraulica.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - selecionar Teto solar \"(.*?)\"$")
	public void check_campo_Teto_Solar(String tetoSolar) {
		WebElement txtTetoSolar = findElement(By.xpath("//*/label[@class='max' and contains(.,'Teto solar')]"));
		if (tetoSolar.equalsIgnoreCase("sim")) {
			if (!txtTetoSolar.findElement(By.tagName("input")).isSelected()) {
				txtTetoSolar.click();
			}
		} else {
			if (txtTetoSolar.findElement(By.tagName("input")).isSelected()) {
				txtTetoSolar.click();
			}
		}
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo CNH \"(.*?)\"$")
	public void veiculo_condutor_preencher_o_cnh(String cnh) {
		preencherInput(By.id("formVeiculo:cnh"), cnh);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo nome condutor \"(.*?)\"$")
	public void preencher_nome_condutor(String nome) {
		WebElement txtNome = driver.findElement(By.id("formVeiculo:nomeCompleto1"));
		txtNome.sendKeys(nome);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo cpf condutor \"(.*?)\"$")
	public void preencher_cpf_condutor(String cpf) {
		WebElement txtCpf = driver.findElement(By.id("formVeiculo:cpf21"));
		txtCpf.sendKeys(cpf);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo rg condutor \"(.*?)\"$")
	public void preencher_rg_condutor(String rg) {
		WebElement txtRg = driver.findElement(By.id("formVeiculo:rg1"));
		txtRg.sendKeys(rg);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo data nascimento condutor \"(.*?)\"$")
	public void preencher_data_nascimento_condutor(String data) {
		WebElement txtData = driver.findElement(By.id("formVeiculo:dtNascimento1"));
		txtData.sendKeys(data);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo tempo habilitação condutor \"(.*?)\"$")
	public void preencher_tempo_habilitacao_condutor(String tempo) {
		WebElement txtTempo = driver.findElement(By.id("formVeiculo:tempoHabilitacao1"));
		txtTempo.sendKeys(tempo);
	}
	
	@Quando("^Auto - Veiculo/Condutor - preencher o campo sexo condutor \"(.*?)\"$")
	public void preencherCampoSeguradoResponsavelPagamento(String opcao) {	
		if (opcao.equalsIgnoreCase("Masculino")) {
			clicar(By.id("formVeiculo:sexo1:1"));		
		} else {
			clicar(By.id("formVeiculo:sexo1:0"));			
		}				
	}
	
	@Então("^Auto - Veiculo/Condutor - clicar no botao proximo$")
	public void veiculo_condutor_clicar_no_botao_proximo() {
		clicar(By.id("formVeiculo:botaoProximo"));
	}
}
