#language: pt
Funcionalidade: MB011 - Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

  @runTestMB_ENDOSSO_5
  Esquema do Cenário: MB011 - Renovacao Mapfre sem Sinistro Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)
            
    #--------------------------- FLUXO DE ACESSO A TELA DE COBERTURAS ------------------------------- 
    Dado Endosso - url do sistema
    Então Endosso - clicar no menu Novo Endosso 
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    Então Endosso - clicar no passo do wizard "<passo_coberturas>"
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- COBERTURAS ---------------------------------------------    
    Quando Endosso - Coberturas - preencher o campo Cobertura de Casco "<cob_casco>"
    Quando Endosso - Coberturas - preencher o campo Franquia "<cob_franquia>"
    Quando Endosso - Coberturas - preencher o campo IS Casco "<is_casco>"
    Quando Endosso - Coberturas - preencher o campo RCF Danos Morais e Esteticos "<rcf_danos_morais>"
    Quando Endosso - Coberturas - preencher o campo RCF Danos Materiais "<rcf_danos_materiais>"
    Quando Endosso - Coberturas - preencher o campo RCF Danos Corporais "<rcf_danos_corporais>"
    Quando Endosso - Coberturas - preencher o campo RCF Objetos Transportados "<rcf_objetos_transportados>"
    Quando Endosso - Coberturas - preencher o campo Assistência AutoMais 250 km "<assistencia_250km>"
    Quando Endosso - Coberturas - preencher o campo Vidros "<vidros>" 
    Quando Endosso - Coberturas - preencher o campo Extensao Reboque "<extensao_reboque>"
    Quando Endosso - Coberturas - preencher o campo Carro Reserva "<carro_reserva>" 
    Quando Endosso - Coberturas - preencher o campo Automais Casa "<automais_casa>" 
    Quando Endosso - Coberturas - preencher o campo APO Morte "<apo_morte>" 
    Quando Endosso - Coberturas - preencher o campo APO Invalidez "<apo_invalidez>" 
    Quando Endosso - Coberturas - preencher o campo APO Decessos "<apo_decessos>" 
    Quando Endosso - Coberturas - preencher o campo APO DMH "<apo_dmh>" 
    Quando Endosso - Coberturas - preencher o campo Reembolso Despesas Extras "<reembolso_desp_extras>" 
    Quando Endosso - Coberturas - preencher o campo Indenizacao por Imobilizacao "<ind_imobilizacao>" 
    Quando Endosso - Coberturas - preencher o campo Extensao Garantia Veiculo "<extensao_garantia>" 
    Quando Endosso - Coberturas - preencher o campo Garantia de Cobertura "<garantia_cobertura>" 
    Quando Endosso - Coberturas - preencher o campo Seguro da Franquia "<seguro_franquia>" 
    Quando Endosso - Coberturas - preencher o campo GAP "<gap>" 
    Quando Endosso - Coberturas - preencher o campo Blindagem "<blindagem>" 
    Quando Endosso - Coberturas - preencher o campo Kit a Gas "<kit_gas>" 
    Quando Endosso - Coberturas - preencher o campo Equipamentos "<equipamentos>" 
    Quando Endosso - Coberturas - preencher o campo Acessorios Referentes a Som e Imagem "<acessorios_som_imagem>" 
    Quando Endosso - Coberturas - preencher o campo Garantia Reposicao 0km "<garantia_reposicao_zerokm>" 
    Entao Endosso - Coberturas - clicar no botao Proximo  
    #------------------------------------------------------------------------------------------------
        
    Exemplos: 
      | apolice       | passo_coberturas | cob_casco                                | cob_franquia | is_casco  | rcf_danos_morais | rcf_danos_materiais | rcf_danos_corporais | rcf_objetos_transportados | assistencia_250km | vidros        | extensao_reboque           | carro_reserva                 | automais_casa            | apo_morte | apo_invalidez | apo_decessos | apo_dmh  | reembolso_desp_extras | ind_imobilizacao | extensao_garantia                               | garantia_cobertura | seguro_franquia | gap    | blindagem | kit_gas | equipamentos | acessorios_som_imagem | garantia_reposicao_zerokm |
      | 3897410409631 | 5                | Casco - Colisão, Incêndio, Roubo e Furto | Reduzida     | 56.800,00 | 15.000,00        | 150.000,00          | 150.000,00          | Gratuita                  | Não Contratada    | Vidros Básico | Extensão de reboque 300 km | Carro Reserva 30 Dias Com AR  | AutoMais Casa - Proteção | 15.000,00 | 15.000,00     | Contratada   | 1.000,00 | Contratada            | Contratada       | Extensão Garantia Veíc.Novo-180 dias-Inc./Roubo | Contratada         | Contratada      | 100,00 | 100,00    | 100,00  | 100,00       | 100,00                | Não Contratada            |
