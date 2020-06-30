#language: pt
Funcionalidade: MB023_ENDOSSO

  @MB023_ENDOSSO
  Esquema do Cenário: MB023_ENDOSSO - Alteracao de Perfil - Caminhao 
  
  #--------------------------- FLUXO DE ACESSO A TELA DE VEICULO----------------------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
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
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Segurado - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURO -------------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
    
    #---------------------------------------- Veiculo -----------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- PERFIL ---------------------------------------------  
    Quando Endosso - Perfil - preencher tipo carroceria "<tipo_carroceria>"
    Quando Endosso - Perfil - preencher veiculo possui cabine suplementar "<opcao_cabine_suplementar>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Perfil - clicar no botao proximo
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- COBERTURAS ---------------------------------------------
    Então tiro um print screen com altura "768" e largura "1366"    
    Entao Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------

    #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
     Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
     Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
     Então tiro um print screen com altura "768" e largura "1366"
     Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
     Então tiro um print screen com altura "768" e largura "1366"
     Então Endosso - Calculo/Efetivacao - clicar Efetivar Proposta
     Quando tiro um print screen com altura "768" e largura "1366"
    #------------------------------------------------------------------------------------------------
    
     Exemplos: 
      |cod_corretor | apolice       | atividade_empresa | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | tipo_carroceria | confirmar_alteracoes | opcao_cabine_suplementar | 
      |       19478 | 4086002353131 | AGROPECUÁRIA	    |          11 |       12345678 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 | Tanque          |        Sim           | Não                      |