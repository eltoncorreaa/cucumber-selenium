#language: pt
Funcionalidade: MB011 - Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

  @runTestMB_CALCULO
  Esquema do Cenário: MB011 - Renovacao Mapfre sem Sinistro Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)
            
    #--------------------------- FLUXO DE ACESSO A TELA DE COBERTURAS ------------------------------- 
    Dado Endosso - url do sistema
    Então Endosso - clicar no menu Novo Endosso 
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    Então Endosso - clicar no passo do wizard "<passo_coberturas>"
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- COBERTURAS ---------------------------------------------   
    Quando Endosso - Coberturas - preencher o campo RCF Danos Morais e Esteticos "<rcf_danos_morais>"    
    Entao Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ----------------------------------------  
    #------Descontos/Campanha------
    Quando Endosso - Calculo/Efetivacao - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Grupo de Afinidade "<grupo_afinidade>"
    Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    
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
    Então Endosso - Calculo/Efetivacao - clicar no botao Nao sei o CEP
    Quando Endosso - Calculo/Efetivacao - preencher o campo Estado "<estado>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Cidade "<cidade>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Logradouro "<logradouro>"
    Então Endosso - Calculo/Efetivacao - clicar no botao Pesquisar CEP
    Então Endosso - Calculo/Efetivacao - selecionar o CEP
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar CEP
    Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Endereco "<numero_endereco>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Complemento "<complemento>"
    
    #------Forma de Pagamento------    
    Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Bandeira "<bandeira>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Nome Titular "<titular>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Cartao "<cartao>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Validade do Cartao "<validade_cartao>"
    #------------------------------------------------------------------------------------------------  
          	    
    Exemplos: 
      | apolice       | passo_coberturas | rcf_danos_morais | banco_relacionamento | grupo_afinidade | confirmar_alteracoes | segurado_responsavel | documento_responsavel | data_nascimento | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento   | qtd_parcelas | dia_vencimento | banco        | agencia | conta_corrente | digito_conta | operacao_conta | bandeira | titular     | cartao           | validade_cartao |
      | 3897410409631 | 5                | 20.000,00        | 000 - Não Informado  | BANCO CENTRAL   | Sim                  | Não                  | 07453618460           | 04/10/1989      | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Cartão de Crédito | CR - 1 parc  | 1              | BANCO BANESE | 1234    | 11122233       | 1            | 10             | Visa     | TESTE TESTE | 1234123412341234 | 08/17           |
