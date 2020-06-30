#language: pt
Funcionalidade: MB000 - Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

  @runTestMB_ENDOSSO1
  Esquema do Cenário: MB000 - Renovacao Mapfre sem Sinistro Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)
            
    #--------------------------- Metodos da Classe Endosso ------------------------------- 
    Dado Endosso - url do sistema
    Então Endosso - clicar no menu Novo Endosso 
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    Então Endosso - clicar no passo do wizard "<passo_seguro>"    
    #------------------------------------------------------------------------------------------------  
    #--------------------------------------- SEGURO ---------------------------------------------   
    Então Endosso/Seguro - preencher o campo Inicio Vigencia Endosso "<dataVigencia>"
    #Então Endosso - Seguro - clicar no botao Proximo Dados do Seguros        
    Então Endosso - clicar no passo do wizard "<passo_calculo>"
    Então Endosso/Seguro - clicar no botao Adicionar Item
    Então Endosso/Seguro - preencher o campo Tipo Seguro "<tipo_seguro>"
    Então Endosso/Seguro - preencher o campo Seguradora Anterior "<seguradora_anterior>"
    Então Endosso/Seguro - preencher o campo Controle de identificação "<controle_identificacao>"
    Então Endosso/Seguro - preencher o campo Numero Apolice Anterior "<apolice_anterior>" 
    Então Endosso/Seguro - preencher o campo Numero Item Apolice "<item_apolice>"
    Então Endosso/Seguro - preencher o campo data Apolice Anterior "<data_apolice_anterior>"
    Então Endosso/Seguro - pergunta Sinistro na Ultima Vigencia "<sinistro_ultima_vigencia>"
    Então Endosso/Seguro - preencher o campo Nova Classe Bonus "<classe_bonus>"
    Quando Endosso/Seguro - pergunta o veículo é o mesmo da apólice anterior "<mesmo_veiculo_apolice_anterior>" 
    Quando Endosso/Seguro - pergunta foram incluidas corbeturas opicionais diferentes da apolice anterior "<foram_incluidos_corbeturas>"  
    Quando Endosso/Seguro - pergunta Renovação do próprio corretor "<renovacao_proprio_corretor>"
    Então Endosso - Seguro - clicar no botao Proximo Dados do Seguro     
    #------------------------------------------------------------------------------------------------
      
    Exemplos: 
      | apolice       | passo_seguro | dataVigencia | passo_calculo | tipo_seguro    | seguradora_anterior | controle_identificacao | apolice_anterior | item_apolice | data_apolice_anterior | sinistro_ultima_vigencia | classe_bonus | mesmo_veiculo_apolice_anterior | foram_incluidos_corbeturas | renovacao_proprio_corretor |
      | 3897410409631 | 2            | 25/08/2016   | 6 			| Ren. Congênere | AZUL                | 33225566334433         | 10102020         | 2010         | 22012001              | Sim                      | Classe 9     | Sim                            | Sim                        | Sim                        |