package mapfre.automationTestsMcc.steps.novoEndosso;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Veiculo extends TestCommon {
		
	@Quando("^Endosso - Veiculo - preencher o campo Chassi \"(.*?)\"$")
	public void preencher_o_campo_Chassi(String chassi) {
		WebElement txtChassi = driver.findElement(By.id("formVeiculo:chassi"));
		
		if (!txtChassi.getAttribute("value").isEmpty() && !txtChassi.getAttribute("value").equalsIgnoreCase(chassi)
				&& !chassi.isEmpty()) {
			
			txtChassi.clear();
			timeout(3);
		}
		
		txtChassi = driver.findElement(By.id("formVeiculo:chassi"));
		txtChassi.sendKeys(chassi);
		//txtChassi.sendKeys(Keys.TAB);
		driver.findElement(By.id("formVeiculo:veiculosInput")).click();		
	}
	
	@Então("^Endosso - Veiculo - preencher a primeira opcao modal$")
	public void clicar_primeiro_campo_modal() {
		clicar(By.xpath("//*[@id=\"listaOpcoesVeiculos\"]/div/ul/li[1]"));		
	}
	
	@Então("^Endosso - Veiculo - clicar no botao salvar$")
	public void clicar_no_botao_salvar_modal_caminhao() {
		clicar(By.id("formVeiculoModal:btSalvar"));		
	}
		
	@Quando("^Endosso - Veiculo - preencher o campo Ano de Fabricacao \"(.*?)\"$")
	public void preencher_o_campo_Ano_de_Fabricacao(String anoFabricacao) {
		 preencherSelect(By.id("formVeiculo:anoDeFabricacao"), anoFabricacao);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Ano do Modelo \"(.*?)\"$")
	public void preencher_o_campo_Ano_do_Modelo(String anoModelo) {
		preencherSelect(By.id("formVeiculo:modelo"), anoModelo);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Veiculo Zero Km \"(.*?)\"$")
	public void preencher_o_campo_Veiculo_Zero_Km(String veiculoZeroKm) {
		if (veiculoZeroKm.equalsIgnoreCase("Sim")) {
			clicar(By.xpath("//*/label[@for='formVeiculo:zeroKm:0']"));
		} else {
			clicar(By.xpath("//*/label[@for='formVeiculo:zeroKm:1']"));
		}
	}

	@Quando("^Endosso - Veiculo - preencher o campo Veiculo \"(.*?)\"$")
	public void preencher_o_campo_Veiculo(String veiculo) {
		 preencherInput(By.id("formVeiculo:veiculosInput"), veiculo);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Renavam \"(.*?)\"$")
	public void preencher_o_campo_Renavam(String renavam) {
		preencherInput(By.id("formVeiculo:renavan"), renavam);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Fabricante \"(.*?)\"$")
	public void preencher_o_campo_Fabricante(String fabricante) {
		preencherInput(By.id("formVeiculo:fabricanteInput"), fabricante);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Codigo Fipe \"(.*?)\"$")
	public void preencher_o_campo_Codigo_Fipe(String codFipe) {
		 WebElement element = preencherInput(By.id("formVeiculo:fipeMolicar"), codFipe);
		 element.sendKeys(Keys.TAB);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Valor de Referencia \"(.*?)\"$")
	public void preencher_o_campo_Valor_de_Referencia(String valorReferencia) {
		preencherInput(By.id("formVeiculo:valorFipeMolicar"), valorReferencia);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Data Saida \"(.*?)\"$")
	public void preencher_o_campo_Data_Saida(String dataSaida) {
		preencherInput(By.id("formVeiculo:dataSaida"), dataSaida);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Odometro \"(.*?)\"$")
	public void preencher_o_campo_Odometro(String odometro) {
		preencherInput(By.id("formVeiculo:odometro"), odometro);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Valor Nota Fiscal \"(.*?)\"$")
	public void preencher_o_campo_Valor_Nota_Fiscal(String valorNotaFiscal) {
		preencherInput(By.id("formVeiculo:valorNF"), valorNotaFiscal);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Veiculo Blindado \"(.*?)\"$")
	public void preencher_o_campo_Veiculo_Blindado(String veiculoBlindado) {
		preencherSelect(By.id("formVeiculo:opcaoBlindagem"), veiculoBlindado);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Uso \"(.*?)\"$")
	public void preencher_o_campo_Uso(String campoUso) {
		preencherSelect(By.id("formVeiculo:uso"), campoUso);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Especifique categoria tarifaria \"(.*?)\"$")
	public void preencher_o_campo_Especifique_Categoria_tarifaria(String especifiqueCategoriaTarifaria) {
		preencherInput(By.id("formVeiculo:outroCategoria"), especifiqueCategoriaTarifaria);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Categoria tarifaria \"(.*?)\"$")
	public void preencher_o_campo_Categoria_tarifaria(String categoriaTarifaria) {
		preencherSelect(By.id("formVeiculo:categoriaTarifaria"), categoriaTarifaria);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Isencao de Imposto \"(.*?)\"$")
	public void preencher_o_campo_Isencao_de_Imposto(String isencaoImposto) {
		preencherSelect(By.id("formVeiculo:isencaoImposto"), isencaoImposto);
	}

	@Quando("^Endosso - Veiculo - preencher o campo Chassis Remarcado \"(.*?)\"$")
	public void preencher_o_campo_Chassis_Remarcado(String chassisRemarcado) {
		if (chassisRemarcado.equals("Sim")) {
			clicar(By.xpath("//*/label[@for='formVeiculo:chasiRemarcado:0']"));
		} else {
			clicar(By.xpath("//*/label[@for='formVeiculo:chasiRemarcado:1']"));
		}
	}

	@Quando("^Endosso - Veiculo - preencher o campo Modalidade \"(.*?)\"$")
	public void preencher_o_campo_Modalidade(String modalidade) {
		preencherSelect(By.id("formVeiculo:modalidade"), modalidade);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Fator de Ajuste \"(.*?)\"$")
	public void preencher_o_campo_Fator_de_Ajuste(String fatorAjuste) {
		WebElement element = preencherInput(By.id("formVeiculo:fatorAjuste"), fatorAjuste);
		element.sendKeys(Keys.TAB);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Valor Ajustado Label \"(.*?)\"$")
	public void preencher_o_campo_Valor_Ajustado_Label(String valorAjustadoLabel) {
		preencherInput(By.id("formVeiculo:valorAjustadoLabel"), valorAjustadoLabel);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Valor Ajustado \"(.*?)\"$")
	public void preencher_o_campo_Valor_Ajustado(String valorAjustado) {
		preencherInput(By.id("formVeiculo:valorAjustadoInput"), valorAjustado);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Certificado do veiculo \"(.*?)\"$")
	public void preencher_o_campo_Certificado_do_veiculo(String certificadoVeiculo) {
		preencherInput(By.id("formVeiculo:certificado"), certificadoVeiculo);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Alienacao Fiduciaria \"(.*?)\"$")
	public void preencher_o_campo_Alienacao_fiduciaria(String alienacaoFiduciaria) {
		preencherInput(By.id("formVeiculo:alienado"), alienacaoFiduciaria);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Numero Nota Fiscal \"(.*?)\"$")
	public void preencher_o_campo_Numero_Nota_Fical(String numeroNotaFiscal) {
		preencherInput(By.id("formVeiculo:notaFiscal"), numeroNotaFiscal);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Placa \"(.*?)\"$")
	public void preencher_o_campo_placa(String placa) {
		preencherInput(By.id("formVeiculo:placa"), placa);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo CEP \"(.*?)\"$")
	public void preencher_o_campo_cep(String cep) {
		WebElement txtCep = findElement(By.id("formVeiculo:cep"));
		
		if (!txtCep.getAttribute("value").isEmpty()) {
			txtCep.clear();
			timeout(2);		
			txtCep = findElement(By.id("formVeiculo:cep"));
			txtCep.click();
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);
		} else {
			txtCep.click();
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);	
		}
	}
	
	@Quando("^Endosso - Veiculo - selecionar ABS \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Cambio automatico \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Retrovisor eletrico \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Travas eletricas \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Air bag \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Computador de bordo \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Rodas de liga leve \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Vidros eletricos \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Ar condicionado \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Direcao eletrica \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Sensor de estacionamento \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Banco de couro \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Direcao hidraulica \"(.*?)\"$")
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
	
	@Quando("^Endosso - Veiculo - selecionar Teto solar \"(.*?)\"$")
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
	
	@Então("^Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo$")
	public void clicar_no_botao_Proximo_Dados_do_Veiculo_Complemento() {
		clicar(By.id("formVeiculo:btoProximo"));
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Especifique Veiculo Outros \"(.*?)\"$")
	public void preencher_o_campo_especifique_veiculo_outros(String especifiquerVeiculo) {
		 preencherInput(By.id("formVeiculo:veiculoOutros"), especifiquerVeiculo);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Valor do Veiculo \"(.*?)\"$")
	public void preencher_o_campo_valor_veiculo(String valorVeiculo) {
		preencherInput(By.id("formVeiculo:valorVeiculo"), valorVeiculo);
	}
	
	@Quando("^Endosso - Veiculo - preencher o campo Qtd de Passageiros \"(.*?)\"$")
	public void preencher_o_campo_qtd_passageiros(String qtdPassageiros) {
		preencherInput(By.id("formVeiculo:qtdPassageiros"), qtdPassageiros);
	}
	
}
