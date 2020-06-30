package mapfre.automationTestsMcc.steps.novoEndosso;

import mapfre.automationTestsMcc.steps.TestCommon;
import mapfre.automationTestsMcc.utils.enums.PerguntaPerfilEnum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Perfil extends TestCommon {
	
	@Quando("^Endosso - Perfil - preencher pergunta com perfil \"(.*?)\"$")
	public void preencher_pergunta_com_perfil(String comPerfil){				
		if(comPerfil.equals("Sim")){
			clicar(By.xpath("//*/input[contains(@id,'" + PerguntaPerfilEnum.COM_PERFIL.getCodigo() + "') and contains(@id, ':1')]"));
		} else {
			clicar(By.xpath("//*/input[contains(@id,'" + PerguntaPerfilEnum.COM_PERFIL.getCodigo() + "') and contains(@id, ':0')]"));
		}
	}

	@Quando("^Endosso - Perfil - preencher segurado é o principal condutor \"(.*?)\"$")
	public void preencher_radio_segurado_principal_condutor(String seguradoPrincipalCondutor) {
		if(seguradoPrincipalCondutor.equals("Sim")){
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEGURADO_PRINCIPAL_CONDUTOR.getCodigo() + "') and contains(@id, ':1')]"));
		} else {
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEGURADO_PRINCIPAL_CONDUTOR.getCodigo() + "') and contains(@id, ':0')]"));
		}
	}

	@Quando("^Endosso - Perfil - preencher campo CPF \"(.*?)\"$")
	public void preencher_campo_cpf(String cpf_condutor) {
		((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.CPF.getCodigo() + "']\").val('" + cpf_condutor + "')");		
	}

	@Quando("^Endosso - Perfil - preencher campo CNH \"(.*?)\"$")
	public void preencher_campo_cnh(String cnh_condutor){		
		preencherInput(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.CNH.getCodigo() + "')]"), cnh_condutor);
	}

	@Quando("^Endosso - Perfil - preencher nome principal condutor \"(.*?)\"$")
	public void preencher_campo_nome_principal_condutor(String nome_principal_condutor){
		preencherInput(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.NOME.getCodigo() + "')]"), nome_principal_condutor);
	}

	@Quando("^Endosso - Perfil - preencher data nascimento principal condutor \"(.*?)\"$")
	public void preencher_data_nascimento_principal_condutor(String data_nascimento_principal_condutor){
		preencherInput(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.DATA_NASCIMENTO.getCodigo() + "')]"), data_nascimento_principal_condutor);
	}

	@Quando("^Endosso - Perfil - preencher sexo principal condutor \"(.*?)\"$")
	public void preencher_sexo_principal_condutor(String sexo_principal_condutor){				
		if(sexo_principal_condutor.equals("Feminino")){
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEXO.getCodigo() + "') and contains(@id, ':0')]"));
		}else{
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.SEXO.getCodigo() + "') and contains(@id, ':1')]"));
		}
	}

	@Quando("^Endosso - Perfil - preencher estado civil principal condutor \"(.*?)\"$")
	public void preencher_estado_civil_principal_condutor(String estado_civil_principal_condutor){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.ESTADO_CIVIL.getCodigo() + "')]"), estado_civil_principal_condutor);
	}

	@Quando("^Endosso - Perfil - preencher profissao principal condutor \"(.*?)\"$")
	public void preencher_profissao_principal_condutor(String profissao_principal_condutor){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.PROFISSAO.getCodigo() + "')]"), profissao_principal_condutor);
	}

	@Quando("^Endosso - Perfil - preencher tempo habilitacao principal condutor \"(.*?)\"$")
	public void preencher_tempo_habilitacao_principal_condutor(String tempo_habilitacao_principal_condutor){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.TEMPO_HABILITACAO.getCodigo() + "')]"), tempo_habilitacao_principal_condutor);		
	}

	@Quando("^Endosso - Perfil - preencher tipo residencia principal condutor \"(.*?)\"$")
	public void preencher_tipo_residencia_principal_condutor(String tipo_residencia_principal_condutor){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.TIPO_RESIDENCIA.getCodigo() + "')]"), tipo_residencia_principal_condutor);		
	}

	@Quando("^Endosso - Perfil - pergunta principal condutor reside com menores vinte seis anos \"(.*?)\"$")
	public void preencher_pergunta_menores_26_anos(String reside_menores_26_anos){
		if(reside_menores_26_anos.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.RESIDENTE_MENOR_26_ANOS.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.RESIDENTE_MENOR_26_ANOS.getCodigo() + "'][id*=':0']\").click().click()");
		}
	}

	@Quando("^Endosso - Perfil - pergunta principal condutor reside com condutores menores vinte seis anos \"(.*?)\"$")
	public void preencher_pergunta_condutores_menores_26_anos(String condutores_menores_26_anos){
		if(condutores_menores_26_anos.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.FILHO_FUNCIONARIO_MENOR_26_ANOS.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.FILHO_FUNCIONARIO_MENOR_26_ANOS.getCodigo() + "'][id*=':0']\").click().click()");
		}
	}
	
	@Quando("^Endosso - Perfil - pergunta principal condutor possui filhos menores vinte seis anos que utilizam o veículo \"(.*?)\"$")
	public void preencher_filhos_condutores_menores_26_anos_usam_veiculo(String filhos_menores_26_anos_usam_veiculo){
		if(filhos_menores_26_anos_usam_veiculo.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.FILHO_FUNCIONARIO_MENOR_26_ANOS.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.FILHO_FUNCIONARIO_MENOR_26_ANOS.getCodigo() + "'][id*=':0']\").click().click()");
		}
	}

	@Quando("^Endosso - Perfil - preenche quantidade de veículos na residencia \"(.*?)\"$")
	public void preencher_quantidade_veiculoes_residencia(String qtd_veiculos_residencia){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.QTDE_VEICULOS_RESIDENCIA.getCodigo() + "')]"), qtd_veiculos_residencia);						
	}

	@Quando("^Endosso - Perfil - preenche cep \"(.*?)\"$")
	public void preencher_cep_perfil(String cep){
		WebElement txtCep = findElement(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.CEP_PERNOITE.getCodigo() + "')]"));
				
		if (!txtCep.getAttribute("value").isEmpty()) {
			txtCep.clear();
			timeout(2);		
			txtCep = findElement(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.CEP_PERNOITE.getCodigo() + "')]"));
			txtCep.click();
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);
		} else {
			txtCep.click();
			txtCep.sendKeys(cep);
			txtCep.sendKeys(Keys.TAB);	
		}	
	}

	@Então("^Endosso - Perfil - clicar no botao Nao sei o CEP$")
	public void clicarBotaoNaoSeiCEP() {
		clicar(By.className("modalPerfil"));	
	}
	
	@Quando("^Endosso - Perfil - preencher o campo Estado \"(.*?)\"$")
	public void preencherCampoEstado(String opcao) {	
		preencherSelect(By.id("cepForm:estado"), opcao);
	}
	
	@Quando("^Endosso - Perfil - preencher o campo Cidade \"(.*?)\"$")
	public void preencherCampoCidade(String texto) {	
		preencherInput(By.id("cepForm:cidadeInput"), texto);		
	}	
	
	@Quando("^Endosso - Perfil - preencher o campo Logradouro \"(.*?)\"$")
	public void preencherCampoLogradouro(String texto) {	
		preencherInput(By.id("cepForm:logradouro"), texto);		
	}
	
	@Então("^Endosso - Perfil - clicar no botao Pesquisar CEP$")
	public void clicarBotaoPesquisarCEP() {
		clicar(By.id("cepForm:btnPesquisar"));
	}
	
	@Então("^Endosso - Perfil - selecionar o CEP$")
	public void selecionarCEP() {
		((JavascriptExecutor)driver).executeScript("$(\".select-box .even\").click()");
	}
	
	@Então("^Endosso - Perfil - clicar no botao Confirmar CEP$")
	public void clicarBotaoConfirmarCEP() {
		clicar(By.id("cepForm:btConfirmar"));
	}

	@Quando("^Endosso - Perfil - relacao segurado proprietario legal \"(.*?)\"$")
	public void preencher_relacao_segurado_proprietario_legal(String relacao_segurado_proprietario){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.RELACAO_COM_SEGURADO.getCodigo() + "')]"), relacao_segurado_proprietario);
	}

	@Quando("^Endosso - Perfil - veiculo é utilizado mais que 2 dias na semana \"(.*?)\"$")
	public void preencher_pergunta_veiculo_usado_mais_dois_dias(String veiculo_utilizado_mais_dois_dias){
		if(veiculo_utilizado_mais_dois_dias.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_UTILIZADO_MAIS_DOIS_DIAS.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_UTILIZADO_MAIS_DOIS_DIAS.getCodigo() + "'][id*=':0']\").click().click()");
		}		
	}

	@Quando("^Endosso - Perfil - veiculo alienado ou leasing \"(.*?)\"$")
	public void preencher_pergunta_veiculo_com_leasing_alienado(String veiculo_alienado_leasing){
		if(veiculo_alienado_leasing.equals("Sim")){
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_ALIENADO_LEASING.getCodigo() + "'][id*=':1']\").click().click()");
		}else{
			((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.VEICULO_ALIENADO_LEASING.getCodigo() + "'][id*=':0']\").click().click()");
		}			
	}

	@Quando("^Endosso - Perfil - veiculo possui disposisitivo anti furto \"(.*?)\"$")
	public void preencher_veiculo_dispositivo_anti_furto(String dispositivo_anti_furto){
		String produto = driver.findElement(By.id("formResumo:produtoResumo")).getText();
		
		if(dispositivo_anti_furto.equals("Sim")){			
			if (produto.equalsIgnoreCase("AutoMais Caminhão On-line")) {
				((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.AUTO_EXISTE_DISPOSITIVO_ANTIFURTO.getCodigo() + "'][id*=':1']\").closest(\"td\").find(\"label\").click()");
			} else {
				((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.EXISTE_DISPOSITIVO_ANTIFURTO.getCodigo() + "'][id*=':1']\").closest(\"td\").find(\"label\").click()");
			}		
		}else{
			if (produto.equalsIgnoreCase("AutoMais Caminhão On-line")) {
				((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.AUTO_EXISTE_DISPOSITIVO_ANTIFURTO.getCodigo() + "'][id*=':0']\").closest(\"td\").find(\"label\").click()");
			} else {
				((JavascriptExecutor)driver).executeScript("$(\"input[id*='" + PerguntaPerfilEnum.EXISTE_DISPOSITIVO_ANTIFURTO.getCodigo() + "'][id*=':0']\").closest(\"td\").find(\"label\").click()");
			}	
		}
	}

	@Quando("^Endosso - Perfil - preencher fabricante rastreador/localizador \"(.*?)\"$")
	public void preencher_fabricante_rastreador_localizador(String fabricante_rastreador_localizador){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.RASTREADORES_LOCALIZADORES.getCodigo() + "')]"), fabricante_rastreador_localizador);
	}

	@Quando("^Endosso - Perfil - preencher propriedade do rastreador \"(.*?)\"$")
	public void preencher_propriedade_rastreador(String propriedade_rastreador){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.PROPRIEDADE_RASTREADOR.getCodigo() + "')]"), propriedade_rastreador);
	}

	@Quando("^Endosso - Perfil - preencher bloqueadores \"(.*?)\"$")
	public void preencher_bloqueadores(String bloqueador){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.BLOQUEADORES.getCodigo() + "')]"), bloqueador);
	}

	@Quando("^Endosso - Perfil - preencher dispositivo anti furto comum \"(.*?)\"$")
	public void preencher_dispositivo_anti_furto_comum(String dispositivo_anti_furto_comum){		
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.DISPOSITIVO_ANTIFURTO_COMUM.getCodigo() + "')]"), dispositivo_anti_furto_comum);
	}

	@Quando("^Endosso - Perfil - possui garagem ou estacionamento fechado \"(.*?)\"$")
	public void preencher_possui_garagem_estacionamento_fechado(String garagem_estacionamento_fechado) {
		if (garagem_estacionamento_fechado.equals("Sim")) {
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM.getCodigo() + "') and contains(@id, ':0')]"));
		} else {
			clicar(By.xpath("//*/input[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM.getCodigo() + "') and contains(@id, ':1')]"));
		}
	}

	@Quando("^Endosso - Perfil - preencher na garagem ou estacionamento na residencia \"(.*?)\"$")
	public void preencher_garagem_estacionamento_na_residencia(String garagem_estacionamento_na_residencia){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM_RESIDENCIA.getCodigo() + "')]"), garagem_estacionamento_na_residencia);
	}

	@Quando("^Endosso - Perfil - preencher na garagem ou estacionamento no trabalho \"(.*?)\"$")
	public void preencher_garagem_estacionamento_no_trabalho(String garagem_estacionamento_no_trabalho){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM_TRABALHO.getCodigo() + "')]"), garagem_estacionamento_no_trabalho);
	}

	@Quando("^Endosso - Perfil - preencher na garagem ou estacionamento na faculdade \"(.*?)\"$")
	public void preencher_garagem_na_faculdade(String garagem_estacionamento_na_faculdade){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EXISTE_GARAGEM_FACULDADE.getCodigo() + "')]"), garagem_estacionamento_na_faculdade);
	}

	@Então("^Endosso - Perfil - clicar no botao proximo$")
	public void clicar_no_botao_proximo() {
	    clicar(By.id("formAvaliacaoRisco:btoProximo"));
	}
			
	@Quando("^Endosso - Perfil - preencher tipo carroceria \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_preencher_tipo_carroceria(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.TIPO_CARROCERIA.getCodigo() + "')]"), opcao);
	}
	
	@Quando("^Endosso - Perfil - preencher carga transportada \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_carga_transportada(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.CARGA_TRANSPORTADA.getCodigo() + "')]"), opcao);
	}
	
	@Quando("^Endosso - Perfil - preencher equipamento \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_preencher_equipamento(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.EQUIPAMENTO.getCodigo() + "')]"), opcao);
	}
	
	@Quando("^Endosso - Perfil - preencher veiculo possui cabine suplementar \"(.*?)\"$")
	public void marcar_opcao_quando_caminhao_preencher_veiculo_possui_cabine_complementar(String opcao){
		preencherSelect(By.xpath("//*/select[contains(@id, '" + PerguntaPerfilEnum.CABINE_SUPLEMENTAR.getCodigo() + "')]"), opcao);
	}	
}
