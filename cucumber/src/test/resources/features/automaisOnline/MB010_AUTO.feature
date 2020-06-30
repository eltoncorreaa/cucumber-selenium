#language: pt
Funcionalidade: MB010_AUTO - (GOLD - Sem Aceitação - Tipo Seguro: Seguro Novo, Tipo Pessoa: Juridica, Cobertura: Colisão e Incêncio, Calculo: Normal, Pagamento: Crédito, Responsável Pagamento: Sim)

  @MB010_AUTO
  Esquema do Cenário: MB010_AUTO - (GOLD - Sem Aceitação - Tipo Seguro: Seguro Novo, Tipo Pessoa: Juridica, Cobertura: Colisão e Incêncio, Calculo: Normal, Pagamento: Crédito, Responsável Pagamento: Sim)
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------     
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Empresa "<nome_empresa>"
    Quando Auto - Segurado/Seguro - clicar na opção de orgao publico "<orgao_publico>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"    
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando Auto - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então  Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Chassis "<chassis>"
    Então  Auto - Veiculo - preencher opcao modal "<opcao_modal>"
    Então  Auto - Veiculo - clicar no botao salvar
    Então  Auto - Veiculo - preencher o campo Veiculo Zero Km "<veiculo_zero_km>"
    Quando Auto - Veiculo - preencher o campo Veiculo Blindado "<veiculo_blindado>"
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Quando Auto - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Quando Auto - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Auto - Veiculo - preencher o campo Modalidade "<modalidade>"
    Quando Auto - Veiculo - preencher o campo Fator de Ajuste "<fator_ajuste>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então  Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
   
    Exemplos:  
  | corretor | cpf_cnpj       |  nome_empresa  | orgao_publico | ddd_celular | numero_celular |ddd_residencial | numero_residencial | tipo_seguro  | tipo_calculo  | inicio_vigencia | chassis           | opcao_modal | veiculo_zero_km | veiculo_blindado | uso        | isencao_imposto | chassis_remarcado | 			modalidade			   | fator_ajuste |
  | 86790    | 17865278000124 |  TESTE TESTE   |     Não  	   |          11 |      999999999 |             11 |           88888888 | Seguro Novo  | Anual         | Data atual      | 8AJYZ59G7B3052117 | 	1	 	   | Não             | Não              | Particular |   Sem Isenção   | Não               | Valor de Mercado Referenciado     | 	  100	  |
