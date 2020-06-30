#language: pt
Funcionalidade: MB030 - ENDOSSO

  @MB030_ENDOSSO
  Esquema do Cenário: MB030 - Endosso - Substituição de Veículo - GOLD - 
  
  # PRIMEIRO FLUXO - ENDOSSO COM

  	#--------------------------- FLUXO DE ACESSO A TELA DE VEICULO----------------------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURADO -----------------------------------------------
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
       Entao Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
     Então Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item
    #------------------------------------------------------------------------------------------------
    

    #SEGUNDO FLUXO - MULTIITEM
     
    #--------------------------------------- SEGURO -------------------------------------------------
    
    Então Endosso/Seguro - preencher o campo Tipo Seguro "<tipo_seguro>"
    Então Endosso/Seguro - preencher o campo Controle de identificação "<controle_identificacao>"
    Então Endosso/Seguro - preencher o campo Numero Apolice Anterior "<apolice_anterior>" 
    Então Endosso/Seguro - preencher o campo Numero Item Apolice "<item_apolice>"
    Então Endosso/Seguro - preencher o campo data Apolice Anterior "<data_apolice_anterior>"
    Quando Endosso/Seguro - pergunta o veículo é o mesmo da apólice anterior "<mesmo_veiculo_apolice_anterior>" 
    Quando Endosso/Seguro - pergunta foram incluidas corbeturas opicionais diferentes da apolice anterior "<foram_incluidos_corbeturas>"  
    Quando Endosso/Seguro - pergunta Renovação do próprio corretor "<renovacao_proprio_corretor>"   
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
     
   # -------------------------------------- VEÍCULO -----------------------------------------------------
   
     Quando Endosso - Veiculo - preencher o campo Chassi "<chassi>"
     Então Endosso - Veiculo - preencher a primeira opcao modal
     Então Endosso - Veiculo - clicar no botao salvar
     Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
     Quando Endosso - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
     Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
     
   # ------------------------------------- PERFIL -------------------------------------------------------
    Quando Endosso - Perfil - preencher pergunta com perfil "<com_perfil>"
    Quando Endosso - Perfil - relacao segurado proprietario legal "<relacao_segurado_proprietario>" "<produto>" "<com_perfil>"
    Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<dispositivo_anti_furto>" "<produto>" "<com_perfil>" 
    Quando Endosso - Perfil - preenche cep "<cep>" "<produto>" "<com_perfil>"
    Então Endosso - Perfil - clicar no botao proximo 
    
   # ------------------------------------COBERTURAS ----------------------------------------------------
    Quando Endosso - Coberturas - preencher o campo Franquia "<cob_franquia>"
    Entao Endosso - Coberturas - clicar no botao Proximo  
    
   #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
    Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
   
     
     
    
    
     Exemplos: 
     |cod_corretor | apolice       | renda_mensal    | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | profissao_principal_condutor |        chassi      | ano_fabricacao | ano_modelo | veiculo_zero_km | veiculo | renavam | fabricante | codigo_fipe | valor_referencia | data_saida | odometro | valor_nota_fiscal | veiculo_blindado |     uso	   | especifique_outros | categoria_tarifaria | isencao_imposto | chassis_remarcado | 				modalidade				| fator_ajuste | valor_ajustado_label | valor_ajustado | certificado_veiculo | alienacao_fiduciaria | numero_nota_fiscal |    placa   | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar |acessorios_som_imagem |  banco_relacionamento | grupo_afinidade | confirmar_alteracoes | segurado_responsavel | documento_responsavel | data_nascimento | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento   | qtd_parcelas | dia_vencimento | banco        | agencia | conta_corrente | digito_conta | operacao_conta | bandeira | titular     | cartao           | validade_cartao |  numero_endereco | complemento_endereco | confirmar_alteracoes | tipo_seguro         | controle_identificacao | apolice_anterior | item_apolice | data_apolice_anterior | mesmo_veiculo_apolice_anterior | foram_incluidos_corbeturas | renovacao_proprio_corretor | chassi            | uso          | isencao_imposto | cep       | relacao_segurado_proprietario  | dispositivo_anti_furto    | cob_franquia | confirmar_alteracoes | produto | com_perfil |
     |       29680 | 3355042421931 | Até R$ 1.400,00 |          11 |       12345678 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 |                      Senador |  8AJYZ59G7B3052117 |                |            | 	   Não         |  	     | 		   | 		    |       	  | 				 |  	      |	 	     |	                 |		Não		    |    Particular|	  TESTE			|					  |	  Sem Isenção   |		Não		    |	  Valor de Mercado Referenciado		|	   90	   |					  |	   51.161,00   |	 TESTE TESTE	 |						|		9865213		 |	 KHA5672  | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não	 |   Sim      |               100,00 |  000 - Não Informado  | BANCO CENTRAL   | Sim                  | Não                  | 07453618460           | 04/10/1989      | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Cartão de Crédito | CR - 1 parc  | 1              | BANCO BANESE | 1234    | 11122233       | 1            | 10             | Visa     | TESTE TESTE | 1234123412341234 | 08/17           |            12345 | teste teste          |         Sim          | Ren. Mapfre Seguros |         62301T2ZBBY539 |    4111000300131 |            1 |              26072016 |                            Não |                        Não |                        Não | 8AJYZ59G7B3052117 | Particular   |     Sem Isenção | 8465312   | Próprio; proprietário ou sócio |                    Não    |       Normal |                  Sim | Gold    | Não        |