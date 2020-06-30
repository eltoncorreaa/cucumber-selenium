#language: pt
Funcionalidade: MB011 - Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

  @runTestMB_ENDOSSO_3
  Esquema do Cenário: MB011 - Renovacao Mapfre sem Sinistro Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

    #--------------------------- FLUXO DE ACESSO A TELA DE VEICULO----------------------------------
    Dado Endosso - url do sistema
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    Então Endosso - clicar no passo do wizard "<passo_coberturas>"
    #------------------------------------------------------------------------------------------------

    #---------------------------------------- Veiculo -----------------------------------------------
    Quando Endosso - Veiculo - preencher o campo Chassi "<chassi>"
    Quando Endosso - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Endosso - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"
    Quando Endosso - Veiculo - preencher o campo Veiculo Zero Km "<veiculo_zero_km>"
    Quando Endosso - Veiculo - preencher o campo Veiculo "<veiculo>"
    Quando Endosso - Veiculo - preencher o campo Renavam "<renavam>"
    Quando Endosso - Veiculo - preencher o campo Fabricante "<fabricante>"
    Quando Endosso - Veiculo - preencher o campo Codigo Fipe "<codigo_fipe>"
    Quando Endosso - Veiculo - preencher o campo Valor de Referencia "<valor_referencia>"
    Quando Endosso - Veiculo - preencher o campo Data Saida "<data_saida>"
    Quando Endosso - Veiculo - preencher o campo Odometro "<odometro>"
    Quando Endosso - Veiculo - preencher o campo Veiculo Blindado "<veiculo_blindado>"
    Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
    Quando Endosso - Veiculo - preencher o campo Especifique categoria tarifaria "<especifique_outros>"
    Quando Endosso - Veiculo - preencher o campo Categoria tarifaria "<categoria_tarifaria>"
    Quando Endosso - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Quando Endosso - Veiculo - preencher o campo Valor Nota Fiscal "<valor_nota_fiscal>"
    Quando Endosso - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Endosso - Veiculo - preencher o campo Modalidade "<modalidade>"
    Quando Endosso - Veiculo - preencher o campo Fator de Ajuste "<fator_ajuste>"
    Quando Endosso - Veiculo - preencher o campo Valor Ajustado Label "<valor_ajustado_label>"
    Quando Endosso - Veiculo - preencher o campo Valor Ajustado "<valor_ajustado>"
    Quando Endosso - Veiculo - preencher o campo Certificado do veiculo "<certificado_veiculo>"
    Quando Endosso - Veiculo - preencher o campo Alienacao Fiduciaria "<alienacao_fiduciaria>"
    Quando Endosso - Veiculo - preencher o campo Numero Nota Fiscal "<numero_nota_fiscal>"
    Quando Endosso - Veiculo - preencher o campo Placa "<placa>"
    Quando Endosso - Veiculo - selecionar ABS "<abs>"
    Quando Endosso - Veiculo - selecionar Cambio automatico "<cambio_automatico>"
    Quando Endosso - Veiculo - selecionar Retrovisor eletrico "<retrovisor_eletrico>"
    Quando Endosso - Veiculo - selecionar Travas eletricas "<travas_eletricas>"
    Quando Endosso - Veiculo - selecionar Air bag "<air_bag>"
    Quando Endosso - Veiculo - selecionar Computador de bordo "<computador_bordo>"
    Quando Endosso - Veiculo - selecionar Rodas de liga leve "<rodas_liga>"
    Quando Endosso - Veiculo - selecionar Vidros eletricos "<vidros_eletricos>"
    Quando Endosso - Veiculo - selecionar Ar condicionado "<ar_condicionado>"
    Quando Endosso - Veiculo - selecionar Direcao eletrica "<direcao_eletrica>"
    Quando Endosso - Veiculo - selecionar Sensor de estacionamento "<sensor_estacinamento>"
    Quando Endosso - Veiculo - selecionar Banco de couro "<banco_couro>"
    Quando Endosso - Veiculo - selecionar Direcao hidraulica "<hidraulica>"
    Quando Endosso - Veiculo - selecionar Teto solar "<teto_solar>"
    Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------

    Exemplos:
      | apolice       | passo_coberturas |       chassi      | ano_fabricacao | ano_modelo | veiculo_zero_km | veiculo | renavam | fabricante | codigo_fipe | valor_referencia | data_saida | odometro | valor_nota_fiscal | veiculo_blindado |     uso	   | especifique_outros | categoria_tarifaria | isencao_imposto | chassis_remarcado | 				modalidade				| fator_ajuste | valor_ajustado_label | valor_ajustado | certificado_veiculo | alienacao_fiduciaria | numero_nota_fiscal |    placa   | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar |
      | 3897410409631 | 3                | KNALN414BC5062125 |      2011      |    2012    | 	   Não       |  	   | 		 | 			  | 			| 				   |  23082016	|	 20	   |	  4558320	   |		Não		  | Particular |	  TESTE			|					  |	  Sem Isenção   |		Não		    |	  Valor de Mercado Referenciado		|	   90	   |					  |	   51.161,00   |	 TESTE TESTE	 |						|		9865213		 |	 KHA5672  | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não	 |   Sim      |
