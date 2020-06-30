#language: pt
Funcionalidade: MB_AUTO_003 - 

  @MB003_AUTO
  Esquema do Cenário: MB_AUTO_003 - 
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<cod_corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Apolice Anterior "<apolice_renovar_repique>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    #Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Quando Auto - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    #Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #Então tiro um print screen com altura "768" e largura "1366"
    Quando Auto - Veiculo - clicar ok no modal aviso de produto diferente
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ AVALIACAO DO SEGURO ----------------------------------------
	Quando Auto - Avaliacao Seguro - preencher o campo Sexo Principal Condutor "<sexo_principal_condutor>"
	Quando Auto - Avaliacao Seguro - preencher o campo Estado Civil Principal Condutor "<estado_civil_princial_condutor>" 
	Quando Auto - Avaliacao Seguro - preencher o campo Profissao Principal Condutor "<profissao_principal_condutor>"
	Quando Auto - Avaliacao Seguro - preencher o campo Tempo de Habilitacao do Principal Condutor "<tempo_habilitacao_principal_condutor>"
	Quando Auto - Avaliacao Seguro - preencher o campo Tipo de Residencia do Principal Condutor "<residencia_principal_condutor>"
	Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_reside_pessoas_menores_26_anos>"
	Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Possui Filhos ou Funcionarios Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_filhos_funcionarios>"
	Quando Auto - Avaliacao Seguro - preencher o campo Quantidade de Veiculos na Residencia "<quantidade_veiculos_residencia>"
	Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Segurado e Utilizado mais que Dois Dias da Semana "<usa_mais_que_dois_dias>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Alienado ou Com Leasing "<veiculo_alienado_leasing>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
    Quando Auto - Avaliacao Seguro - preencher o campo Existe Garagem ou Estacionamento Fechado para Veiculo "<>"
    #Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ COBERTURAS -------------------------------------------------
    Quando Auto - Coberturas - preencher o campo Cobertura de Casco "<cob_casco>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Coberturas - clicar no botão Proximo 
    #----------------------------------------------------------------------------------------
    
    #----------------------------------- VALOR DO SEGURO ------------------------------------
    Então Auto - Calculo - clicar no botao Calcular
    Então tiro um print screen com altura "768" e largura "1366"
    Quando Auto - Calculo - clicar no botao repique
    Quando Auto - Veiculo - preencher congenere modal repique "<congenere_repique>"
    Quando Auto - Veiculo - preencher comissao modal repique "<comissao_repique>"
    Quando Auto - Veiculo - preencher premio liquido modal repique "<premio_liquido_repique>"
    Quando Auto - Veiculo - preencher premio total modal repique "<premio_total_repique>"
    Quando Auto - Veiculo - preencher apólice a renovar modal repique "<apolice_renovar_repique>"
    Quando Auto - Veiculo - preencher Observacao modal repique "<observacao_repique>"
    Quando Auto - Veiculo - clicar no botao salvar modal repique
    Então tiro um print screen com altura "768" e largura "1366"
    #----------------------------------------------------------------------------------------
   
    Exemplos:  
	|cod_corretor  | cpf_cnpj       | nome_empresa   | orgao_publico  | ddd_celular | numero_celular |ddd_residencial | numero_residencial | tipo_seguro            |sinistro_ultima_vigencia |classe_bonus | renovacao_proprio_corretor | chassis              | ano_fabricacao| ano_modelo | veiculo_zero_km | veiculo_blindado | uso        | isencao_imposto | chassis_remarcado | modalidade | segurado_principal_condutor | sexo_principal_condutor | estado_civil_princial_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor | residencia_principal_condutor | principal_condutor_reside_pessoas_menores_26_anos | principal_condutor_filhos_funcionarios | quantidade_veiculos_residencia | cep       | relacao_segurado_com_o_proprietario_legal_do_veiculo | veiculo_segurado_utilizado_mais_que_dois_dias_semana | veiculo_alienado_leasing | veiculo_antifurto_rastreador_bloqueador_localizador | fabricante_rastreador_localizador | propriedade_rastreador | bloqueador                  | dispositivo_anti_furto_comum | garagem_estacionamento_fechado_veiculo | na_residencia | no_trabalho | na_faculdade | cobertura_basica | danos_morais_esteticos | danos_materiais | danos_corporais | objetos_transportados | cobertura_adicional | vidros         | extensao_reboque | apo_morte_por_ocupante | apo_invalidez_por_ocupante | apo_decessos   | assitencia_basica | banco_relacionamento | operacao | msgSucesso                    | franquia | 	 sexo 	 | nome_completo_segurado | 	estado_civil	 | renda_mensal    | profissao | pais_residencia | tipo_documento | ddd_celular_segurado | numero_celular_segurado | ddd_residencial_segurado | numero_residencial_segurado | numero_documento | orgao_expedidor | data_de_expedicao |           email |      cep | numero_endereco |  placa  | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar | posicao_modal | com_perfil | estado        | cidade | logradouro        |  cob_casco                   | banco_relacionamento | operacao | congenere_repique | comissao_repique | premio_liquido_repique | premio_total_repique | apolice_renovar_repique | observacao_repique | inicio_vigencia | usa_mais_que_dois_dias | garagem_estacionamento_fechado |   
	| 29680        | 66461682000148 |  TESTE TESTE   |    Sim  	      |          11 |      999999999 |             11 |          988888888 | Ren. Mapfre Seguros	|   Não                   |     0       |       Sim                  | 9bwdb45uxht017404    |    2016       |  2017      | Não             | Não              | Particular |   Sem Isenção   | Não               | RCF - V    | Sim                         | Feminino                | Solteiro                       | Advogado                     | Até 5 anos                           | Casa em condomínio fechado    | Não                                               | Não                                    | Até 2                          | 07077-070 | Próprio; proprietário ou sócio                       | Não                                                  | Não                      | Sim                                                 |                             CIELO |                PRÓPRIO | Positron Bloqueador RD link |                    IDENTICAR | Sim                                    | Sim           | Sim         | Sim          | Básico           | Não Contratada         | Não Contratada  |            0,00 |                 00,00 | Não Contratada      | Não Contratada | Não Contratada   |                   0,00 |                      00,00 | Não Contratada | Gratuita          | 000 - Não Informado  |       10 | Cotação realizada com Sucesso |  normal  |  Feminino | 		TESTE TESTE		  |  Divorciado/Separado | Até R$ 1.400,00 |  ADVOGADO |          BRASIL |             RG | 		11			 |	     999999999		   |			11	    	  |	         88888888		    |          1234567 |        SSP - SP |          01012010 | teste@teste.com | 50791230 |           12345 | KHA7891 | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não	 |   Sim      | 2             | Não        | Pernambuco PE | RECIFE | Rua Pereira Passos|   Casco - Colisão e Incêndio | 000 - Não Informado  | 10       |  MAPFRE SEGUROS   |  0               | 3628,56                | 2903,19              | 3355042421931           | teste teste        | Data atual      | Não                    | Não                            |
