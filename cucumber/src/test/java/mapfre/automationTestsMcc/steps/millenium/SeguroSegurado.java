package mapfre.automationTestsMcc.steps.millenium;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import mapfre.automationTestsMcc.steps.TestCommon;

public class SeguroSegurado extends TestCommon {


    @Quando("^Millenium - Segurado/Seguro - preencher o campo Tipo de Seguro \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_Tipo_de_Seguro(final String tipoSeguro) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:tipoSeguro"), tipoSeguro);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo Tipo de Calculo \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_Tipo_de_Calculo(final String tipoCalculo) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:tipoCalculo"), tipoCalculo);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo Inicio Vigencia \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_Inicio_Vigencia(final String inicioVigencia) {
        final WebElement inputDate= findElement(By.id("formSeguroResidencialSuperFacil:inicioVigencia"));
        inputDate.click();
        if (inicioVigencia.equalsIgnoreCase("Data atual")) {
            inputDate.sendKeys(getDateTime());
        } else {
            inputDate.sendKeys(inicioVigencia);
        }
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo operador \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_operador(final String operador) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:operador"), operador);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo tipo de pessoa \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_tipo_pessoa(final String tipoPessoa) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:tipoPessoa"), tipoPessoa);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo cpf/cpnj \"(.*?)\"$")
    public void preencherCampoCpfCnpj(final String valor) {
        final WebElement element = preencherInput(By.id("formSeguroResidencialSuperFacil:cpf"), valor);
        element.sendKeys(Keys.TAB);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo Nome Completo \"(.*?)\"$")
    public void preencher_campo_nome_completo(final String valor) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:NomeCompleto"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo Data Nascimento \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_Data_Nascimento(final String valor) {
        final WebElement inputDate= findElement(By.id("formSeguroResidencialSuperFacil:dataNascimento"));
        inputDate.click();
        inputDate.sendKeys(valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo sexo \"(.*?)\"$")
    public void preencher_campo_sexo(final String valor) {
        if (valor.equalsIgnoreCase("Masculino")) {
            clicar(By.id("uniform-formSeguroResidencialSuperFacil:sexo:0"));
        } else {
            clicar(By.id("uniform-formSeguroResidencialSuperFacil:sexo:1"));
        }
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo estado civil \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_estado_civil(final String valor) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:estadoCilvil"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo atividade do segurado \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_atividade_segurado(final String valor) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:AtividadeExercidaCombo"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo renda mensal \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_renda_mensal(final String valor) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:RendaMensalCombo"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo orgao publico \"(.*?)\"$")
    public void preencherCampoOrgaoPublico(final String valor) {
        if (valor.equalsIgnoreCase("sim")) {
            clicar(By.id("uniform-formSeguroResidencialSuperFacil:orgaoPublico:0"));
        } else {
            clicar(By.id("uniform-formSeguroResidencialSuperFacil:orgaoPublico:1"));
        }
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo DDD Residencial \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_DDD_residencial(final String ddd) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:TelefoneContatoDDDRes"), ddd);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo Numero Residencial \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_Numero_Residencial(final String numeroCelular) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:TelefoneContatoRes"), numeroCelular);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo DDD Celular \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_DDD_Celular(final String ddd) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:TelefoneContatoDDDCel"), ddd);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo Numero Celular \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_Numero_Celular(final String numeroCelular) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:TelefoneContatoCel"), numeroCelular);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo DDD Outros \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_DDD_outros(final String ddd) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:TelefoneContatoDDDOutros"), ddd);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo Numero Outros \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_Numero_outros(final String numeroCelular) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:TelefoneContatoOutros"), numeroCelular);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo email \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_email(final String valor) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:email"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo tipo de documento \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_tipo_documento(final String valor) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:TipoDocumentoCombo"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo numero de documento \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_numero_documento(final String valor) {
        preencherInput(By.id("formSeguroResidencialSuperFacil:NumeroDocumento"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo orgao expedidor \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_orgao_expedidor(final String valor) {
        final WebElement comboBox= findElement(By.id("formSeguroResidencialSuperFacil:orgaoExpedidorCombo"));
        final Select select = new Select(comboBox);
        select.selectByVisibleText(valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo data expedicao \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_data_expedicao(final String valor) {
        final WebElement inputDate= findElement(By.id("formSeguroResidencialSuperFacil:dataExpedicao"));
        inputDate.click();
        inputDate.sendKeys(valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo atividade economica \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_atividade_economica(final String valor) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:atividadeEconomica"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo pais de residencia \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_pais_residencia(final String valor) {
        preencherSelect(By.id("formSeguroResidencialSuperFacil:paisResidencia"), valor);
    }

    @Quando("^Millenium - Segurado/Seguro - preencher o campo segurado responsavel pelo pagamento \"(.*?)\"$")
    public void segurado_seguro_preencher_o_campo_responsavel_pelo_pagamento(final String valor) {
        if (valor.equalsIgnoreCase("sim")) {
            clicar(By.id("formSeguroResidencialSuperFacil:responsavelPagamento:0"));
        } else {
            clicar(By.id("formSeguroResidencialSuperFacil:responsavelPagamento:1"));
        }
    }

    @Entao("^Millenium - Segurado/Seguro - clicar no botao proximo$")
    public void segurado_seguro_clicar_no_botao_proximo() {
        clicar(By.id("formSeguroResidencialSuperFacil:btoProximo"));
    }

    private String getDateTime() {
        final DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        final Date date = new Date();
        return dateFormat.format(date);
    }

}
