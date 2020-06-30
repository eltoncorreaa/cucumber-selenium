#language: pt
Funcionalidade: MB027_ENDOSSO

  @MB027_ENDOSSO
  Esquema do Cenário: MB027_ENDOSSO - Alteracao de Importancia Segurada - GOLD - MultiItem - Seguro Novo - Com Responsável pelo pagamento
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
     
     Quando Endosso - Coberturas - preencher o campo IS Casco "<is_casco>"
     Então tiro um print screen com altura "768" e largura "1366"
     Entao Endosso - Coberturas - clicar no botao Proximo
       
    #------------------------------------------------------------------------------------------------
    
    #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
    Então tiro um print screen com altura "768" e largura "1366"
     Então Endosso - Calculo/Efetivacao - clicar no botao Adicionar Item

    #------------------------------------------------------------------------------------------------
    
    
    #SEGUNDO FLUXO - MULTIITEM
     
    #--------------------------------------- SEGURO -------------------------------------------------
    
    Então Endosso/Seguro - preencher o campo Tipo Seguro "<tipo_seguro>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
     
   # -------------------------------------- VEÍCULO -----------------------------------------------------
   
     Quando Endosso - Veiculo - preencher o campo Chassi "<chassi>"
     Então Endosso - Veiculo - preencher a primeira opcao modal
     Então Endosso - Veiculo - clicar no botao salvar
     Quando Endosso - Veiculo - preencher o campo Uso "<uso>"
     Quando Endosso - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
     Então tiro um print screen com altura "768" e largura "1366"
     Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
     
   # ------------------------------------- PERFIL -------------------------------------------------------
    
    
    Quando Endosso - Perfil - relacao segurado proprietario legal "<relacao_segurado_proprietario>" 
    Então Endosso - Perfil - clicar no botao Nao sei o CEP
    Quando Endosso - Perfil - preencher o campo Estado "<estado>"
    Quando Endosso - Perfil - preencher o campo Cidade "<cidade>"
    Quando Endosso - Perfil - preencher o campo Logradouro "<logradouro>"
    Então Endosso - Perfil - clicar no botao Pesquisar CEP
    Então Endosso - Perfil - selecionar o CEP
    Então Endosso - Perfil - clicar no botao Confirmar CEP
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Perfil - clicar no botao proximo 
    
    
   # ------------------------------------COBERTURAS ----------------------------------------------------
    Quando Endosso - Coberturas - preencher o campo Franquia "<cob_franquia>"
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Endosso - Coberturas - clicar no botao Proximo  
    
   #------------------------------------ CALCULO/EFETIVACAO ---------------------------------------- 
    Então Endosso - Calculo/Efetivacao - clicar no botao Calcular
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    Então tiro um print screen com altura "768" e largura "1366"
    
     Exemplos: 
      |cod_corretor | apolice       | atividade_empresa | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros |confirmar_alteracoes | opcao_cabine_suplementar | is_casco   | possui_anti_furto | produto | com_perfil | profissao_principal_condutor |com_perfil_2 | tipo_seguro | chassi            | uso          | isencao_imposto | cep       | relacao_segurado_proprietario  | dispositivo_anti_furto    | cob_franquia | confirmar_alteracoes | com_perfil_3 | estado        | cidade | logradouro        | 
      |       29680 | 3355042421931 | AGROPECUÁRIA	    |          11 |       12345678 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 |        Sim          | Não                      |  39.305,00 |               Não |    GOLD |        Sim |                      Senador |         Não | Seguro Novo | 8AJYZ59G7B3052117 | Particular   |     Sem Isenção | 8465-312   | Próprio; proprietário ou sócio |                    Não    |     Reduzida |                  Sim | Não         | Pernambuco PE | RECIFE | Rua Pereira Passos|  