package mapfre.automationTestsMcc.steps.residencial;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import mapfre.automationTestsMcc.utils.config.Config;

import org.openqa.selenium.WebDriver;

public class SeguroSegurado {

	public WebDriver driver;

	public void timeout(int tempo) {
		try {
			Thread.sleep(tempo * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void copiaDados(String dados) {
		Clipboard toolkit = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection(dados);
		toolkit.setContents(str, null);
	}

	public SeguroSegurado() {
		driver = Config.driver;
	}

//	@Dado("^a url do sistema$")
//	public void a_url_do_sistema() {
//		// driver.get("https://10.206.65.39/Mapfre.Connect/");
//		driver.get("http://localhost:8080/novo-portal-web/cotacao/index.xhtml?cod_cotacao=0&cod_corretor=86790&Acao=Novo");
//		timeout(3);
//	}
//	
//	@Então("^preencher os Dados do Segurado$")
//	public void preencher_os_Dados_do_Segurado() {
//		WebElement lblDadosSegurado = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/header/h1"));
//
//		String dadosSegurado = lblDadosSegurado.getText();
//
//		Assert.assertTrue(dadosSegurado, true);
//	}
//
//	@Quando("^preencher o campo CPF$")
//	public void preencher_o_campo_CPF() {
//		WebElement txtCPF = driver.findElement(By.id("formSeguroSegurado:cpfCnpj"));
//		// txtCPF.sendKeys(GeraCPF.geraCPF());
//		txtCPF.sendKeys("111.444.777-35");
//		txtCPF.sendKeys(Keys.TAB);
//		timeout(5);
//	}
//
//	@Quando("^preencher o campo Nome Completo \"(.*?)\"$")
//	public void preencher_o_campo_Nome_Completo(String nomeCompleto) {
//		WebElement txtNomeCompleto = driver.findElement(By.id("formSeguroSegurado:nomeProponente"));
//		txtNomeCompleto.clear();
//		txtNomeCompleto.sendKeys(nomeCompleto);
//		// txtNomeCompleto.sendKeys(Keys.TAB);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Data Nascimento \"(.*?)\"$")
//	public void preencher_o_campo_Data_Nascimento(String dataNascimento) {
//		WebElement txtDataNascimento = driver.findElement(By.id("formSeguroSegurado:dataNascimento"));
//		txtDataNascimento.clear();
//		txtDataNascimento.sendKeys(dataNascimento);
//		//txtDataNascimento.sendKeys(Keys.TAB);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo DDD Celular \"(.*?)\"$")
//	public void preencher_o_campo_DDD_Celular(String ddd) {
//		WebElement txtDDD = driver.findElement(By.id("formSeguroSegurado:dddCelular"));
//		txtDDD.sendKeys(ddd);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Numero Celular \"(.*?)\"$")
//	public void preencher_o_campo_Numero_Celular(String numeroCelular) {
//		WebElement txtNumeroCelular = driver.findElement(By.id("formSeguroSegurado:telefoneCelular"));
//		txtNumeroCelular.sendKeys(numeroCelular);
//		timeout(3);
//	}
//	
//	@Quando("^preencher o campo DDD Residencial \"(.*?)\"$")
//	public void preencher_o_campo_DDD_residencial(String ddd) {
//		WebElement txtDDD = driver.findElement(By.id("formSeguroSegurado:dddResidencial"));
//		txtDDD.sendKeys(ddd);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Numero Residencial \"(.*?)\"$")
//	public void preencher_o_campo_Numero_Residencial(String numeroCelular) {
//		WebElement txtNumeroCelular = driver.findElement(By.id("formSeguroSegurado:telefoneResidencial"));
//		txtNumeroCelular.sendKeys(numeroCelular);
//		timeout(3);
//	}
//
//	@Então("^preencher os Dados do Seguro$")
//	public void preencher_os_Dados_do_Seguro() {
//		WebElement lblPreencherDadosSeguro = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/h1"));
//
//		String dadosSeguro = lblPreencherDadosSeguro.getText();
//
//		Assert.assertTrue(dadosSeguro, true);
//
//	}
//
//	@Quando("^preencher o campo Tipo de Seguro \"(.*?)\"$")
//	public void preencher_o_campo_Tipo_de_Seguro(String tipoSeguro) {
//
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='13']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(tipoSeguro);
//		timeout(4);
//	}
//
//	@Quando("^preencher o campo Tipo de Calculo \"(.*?)\"$")
//	public void preencher_o_campo_Tipo_de_Calculo(String tipoCalculo) {
//		WebElement cboTipoCalculo = driver.findElement(By.id("formSeguroSegurado:tipoCalculo"));
//		cboTipoCalculo.sendKeys(tipoCalculo);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Inicio Vigencia \"(.*?)\"$")
//	public void preencher_o_campo_Inicio_Vigencia(String inicioVigencia) {
//		// WebElement txtInicioVigencia =
//		// driver.findElement(By.id("formSeguroSegurado:inicioVigencia"));
//
//	}
//
//	@Então("^clicar no botao Iniciar Calculo$")
//	public void clicar_no_botao_Iniciar_Calculo() {
//		WebElement btnIniciarCalculo = driver.findElement(By.id("formSeguroSegurado:btoProximo"));
//		btnIniciarCalculo.click();
//		timeout(3);
//	}
//
//	@Então("^preencher os dados do Veiculo$")
//	public void preencher_os_dados_do_Veiculo() {
//		WebElement lblPreencherDados = driver.findElement(By.xpath("//*[@id=\"envolucro\"]/div/div[1]/header/h1"));
//
//		String preencherDados = lblPreencherDados.getText();
//
//		Assert.assertTrue(preencherDados, true);
//		timeout(1);
//	}
//
//	@Quando("^preencher o campo Chassis \"(.*?)\"$")
//	public void preencher_o_campo_Chassis(String chassis) {
//		WebElement txtChassis = driver.findElement(By.id("formVeiculo:chassi"));
//		// WebElement txtCep = driver.findElement(By.id("formVeiculo:cep"));
//
//		txtChassis.sendKeys(chassis);
//		// txtCep.click();
//		txtChassis.sendKeys(Keys.TAB);
//		timeout(10);
//	}
//
//	@Então("^validar o campo Ano de Fabricacao \"(.*?)\"$")
//	public void validar_o_campo_Ano_de_Fabricacao(String anoFabricacao) {
//		// WebElement txtAnoFabricacao =
//		// driver.findElement(By.id("formVeiculo:anoDeFabricacao"));
//		// txtAnoFabricacao.sendKeys(anoFabricacao);
//	}
//
//	@Então("^validar o campo Ano do Modelo \"(.*?)\"$")
//	public void validar_o_campo_Ano_do_Modelo(String anoModelo) {
//		// WebElement txtAnoModelo =
//		// driver.findElement(By.id("formVeiculo:modelo"));
//		// txtAnoModelo.sendKeys(anoModelo);
//	}
//
//	@Então("^validar o campo Veiculo Zero Km \"(.*?)\"$")
//	public void validar_o_campo_Veiculo_Zero_Km(String veiculoZeroKm) {
//		WebElement txtZeroKmNao = driver.findElement(By.id("formVeiculo:zeroKm:1"));
//		WebElement txtZeroKmSim = driver.findElement(By.id("formVeiculo:zeroKm:0"));
//
//		if (veiculoZeroKm.equals("Não")) {
//			txtZeroKmNao.click();
//		} else {
//			txtZeroKmSim.click();
//		}
//	}
//
//	@Então("^validar o campo Veiculo \"(.*?)\"$")
//	public void validar_o_campo_Veiculo(String veiculo) {
//		// WebElement txtVeiculo =
//		// driver.findElement(By.id("formVeiculo:veiculosInput"));
//
//	}
//
//	@Então("^validar o campo Fabricante \"(.*?)\"$")
//	public void validar_o_campo_Fabricante(String fabricante) {
//		// WebElement txtFabricante =
//		// driver.findElement(By.id("formVeiculo:fabricanteInput"));
//
//	}
//
//	@Então("^validar o campo Codigo Fipe \"(.*?)\"$")
//	public void validar_o_campo_Codigo_Fipe(String codFipe) {
//		// WebElement txtCodFipe =
//		// driver.findElement(By.id("formVeiculo:fipeMolicar"));
//
//	}
//
//	@Então("^validar o campo Valor de Referencia \"(.*?)\"$")
//	public void validar_o_campo_Valor_de_Referencia(String valorReferencia) {
//		// WebElement txtValorReferencia =
//		// driver.findElement(By.id("formVeiculo:valorFipeMolicar"));
//
//	}
//
//	@Então("^preencher os Dados do Veiculo Complemento$")
//	public void preencher_os_Dados_do_Veiculo_Complemento() {
//	}
//
//	@Quando("^preencher o campo Veiculo Blindado \"(.*?)\"$")
//	public void preencher_o_campo_Veiculo_Blindado(String veiculoBlindado) {
//		WebElement txtVeiculoBlindado = driver.findElement(By.id("formVeiculo:opcaoBlindagem"));
//
//		Select dD = new Select(txtVeiculoBlindado);
//		dD.selectByVisibleText(veiculoBlindado);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Uso \"(.*?)\"$")
//	public void preencher_o_campo_Uso(String campoUso) {
//		WebElement txtCampoUso = driver.findElement(By.id("formVeiculo:uso"));
//
//		Select dD = new Select(txtCampoUso);
//		dD.selectByVisibleText(campoUso);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Categoria tarifaria$")
//	public void preencher_o_campo_Categoria_tarifaria() {
//		// WebElement txtCategoriaTarifaria =
//		// driver.findElement(By.id("formVeiculo:categoriaTarifaria"));
//		// txtCategoriaTarifaria.sendKeys(categoriaTarifaria);
//	}
//
//	@Quando("^preencher o campo Isencao de Imposto \"(.*?)\"$")
//	public void preencher_o_campo_Isencao_de_Imposto(String isencaoImposto) {
//		// WebElement txtIsencaoImposto =
//		// driver.findElement(By.id("formVeiculo:isencaoImposto"));
//		//
//		// Select dD = new Select(txtIsencaoImposto);
//		// dD.selectByValue(isencaoImposto);
//		// timeout(3);
//	}
//
//	@Quando("^preencher o campo Chassis Remarcado \"(.*?)\"$")
//	public void preencher_o_campo_Chassis_Remarcado(String chassisRemarcado) {
//		WebElement txtChassisRemarcadoSim = driver.findElement(By.id("formVeiculo:chassiRemarcado:0"));
//		WebElement txtChassisRemarcadoNao = driver.findElement(By.id("formVeiculo:chassiRemarcado:1"));
//
//		if (chassisRemarcado.equals("Sim")) {
//			txtChassisRemarcadoSim.click();
//		} else {
//			txtChassisRemarcadoNao.click();
//		}
//
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Modalidade \"(.*?)\"$")
//	public void preencher_o_campo_Modalidade(String modalidade) {
//		WebElement txtModalidade = driver.findElement(By.id("formVeiculo:modalidade"));
//
//		Select dD = new Select(txtModalidade);
//		dD.selectByVisibleText(modalidade);
//		timeout(3);
//	}
//
//	@Então("^clicar no botao Proximo Dados do Veiculo Complemento$")
//	public void clicar_no_botao_Proximo_Dados_do_Veiculo_Complemento() {
//		WebElement btnDadosDoVeiculoComplemento = driver.findElement(By.id("formVeiculo:btoProximo"));
//		btnDadosDoVeiculoComplemento.click();
//		timeout(5);
//	}
//
//	@Então("^preencher o Perfil do Principal Condutor$")
//	public void preencher_o_Perfil_do_Principal_Condutor() {
//		// WebElement msgPerfilPrincipalCondutor = driver
//		// .findElement(By.xpath("//*[@id=\"formAvaliacaoRisco:questionario0\"]/div[1]/header/h1"));
//		//
//		// String perfilPrincipalCondutor =
//		// msgPerfilPrincipalCondutor.getText();
//		//
//		// Assert.assertTrue(perfilPrincipalCondutor, true);
//	}
//
//	@Quando("^selecionar o campo Veiculo sera Conduzido por Quantos Condutores \"(.*?)\"$")
//	public void selecionar_o_campo_Veiculo_sera_Conduzido_por_Quantos_Condutores(String veiculoConduzido) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='5']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(veiculoConduzido);
//		timeout(3);
//	}
//
//	@Quando("^selecionar o Possui Condutores Menores de 26 Anos \"(.*?)\"$")
//	public void selecionar_o_Possui_Condutores_Menores_de_26_Anos(String possuiCondutores) {
//		WebElement rdoNao = driver.findElement(By.xpath("//*[@tabindex='6']"));
//		rdoNao.click();
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Segurado Principal Condutor \"(.*?)\"$")
//	public void preencher_o_campo_Segurado_Principal_Condutor(String principalCondutor) {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		WebElement rdoSim = driver.findElement(By.xpath("//label[contains(.,'" + principalCondutor + "')]"));
//		jse.executeScript("arguments[0].click()", rdoSim);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Sexo Principal Condutor \"(.*?)\"$")
//	public void preencher_o_campo_Sexo_Principal_Condutor(String sexoCondutor) {
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		WebElement rdoSexoPrincipalCondutorF = driver
//				.findElement(By.xpath("//label[contains(.,'" + sexoCondutor + "')]"));
//		jse.executeScript("arguments[0].click()", rdoSexoPrincipalCondutorF);
//
//		timeout(3);
//
//	}
//
//	@Quando("^preencher o campo Estado Civil Principal Condutor \"(.*?)\"$")
//	public void preencher_o_campo_Estado_Civil_Principal_Condutor(String estadoCivil) {
//
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='8']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(estadoCivil);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Estado Civil Principal Condutor Caminhao \"(.*?)\"$")
//	public void preencher_o_campo_Estado_Civil_Principal_Condutor_Caminhao(String estadoCivil) {
//
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='10']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(estadoCivil);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Profissao Principal Condutor \"(.*?)\"$")
//	public void preencher_o_campo_Profissao_Principal_Condutor(String profissaoPrincipalCondutor) {
//
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='9']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(profissaoPrincipalCondutor);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Tempo de Habilitacao do Principal Condutor \"(.*?)\"$")
//	public void preencher_o_campo_Tempo_de_Habilitacao_do_Principal_Condutor(String cnhPrincipalCondutor) {
//
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='10']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(cnhPrincipalCondutor);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Tempo de Habilitacao do Principal Condutor Taxi \"(.*?)\"$")
//	public void preencher_o_campo_Tempo_de_Habilitacao_do_Principal_Condutor_Taxi(String cnhPrincipalCondutor) {
//
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='4']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(cnhPrincipalCondutor);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Tipo de Residencia do Principal Condutor \"(.*?)\"$")
//	public void preencher_o_campo_Tipo_de_Residencia_do_Principal_Condutor(String residenciaPrincipalCondutor) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='11']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(residenciaPrincipalCondutor);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo \"(.*?)\"$")
//	public void preencher_o_campo_Principal_Condutor_Reside_com_Menores_de_vinte_e_seis_anos_que_Possam_Utilizar_o_Veiculo(
//			String condutorMenoresUtilizam) {
//		WebElement slcNao = driver.findElement(By.xpath("//*[@tabindex='12']"));
//		WebElement slcSim = driver.findElement(By.xpath("//*[@tabindex='13']"));
//
//		if (condutorMenoresUtilizam.equals("Não")) {
//			slcNao.click();
//		} else {
//			slcSim.click();
//		}
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Principal Condutor Possui Filhos ou Funcionarios Menores de vinte e seis anos que Possam Utilizar o Veiculo \"(.*?)\"$")
//	public void preencher_o_campo_Principal_Condutor_Possui_Filhos_ou_Funcionarios_Menores_de_vinte_e_seis_anos_que_Possam_Utilizar_o_Veiculo(
//			String condutorFilhoFuncionario) {
//
//		WebElement slcNao = driver.findElement(By.xpath("//*[@tabindex='14']"));
//		WebElement slcSim = driver.findElement(By.xpath("//*[@tabindex='15']"));
//
//		if (condutorFilhoFuncionario.equals("Não")) {
//			slcNao.click();
//		} else {
//			slcSim.click();
//		}
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Quantidade de Veiculos na Residencia \"(.*?)\"$")
//	public void preencher_o_campo_Quantidade_de_Veiculos_na_Residencia(String qtdVeiculosResidencia) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='16']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(qtdVeiculosResidencia);
//		timeout(3);
//	}
//
//	@Então("^preencher o Perfil de Uso do Veiculo$")
//	public void preencher_o_Perfil_de_Uso_do_Veiculo() {
//		WebElement msgPerfilUsoVeiculo = driver
//				.findElement(By.xpath("//*[@id=\"formAvaliacaoRisco:questionario0\"]/div[3]/header/h1"));
//
//		String perfilUsoVeiculo = msgPerfilUsoVeiculo.getText();
//		Assert.assertTrue(perfilUsoVeiculo, true);
//	}
//
//	@Quando("^preencher o campo CEP \"(.*?)\"$")
//	public void preencher_o_campo_CEP(String cep) {
//		// WebElement txtCep = driver.findElement(By.id("formVeiculo:cep"));
//		// WebElement txtCep =
//		// driver.findElement(By.id("formAvaliacaoRisco:id_405_CND_33_31461686790100650_0_1"));
//		WebElement txtCep = driver.findElement(By.xpath("//*[@tabindex='17']"));
//		copiaDados(cep);
//		txtCep.sendKeys(Keys.CONTROL + "v");
//		timeout(3);
//		txtCep.sendKeys(Keys.TAB);
//		timeout(2);
//	}
//
//	@Quando("^preencher o campo CEP caminhao \"(.*?)\"$")
//	public void preencher_o_campo_CEP_caminhao(String cep) {
//
//		WebElement txtCep = driver.findElement(By.xpath("//*[@tabindex='16']"));
//		copiaDados(cep);
//		txtCep.sendKeys(Keys.CONTROL + "v");
//		timeout(3);
//		txtCep.sendKeys(Keys.TAB);
//		timeout(2);
//	}
//
//	@Quando("^preencher o campo CEP carro_gold \"(.*?)\"$")
//	public void preencher_o_campo_CEP_carro_gold(String cep) {
//
//		WebElement txtCep = driver.findElement(By.xpath("//*[@tabindex='19']"));
//		copiaDados(cep);
//		txtCep.sendKeys(Keys.CONTROL + "v");
//		timeout(3);
//		txtCep.sendKeys(Keys.TAB);
//		timeout(2);
//	}
//
//	@Quando("^preencher o campo CEP taxi \"(.*?)\"$")
//	public void preencher_o_campo_CEP_taxi(String cep_taxi) {
//
//		WebElement txtCep = driver.findElement(By.xpath("//*[@tabindex='8']"));
//		copiaDados(cep_taxi);
//		txtCep.sendKeys(Keys.CONTROL + "v");
//		timeout(3);
//		txtCep.sendKeys(Keys.TAB);
//		timeout(2);
//	}
//
//	@Quando("^preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo \"(.*?)\"$")
//	public void preencher_o_campo_Relacao_do_Segurado_com_o_Proprietario_Legal_do_Veiculo(
//			String proprietarioLegalVeiculo) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='18']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(proprietarioLegalVeiculo);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo taxi \"(.*?)\"$")
//	public void preencher_o_campo_Relacao_do_Segurado_com_o_Proprietario_Legal_do_Veiculo_taxi(
//			String proprietarioLegalVeiculo_taxi) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='9']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(proprietarioLegalVeiculo_taxi);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Veiculo Segurado e Utilizado mais que Dois Dias da Semana \"(.*?)\"$")
//	public void preencher_o_campo_Veiculo_Segurado_e_Utilizado_mais_que_Dois_Dias_da_Semana(
//			String utilizadoMaisQueDoisDias) {
//		WebElement slcNao = driver.findElement(By.xpath("//*[@tabindex='19']"));
//		WebElement slcSim = driver.findElement(By.xpath("//*[@tabindex='20']"));
//
//		if (utilizadoMaisQueDoisDias.equals("Não")) {
//			slcNao.click();
//		} else {
//			slcSim.click();
//		}
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Veiculo Alienado ou Com Leasing \"(.*?)\"$")
//	public void preencher_o_campo_Veiculo_Alienado_ou_Com_Leasing(String alienadoLeasing) {
//		WebElement slcNao = driver.findElement(By.xpath("//*[@tabindex='21']"));
//		WebElement slcSim = driver.findElement(By.xpath("//*[@tabindex='22']"));
//
//		if (alienadoLeasing.equals("Não")) {
//			slcNao.click();
//		} else {
//			slcSim.click();
//		}
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Veiculo Possui Anti-Furto, Rastreador, Bloqueador ou Localizador \"(.*?)\"$")
//	public void preencher_o_campo_Veiculo_Possui_Anti_Furto_Rastreador_Bloqueador_ou_Localizador(
//			String antiFurtoBloqueador) {
//		WebElement slcNao = driver.findElement(By.xpath("//*[@tabindex='23']"));
//		WebElement slcSim = driver.findElement(By.xpath("//*[@tabindex='24']"));
//
//		if (antiFurtoBloqueador.equals("Não")) {
//			slcNao.click();
//		} else {
//			slcSim.click();
//		}
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Existe Garagem ou Estacionamento Fechado para Veiculo \"(.*?)\"$")
//	public void preencher_o_campo_Existe_Garagem_ou_Estacionamento_Fechado_para_Veiculo(String garagemEstacionamento) {
//		WebElement slcNao = driver.findElement(By.xpath("//*[@tabindex='25']"));
//		WebElement slcSim = driver.findElement(By.xpath("//*[@tabindex='26']"));
//
//		if (garagemEstacionamento.equals("Sim")) {
//			slcSim.click();
//		} else {
//			slcNao.click();
//		}
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Na Residencia \"(.*?)\"$")
//	public void preencher_o_campo_Na_Residencia(String naResidencia) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='27']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(naResidencia);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo No Trabalho \"(.*?)\"$")
//	public void preencher_o_campo_No_Trabalho(String noTrabalho) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='28']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(noTrabalho);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Na Faculdade \"(.*?)\"$")
//	public void preencher_o_campo_Na_Faculdade(String naFaculdade) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='29']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(naFaculdade);
//		timeout(3);
//	}
//
//	@Então("^clicar no botao Proximo Perfil de Uso do Veiculo$")
//	public void clicar_no_botao_Proximo_Perfil_de_Uso_do_Veiculo() {
//		WebElement btnProximo = driver.findElement(By.id("formAvaliacaoRisco:btoProximo"));
//		btnProximo.click();
//		timeout(5);
//	}
//
//	@Quando("^preencher os Pacotes de Cobertura Basica \"(.*?)\"$")
//	public void preencher_os_Pacotes_de_Cobertura_Basica(String coberturaBasica) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='1']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(coberturaBasica);
//		timeout(3);
//	}
//
//	@Então("^validar RCF - Danos Morais / Esteticos \"(.*?)\"$")
//	public void validar_RCF_Danos_Morais_Esteticos(String danosMoraisEsteticos) {
//		// WebElement cboDanosMorais =
//		// driver.findElement(By.id("formCoberturas:coberturasList_0:1:idOpcao_0"));
//		//
//		// String danosMorais = cboDanosMorais.getText();
//		//
//		// Assert.assertEquals(danosMorais, danosMoraisEsteticos);
//
//	}
//
//	@Então("^validar RCF - Danos Materiais \"(.*?)\"$")
//	public void validar_RCF_Danos_Materiais(String danosMateriais) {
//		// WebElement cboDanosMateriais =
//		// driver.findElement(By.id("formCoberturas:coberturasList_0:2:idOpcao_0"));
//		//
//		// String danoMateriais = cboDanosMateriais.getText();
//		//
//		// Assert.assertEquals(danoMateriais, danosMateriais);
//
//	}
//
//	@Então("^validar RCF - Danos Corporais \"(.*?)\"$")
//	public void validar_RCF_Danos_Corporais(String danosCorporais) {
//		// WebElement cboDanosCorporais =
//		// driver.findElement(By.id("formCoberturas:coberturasList_0:3:idOpcao_0"));
//		//
//		// String danoCoporal = cboDanosCorporais.getText();
//		//
//		// Assert.assertEquals(danoCoporal, danosCorporais);
//	}
//
//	@Então("^validar RCF - Objetos Transportados \"(.*?)\"$")
//	public void validar_RCF_Objetos_Transportados(String objetosTransportados) {
//		// WebElement cboObjetosTransportados =
//		// driver.findElement(By.id("formCoberturas:coberturasList_0:4:idOpcao_0"));
//		//
//		// String objetoTransportado = cboObjetosTransportados.getText();
//		//
//		// Assert.assertEquals(objetoTransportado, objetosTransportados);
//	}
//
//	// @Quando("^preencher os Pacotes de Cobertura Adicional \"(.*?)\"$")
//	// public void preencher_os_Pacotes_de_Cobertura_Adicional(String
//	// coberturaAdicional) {
//	// WebElement pacoteCoberturaAdicional = driver.findElement(By.id(""));
//	//
//	// String pacoteCobertura = pacoteCoberturaAdicional.getText();
//	//
//	// Assert.assertEquals(pacoteCobertura, coberturaAdicional);
//	// }
//
//	@Então("^validar Vidros \"(.*?)\"$")
//	public void validar_Vidros(String vidros) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='5']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(vidros);
//		timeout(3);
//	}
//
//	@Então("^validar Vidros Caminhao \"(.*?)\"$")
//	public void validar_Vidros_Caminhao(String vidros_caminhao) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='8']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(vidros_caminhao);
//		timeout(3);
//	}
//
//	@Então("^validar Vidros carro_gold \"(.*?)\"$")
//	public void validar_Vidros_Gold(String vidros_gold) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='11']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(vidros_gold);
//		timeout(3);
//	}
//
//	@Então("^validar Vidros Guincho \"(.*?)\"$")
//	public void validar_Vidros_Guincho(String vidros_guincho) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='7']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(vidros_guincho);
//		timeout(3);
//	}
//
//	@Então("^validar Vidros TestDrive \"(.*?)\"$")
//	public void validar_Vidros_TestDrive(String vidros_testdrive) {
//		WebElement slc = driver.findElement(By.xpath("//*[@tabindex='9']"));
//		Select dropDown = new Select(slc);
//		dropDown.selectByVisibleText(vidros_testdrive);
//		timeout(3);
//	}
//
//	@Então("^validar Extensao Reboque \"(.*?)\"$")
//	public void validar_Extensao_Reboque(String extensaoReboque) {
//	}
//
//	@Então("^validar APO - Morte \\(por Ocupante\\) \"(.*?)\"$")
//	public void validar_APO_Morte_por_Ocupante(String apoMorte) {
//	}
//
//	@Então("^validar APO - Invalidez \\(por Ocupante\\) \"(.*?)\"$")
//	public void validar_APO_Invalidez_por_Ocupante(String invalidezOcupante) {
//	}
//
//	@Então("^validar APO - Decessos \"(.*?)\"$")
//	public void validar_APO_Decessos(String apoDecessos) {
//	}
//
//	@Então("^validar Assistencia basica \"(.*?)\"$")
//	public void validar_Assistencia_basica(String assistenciaBasica) {
//	}
//
//	@Então("^clicar no botão Proximo Pacotes de Coberturas$")
//	public void clicar_no_botão_Proximo_Pacotes_de_Coberturas() {
//		WebElement btnProximo = driver.findElement(By.id("formCoberturas:save"));
//		btnProximo.click();
//		timeout(5);
//	}
//
//	@Então("^validar o Valor do Seguro \"(.*?)\"$")
//	public void validar_o_Valor_do_Seguro(String valorSeguro) {
//	}
//
//	@Quando("^preencher o campo Descontos/Campanha \"(.*?)\"$")
//	public void preencher_o_campo_Descontos_Campanha(String descontosCampanha) {
//	}
//
//	@Quando("^preencher o campo Banco Maior Relacionamento \"(.*?)\"$")
//	public void preencher_o_campo_Banco_Maior_Relacionamento(String bancoMaiorRelacionamento) {
//		WebElement txtBancoMaiorRelacionamento = driver.findElement(By.id("frmCalculoCotacao:nomeBancoInput"));
//		txtBancoMaiorRelacionamento.sendKeys(bancoMaiorRelacionamento);
//		txtBancoMaiorRelacionamento.sendKeys(Keys.TAB);
//		timeout(3);
//	}
//
//	@Quando("^preencher o campo Grupo de Afinidade \"(.*?)\"$")
//	public void preencher_o_campo_Grupo_de_Afinidade(String afinidade) {
//	}
//
//	@Quando("^preencher o campo Operador \"(.*?)\"$")
//	public void preencher_o_campo_Operador(String operador) {
//	}
//
//	@Quando("^preencher o campo Operacao \"(.*?)\"$")
//	public void preencher_o_campo_Operacao(String operacao) {
//		WebElement txtOperacao = driver.findElement(By.id("frmCalculoCotacao:codigoComissao"));
//		txtOperacao.clear();
//		txtOperacao.sendKeys(operacao);
//		timeout(3);
//	}
//	
//	@Então("^tiro um print screen com altura \"(.*?)\"$ ^e largura \"(.*?)\"$")
//	public void tirar_printscreen(String largura, String altura){
//		try {
//			Robot robot = new Robot();
//			BufferedImage bi = robot.createScreenCapture(new Rectangle(Integer.valueOf(largura),Integer.valueOf(altura)));
//			try {
//				ImageIO.write(bi, "png", new File("C:\\Printsprint.png"));
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//
//	@Então("^clicar no botao Calcular$")
//	public void clicar_no_botao_Calcular() {
//		WebElement btnCalcular = driver.findElement(By.id("frmCalculoCotacao:btnCalcular"));
//		btnCalcular.click();
//		timeout(8);
//	}
//
//	// @Então("^validar mensagem de sucesso$")
//	// public void validar_mensagem_de_sucesso() {
//	// // WebElement msgSucesso = driver.findElement(By.className("sucess"));
//	// // WebElement msgSucesso = driver
//	// //
//	// .findElement(By.xpath("//*[@id=\"frmCalculoCotacao:panelMessage\"]/div/div[2]/div/ul/li/text()"));
//	// //
//	// // String sucesso = msgSucesso.getText();
//	// //
//	// // Assert.assertTrue(sucesso, true);
//	// // timeout(3);
//	// }
//
//	@Então("^validar mensagem de sucesso \"(.*?)\"$")
//	public void validar_mensagem_de_sucesso(String msgSucesso) {
//		WebElement classeMsg = driver.findElement(By.xpath("//li[contains(.,'" + msgSucesso + "')]"));
//		String mensagem = classeMsg.getText();
//
//		mensagem.substring(0, 1).trim();
//
//		Assert.assertEquals(mensagem, msgSucesso);
//	}
//
//	@Então("^clicar no botao salvar pdf$")
//	public void clicar_no_botao_salvar_pdf() {
//	}
//
//	@Então("^clicar no botao Imprimir$")
//	public void clicar_no_botao_Imprimir() {
//		WebElement btnImprimir = driver.findElement(By.id("frmCalculoCotacao:btImprimir"));
//		btnImprimir.click();
//		timeout(5);
//	}
//
//	@Quando("^clicar no botão fechar popup Banco Maior Relacionamento$")
//	public void clicar_no_botão_fechar_popup_Banco_Maior_Relacionamento() {
//		WebElement btnFecharBanco = driver
//				.findElement(By.xpath("//*[@id=\"modalAlertBancoRelacionado\"]/div/div[3]/a"));
//		btnFecharBanco.click();
//		timeout(3);
//	}
//
//	@Quando("^clicar na opção de franquia \"(.*?)\"$")
//	public void clicar_na_opção_de_franquia(String opcaoFranquia) {
//
//		if (opcaoFranquia.trim().toLowerCase().equals("normal")) {
//			WebElement normal = driver.findElement(By.xpath("//*[@tabindex='43']"));
//			normal.click();
//		} else if (opcaoFranquia.trim().toLowerCase().equals("reduzida")) {
//			WebElement reduzida = driver.findElement(By.xpath("//*[@tabindex='44']"));
//			reduzida.click();
//		} else {
//			WebElement desconto = driver.findElement(By.xpath("//*[@tabindex='45']"));
//			desconto.click();
//		}
//		timeout(3);
//	}
//
//	@Então("^troca de aba e clicar no botão Imprimir$")
//	public void troca_de_aba_e_clicar_no_botão_Imprimir() {
//		ArrayList<String> outraAbas = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(outraAbas.get(1));
//		timeout(3);
//		WebElement botaoImprimirOutraAba = driver.findElement(By.id("formImpressao:btImprimir"));
//		botaoImprimirOutraAba.click();
//		timeout(20);
//	}
//
//	@Então("^troca de aba e clicar no botão Salvar PDF$")
//	public void troca_de_aba_e_clicar_no_botão_Salvar_PDF() {
//		ArrayList<String> outraAbas = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(outraAbas.get(1));
//		timeout(3);
//		WebElement botaoImprimirOutraAba = driver.findElement(By.id("formImpressao:btSalvarPDF"));
//		botaoImprimirOutraAba.click();
//		timeout(20);
//	}
}
