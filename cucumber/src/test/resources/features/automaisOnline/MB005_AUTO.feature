#language: pt
Funcionalidade: MB_AUTO_005 - (Renovação Brasil Veículos Sem Sinistro, CAMINHÃO, Sem Aceitação, Colisão e Incêncio, FCA, Normal, RC)

  @MB005_AUTO
  Esquema do Cenário: MB_AUTO_005 - (Renovação Brasil Veículos Sem Sinistro, CAMINHÃO, Sem Aceitação, Colisão e Incêncio, FCA, Normal, RC)
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando Auto - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    Quando Auto - Segurado/Seguro - preencher o campo Sinistro Ultima Vigencia "<sinistro_ultima_vigencia>"
    Quando Auto - Segurado/Seguro - preencher o campo Nova Classe Bonus "<nova_classe_bônus>"
    Quando Auto - Segurado/Seguro - preencher o campo Renovacao Propio Corretor "<renovação_proprio_corretor>"
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"       
    Quando Auto - Segurado/Seguro - preencher o campo Nome Completo "<nome_completo>"
    Quando Auto - Segurado/Seguro - preencher o campo Data Nascimento "<data_nascimento>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Chassis "<chassi>"
    Então Auto - Veiculo - preencher opcao modal "<posicao_modal>"
    Então Auto - Veiculo - clicar no botao salvar
    Quando Auto - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Auto - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"   
    Então Auto - Veiculo - preencher o campo Veiculo Zero Km "<veiculo_zero_km>"
    #Quando Auto - Veiculo - preencher o campo Veiculo Blindado "<veiculo_blindado>"
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    #Quando Auto - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Quando Auto - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Auto - Veiculo - preencher o campo Modalidade "<modalidade>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- Avaliacao do Seguro - PERFIL -------------------------------------
    Quando Auto - Avaliacao Seguro - preencher o campo Segurado Principal Condutor "<segurado_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Sexo Principal Condutor "<sexo_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Estado Civil Principal Condutor "<estado_civil_princial_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Tempo de Habilitacao do Principal Condutor "<tempo_habilitacao_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_reside_pessoas_menores_26_anos>"
    Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Possui Filhos ou Funcionarios Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_filhos_funcionarios>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Segurado e Utilizado mais que Dois Dias da Semana "<veiculo_segurado_utilizado_mais_que_dois_dias_semana>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Possui Anti-Furto, Rastreador, Bloqueador ou Localizador "<veiculo_antifurto_rastreador_bloqueador_localizador>"
    Quando Auto - Avaliacao Seguro - preencher tipo carroceria "<tipo_carroceria>"
    Quando Auto - Avaliacao Seguro - preencher carga transportada "<carga_transportada>"
    Quando Auto - Avaliacao Seguro - preencher equipamento "<equipamento>"
    Quando Auto - Avaliacao Seguro - preencher veiculo possui cabine complementar "<cabine_suplementar>"
    Quando Auto - Avaliacao Seguro - preencher o campo CEP "<cep>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- COBERTURA ----------------------------------------------
    Quando Auto - Coberturas - preencher o campo Cobertura de Casco "<cob_casco>"
    Quando Auto - Coberturas - preencher o campo Reembolso Despesas Extras "<reembolso_despesas_extras>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Coberturas - clicar no botão Proximo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- CALCULO ------------------------------------------------
    Quando Auto - Calculo - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"
    Quando Auto - Calculo - preencher o campo Operacao "<operacao>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Efetivacao - clicar no botao Adicionar Item
 
    #-------------------------------------------------------------------------------------------------
    
    ###################################### SEGUNDO ITEM ##################################################
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Chassis "<chassi>"
    Então Auto - Veiculo - preencher opcao modal "<posicao_modal>"
    Então Auto - Veiculo - clicar no botao salvar
    Quando Auto - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Auto - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"   
    Então Auto - Veiculo - preencher o campo Veiculo Zero Km "<veiculo_zero_km>"
    #Quando Auto - Veiculo - preencher o campo Veiculo Blindado "<veiculo_blindado>"
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    #Quando Auto - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Quando Auto - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Auto - Veiculo - preencher o campo Modalidade "<modalidade>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- Avaliacao do Seguro - PERFIL -------------------------------------
    Quando Auto - Avaliacao Seguro - preencher pergunta com perfil "<comPerfil>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
    Quando Auto - Avaliacao Seguro - preencher tipo carroceria "<tipo_carroceria>"
    Quando Auto - Avaliacao Seguro - preencher carga transportada "<carga_transportada>"
    Quando Auto - Avaliacao Seguro - preencher equipamento "<equipamento>"
    Quando Auto - Avaliacao Seguro - preencher veiculo possui cabine complementar "<cabine_suplementar>"
    Quando Auto - Avaliacao Seguro - preencher o campo CEP "<cep>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- COBERTURA ----------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Coberturas - clicar no botão Proximo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- CALCULO -----------------------------------------------
    Então Auto - Calculo - clicar no botao Calcular
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Calculo - clicar no botão proposta
    #-------------------------------------------------------------------------------------------------
     
    #------------------------------------ SEGURADO ---------------------------------------------------
    Quando Auto - Efetivacao - preencher o campo renda mensal "<renda_mensal>"
    Quando Auto - Segurado - preencher campo profissao "<profissao>"
    Quando Auto - Segurado - preencher pais de residencia "<pais>"    
    Quando Auto - Segurado - preencher tipo de documento "<tipo_documento>"
    Quando Auto - Segurado - preencher numero do documento "<numero_documento>"
    Quando Auto - Segurado - preencher orgao expedidor "<orgao_expedidor>"
    Quando Auto - Segurado - preencher data de expedicao "<data_expedicao>"  
    Quando Auto - Segurado - preencher cep "<cep>"
    Quando Auto - Segurado - preencher numero "<numero_endereco>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURO -----------------------------------------------------
    Quando Auto - Seguro - preencher campo controle identificacao "<controle_identificacao>"
    Quando Auto - Seguro - preencher o campo Numero Apolice Anterior "<apolice_anterior>"
    Quando Auto - Seguro - preencher o campo Numero Item Apolice "<num_item_apolice>"
    Quando Auto - Seguro - pergunta o veículo é o mesmo da apólice anterior "<veiculo_apolice_anterior>"
    Quando Auto - Seguro - preencher campo data Apolice Anterior "<data_apolice_anterior>"
    Quando Auto - Seguro - pergunta foram incluídas coberturas opcionais diferentes da apólice anterior "<coberturas_opcionais_diferentes>"
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Seguro - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #--------------------------------- VEICULO/CONDUTOR ----------------------------------------------
    Quando Auto - Veiculo/Condutor - preencher o campo Placa "<placa>"
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Veiculo/Condutor - clicar no botao proximo
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Veiculo/Condutor - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURO -----------------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Seguro - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #--------------------------------- VEICULO/CONDUTOR ----------------------------------------------
    Quando Auto - Veiculo/Condutor - preencher o campo Placa "<placa>"
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Veiculo/Condutor - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #----------------------------------- EFETIVACAO --------------------------------------------------
    Quando Auto - Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Auto - Efetivacao - preencher o campo Quantidade de Parcelas "<qtd_parcelas>"
    Quando Auto - Efetivacao - preencher o campo Dia preferencial para vencimento "<dia_vencimento>"
    Quando Auto - Efetivacao - preencher o campo Banco "<banco>"
    Quando Auto - Efetivacao - preencher o campo Agencia "<numero_agencia>"
    Quando Auto - Efetivacao - preencher o campo Digito Agencia "<digito_agencia>"
    Quando Auto - Efetivacao - preencher o campo Conta Corrente "<numero_conta>"
    Quando Auto - Efetivacao - preencher o campo Digito Conta "<digito_conta>"
	Então Auto - Efetivacao - clicar no botao Efetivar
	Então tiro um print screen com altura "768" e largura "1366"
	#-------------------------------------------------------------------------------------------------
    
    Exemplos:  
  	| corretor | cpf_cnpj      | nome_completo  | data_nascimento | ddd_celular | numero_celular |ddd_residencial | numero_residencial | tipo_seguro           | tipo_calculo  | inicio_vigencia | sinistro_ultima_vigencia | nova_classe_bônus | renovação_proprio_corretor | chassi            | cod_fipe | ano_fabricacao | ano_modelo |  veiculo_zero_km | uso                 | chassis_remarcado | modalidade                    | segurado_principal_condutor | sexo_principal_condutor | estado_civil_princial_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor | residencia_principal_condutor | principal_condutor_reside_pessoas_menores_26_anos | principal_condutor_filhos_funcionarios | quantidade_veiculos_residencia | cep       | relacao_segurado_com_o_proprietario_legal_do_veiculo | veiculo_segurado_utilizado_mais_que_dois_dias_semana | veiculo_alienado_leasing | veiculo_antifurto_rastreador_bloqueador_localizador | garagem_estacionamento_fechado_veiculo | banco_relacionamento | msgSucesso                    | franquia | 	 sexo 	 | nome_completo_segurado | 	estado_civil	 | renda_mensal    | profissao | pais_residencia | tipo_documento | ddd_celular_segurado | numero_celular_segurado | ddd_residencial_segurado | numero_residencial_segurado | numero_documento | orgao_expedidor | data_de_expedicao |           email | numero_endereco |  placa  | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar | responsavel | chassi_modal      | observacao          |  posicao_modal | tipo_carroceria | carga_transportada | equipamento | cob_casco                  | cabine_suplementar | reembolso_despesas_extras | banco_relacionamento | operacao | comPerfil |  renda_mensal  | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | controle_identificacao | apolice_anterior | num_item_apolice | veiculo_apolice_anterior | coberturas_opcionais_diferentes | placa   | segurado_responsavel_pagamento | dt_nasc    | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cpf_responsavel_pagamento | data_apolice_anterior |     forma_pagamento     |   qtd_parcelas   | dia_vencimento |       banco     | numero_agencia | digito_agencia | numero_conta | digito_conta | item_selecao |
  	|  86790   | 67721872103   | TESTE TESTE    |  14101970       |          11 | 986948839      |             11 |           34255386 | Ren. Brasil Veículos  | Anual         | Data atual      | Não					    | Classe 7          | Não                        | 9BWA452R25R533493 | 5161819  | 2005           | 2005       |  Não             | Transporte de Carga | Não               | Valor de Mercado Referenciado | Sim                         | Feminino                | Solteiro                       | Advogado                     | Até 10 anos                          | Casa em condomínio fechado    | Não                                               | Não                                    | Até 2                          | 07077070  | Próprio; proprietário ou sócio                       | Não                                                  | Não                      | Não                                                 | Não                                    | 000 - Não Informado  | Cotação realizada com Sucesso |  normal  |  Feminino    | 		TESTE TESTE		  |  Divorciado/Separado | Até R$ 1.400,00 |  ADVOGADO |          BRASIL |             RG | 		11			 |	     999999999		   |			11	    	  |	         88888888		    |          1234567 |        SSP - SP |          01012010 | teste@teste.com |           12345 | KHA7891 | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não	  |   Sim      | Sim   		 | 9BWAA05U09T220351 | Teste Sem Aceitação |       1        | Baú             | ALMOFADAS          | Não possui  | Casco - Colisão e Incêndio | Não                | Não Contratada            |  000 - Não Informado | 10	     | Não       | Não Informado  | RG             | 1234567          | SSP - PE        | 06/06/2013     | 61800066144087		  | 2131231231231    | 10 			    | Não					   | Não 							 | KHA9867 | Não 						    | 04/10/1989 | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 10791177416			    | 01092016			    | Ficha Comp. + Deb.Conta | 1 FCA + 1 debito |        1       | BANCO DO BRASIL |      0037      |       X        |     438888   |      7       |      Item 2  |
