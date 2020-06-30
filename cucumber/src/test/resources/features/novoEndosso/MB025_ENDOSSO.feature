#language: pt
Funcionalidade: MB025 - ENDOSSO

  @MB025_ENDOSSO
  Esquema do Cenário: MB025 - Endosso - Inclusão/Exclusão de Cobertura

  # PRIMEIRO FLUXO - ENDOSSO

  	#--------------------------- FLUXO DE ACESSO A TELA DE SEGURADO --------------------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então  Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então  Endosso - clicar no botao Localizar Apolice
    Então  Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURADO -----------------------------------------------
    Quando Endosso - Segurado - preencher Nome da Empresa "<nome_empresa>"
    Quando Endosso - Segurado - preencher Atividade que Empresa Exerce "<atividade_empresa>"
    Quando Endosso - Segurado - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Segurado - preencher o campo Numero Celular "<numero_celular>"
    Quando Endosso - Segurado - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Segurado - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Endosso - Segurado - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Endosso - Segurado - preencher o campo Numero Comercial "<numero_comercial>"
    Quando Endosso - Segurado - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Segurado - preencher o campo Numero Outros "<numero_outros>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Segurado - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURO -------------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------

    #---------------------------------------- VEICULO -----------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- PERFIL -------------------------------------------------
    Quando Endosso - Perfil - preencher veiculo possui cabine suplementar "<cabine>"
    Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Perfil - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- COBERTURAS ---------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"
 	Entao Endosso - Coberturas - clicar no botao Proximo
    #------------------------------------------------------------------------------------------------

	#------------------------------------ CALCULO/EFETIVACAO ----------------------------------------
	Então tiro um print screen com altura "768" e largura "1366"
	Então Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item
	#------------------------------------------------------------------------------------------------

	#--------------------------------------- SEGURO -------------------------------------------------
	Quando Endosso - preencher o campo tipo de seguro "<tipo_seguro>"
	Então Endosso/Seguro - preencher o campo Inicio Vigencia Endosso "<inicio_vigencia>"
    Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------

    #---------------------------------------- VEICULO -----------------------------------------------
    Quando Endosso - Veiculo - preencher o campo Chassi "<chassi>"
    Quando Endosso - Veiculo - preencher o campo Veiculo Zero Km "<veiculo_zero_km>"
    Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
    Quando Endosso - Veiculo - preencher o campo Categoria tarifaria "<categoria_tarifaria>"
    Quando Endosso - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Endosso - Veiculo - preencher o campo Modalidade "<modalidade>"
    Quando Endosso - Veiculo - preencher o campo Fator de Ajuste "<fator_ajuste>"
    Quando Endosso - Veiculo - preencher o campo Placa "<placa>"
    Quando Endosso - Veiculo - selecionar ABS "<abs>"
    Quando Endosso - Veiculo - selecionar Travas eletricas "<travas_eletricas>"
    Quando Endosso - Veiculo - selecionar Vidros eletricos "<vidros_eletricos>"
    Quando Endosso - Veiculo - selecionar Ar condicionado "<ar_condicionado>"
    Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- PERFIL -------------------------------------------------
    Quando Endosso - Perfil - preencher pergunta com perfil "<com_perfil>"
    Então Endosso - Perfil - clicar no botao Nao sei o CEP
    Quando Endosso - Perfil - preencher o campo Estado "<estado>"
    Quando Endosso - Perfil - preencher o campo Cidade "<cidade>"
    Quando Endosso - Perfil - preencher o campo Logradouro "<logradouro>"
    Então Endosso - Perfil - clicar no botao Pesquisar CEP
    Então Endosso - Perfil - selecionar o CEP
    Então Endosso - Perfil - clicar no botao Confirmar CEP
    Quando Endosso - Perfil - relacao segurado proprietario legal "<relacao_segurado>"
    Quando Endosso - Perfil - preencher tipo carroceria "<carroceria>"
    Quando Endosso - Perfil - preencher carga transportada "<carga_transportada>"
    Quando Endosso - Perfil - preencher equipamento "<equipamento>"
    Quando Endosso - Perfil - preencher veiculo possui cabine suplementar "<cabine>"
    Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<anti_furto>"
    Quando Endosso - Perfil - preencher fabricante rastreador/localizador "<fabricante_rastreador_localizador>"
    Quando Endosso - Perfil - preencher propriedade do rastreador "<propriedade_rastreador>"
    Quando Endosso - Perfil - preencher bloqueadores "<bloqueador>"
    Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Perfil - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- COBERTURAS ---------------------------------------------
    Quando Endosso - Coberturas - preencher o campo Franquia "<franquia>"
    Então tiro um print screen com altura "768" e largura "1366"
 	Entao Endosso - Coberturas - clicar no botao Proximo
    #------------------------------------------------------------------------------------------------

    #------------------------------------ CALCULO/EFETIVACAO ----------------------------------------
    Quando Endosso - Calculo/Efetivacao - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"
    Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Calculo
    Então Endosso - Calculo/Efetivacao - print impressao
    
 	#------Dados do Responsável pelo Pagamento-------
    Quando Endosso - Calculo/Efetivacao - preencher o campo Segurado Responsavel Pagamento "<segurado_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo CPF CNPJ "<documento_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Nome Completo "<nome_empresa>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Atividade da Empresa "<atividade_empresa_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Pais de Residencia "<pais>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo DDD Celular "<ddd_celular_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Fone Celular "<fone_celular_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo DDD Residencial "<ddd_residencial_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Fone Residencial "<fone_residencial_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Email "<email_responsavel>"
    
    #------Endereço do Responsável pelo Pagamento------
    Quando Endosso - Calculo/Efetivacao - preencher o campo CEP "<cep_responsavel>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Endereco "<numero_endereco_responsavel>"
    
    #--------------Forma de Pagamento------------------
    Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar Efetivar Proposta
	Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Proposta
	Então Endosso - Calculo/Efetivacao - print impressao
	#------------------------------------------------------------------------------------------------

 	Exemplos: 
 	|cod_corretor | apolice       | nome_empresa | 		  atividade_empresa 	   | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | cabine | tipo_seguro | inicio_vigencia |       chassi      |  	    uso	 	    | categoria_tarifaria | chassis_remarcado | 				modalidade				| fator_ajuste |     placa    | abs | travas_eletricas | vidros_eletricos | ar_condicionado | com_perfil | 			relacao_segurado		| carroceria | carga_transportada | 		equipamento	  | anti_furto |fabricante_rastreador_localizador | propriedade_rastreador    | bloqueador                    | estado        | cidade | logradouro         | franquia |  banco_relacionamento | confirmar_alteracoes | segurado_responsavel | documento_responsavel | nome_empresa |    atividade_empresa_responsavel   |  pais  | ddd_celular_responsavel | fone_celular_responsavel | ddd_residencial_responsavel | fone_residencial_responsavel | email_responsavel | cep_responsavel | numero_endereco_responsavel |    forma_pagamento   | qtd_parcelas |
 	|       19478 | 4086002353131 |  TESTE TESTE | A CUNHAGEM DE MOEDAS E MEDALHAS |          11 |      999999999 |              81 |           88888888 |            81 |         77777777 |         81 |      66666666 |   Não  | Seguro Novo |    Data atual   | 9BM695304AB718125 | Transporte de Carga |					  |		Não		      |	  Valor de Mercado Referenciado			|	   90	   |	 KHA5672  | Sim |        Sim       |       Sim        |       Sim       |		Não  |	Próprio; proprietário ou sócio 	|		Baú  | 		AQUECEDORES	  | Plataforma elevatoria | 	Sim	   | CIELO                            | PRÓPRIO                   | Positron Bloqueador RD link   | Pernambuco PE | RECIFE | Rua Pereira Passos |  Normal  |   000 - Não Informado | Sim                  | Não                  |		51853152000178	 |  TESTE TESTE | ADMINISTRAÇÃO DE CARTÃO DE CRÉDITO | BRASIL | 		   11			| 			955555555	   | 				11			 | 			44444444 		    | teste@gmail.ccom  | 		51020000  | 			 3456 			| Ficha de Compensação |    1 FCA     |