#language: pt
Funcionalidade: MB029_ENDOSSO

  @MB029_ENDOSSO
  Esquema do Cenário: MB029_ENDOSSO - Alteracao de Importancia Segurada - GOLD - MultiItem - Seguro Novo - Com Responsável pelo pagamento
  - FCA - Reduzida - CSN
  
  #--------------------------- FLUXO DE ACESSO A TELA DE VEICULO----------------------------------
    Dado Endosso - login no sistema "<cod_corretor>"
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------

    #--------------------------------------- SEGURADO -----------------------------------------------
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
    
     Quando Endosso - Perfil - preencher profissao principal condutor "<profissao_principal_condutor>" 
     Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<possui_anti_furto>"
     Então tiro um print screen com altura "768" e largura "1366"
     Então Endosso - Perfil - clicar no botao proximo
   
    #--------------------------------------- COBERTURAS ---------------------------------------------    
     
     Quando Endosso - Coberturas - preencher o campo Cobertura de Casco "<cob_casco>"
     Então tiro um print screen com altura "768" e largura "1366"
     Entao Endosso - Coberturas - clicar no botao Proximo
       
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
    Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    Então tiro um print screen com altura "768" e largura "1366"

    #------------------------------------------------------------------------------------------------
    
    
  
     Exemplos: 
      |cod_corretor | apolice       | atividade_empresa | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros |confirmar_alteracoes | opcao_cabine_suplementar | is_casco   | possui_anti_furto | produto | com_perfil | profissao_principal_condutor |com_perfil_2 | tipo_seguro | chassi            | uso          | isencao_imposto | cep       | relacao_segurado_proprietario  | dispositivo_anti_furto    | cob_franquia | confirmar_alteracoes | com_perfil_3 | estado        | cidade | logradouro        | cob_casco                     | 
      |       29680 | 3355042421931 | AGROPECUÁRIA	    |          11 |       12345678 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 |        Sim          | Não                      |  39.305,00 |               Não |    GOLD |        Sim |                      Senador |         Não | Seguro Novo | 8AJYZ59G7B3052117 | Particular   |     Sem Isenção | 8465-312   | Próprio; proprietário ou sócio |                    Não    |     Reduzida |                  Sim | Não         | Pernambuco PE | RECIFE | Rua Pereira Passos|   Casco - Colisão e Incêndio  |