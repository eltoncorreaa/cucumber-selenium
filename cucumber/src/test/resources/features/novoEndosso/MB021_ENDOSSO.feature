#language: pt
Funcionalidade: MB003 - Renovação Mais, Renovação Garantida, Renovação Flex, Seguro Novo (PJ, V. Outros, Perfil, Órgão Público, Débito, Responsável pagamento)

  @MB021_ENDOSSO
  Esquema do Cenário: MB003 - Renovação Mais, Renovação Garantida, Renovação Flex, Seguro Novo (PJ, V. Outros, Perfil, Órgão Público, Débito, Responsável pagamento)

    #--------------------------------- FLUXO DE ACESSO A APOLICE ------------------------------------
    Dado   Endosso - login no sistema "<corretor>"
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
    Quando Endosso - Segurado - preencher e-mail "<email>"
    Quando Endosso - Segurado - preencher cep "<cep>"
    Quando Endosso - Segurado - preencher numero "<numero>" 
    Então  Endosso - Segurado - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

	#---------------------------------------- SEGURO ------------------------------------------------
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- VEICULO ------------------------------------------------
    Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #---------------------------------------- PERFIL ------------------------------------------------   
    Quando Endosso - Perfil - preenche cep "<cep>"
    Então Endosso - Perfil - clicar no botao proximo
    #------------------------------------------------------------------------------------------------
         
    #--------------------------------------- COBERTURAS ---------------------------------------------    
    Entao Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
    Então Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item
    #------------------------------------------------------------------------------------------------

	#------------------------------------- SEGURO (ITEM 1) ------------------------------------------
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------

	#------------------------------------ VEICULO (ITEM 1) ------------------------------------------
    Quando Endosso - Veiculo - preencher o campo Chassi "<chassi>"
    Entao  Endosso - Veiculo - preencher a primeira opcao modal
	Entao  Endosso - Veiculo - clicar no botao salvar
    Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
    Quando Endosso - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Então  Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
	
	#------------------------------------- PERFIL (ITEM 1) ------------------------------------------    
    Quando Endosso - Perfil - preenche cep "<cep>"
	Quando Endosso - Perfil - relacao segurado proprietario legal "<relacao_segurado_proprietario>"	
	Então  Endosso - Perfil - clicar no botao proximo
    #------------------------------------------------------------------------------------------------
	
	#----------------------------------- COBERTURAS (ITEM 1) ----------------------------------------    
    Quando Endosso - Coberturas - preencher o campo Franquia "<cob_franquia>"
    Entao  Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------
	
	#------------------------------- CALCULO/EFETIVACAO (ITEM 1) ---------------------------------------- 
    Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo  
    #------------------------------------------------------------------------------------------------
	
    Exemplos:
      | corretor | cpf_condutor | data_nascimento_principal_condutor | apolice      | renda_mensal  | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | email           | chassi            | uso        | isencao_imposto | cep      | relacao_legal | cob_franquia | confirmar_alteracoes | relacao_segurado_proprietario  | nome_principal_condutor | sexo_principal_condutor | estado_civil_principal_condutor | profissao_principal_condutor | numero | segurado_responsavel | nome_completo |
      | 67482    | 11144477735  | 26051978                           | 100006621031 | Não Informado |          81 |       98779877 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 | teste@teste.com | 8AJYZ59G7B3052117 | Particular | Sem Isenção     | 52031290 | Empregado     | Normal       | Sim                  | Próprio; proprietário ou sócio | TESTE TESTE             | Masculino               | Solteiro                        | Senador                      | 327    | Não                  | TESTE TESTE   |