package mapfre.automationTestsMcc.steps.millenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import mapfre.automationTestsMcc.steps.TestCommon;

public class ResidenciaSegurada extends TestCommon{

    @Quando("^Millenium - Residencia Segurada - preencher o campo tipo de risco \"(.*?)\"$")
    public void residencia_segurada_preencher_o_campo_Tipo_de_risco(final String valor) {
        preencherSelect(By.id("formResidencia:tipoRiscoCorretor"), valor);
    }

    @Quando("^Millenium - Residencia Segurada - preencher o campo renovacao automatica \"(.*?)\"$")
    public void residencia_segurada_preencher_o_campo_renovacao_automatica(final String valor) {
        if (valor.equalsIgnoreCase("Masculino")) {
            clicar(By.id("formResidencia:selectRenovacao:0"));
        } else {
            clicar(By.id("formResidencia:selectRenovacao:1"));
        }
    }

    @Quando("^Millenium - Residencia Segurada - preencher o campo cep \"(.*?)\"$")
    public void residencia_segurada_preencher_o_campo_cep(final String valor) {
        final WebElement inputDate= findElement(By.id("formResidencia:cep"));
        inputDate.sendKeys(valor);
    }

    @Quando("^Millenium - Residencia Segurada - preencher o campo numero \"(.*?)\"$")
    public void residencia_segurada_preencher_o_campo_numero(final String valor) {
        final WebElement inputDate= findElement(By.id("formResidencia:numeroResidencia"));
        inputDate.click();
        inputDate.sendKeys(valor);
    }

    @Entao("^Millenium - Residencia Segurada - clicar no botao proximo$")
    public void residencia_segurada_clicar_no_botao_proximo() {
        clicar(By.id("formResidencia:btoProximo"));
    }
}
