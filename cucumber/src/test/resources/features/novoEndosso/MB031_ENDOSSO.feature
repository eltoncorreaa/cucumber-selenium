#language: pt
Funcionalidade: MB_031 - Seguro Novo (PJ, V. Outros, Perfil, Órgão Público, Débito, Responsável pagamento)

  @MB031Endosso
  Esquema do Cenário: MB_031 - Alterações Diversas

    #--------------------------- FLUXO INICIAL -----------------------------------------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- TELA DE SEGURADO -------------------------------------------------- 
    Quando Endosso - Segurado - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Segurado - preencher o campo Numero Celular "<numero_celular>"
    Quando Endosso - Segurado - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Segurado - preencher o campo Numero Residencial "<fone_residencial>"
    Quando Endosso - Segurado - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Endosso - Segurado - preencher o campo Numero Comercial "<fone_comercial>"
    Quando Endosso - Segurado - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Segurado - preencher o campo Numero Outros "<fone_outros>"
    Então Endosso - Segurado - clicar no botao proximo    
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- TELA DE SEGURO ---------------------------------------------------- 
       Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
        
       #---------------------------- TELA DE VEICULO -------------------------------------------------- 
       Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- Perfil ------------------------------------------------------------   
    Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<dispositivo_anti_furto>" "<produto>"
       Quando Endosso - Perfil - clicar no botao proximo 
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- Cobertura ---------------------------------------------------------
       Entao Endosso - Coberturas - clicar no botao Proximo   
    #------------------------------------------------------------------------------------------------
       
    #------------------------------------ CALCULO/EFETIVACAO ----------------------------------------         
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"    
    #Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
    #Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    #Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Grupo de Afinidade "<grupo_afinidade>" 
    
    #------Dados do Responsável pelo Pagamento------
    Quando Endosso - Calculo/Efetivacao - preencher o campo Segurado Responsavel Pagamento "<segurado_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo CPF CNPJ "<documento_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Data Nascimento "<data_nascimento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Sexo "<sexo>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Nome Completo "<nome_completo>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Estado Civil "<estado_civil>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Renda Mensal "<renda_mensal>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Atividade do Segurado "<profissao>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Pais de Residencia "<pais>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Fone Celular "<fone_celular>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Fone Residencial "<fone_residencial>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Fone Comercial "<fone_comercial>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Fone Outros "<fone_outros>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Tipo de Documento "<tipo_documento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Documento "<numero_documento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Orgao Expedidor "<orgao_expedidor>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Data Expedicao "<data_expedicao>"    
    Quando Endosso - Calculo/Efetivacao - preencher o campo Email "<email>" 
    
    #------Endereço do Responsável pelo Pagamento------
    Quando Endosso - Calculo/Efetivacao - preencher o campo cep "<cep>" 
    Quando Endosso - Calculo/Efetivacao - preencher o campo Estado "<estado>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Cidade "<cidade>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Logradouro "<logradouro>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Endereco "<numero_endereco>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Complemento "<complemento>" 
     
    #------Forma de Pagamento------    
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Bandeira "<bandeira>"
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Nome Titular "<titular>"
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Cartao "<cartao>"
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Validade do Cartao "<validade_cartao>"
    #------------------------------------------------------------------------------------------------  

    
  
   
    
    
     Exemplos:
      | cod_corretor | apolice       | renda_mensal  | ddd_celular | numero_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | dispositivo_anti_furto | produto | fabricante_rastreador_localizador | propriedade_rastreador | confirmar_alteracoes | segurado_responsavel | documento_responsavel | data_nascimento | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento   | qtd_parcelas | bandeira | titular     | cartao           | validade_cartao |
      | 79170       | 3897320289931 | Não Informado | 81          | 98779877       | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | Não					  |	On-line	| CIELO                             | PRÓPRIO                | Sim                  | Não                  | 07453618460           | 04/10/1989      | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Cartão de Crédito | CR - 1 parc  | Visa     | TESTE TESTE | 1234123412341234 | 08/17           |