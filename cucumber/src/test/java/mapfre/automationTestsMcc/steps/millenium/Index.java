package mapfre.automationTestsMcc.steps.millenium;

import cucumber.api.java.pt.Dado;
import mapfre.automationTestsMcc.steps.TestCommon;

public class Index extends TestCommon{

    @Dado("^Millenium - a url do sistema para nova cotacao \"(.*?)\"$")
    public void urlSistema(final String codCorretor) {
        driver.get("http://hmlj1:8684/novo-portal-web-1604/segurosgerais/massificados/residencialsuperfacil/indexResidencialSuperFacil.xhtml?cod_produto=180&cod_operacao=1&cod_canalVenda=1&cod_corretor="+ codCorretor+"&cod_cotacao=0");
    }
}
