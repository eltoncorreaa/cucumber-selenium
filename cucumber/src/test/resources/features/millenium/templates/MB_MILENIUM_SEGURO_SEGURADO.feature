#language: pt
Funcionalidade: Avaliacao do Seguro/Segurado -

  @MB_MILENIUM_SEGURO_SEGURADO
  Esquema do Cenário: Seguro/Segurado - Teste tela Seguro/Segurado
  
    Dado Millenium - a url do sistema para nova cotacao "<cod_corretor>"
    
    #------------------------------------ SEGURO/SEGURADO ---------------------------------------- 
    Quando Millenium - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Millenium - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    #Quando Millenium - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    #Quando Millenium - Segurado/Seguro - preencher o campo operador "<operador>"
    
    Quando Millenium - Segurado/Seguro - preencher o campo tipo de pessoa "<tipo_pessoa>" 
    Quando Millenium - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"    
    Quando Millenium - Segurado/Seguro - preencher o campo Nome Completo "<nome_completo>"
    Quando Millenium - Segurado/Seguro - preencher o campo Data Nascimento "<data_nascimento>"
    Quando Millenium - Segurado/Seguro - preencher o campo sexo "<sexo>"
    Quando Millenium - Segurado/Seguro - preencher o campo estado civil "<estado_civil>"
    Quando Millenium - Segurado/Seguro - preencher o campo atividade do segurado "<atividade_segurado>"
    Quando Millenium - Segurado/Seguro - preencher o campo renda mensal "<renda_mensal>"
    #Quando Millenium - Segurado/Seguro - preencher o campo orgao publico "<orgao_publico>"
    
    Quando Millenium - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Millenium - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"
    #Quando Millenium - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    #Quando Millenium - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    #Quando Millenium - Segurado/Seguro - preencher o campo DDD Outros "<ddd_outros>"
    #Quando Millenium - Segurado/Seguro - preencher o campo Numero Outros "<numero_outros>"    
    Quando Millenium - Segurado/Seguro - preencher o campo email "<email>"
    Quando Millenium - Segurado/Seguro - preencher o campo tipo de documento "<tipo_documento>"
    Quando Millenium - Segurado/Seguro - preencher o campo numero de documento "<numero_documento>"
    Quando Millenium - Segurado/Seguro - preencher o campo orgao expedidor "<orgao_expedidor>"
    Quando Millenium - Segurado/Seguro - preencher o campo data expedicao "<data_expedicao>"
    #Quando Millenium - Segurado/Seguro - preencher o campo atividade economica "<atividade_economica>"
    Quando Millenium - Segurado/Seguro - preencher o campo pais de residencia "<pais_residencia>"
    Quando Millenium - Segurado/Seguro - preencher o campo segurado responsavel pelo pagamento "<segurado_responsavel_pagamento>"
          
    Entao Millenium - Segurado/Seguro - clicar no botao proximo
    #------------------------------------------------------------------------------------------------
    #Então tiro um print screen com altura "768" e largura "1366"
    
    
    
    Exemplos: 
    | cod_corretor | tipo_seguro | tipo_calculo | inicio_vigencia | operador | tipo_pessoa | cpf_cnpj    | nome_completo | data_nascimento | sexo      | estado_civil | atividade_segurado   |  renda_mensal    | orgao_publico | ddd_residencial | numero_residencial | ddd_celular | numero_celular | ddd_outros | numero_outros |           email | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | atividade_economica | pais_residencia | segurado_responsavel_pagamento |
    | 71503        | Seguro Novo | Anual        | Data atual      |          | Física      | 11144477735 | TESTE TESTE   |        15121977 | Masculino | Solteiro     | ANALISTA DE SISTEMAS |  Até R$ 1.400,00 | Não           |             11  |       912345678    |     11      |      912245678 | 11         | 912345668     | teste@teste.com |             RG |          1234567 |  SSP - SP       | 15052000       | BANCO CENTRAL       | BRASIL          | Sim 							 |
    
    