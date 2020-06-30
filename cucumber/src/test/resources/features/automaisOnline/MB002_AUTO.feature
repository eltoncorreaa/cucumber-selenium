#language: pt
Funcionalidade: MB_AUTO_001 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Fisica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)

  @MB002_AUTO
  Esquema do Cenário: MB_AUTO_001 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Fisica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Sinistro Ultima Vigencia "<sinistro>"
    Quando Auto - Segurado/Seguro - preencher o campo Nova Classe Bonus "<classe_bonus>"
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Completo "<nome_completo>"
    Quando Auto - Segurado/Seguro - preencher o campo Data Nascimento "<data_nascimento>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"
    Então tiro um print screen com altura "768" e largura "1366"   
    Então  Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Codigo Fipe "<cod_fipe>"
    Então Auto - Veiculo - preencher opcao modal "<num_opcao_primeiro_veiculo>"
    Então  Auto - Veiculo - clicar no botao salvar
    Quando Auto - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Auto - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"   
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Quando Auto - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Então tiro um print screen com altura "768" e largura "1366"    
    Então  Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    Então tiro um print screen com altura "768" e largura "1366"
    #-------------------------------------------------------------------------------------------------
    
    Exemplos:  
    | corretor | cpf_cnpj       | nome_completo | data_nascimento | ddd_celular | numero_celular |ddd_residencial | numero_residencial | tipo_seguro         | sinistro | classe_bonus | cod_fipe | ano_fabricacao | ano_modelo | uso  | isencao_imposto | modalidade                    | num_opcao_primeiro_veiculo |
    | 86790    | 11144477735    | TESTE TESTE   | 04101989  	  | 11          | 998779877      | 11             | 32113211           | Ren. Mapfre Seguros | Sim      | 0            | 0050482  | 1996           | 1996       | Taxi | Sem Isenção     | Valor de Mercado Referenciado | 1						  |