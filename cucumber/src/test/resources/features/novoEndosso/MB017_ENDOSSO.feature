#language: pt
Funcionalidade: MB017 - ENDOSSO

  @MB017_ENDOSSO
  Esquema do Cenário: MB017 - Endosso - Alteração de Importância Segurada
  
  # PRIMEIRO FLUXO - ENDOSSO COM

  	#--------------------------- FLUXO DE ACESSO A TELA DE VEICULO----------------------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURADO -----------------------------------------------
    Quando Endosso - Segurado - preencher campo renda mensal "<renda_mensal>"
    Quando Endosso - Segurado - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Segurado - preencher o campo Numero Celular "<numero_celular>"
    Quando Endosso - Segurado - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Segurado - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Endosso - Segurado - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Endosso - Segurado - preencher o campo Numero Comercial "<numero_comercial>"
    Quando Endosso - Segurado - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Segurado - preencher o campo Numero Outros "<numero_outros>"

    Então Endosso - Segurado - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURO -------------------------------------------------
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
    
    #---------------------------------------- Veiculo -----------------------------------------------
     Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- PERFIL ---------------------------------------------    
     Então Endosso - Perfil - clicar no botao proximo
     
    #--------------------------------------- COBERTURAS ---------------------------------------------
       Quando Endosso - Coberturas - preencher o campo RCF Danos Materiais "<rcf_danos_materiais>"
       Quando Endosso - Coberturas - preencher o campo RCF Danos Corporais "<rcf_danos_corporais>"
       Quando Endosso - Coberturas - preencher o campo Reembolso Despesas Extras "<reembolso_desp_extras>"  
       Entao Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
     Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
     Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
     Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
     Então Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item
     
    #------------------------------------------------------------------------------------------------
    
  
   
    
    
     Exemplos: 
     |cod_corretor | apolice       | renda_mensal    | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | profissao_principal_condutor |        chassi      | ano_fabricacao | ano_modelo | veiculo_zero_km | veiculo | renavam | fabricante | codigo_fipe | valor_referencia | data_saida | odometro | valor_nota_fiscal | veiculo_blindado |     uso	   | especifique_outros | categoria_tarifaria | isencao_imposto | chassis_remarcado | 				modalidade				| fator_ajuste | valor_ajustado_label | valor_ajustado | certificado_veiculo | alienacao_fiduciaria | numero_nota_fiscal |    placa   | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar |acessorios_som_imagem |  banco_relacionamento | grupo_afinidade | confirmar_alteracoes | segurado_responsavel | documento_responsavel | data_nascimento | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento   | qtd_parcelas | dia_vencimento | banco        | agencia | conta_corrente | digito_conta | operacao_conta | bandeira | titular     | cartao           | validade_cartao |  numero_endereco | complemento_endereco | confirmar_alteracoes | rcf_danos_materiais | rcf_danos_corporais | reembolso_desp_extras |
     |       98136 | 1460002555431 | Até R$ 1.400,00 |          11 |       12345678 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 |                      Senador |                    |                |            | 	   Não        |  	    | 		  | 		    | 005062-8	  | 				 |  	      |	 	     |	                 |		Não		    |    Particular|	  TESTE			|					  |	  Sem Isenção   |		Não		    |	  Valor de Mercado Referenciado		|	   90	   |					  |	   51.161,00   |	 TESTE TESTE	 |						|		9865213		 |	 KHA5672  | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não	 |   Sim      |               100,00 |  000 - Não Informado  | BANCO CENTRAL   | Sim                  | Não                  | 07453618460           | 04/10/1989      | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Cartão de Crédito | CR - 1 parc  | 1              | BANCO BANESE | 1234    | 11122233       | 1            | 10             | Visa     | TESTE TESTE | 1234123412341234 | 08/17           |            12345 | teste teste          |         Sim          | 150.000,00          | 150.000,00          | Contratada            |