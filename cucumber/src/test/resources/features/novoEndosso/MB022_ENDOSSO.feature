#language: pt
Funcionalidade: MB022_ENDOSSO - Inclusão/Exclusão de Cobertura - Colisão, Incêncio, Roubo e Furto (FCA)

  @MB022_ENDOSSO
  Esquema do Cenário: MB022_ENDOSSO - Inclusão/Exclusão de Cobertura - Colisão, Incêncio, Roubo e Furto (FCA)
            
            
    #--------------------------- ENDOSSO ------------------------------- 
    Dado Endosso - login no sistema "<corretor>"
    Então Endosso - clicar no menu Novo Endosso 
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- SEGURADO -----------------------------------------------
    Quando Endosso - Segurado - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Segurado - preencher o campo Numero Celular "<numero_celular>"
    Quando Endosso - Segurado - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Segurado - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Endosso - Segurado - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Segurado - preencher o campo Numero Outros "<numero_outros>"
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Segurado - clicar no botao proximo
    #------------------------------------------------------------------------------------------------ 
    
    #--------------------------------------- SEGURO -------------------------------------------------
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro
    #------------------------------------------------------------------------------------------------
    
    #---------------------------------------- Veiculo -----------------------------------------------
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Veiculo - clicar no botao Proximo Dados do Veiculo
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- PERFIL ---------------------------------------------    
    Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<dispositivo_anti_furto>"
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Perfil - clicar no botao proximo
       
    #--------------------------- COBERTURA -----------------------------
    Quando Endosso - Coberturas - preencher o campo Cobertura de Casco "<cob_casco>"
    Quando tiro um print screen com altura "768" e largura "1366"
    Quando Endosso - Coberturas - preencher o campo Franquia "<cob_franquia>"
    Quando Endosso - Coberturas - preencher o campo Garantia de Cobertura "<garantia_cobertura>" 
    Quando Endosso - Coberturas - preencher o campo Seguro da Franquia "<seguro_franquia>"
    Quando tiro um print screen com altura "768" e largura "1366" 
    Entao Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------
    
    #--------------------------- CALCULO/EFETIVACAO --------------------   
    Então Endosso - Calculo/Efetivacao - clicar no botao Calcular    
    Quando Endosso - Calculo/Efetivacao - confirmar alteracoes realizadas "<confirmar_alteracoes>"
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botao Confirmar Calculo
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Calculo
    Então Endosso - Calculo/Efetivacao - print impressao
    Quando Endosso - Calculo/Efetivacao - preencher o campo Segurado Responsavel Pagamento "<opcao>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Forma de Pagamento "<forma>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Qtd de Parcelas "<qtd_parcelas>"
    Quando Endosso - Calculo/Efetivacao - preencher o campo Dia Vencimento "<dia>"
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar Efetivar Proposta
    Quando tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Calculo/Efetivacao - clicar no botão Imprimir Proposta
    Então Endosso - Calculo/Efetivacao - print impressao
    #-------------------------------------------------------------------
        
Exemplos: 
      | corretor | apolice       | passo_calculo | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_outros | numero_outros | dispositivo_anti_furto | cob_casco                  | cob_franquia | garantia_cobertura | seguro_franquia | confirmar_alteracoes | opcao | forma 				  | qtd_parcelas | dia |
      | 89915    | 6051014828331 | 5             | 81          | 98779877       | 81              | 32113211           | 81         | 32113211      | Não                    | Casco - Colisão e Incêndio | Normal	     | Contratada         | Contratada      | Sim                  | Sim   | Ficha de Compensação | 1 FCA        | 10  |