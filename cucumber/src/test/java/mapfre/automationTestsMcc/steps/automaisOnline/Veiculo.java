package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Veiculo extends TestCommon {
		
	@Quando("^Auto - Veiculo - preencher o campo Chassis \"(.*?)\"$")
	public void preencher_o_campo_Chassis(String chassis) {
		WebElement element = preencherInput(By.id("formVeiculo:chassi"), chassis);
		element.sendKeys(Keys.TAB);
	}
	
	@Então("^Auto - Veiculo - preencher opcao modal \"(.*?)\"$")
	public void clicar_primeiro_campo_modal(String posicao) {
		clicar(By.xpath("//*[@id=\"listaOpcoesVeiculos\"]/div/ul/li["+ posicao +"]"));
	}
	
	@Então("^Auto - Veiculo - clicar no botao salvar$")
	public void clicar_no_botao_salvar_modal_caminhao() {
		clicar(By.id("formVeiculoModal:btSalvar"));		
	}
	
	@Então("^Auto - Veiculo - limpar champo de chassi$")
	public void limpar_campo_chassi() {
		WebElement campoChassi = findElement(By.id("formVeiculo:chassi"));
		campoChassi.clear();	
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Ano de Fabricacao \"(.*?)\"$")
	public void preencher_o_campo_Ano_de_Fabricacao(String anoFabricacao) {
		preencherSelect(By.id("formVeiculo:anoDeFabricacao"), anoFabricacao);		
	}

	@Quando("^Auto - Veiculo - preencher o campo Ano do Modelo \"(.*?)\"$")
	public void preencher_o_campo_Ano_do_Modelo(String anoModelo) {
		preencherSelect(By.id("formVeiculo:modelo"), anoModelo);
		 
		 timeout(3);
	}
	
	@Então("^Auto - Veiculo - preencher o campo Veiculo Zero Km \"(.*?)\"$")
	public void preencher_o_campo_Veiculo_Zero_Km(String veiculoZeroKm) {
		if (veiculoZeroKm.equalsIgnoreCase("Sim")) {
			clicar(By.xpath("//*/label[@for='formVeiculo:zeroKm:0']"));
		} else {
			clicar(By.xpath("//*/label[@for='formVeiculo:zeroKm:1']"));
		}
	}

	@Então("^Auto - Veiculo - preencher o campo Veiculo \"(.*?)\"$")
	public void preencher_o_campo_Veiculo(String veiculo) {
		preencherInput(By.id("formVeiculo:veiculosInput"), veiculo);
	}

	@Quando("^Auto - Veiculo - preencher o campo Fabricante \"(.*?)\"$")
	public void preencher_o_campo_Fabricante(String fabricante) {
		preencherInput(By.id("formVeiculo:fabricanteInput"), fabricante);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Especifique Veiculo Outros \"(.*?)\"$")
	public void preencher_o_campo_especifique_veiculo_outros(String especifiquerVeiculo) {
		preencherInput(By.id("formVeiculo:veiculoOutros"), especifiquerVeiculo);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Valor do Veiculo \"(.*?)\"$")
	public void preencher_o_campo_valor_veiculo(String valorVeiculo) {
		preencherInput(By.id("formVeiculo:valorVeiculo"), valorVeiculo);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Qtd de Passageiros \"(.*?)\"$")
	public void preencher_o_campo_qtd_passageiros(String qtdPassageiros) {
		preencherInput(By.id("formVeiculo:qtdPassageiros"), qtdPassageiros);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Codigo Fipe \"(.*?)\"$")
	public void preencher_o_campo_Codigo_Fipe(String codFipe) {
		 WebElement element = preencherInput(By.id("formVeiculo:fipeMolicar"), codFipe);
		 element.sendKeys(Keys.TAB);
	}

	@Quando("^Auto - Veiculo - preencher o campo Valor de Referencia \"(.*?)\"$")
	public void preencher_o_campo_Valor_de_Referencia(String valorReferencia) {
		 preencherInput(By.id("formVeiculo:valorFipeMolicar"), valorReferencia);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Data Saida \"(.*?)\"$")
	public void preencher_o_campo_Data_Saida(String dataSaida) {
		preencherInput(By.id("formVeiculo:dataSaida"), dataSaida);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Odometro \"(.*?)\"$")
	public void preencher_o_campo_Odometro(String odometro) {
		preencherInput(By.id("formVeiculo:odometro"), odometro);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Valor Nota Fiscal \"(.*?)\"$")
	public void preencher_o_campo_Valor_Nota_Fiscal(String valorNotaFiscal) {
		preencherInput(By.id("formVeiculo:valorNF"), valorNotaFiscal);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Veiculo Blindado \"(.*?)\"$")
	public void preencher_o_campo_Veiculo_Blindado(String veiculoBlindado) {
		preencherSelect(By.id("formVeiculo:opcaoBlindagem"), veiculoBlindado);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Valor IS blindagem \"(.*?)\"$")
	public void preencher_o_campo_Valor_IS_blindagem(String valorISBlindagem) {
		preencherInput(By.id("formVeiculo:valorISBlindagem"), valorISBlindagem);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Nivel da blindagem \"(.*?)\"$")
	public void preencher_o_campo_Nivel_da_blindagem(String nivelBlindagem) {
		preencherSelect(By.id("formVeiculo:nivelBlindagem"), nivelBlindagem);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Uso \"(.*?)\"$")
	public void preencher_o_campo_Uso(String campoUso) {
		preencherSelect(By.id("formVeiculo:uso"), campoUso);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Especifique categoria tarifaria \"(.*?)\"$")
	public void preencher_o_campo_Especifique_Categoria_tarifaria(String especifiqueCategoriaTarifaria) {
		preencherInput(By.id("formVeiculo:outroCategoria"), especifiqueCategoriaTarifaria);
	}

	@Quando("^Auto - Veiculo - preencher o campo Categoria tarifaria \"(.*?)\"$")
	public void preencher_o_campo_Categoria_tarifaria(String categoriaTarifaria) {
		preencherSelect(By.id("formVeiculo:categoriaTarifaria"), categoriaTarifaria);
	}

	@Quando("^Auto - Veiculo - preencher o campo Isencao de Imposto \"(.*?)\"$")
	public void preencher_o_campo_Isencao_de_Imposto(String isencaoImposto) {
		preencherSelect(By.id("formVeiculo:isencaoImposto"), isencaoImposto);
	}

	@Quando("^Auto - Veiculo - preencher o campo Chassis Remarcado \"(.*?)\"$")
	public void preencher_o_campo_Chassis_Remarcado(String chassisRemarcado) {
		if (chassisRemarcado.equalsIgnoreCase("Sim")) {
			clicar(By.id("formVeiculo:chassiRemarcado:0"));
		} else {
			clicar(By.id("formVeiculo:chassiRemarcado:1"));
		}
	}

	@Quando("^Auto - Veiculo - preencher o campo Modalidade \"(.*?)\"$")
	public void preencher_o_campo_Modalidade(String modalidade) {
		preencherSelect(By.id("formVeiculo:modalidade"), modalidade);
	}
	
	@Quando("^Auto - Veiculo - preencher o campo Fator de Ajuste \"(.*?)\"$")
	public void preencher_o_campo_Fator_de_Ajuste(String fatorAjuste) {
		WebElement element = preencherInput(By.id("formVeiculo:fatorAjuste"), fatorAjuste);
		element.sendKeys(Keys.TAB);
	}
		
	@Quando("^Auto - Veiculo - preencher o campo Valor Ajustado \"(.*?)\"$")
	public void preencher_o_campo_Valor_Ajustado(String valorAjustado) {
		preencherInput(By.id("formVeiculo:valorAjustadoInput"), valorAjustado);
	}

	@Então("^Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento$")
	public void clicar_no_botao_Proximo_Dados_do_Veiculo_Complemento() {
		clicar(By.id("formVeiculo:btoProximo"));
	}
	
	@Quando("Auto - Veiculo - clicar ok no modal aviso de produto diferente$")
	public void clicar_no_botao_ok_modal_aviso(){
		clicar(By.id("formTrocaProduto:btOkTrocaProduto"));	
	}
}
