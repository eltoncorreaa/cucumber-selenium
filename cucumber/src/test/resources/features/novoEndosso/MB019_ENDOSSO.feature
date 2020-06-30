#language: pt
Funcionalidade: MB019_ENDOSSO - Seguro Novo (PJ, V. Outros, Perfil, Órgão Público, Débito, Responsável pagamento)

  @MB019_ENDOSSO
  Esquema do Cenário: MB019_ENDOSSO - Apólice auto mais anterior de outra seguradora com sinistro. Que seja pessoa fisica. Chassi de veiculo restrito.

    #--------------------------- FLUXO DE ACESSO A TELA DE Calculo/Efetivacao-----------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- TELA DE SEGURADO --------------------------------------------------
    Quando Endosso - Segurado - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Segurado - preencher o campo Numero Celular "<fone_celular>"
    Quando Endosso - Segurado - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Segurado - preencher o campo Numero Residencial "<fone_residencial>"
    Quando Endosso - Segurado - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Segurado - preencher o campo Numero Outros "<fone_outros>"
    Então Endosso - Segurado - clicar no botao proximo    
    #------------------------------------------------------------------------------------------------
    
    
    #--------------------------------------- SEGURO ---------------------------------------------   
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro     
    #------------------------------------------------------------------------------------------------
    
    
  	#---------------------------- TELA DE VEICULO --------------------------------------------------  
  	Então Auto - Veiculo - limpar champo de chassi 
	Quando Endosso - Veiculo - preencher o campo Codigo Fipe "<codigo_fipe>"
	Então Auto - Veiculo - preencher opcao modal "<num_opcao_primeiro_veiculo>"
    Então Auto - Veiculo - clicar no botao salvar
	Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
	Quando Endosso - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
	Quando Endosso - Veiculo - preencher o campo Placa "<placa_1>"
	Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- Perfil ------------------------------------------------------------
    Quando Endosso - Perfil - preencher veiculo possui cabine complementar "<cabine_complementar>"   
	Quando Endosso - Perfil - clicar no botao proximo 
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- Cobertura ---------------------------------------------------------
	Entao Endosso - Coberturas - clicar no botao Proximo   
    #------------------------------------------------------------------------------------------------
              
    #------------------------------------ CALCULO/EFETIVACAO ----------------------------------------  
        
    #Quando Endosso - Calculo/Efetivacao - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"    
    Entao Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    Quando Endosso - Calculo/Efetivacao - preencher o campo Grupo de Afinidade "<grupo_afinidade>"
    Entao Endosso - Calculo/Efetivacao - clicar no botão Imprimir Calculo
 	Entao Endosso - Calculo/Efetivacao - print impressao
 	
 	#------Forma de Pagamento------    
    Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    
    #------EFETIVACAO-------------- 
    Entao Endosso - Calculo/Efetivacao - clicar Efetivar Proposta
    
    #------------------------------------------------------------------------------------------------  
     
    Exemplos:
      | cod_corretor | apolice       | passo | chassi            | uso  | chassi_segundo_item | cep      | relacao_segurado | tipo_carroceria | carga_transportada | equipamento | cabine_complementar_segundo_item |uso_segundo_item    | cabine_complementar | tipo_seguro    | seguradora_anterior | controle_identificacao | apolice_anterior | item_apolice | data_apolice_anterior | sinistro_ultima_vigencia | mesmo_veiculo_apolice_anterior | foram_incluidos_corbeturas | renovacao_proprio_corretor |      codigo_fipe  | ano_fabricacao | ano_modelo |     uso	   | isencao_imposto |          modalidade			 | teto_solar | segurado_principal_condutor | cpf_condutor     | cnh_condutor  | nome_principal_condutor | data_nascimento_principal_condutor | sexo_principal_condutor | estado_civil_principal_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor  | tipo_residencia_principal_condutor  | reside_menores_26_anos | condutores_menores_26_anos | qtd_veiculos_residencia | cep      | relacao_segurado_proprietario   | veiculo_utilizado_mais_dois_dias | veiculo_alienado_leasing  | dispositivo_anti_furto | fabricante_rastreador_localizador | propriedade_rastreador    | bloqueador                    | dispositivo_anti_furto_comum | garagem_estacionamento_fechado | garagem_estacionamento_na_residencia | garagem_estacionamento_no_trabalho | garagem_estacionamento_na_faculdade | cob_franquia | banco_relacionamento | grupo_afinidade          | confirmar_alteracoes | segurado_responsavel | documento_responsavel | data_nascimento | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento      | qtd_parcelas | dia_vencimento | banco        | agencia | conta_corrente | digito_conta | operacao_conta | bandeira | titular     | cartao           | validade_cartao | atividade_empresa  | placa_1 | placa_2 | isencao_imposto | num_opcao_primeiro_veiculo |
      | 12229        | 1906000005331 |   3   | 9BWAA05U7AP008172 | Taxi | 9BVAS02C6BE774467   | 51170590 | Leasing          | Outros          | AGUA               | Outros      | Não                              |Transporte de Carga | Não                 | Novo           |    AZUL             | 	53522JS5BMON57     |   10102020       |      2010    |    22052016           |   Sim                    |    Não                         |          Não               |   Não                      | 		073010-6  |      2014      |    2015    | Particular   |  Sem Isenção    | Valor de Mercado Referenciado |	Sim		  | Não                         |  11144477735     | 123456        | TESTE TESTE             | 26051978                           | Masculino               | Solteiro                        | Senador                      | Até 5 anos                            | Outros                              | Sim                    | Sim                        | Acima de 4              | 50791230 | Próprio; proprietário ou sócio  | Sim                              |  Não                      | Sim                    | CIELO                             | PRÓPRIO                   | Positron Bloqueador RD link   | IDENTICAR                    | Sim                            | Sim                                  | Sim                                | Sim                                 | Reduzida     | 000 - Não Informado  | DAIMLERCHRYSLER CAMINHAO | Sim                  | Não                  | 07453618460           | 04/10/1989      | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 988779877    | 81              | 33390918         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Ficha de Compensação | 1 FCA        | 1              | BANCO BANESE | 1234    | 11122233       | 1            | 10             | Visa     | TESTE TESTE | 1234123412341234 | 08/17           | ACADEMIAS DE DANÇA | KHA5672 | KLT5672 |	  Sem Isenção | 1						   |
              
