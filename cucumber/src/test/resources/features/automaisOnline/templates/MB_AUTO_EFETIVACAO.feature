#language: pt
Funcionalidade: MB_Teste - Automais. Realizarcotacao e imprimir.

  @MB_AUTO_EFETIVACAO
  Esquema do Cenário: MB_Teste - Automais. Realizarcotacao e imprimir.
  
    #------------------------------ FLUXO DE ACESSO A TELA DE EFETIVACAO ------------------------------
    Dado  Auto - Segurado/Seguro - a url do sistema
    Então Auto - Comum - acessar passo "<passo_calculo>"
    Então Auto - Calculo - clicar no botão proposta
    Então Auto - Comum - acessar passo "<passo_efetivacao>" 
    #--------------------------------------------------------------------------------------------------
    
    #------------------------------------------- EFETIVACAO -------------------------------------------
    #------- RESPONSAVEL -----
    Quando Auto - Efetivacao - preencher o campo Segurado Responsavel Pagamento "<resp_pagamento>"
    Quando Auto - Efetivacao - preencher o campo CPF CNPJ "<cpf_cnpj>"
    Quando Auto - Efetivacao - preencher o campo Data Nascimento "<dt_nasc>"
    Quando Auto - Efetivacao - preencher o campo Sexo "<sexo>"
    Quando Auto - Efetivacao - preencher o campo Nome Completo "<nome_completo>"
    Quando Auto - Efetivacao - preencher o campo Estado Civil "<estado_civil>"
    Quando Auto - Efetivacao - preencher o campo Atividade do Segurado "<profissao>"
    Quando Auto - Efetivacao - preencher o campo Pais de Residencia "<pais>"
    Quando Auto - Efetivacao - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Efetivacao - preencher o campo Fone Celular "<fone_celular>"
    Quando Auto - Efetivacao - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Efetivacao - preencher o campo Fone Residencial "<fone_residencial>"
    Quando Auto - Efetivacao - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Auto - Efetivacao - preencher o campo Fone Comercial "<fone_comercial>"
    Quando Auto - Efetivacao - preencher o campo DDD Outros "<ddd_outros>"
    Quando Auto - Efetivacao - preencher o campo Fone Outros "<fone_outros>"
    Quando Auto - Efetivacao - preencher o campo Tipo de Documento "<tipo_documento>"
    Quando Auto - Efetivacao - preencher o campo Numero do Documento "<numero_documento>"
    Quando Auto - Efetivacao - preencher o campo Orgao Expedidor "<orgao_expedidor>"
    Quando Auto - Efetivacao - preencher o campo Data Expedicao "<data_expedicao>"    
    Quando Auto - Efetivacao - preencher o campo Email "<email>" 
               
    #------- PAGAMENTO -------
    Quando Auto - Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Auto - Efetivacao - preencher o campo Quantidade de Parcelas "<qtd_parcelas>"
    Quando Auto - Efetivacao - preencher o campo Dia preferencial para vencimento "<dia_pagamento>"
    Quando Auto - Efetivacao - preencher o campo Banco "<banco>"
    Quando Auto - Efetivacao - preencher o campo Agencia "<agencia>"
    Quando Auto - Efetivacao - preencher o campo Digito Agencia "<digito_agencia>"
    Quando Auto - Efetivacao - preencher o campo Conta Corrente "<conta>"
    Quando Auto - Efetivacao - preencher o campo Digito Conta "<digito_conta>"
    
    #------Endereço do Responsável pelo Pagamento------
    Então  Auto - Efetivacao - clicar no botao Nao sei o CEP
    Quando Auto - Efetivacao - preencher o campo Estado "<estado>"
    Quando Auto - Efetivacao - preencher o campo Cidade "<cidade>"
    Quando Auto - Efetivacao - preencher o campo Logradouro "<logradouro>"
    Então  Auto - Efetivacao - clicar no botao Pesquisar CEP
    Então  Auto - Efetivacao - selecionar o CEP
    Então  Auto - Efetivacao - clicar no botao Confirmar CEP
    Quando Auto - Efetivacao - preencher o campo Numero do Endereco "<numero_endereco>"
    Quando Auto - Efetivacao - preencher o campo Complemento "<complemento>"
    #--------------------------------------------------------------------------------------------------

    Exemplos: 
    | passo_calculo   | passo_efetivacao | resp_pagamento | cpf_cnpj    | dt_nasc    | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento         | qtd_parcelas     | dia_pagamento | banco          | agencia | digito_agencia | conta  | digito_conta | operacao_conta |
    | Valor do Seguro | Efetivação       | Não            | 07453618460 | 04/10/1989 | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Ficha Comp. + Deb.Conta | 1 FCA + 1 debito | 11            | BANCO BRADESCO | 1234    | 1              | 123456 | 1            |  12            |
