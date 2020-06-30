package mapfre.automationTestsMcc.steps.residencial;

import mapfre.automationTestsMcc.steps.TestCommon;
import org.openqa.selenium.By;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Calculo extends TestCommon{

	@Quando("^Residencial - Calculo - preencher o campo Operador \"(.*?)\"$")
	public void preencherCampoOperador(String opcao) {		
		preencherSelect(By.id("formCalCotacao:operador"), opcao);
	}
	
	@Quando("^Residencial - Calculo - preencher o campo Grupo Afinidade \"(.*?)\"$")
	public void preencherCampoGrupoAfinidade(String opcao) {		
		preencherSelect(By.id("formCalCotacao:grupoAfinidade"), opcao);
	}
	
	@Quando("^Residencial - Calculo - preencher o campo Operação \"(.*?)\"$")
	public void preencherCampoOperacao(String valor) {		
		preencherInput(By.id("formCalCotacao:operacao"), valor);
	}

	@Quando("^Residencial - Calculo - preencher o campo Fator \"(.*?)\"$")
	public void preencherCampoFator(String valor) {		
		preencherInput(By.id("formCalCotacao:fator"), valor);
	}
	
	@Quando("^Residencial - Calculo - preencher o campo Banco Maior Relacionamento \"(.*?)\"$")
	public void preencherCampoBancoMaiorRelacionamento(String valor) {		
		preencherInput(By.id("formCalCotacao:nomeBancoInput"), valor);
	}
	
	@Então("^Residencial - Calculo - Clicar Botão Calcular$")
	public void clicarBotaoCalcular() {	
		clicar(By.id("formCalCotacao:btoCalcular"));
	}
	
	@Então("^Residencial - Calculo - Clicar Botão Imprimir$")
	public void clicarBotaoImprimir() {	
		clicar(By.id("formCalCotacao:btoImprimir"));
	}
	
	@Então("^Residencial - Calculo - Clicar Botão Parcelamento$")
	public void clicarBotaoParcelamento() {	
		clicar(By.id("formCalCotacao:btnFormasPagamento"));
	}

	@Então("^Residencial - Calculo - Clicar Botão Fechar Modal Formas Pagamento$")
	public void clicarBotaoFecharModalFormasPagamento() {	
		clicar(By.xpath("//*[@id='parcelamentos']/span"));
	}
	
	@Então("^Residencial - Calculo - Clicar Botão Proposta$")
	public void clicarBotaoProposta() {	
		clicar(By.xpath("formCalCotacao:btoProximo321"));
	}
		
	
}