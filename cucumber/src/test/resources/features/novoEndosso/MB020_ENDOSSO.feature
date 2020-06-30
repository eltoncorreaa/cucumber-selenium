#language: pt
Funcionalidade: MB020 - ENDOSSO

  @MB020_ENDOSSO
  Esquema do Cenário: MB020 - Endosso - Inclusão/Exclusão de Cobertura

  # PRIMEIRO FLUXO - ENDOSSO

  	#--------------------------- FLUXO DE ACESSO A TELA DE SEGURADO --------------------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então  Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então  Endosso - clicar no botao Localizar Apolice
    Então  Endosso - clicar no botao Alterar Apolice
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
    Quando Endosso - Perfil - preencher fabricante rastreador/localizador "<fabricante_rastreador_localizador>"
    Quando Endosso - Perfil - preencher propriedade do rastreador "<propriedade_rastreador>"
    Quando Endosso - Perfil - preencher bloqueadores "<bloqueador>"
    Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Perfil - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- COBERTURAS ---------------------------------------------
    Quando Endosso - Coberturas - preencher o campo Cobertura de Casco "<cob_casco>"
    Quando Endosso - Coberturas - preencher o campo Vidros "<vidros>"
    Quando Endosso - Coberturas - preencher o campo Extensao Reboque "<extensao_reboque>"
    Quando Endosso - Coberturas - preencher o campo Carro Reserva "<carro_reserva>"
    Então tiro um print screen com altura "768" e largura "1366"
 	Entao Endosso - Coberturas - clicar no botao Proximo
    #------------------------------------------------------------------------------------------------

    #------------------------------------ CALCULO/EFETIVACAO ----------------------------------------
    Quando Endosso - Calculo/Efetivacao - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Grupo de Afinidade "<grupo_afinidade>"
 	Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
 	Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
 	Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
 	Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Calculo
 	Então tiro um print screen com altura "768" e largura "1366"
 	Então Endosso - Calculo/Efetivacao - print impressao
 	Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Bandeira "<bandeira>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Nome Titular "<titular>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Numero do Cartao "<cartao>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Validade do Cartao "<validade_cartao>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar Efetivar Proposta
    Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Proposta
	Então Endosso - Calculo/Efetivacao - print impressao
    #------------------------------------------------------------------------------------------------

 	Exemplos: 
 	|cod_corretor | apolice       | renda_mensal    | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros |fabricante_rastreador_localizador | propriedade_rastreador    | bloqueador                    | 					cob_casco			   |      vidros    |        extensao_reboque       |      carro_reserva     | confirmar_alteracoes |  banco_relacionamento | grupo_afinidade | confirmar_alteracoes | segurado_responsavel | forma_pagamento   | qtd_parcelas | dia_vencimento | banco        | agencia | conta_corrente | digito_conta | operacao_conta | bandeira | titular     | cartao           | validade_cartao |
 	|       79170 | 3897410409631 | Até R$ 1.400,00 |          11 |       12345678 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 | CIELO                            | PRÓPRIO                   | Positron Bloqueador RD link   | Casco - Colisão, Incêndio, Roubo e Furto| Não Contratada | Extensão de reboque ilimitado | Carro Reserva Top Plus | 			Sim		    |  000 - Não Informado  | - selecione -   | Sim                  | Sim                  | Cartão de Crédito | CR - 1 parc  | 1              | BANCO BANESE | 1234    | 11122233       | 1            | 10             | Visa     | TESTE TESTE | 4532980705305854 | 08/17           |