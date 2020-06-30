#language: pt
Funcionalidade: MB015 - ENDOSSO

  @MB015_ENDOSSO
  Esquema do Cenário: MB015 - Endosso - Alteração de Importância Segurada

    #--------------------------- FLUXO DE ACESSO A TELA DE VEICULO----------------------------------
    Dado   Endosso - login no sistema "<cod_corretor>"
    Então  Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então  Endosso - clicar no botao Localizar Apolice
    Quando tiro um  print screen
    Então  Endosso - clicar no botao Alterar Apolice	
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURADO -----------------------------------------------
    Quando Endosso - Segurado - preencher Atividade que Empresa Exerce "<atividade_empresa>"
    Quando Endosso - Segurado - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Segurado - preencher o campo Numero Celular "<numero_celular>"
    Quando Endosso - Segurado - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Segurado - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Endosso - Segurado - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Endosso - Segurado - preencher o campo Numero Comercial "<numero_comercial>"
    Quando Endosso - Segurado - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Segurado - preencher o campo Numero Outros "<numero_outros>"
    Quando tiro um  print screen
    Então  Endosso - Segurado - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURO -------------------------------------------------
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
    
    #---------------------------------------- Veiculo -----------------------------------------------
    Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- PERFIL ---------------------------------------------    
    Quando Endosso - Perfil - preencher veiculo possui cabine suplementar "<cabine_suplementar>"
    Quando tiro um  print screen
    Então  Endosso - Perfil - clicar no botao proximo
     
    #--------------------------------------- COBERTURAS ---------------------------------------------    
    Quando Endosso - Coberturas - preencher o campo RCF Danos Morais e Esteticos "<rcf_danos_morais>"
    Quando tiro um  print screen
    Entao  Endosso - Coberturas - clicar no botao Proximo    
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
    Então Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item
    Quando tiro um  print screen
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------- SEGURO (ITEM 2) ------------------------------------------
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------

	#------------------------------------ VEICULO (ITEM 2) ------------------------------------------
    Quando Endosso - Veiculo - preencher o campo Chassi "<chassi>"
    Entao  Endosso - Veiculo - preencher a primeira opcao modal
	Entao  Endosso - Veiculo - clicar no botao salvar
    Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
    Quando Endosso - Veiculo - preencher o campo Placa "<placa>"
	Quando Endosso - Veiculo - preencher o campo CEP "<cep>"
	Quando tiro um  print screen
    Então  Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ PERFIL (ITEM 2) -------------------------------------------
    Quando Endosso - Perfil - relacao segurado proprietario legal "<relacao_segurado>"  
    Quando Endosso - Perfil - preencher tipo carroceria "<tipo_carroceria>"
    Quando Endosso - Perfil - preencher carga transportada "<carga_transportada>"
    Quando Endosso - Perfil - preencher equipamento "<equipamento>"
    Quando Endosso - Perfil - preencher veiculo possui cabine suplementar "<cabine_suplementar>"
    Quando tiro um  print screen
    Então  Endosso - Perfil - clicar no botao proximo
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- COBERTURAS ---------------------------------------------    
    Quando Endosso - Coberturas - preencher o campo Franquia "<franquia>"
    Quando tiro um  print screen
    Entao  Endosso - Coberturas - clicar no botao Proximo    
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ----------------------------------------
    Então  Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então  Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    Quando tiro um  print screen
        
    #------Forma de Pagamento------    
    Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    Então Endosso - Calculo/Efetivacao - clicar Efetivar Proposta
    Quando tiro um  print screen
    Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Calculo
    Então Endosso - Calculo/Efetivacao - print impressao
    Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Proposta
    Então Endosso - Calculo/Efetivacao - print impressao
    #------------------------------------------------------------------------------------------------
    
     Exemplos: 
     | cod_corretor | apolice       | renda_mensal    | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | profissao_principal_condutor | chassi             | ano_fabricacao | ano_modelo | veiculo_zero_km | veiculo | renavam | fabricante | codigo_fipe | valor_referencia | data_saida | odometro | valor_nota_fiscal | veiculo_blindado | uso                 | especifique_outros | categoria_tarifaria | isencao_imposto | chassis_remarcado | modalidade                                 | fator_ajuste         | valor_ajustado_label | valor_ajustado      | certificado_veiculo | alienacao_fiduciaria | numero_nota_fiscal    |    placa     | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar |acessorios_som_imagem |  banco_relacionamento | grupo_afinidade | confirmar_alteracoes | segurado_responsavel | documento_responsavel | data_nascimento | sexo      | nome_completo | estado_civil | renda_mensal  | profissao       | pais             | ddd_celular     | fone_celular     | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento        | qtd_parcelas | dia_vencimento | banco          | agencia | conta_corrente | digito_conta | operacao_conta | bandeira | titular     | cartao           | validade_cartao |  numero_endereco | complemento_endereco | confirmar_alteracoes |  atividade_empresa | cabine_suplementar | rcf_danos_morais | relacao_segurado               | tipo_carroceria | carga_transportada | equipamento | cabine_suplementar | franquia |
     |       64689  | 2319000098231 | 1.400,00        |          81 | 98765645       |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 |                      Senador | 9BFV2UHG14BB33491  |                |            |          Não    |         |          |           | 005062-8    |                  |            |          |                   |           Não    | Transporte de Carga | TESTE              |                     | Sem Isenção     | Não               | Valor de Mercado Referenciado              |         90           |                      |         51.161,00   | TESTE TESTE         |                      |   9865213             |     KHA5672  | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não     |   Sim      |               100,00 |  000 - Não Informado  | BANCO CENTRAL   | Sim                  | Não                  | 07453618460           | 04/10/1989      | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO      | BRASIL           | 81              | 98779877         | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Ficha de Compensação   | 1 FCA        | 1              | BANCO BRADESCO | 02879   | 60590          | 5            | 10             | Visa     | TESTE TESTE | 1234123412341234 | 08/17           |            12345 | teste teste          |         Sim          | ACADEMIAS DE DANÇA | Não                | 10.000,00        | Próprio; proprietário ou sócio | Aberto          | ABRASIVOS          | Outros      | Não                | Normal   | 