#language: pt
Funcionalidade: MB028_ENDOSSO - Seguro Novo (PJ, V. Outros, Perfil, Órgão Público, Débito, Responsável pagamento)

  @MB028_ENDOSSO
  Esquema do Cenário: MB028_ENDOSSO - Apólice auto mais anterior de outra seguradora com sinistro. Que seja pessoa fisica. Chassi de veiculo restrito.

    #--------------------------- FLUXO DE ACESSO A TELA DE Calculo/Efetivacao-----------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- TELA DE SEGURADO -------------------------------------------------- 
    Quando Endosso - Segurado - preencher campo renda mensal "<renda_mensal>"
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
    Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<dispositivo_anti_furto>"
    Quando Endosso - Perfil - preencher fabricante rastreador/localizador "<fabricante_rastreador_localizador>" 
    Quando Endosso - Perfil - preencher propriedade do rastreador "<propriedade_rastreador>"
	Quando Endosso - Perfil - clicar no botao proximo 
    #------------------------------------------------------------------------------------------------
    
    #---------------------------- Cobertura ---------------------------------------------------------
	Entao Endosso - Coberturas - clicar no botao Proximo   
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ----------------------------------------
    Então Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item
	#------------------------------------------------------------------------------------------------

	#---------------------------- TELA DE SEGURO NOVO ITEM ------------------------------------------	
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro 
    #------------------------------------------------------------------------------------------------    
        
    #---------------------------- TELA DE VEICULO ------------------------------------------    
	Quando Endosso - Veiculo - preencher o campo Codigo Fipe "<codigo_fipe>"
	Quando Endosso - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Endosso - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"
    Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
    Quando Endosso - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Quando Endosso - Veiculo - preencher o campo Valor Nota Fiscal "<valor_nota_fiscal>"
    Quando Endosso - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Endosso - Veiculo - preencher o campo Modalidade "<modalidade>"
    Quando Endosso - Veiculo - preencher o campo Placa "<placa>"
    Quando Endosso - Veiculo - selecionar Teto solar "<teto_solar>"
    Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- PERFIL ---------------------------------------------    
    Quando Endosso - Perfil - preencher segurado é o principal condutor "<segurado_principal_condutor>"
    Quando Endosso - Perfil - preencher campo CNH "<cnh_condutor>"
    Quando Endosso - Perfil - preencher tempo habilitacao principal condutor "<tempo_habilitacao_principal_condutor>"
    Quando Endosso - Perfil - preencher tipo residencia principal condutor "<tipo_residencia_principal_condutor>"
    Quando Endosso - Perfil - pergunta principal condutor reside com menores vinte seis anos "<reside_menores_26_anos>"
    Quando Endosso - Perfil - pergunta principal condutor reside com condutores menores vinte seis anos "<condutores_menores_26_anos>"
    Quando Endosso - Perfil - preenche quantidade de veículos na residencia "<qtd_veiculos_residencia>"
    Quando Endosso - Perfil - preenche cep "<cep>"
    Quando Endosso - Perfil - relacao segurado proprietario legal "<relacao_segurado_proprietario>" 
    Quando Endosso - Perfil - veiculo é utilizado mais que 2 dias na semana "<veiculo_utilizado_mais_dois_dias>" 
    Quando Endosso - Perfil - veiculo alienado ou leasing "<veiculo_alienado_leasing>"
    Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<dispositivo_anti_furto>" 
    Quando Endosso - Perfil - possui garagem ou estacionamento fechado "<garagem_estacionamento_fechado>" 
    #Quando Endosso - Perfil - preencher na garagem ou estacionamento na residencia "<garagem_estacionamento_na_residencia>"
    #Quando Endosso - Perfil - preencher na garagem ou estacionamento no trabalho "<garagem_estacionamento_no_trabalho>"
    #Quando Endosso - Perfil - preencher na garagem ou estacionamento na faculdade "<garagem_estacionamento_na_faculdade>"
    Quando Endosso - Perfil - clicar no botao proximo   
    #------------------------------------------------------------------------------------------------

 	#---------------------------- TELA DE COBERTURA -------------------------------------------------
	Quando Endosso - Coberturas - preencher o campo Franquia "<cob_franquia>"
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
       
    #------Forma de Pagamento------    
    Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Bandeira "<bandeira>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Nome Titular "<titular>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Cartao "<cartao>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Validade do Cartao "<validade_cartao>"
   
    #------EFETIVACAO-------------- 
    Entao Endosso - Calculo/Efetivacao - clicar Efetivar Proposta
    
    #------EFETIVACAO-------------- 
    Entao Endosso - Calculo/Efetivacao - preencher o campo chassi do modal no momento de efetivar "<chassi_segundo_item>" "<num_item>"
    Entao Endosso - Calculo/Efetivacao - clico botao salvar modal de chassi obrigatorio
    Entao Endosso - Calculo/Efetivacao - clico botao fechar modal de chassi obrigatorio
    #------------------------------------------------------------------------------------------------  
   
    Exemplos:
      | apolice       | cod_corretor | passo | codigo_fipe | ano_fabricacao | ano_modelo |     uso	   | isencao_imposto |          modalidade			 | teto_solar | segurado_principal_condutor | cpf_condutor     | cnh_condutor  | nome_principal_condutor | data_nascimento_principal_condutor | sexo_principal_condutor | estado_civil_principal_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor  | tipo_residencia_principal_condutor  | reside_menores_26_anos | condutores_menores_26_anos | qtd_veiculos_residencia | cep      | relacao_segurado_proprietario   | veiculo_utilizado_mais_dois_dias | veiculo_alienado_leasing  | dispositivo_anti_furto | fabricante_rastreador_localizador | propriedade_rastreador    | bloqueador                    | dispositivo_anti_furto_comum | garagem_estacionamento_fechado | garagem_estacionamento_na_residencia | garagem_estacionamento_no_trabalho | garagem_estacionamento_na_faculdade | cob_franquia | banco_relacionamento | grupo_afinidade | confirmar_alteracoes | segurado_responsavel | documento_responsavel | data_nascimento | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | numero_celular | ddd_residencial | fone_residencial | ddd_comercial | fone_comercial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | cep      | estado        | cidade | logradouro         | numero_endereco | complemento | forma_pagamento   | qtd_parcelas | dia_vencimento | banco        | agencia | conta_corrente | digito_conta | operacao_conta | bandeira | titular     | cartao           | validade_cartao | placa   | chassi_segundo_item | num_item |
      | 3897410409631 | 79170    	 |  4    | 073010-6    |      2014      |    2015    | Particular  |  Sem Isenção    | Valor de Mercado Referenciado |	Sim		  | Sim                         |  11144477735     | 123456        | TESTE TESTE             | 26051978                           | Masculino               | Solteiro                        | Senador                      | Até 5 anos                            | Outros                              | Sim                    | Sim                        | Acima de 4              | 50791230 | Próprio; proprietário ou sócio  | Sim                              |  Não                      | Sim                    | CIELO                             | PRÓPRIO                   | Positron Bloqueador RD link   | IDENTICAR                    | Sim                            | Sim                                  | Sim                                | Sim                                 | Reduzida     | 000 - Não Informado  | BANCO CENTRAL   | Sim                  | Sim                  | 07453618460           | 04/10/1989      | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877       | 81              | 32113211         | 81            | 32113211       | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 52031290 | Pernambuco PE | RECIFE | Rua Pereira Passos | 327             | Casa        | Cartão de Crédito | CR - 1 parc  | 1              | BANCO BANESE | 1234    | 11122233       | 1            | 10             | Visa     | TESTE TESTE | 4929323099931855 | 08/17           | KHA5672 | 5UXFG2C56CL778040   | 1 		|
              
