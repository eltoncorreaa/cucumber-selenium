#language: pt
Funcionalidade: MB_AUTO_001 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Fisica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)

  @MB011_AUTO
  Esquema do Cenário: MB_AUTO_001 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Fisica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Sinistro Ultima Vigencia "<sinistro>"
    Quando Auto - Segurado/Seguro - preencher o campo Nova Classe Bonus "<classe_bonus>"
    Quando Auto - Segurado/Seguro - preencher o campo Seguradora Anterior "<seguradora>"
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Empresa "<nome_empresa>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"    
    Então  Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Codigo Fipe "<cod_fipe>"
    Quando Auto - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Auto - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"   
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"   
    Então  Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
    
    Exemplos:  
    | corretor | cpf_cnpj       | nome_empresa | data_nascimento | ddd_celular | numero_celular |ddd_residencial | numero_residencial | tipo_seguro    | sinistro | classe_bonus | seguradora | cod_fipe | ano_fabricacao | ano_modelo | uso                 |
    | 86790    | 51658246000196 | TESTE TESTE  | 04101989  	   | 11          | 998779877      | 11             | 32113211           | Ren. Congênere | Sim      | 0            | AZUL       | 5040116  | 2001           | 2001       | Transporte de Carga |