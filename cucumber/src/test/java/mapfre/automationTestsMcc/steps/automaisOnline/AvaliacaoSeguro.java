package mapfre.automationTestsMcc.steps.automaisOnline;

import mapfre.automationTestsMcc.steps.TestCommon;
import mapfre.automationTestsMcc.utils.enums.PerguntaPerfilEnum;
import mapfre.automationTestsMcc.utils.enums.TipoProdutoEnum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AvaliacaoSeguro extends TestCommon {
			
	@Quando("^Auto - Avaliacao Seguro - preencher pergunta com perfil \"(.*?)\"$")
	public void preencher_pergunta_com_perfil(String comPerfil){				
		if(comPerfil.equals("Sim")){
			clicar(By.xpath("//*/input[contains(@id,'" + PerguntaPerfilEnum.COM_PERFIL.getCodigo() + "') and contains(@id, ':1')]"));
		} else {
			clicar(By.xpath("//*/input[contains(@id,'" + PerguntaPerfilEnum.COM_PERFIL.getCodigo() + "') and contains(@id, ':0')]"));
			
			timeout(3);
		}
	}
	
	@Quando("^Auto - Avaliacao Seguro - selecionar o campo Veiculo sera Conduzido por Quantos Condutores \"(.*?)\"$")
	public void selecionar_o_campo_Veiculo_sera_Conduzido_por_Quantos_Condutores(String veiculoConduzido) {				
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.VEICULO_QUANTOS_CONDUTORES.getCodigo() + "')]"), veiculoConduzido);
	}

	@Quando("^Auto - Avaliacao Seguro - selecionar o Possui Condutores Menores de 26 Anos \"(.*?)\"$")
	public void selecionar_o_Possui_Condutores_Menores_de_26_Anos(String possuiCondutores) {		
		if(possuiCondutores.equals("Sim")){
			clicar(By.xpath("//*/input[contains(@id,'" + PerguntaPerfilEnum.POSSUI_CONDUTORES_MENORES_26_ANOS.getCodigo() + "') and contains(@id, ':1')]"));
		} else {
			clicar(By.xpath("//*/input[contains(@id,'" + PerguntaPerfilEnum.POSSUI_CONDUTORES_MENORES_26_ANOS.getCodigo() + "') and contains(@id, ':0')]"));
		}
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Segurado Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Segurado_Principal_Condutor(String principalCondutor) {
		if(principalCondutor.equals("Sim")){
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEGURADO_PRINCIPAL_CONDUTOR.getCodigo() + "') and contains(@id, ':1')]"));
		} else {
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEGURADO_PRINCIPAL_CONDUTOR.getCodigo() + "') and contains(@id, ':0')]"));
		}
	}
	
	@Quando("^Auto - Avaliacao Seguro - preencher data nascimento principal condutor \"(.*?)\"$")
	public void preencher_data_nascimento_principal_condutor(String data_nascimento_principal_condutor){
		WebElement dataNascimento = driver.findElement(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.DATA_NASCIMENTO.getCodigo() + "')]"));
		dataNascimento.clear();
		dataNascimento.sendKeys(data_nascimento_principal_condutor);		
		timeout(3);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Sexo Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Sexo_Principal_Condutor(String sexoCondutor) {
		if(sexoCondutor.equals("Feminino")){
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEXO.getCodigo() + "') and contains(@id, ':0')]"));
		}else{
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEXO.getCodigo() + "') and contains(@id, ':1')]"));
		}
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Estado Civil Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Estado_Civil_Principal_Condutor(String estadoCivil) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.ESTADO_CIVIL.getCodigo() + "')]"), estadoCivil);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Profissao Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Profissao_Principal_Condutor(String profissaoPrincipalCondutor) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.PROFISSAO.getCodigo() + "')]"), profissaoPrincipalCondutor);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Tempo de Habilitacao do Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Tempo_de_Habilitacao_do_Principal_Condutor(String cnhPrincipalCondutor) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.TEMPO_HABILITACAO.getCodigo() + "')]"), cnhPrincipalCondutor);		
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Tipo de Residencia do Principal Condutor \"(.*?)\"$")
	public void preencher_o_campo_Tipo_de_Residencia_do_Principal_Condutor(String residenciaPrincipalCondutor) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.TIPO_RESIDENCIA.getCodigo() + "')]"), residenciaPrincipalCondutor);		
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo \"(.*?)\"$")
	public void preencher_o_campo_Principal_Condutor_Reside_com_Menores_de_vinte_e_seis_anos_que_Possam_Utilizar_o_Veiculo(String condutorMenoresUtilizam) {
		if(condutorMenoresUtilizam.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.RESIDENTE_MENOR_26_ANOS.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.RESIDENTE_MENOR_26_ANOS.getCodigo() + "'][id*=':0']\").click().click()");
		}
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Principal Condutor Possui Filhos ou Funcionarios Menores de vinte e seis anos que Possam Utilizar o Veiculo \"(.*?)\"$")
	public void preencher_o_campo_Principal_Condutor_Possui_Filhos_ou_Funcionarios_Menores_de_vinte_e_seis_anos_que_Possam_Utilizar_o_Veiculo(
			String condutorFilhoFuncionario) {
		if(condutorFilhoFuncionario.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.FILHO_FUNCIONARIO_MENOR_26_ANOS.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.FILHO_FUNCIONARIO_MENOR_26_ANOS.getCodigo() + "'][id*=':0']\").click().click()");
		}
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Quantidade de Veiculos na Residencia \"(.*?)\"$")
	public void preencher_o_campo_Quantidade_de_Veiculos_na_Residencia(String qtdVeiculosResidencia) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.QTDE_VEICULOS_RESIDENCIA.getCodigo() + "')]"), qtdVeiculosResidencia);						
	}
	
	@Quando("^Auto - Avaliacao Seguro - preencher o campo CEP \"(.*?)\"$")
	public void preencher_o_campo_CEP(String cep) {
		WebElement campoCep = null;
		String txtTipoProduto = driver.findElement(By.id("formResumo:produtoResumo")).getText();
		
		if(txtTipoProduto.equalsIgnoreCase(TipoProdutoEnum.AUTOMAIS_CAMINHAO_ONLINE.getDescricao())){
			campoCep = findElement(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.CEP_RISCO_CAMINHAO.getCodigo() + "')]"));			
		}else{
			campoCep = findElement(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.CEP_PERNOITE.getCodigo() + "')]"));			
		}
		
		campoCep.click();
		campoCep.sendKeys(cep);
		campoCep.sendKeys(Keys.TAB);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher tempo habilitacao principal condutor \"(.*?)\"$")
	public void preencher_tempo_habilitacao_principal_condutor(String tempo_habilitacao_principal_condutor){
		WebElement slc = driver.findElement(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.TEMPO_HABILITACAO.getCodigo() + "')]"));		
		Select dropDown = new Select(slc);
		dropDown.selectByVisibleText(tempo_habilitacao_principal_condutor);	
		timeout(1);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo \"(.*?)\"$")
	public void preencher_o_campo_Relacao_do_Segurado_com_o_Proprietario_Legal_do_Veiculo(
			String proprietarioLegalVeiculo) {		
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.RELACAO_COM_SEGURADO.getCodigo() + "')]"), proprietarioLegalVeiculo);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Veiculo Segurado e Utilizado mais que Dois Dias da Semana \"(.*?)\"$")
	public void preencher_o_campo_Veiculo_Segurado_e_Utilizado_mais_que_Dois_Dias_da_Semana(
			String utilizadoMaisQueDoisDias) {
		if(utilizadoMaisQueDoisDias.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_UTILIZADO_MAIS_DOIS_DIAS.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_UTILIZADO_MAIS_DOIS_DIAS.getCodigo() + "'][id*=':0']\").click().click()");
		}	
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Veiculo Alienado ou Com Leasing \"(.*?)\"$")
	public void preencher_o_campo_Veiculo_Alienado_ou_Com_Leasing(String alienadoLeasing) {
		
		if(alienadoLeasing.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_ALIENADO_LEASING.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_ALIENADO_LEASING.getCodigo() + "'][id*=':0']\").click().click()");
		}
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Veiculo Possui Anti-Furto, Rastreador, Bloqueador ou Localizador \"(.*?)\"$")
	public void preencher_o_campo_Veiculo_Possui_Anti_Furto_Rastreador_Bloqueador_ou_Localizador(
			String antiFurtoBloqueador) {
		if(antiFurtoBloqueador.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.AUTO_EXISTE_DISPOSITIVO_ANTIFURTO.getCodigo() + "'][id*=':1']\").closest(\"td\").find(\"label\").click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.AUTO_EXISTE_DISPOSITIVO_ANTIFURTO.getCodigo() + "'][id*=':0']\").closest(\"td\").find(\"label\").click()");
		}
	}

	@Quando("^Auto - Avaliacao Seguro - preencher fabricante rastreador/localizador \"(.*?)\"$")
	public void preencher_fabricante_rastreador_localizador(String fabricante_rastreador_localizador){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.RASTREADORES_LOCALIZADORES.getCodigo() + "')]"), fabricante_rastreador_localizador);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher propriedade do rastreador \"(.*?)\"$")
	public void preencher_propriedade_rastreador(String propriedade_rastreador){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.PROPRIEDADE_RASTREADOR.getCodigo() + "')]"), propriedade_rastreador);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher bloqueadores \"(.*?)\"$")
	public void preencher_bloqueadores(String bloqueador){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.BLOQUEADORES.getCodigo() + "')]"), bloqueador);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher dispositivo anti furto comum \"(.*?)\"$")
	public void preencher_dispositivo_anti_furto_comum(String dispositivo_anti_furto_comum){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.DISPOSITIVO_ANTIFURTO_COMUM.getCodigo() + "')]"), dispositivo_anti_furto_comum);
	}
		
	@Quando("^Auto - Avaliacao Seguro - preencher o campo Existe Garagem ou Estacionamento Fechado para Veiculo \"(.*?)\"$")
	public void preencher_o_campo_Existe_Garagem_ou_Estacionamento_Fechado_para_Veiculo(String garagemEstacionamento) {
		if (garagemEstacionamento.equals("Sim")) {
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM.getCodigo() + "') and contains(@id, ':1')]"));
		} else {
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM.getCodigo() + "') and contains(@id, ':0')]"));
		}
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Na Residencia \"(.*?)\"$")
	public void preencher_o_campo_Na_Residencia(String naResidencia) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM_RESIDENCIA.getCodigo() + "')]"), naResidencia);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo No Trabalho \"(.*?)\"$")
	public void preencher_o_campo_No_Trabalho(String noTrabalho) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM_TRABALHO.getCodigo() + "')]"), noTrabalho);
	}

	@Quando("^Auto - Avaliacao Seguro - preencher o campo Na Faculdade \"(.*?)\"$")
	public void preencher_o_campo_Na_Faculdade(String naFaculdade) {
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM_FACULDADE.getCodigo() + "')]"), naFaculdade);
	}

	@Então("^Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo$")
	public void clicar_no_botao_Proximo_Perfil_de_Uso_do_Veiculo() {
		clicar(By.id("formAvaliacaoRisco:btoProximo"));
	}
	
	@Quando("^Auto - Avaliacao Seguro - preencher tipo carroceria \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_preencher_tipo_carroceria(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.TIPO_CARROCERIA.getCodigo() + "')]"), opcao);
	}
	
	@Quando("^Auto - Avaliacao Seguro - preencher carga transportada \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_carga_transportada(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.CARGA_TRANSPORTADA.getCodigo() + "')]"), opcao);
	 timeout(2);
	}
	
	
	@Quando("^Auto - Avaliacao Seguro - preencher equipamento \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_preencher_equipamento(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EQUIPAMENTO.getCodigo() + "')]"), opcao);
	}
	
	@Quando("^Auto - Avaliacao Seguro - preencher veiculo possui cabine complementar \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_preencher_veiculo_possui_cabine_complementar(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.CABINE_SUPLEMENTAR.getCodigo() + "')]"), opcao);
	}
	
	@Então("^Auto - Avaliacao Seguro - clicar no botao Nao sei o CEP$")
	public void clicarBotaoNaoSeiCEP() {
		clicar(By.className("modalPerfil"));
	}
	
	@Quando("^Auto - Avaliacao Seguro - preencher o campo Estado \"(.*?)\"$")
	public void preencherCampoEstado(String opcao) {	
		preencherSelect(By.id("cepForm:estado"), opcao);
	}
	
	@Quando("^Auto - Avaliacao Seguro - preencher o campo Cidade \"(.*?)\"$")
	public void preencherCampoCidade(String texto) {	
		preencherInput(By.id("cepForm:cidadeInput"), texto);		
	}	
	
	@Quando("^Auto - Avaliacao Seguro - preencher o campo Logradouro \"(.*?)\"$")
	public void preencherCampoLogradouro(String texto) {	
		preencherInput(By.id("cepForm:logradouro"), texto);		
	}
	
	@Então("^Auto - Avaliacao Seguro - clicar no botao Pesquisar CEP$")
	public void clicarBotaoPesquisarCEP() {
		clicar(By.id("cepForm:btnPesquisar"));
	}
	
	@Então("^Auto - Avaliacao Seguro - selecionar o CEP$")
	public void selecionarCEP() {
		((JavascriptExecutor)driver).executeScript("$(\".select-box .even\").click()");
	}
	
	@Então("^Auto - Avaliacao Seguro - clicar no botao Confirmar CEP$")
	public void clicarBotaoConfirmarCEP() {
		clicar(By.id("cepForm:btConfirmar"));
	}
}
