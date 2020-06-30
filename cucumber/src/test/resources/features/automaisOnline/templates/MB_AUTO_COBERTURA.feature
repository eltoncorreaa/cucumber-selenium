#language: pt
Funcionalidade: MB_Teste - Automais. Realizarcotacao e imprimir.

  @MB_AUTO_COBERTURA
  Esquema do Cenário: MB_Teste - Automais. Realizarcotacao e imprimir.
  
    Dado   Auto Segurado/Seguro - a url do sistema   
    Então  Auto Segurado/Seguro - clicar no botao Iniciar Calculo            
    Então  Auto Veículo - clicar no botao Proximo Dados do Veiculo Complemento            
    Então  Auto Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo   
    
    #------------------------------------------- COBERTURAS -------------------------------------------
    Quando Auto - Coberturas - preencher o campo Pacotes de Coberturas "<cobertura_basica>"
    Quando Auto - Coberturas - preencher o campo Cobertura de Casco "<cob_casco>"
    Quando Auto - Coberturas - preencher o campo Franquia "<cob_franquia>"
    Quando Auto - Coberturas - preencher o campo RCF Danos Morais e Esteticos "<rcf_danos_morais>"
    Quando Auto - Coberturas - preencher o campo RCF Danos Materiais "<rcf_danos_materiais>"
    Quando Auto - Coberturas - preencher o campo RCF Danos Corporais "<rcf_danos_corporais>"
    Quando Auto - Coberturas - preencher o campo RCF Objetos Transportados "<rcf_objetos_transportados>"
    Quando Auto - Coberturas - preencher o campo Assistência AutoMais 250 km "<assistencia_250km>"
    Quando Auto - Coberturas - preencher o campo Vidros "<vidros>"  
    Quando Auto - Coberturas - preencher o campo Carro Reserva "<carro_reserva>"   
    Quando Auto - Coberturas - preencher o campo APO Morte "<apo_morte>" 
    Quando Auto - Coberturas - preencher o campo APO Invalidez "<apo_invalidez>" 
    Quando Auto - Coberturas - preencher o campo APO Decessos "<apo_decessos>"
    Quando Auto - Coberturas - preencher o campo Extensao Reboque "<extensao_reboque>"   
    Quando Auto - Coberturas - preencher o campo Automais Casa "<automais_casa>"
    Quando Auto - Coberturas - preencher o campo APO DMH "<apo_dmh>" 
    Quando Auto - Coberturas - preencher o campo Reembolso Despesas Extras "<reembolso_desp_extras>" 
    Quando Auto - Coberturas - preencher o campo Indenizacao por Imobilizacao "<ind_imobilizacao>"
    Quando Auto - Coberturas - preencher o campo Extensao Garantia Veiculo "<extensao_garantia>" 
    Quando Auto - Coberturas - preencher o campo Garantia de Cobertura "<garantia_cobertura>" 
    Quando Auto - Coberturas - preencher o campo Seguro da Franquia "<seguro_franquia>"
    Quando Auto - Coberturas - preencher o campo GAP "<gap>" 
    Quando Auto - Coberturas - preencher o campo Blindagem "<blindagem>" 
    Quando Auto - Coberturas - preencher o campo Kit a Gas "<kit_gas>" 
    Quando Auto - Coberturas - preencher o campo Equipamentos "<equipamentos>" 
    Quando Auto - Coberturas - preencher o campo Acessorios Referentes a Som e Imagem "<acessorios_som_imagem>" 
    Quando Auto - Coberturas - preencher o campo Garantia Reposicao 0km "<garantia_reposicao_zerokm>"   
  	
	#------- CAMINHAO -----
	Quando Auto - Coberturas - preencher o campo Carrocerias "<carrocerias>"
	#-- EIXO ADICIONAL
    Então  Auto - Coberturas - clicar no link para Especificar o Eixo Adicional
    Quando Auto - Coberturas - preencher o campo Eixo Adicionado "<eixo_adicional>"  
    Então  Auto - Coberturas - clicar no botão Salvar Eixo Adicional
    Então  Auto - Coberturas - clicar no botão Cancelar Eixo Adicional
    Quando Auto - Coberturas - preencher o campo Eixo Adicional "<val_eixo_adicional>"
	#--
    Quando Auto - Coberturas - preencher o campo Caminhao Basculando "<caminhao_basculando>"
    Quando Auto - Coberturas - preencher o campo Cobertura para o Estado de Sao Paulo "<cob_estado_sp>"
    Quando Auto - Coberturas - preencher o campo Extensao da Cob. para Veiculos Rebocados "<ext_cob_veic_reboc>"
	#-- INDENIZACAO POR PERDA DE FATURAMENTO
    Então  Auto - Coberturas - clicar no link para Especificar a Indenizacao por Perda de Faturamento
    Quando Auto - Coberturas - preencher o campo Quantidade de Diaria "<qtd_diaria>"
    Então  Auto - Coberturas - clicar no botão Salvar Indenizacao por Perda de Faturamento
    Então  Auto - Coberturas - clicar no botão Cancelar Indenizacao por Perda de Faturamento
    Quando Auto - Coberturas - preencher o campo Indenizacao por Perda de Faturamento "<ind_perda_faturamento>"
    #--	
    Quando Auto - Coberturas - preencher o campo Extensao Garantia Veiculo Novo "<ext_garantia_veic_novo>" 
    
    Então Auto - Coberturas - clicar no botão Proximo

    Exemplos: 
    | cobertura_basica | cob_casco                  | cob_franquia | rcf_danos_morais | rcf_danos_materiais | rcf_danos_corporais | rcf_objetos_transportados | assistencia_250km | vidros         | carro_reserva  | apo_morte | apo_invalidez | apo_decessos     | extensao_reboque           | automais_casa            | apo_dmh  | reembolso_desp_extras | ind_imobilizacao | extensao_garantia                               | garantia_cobertura | seguro_franquia | gap    | blindagem | kit_gas | equipamentos | acessorios_som_imagem | garantia_reposicao_zerokm | carrocerias | eixo_adicional | caminhao_basculando | cob_estado_sp  | ext_cob_veic_reboc | ext_garantia_veic_novo               | eixo_adicional | val_eixo_adicional | 
    | Básico           | Casco - Colisão e Incêndio | Reduzida     | 15.000,00        | 150.000,00          | 150.000,00          | Gratuita                  | Gratuita          | Não Contratada | Não Contratada | 15.000,00 | 15.000,00     | Não Contratada   | Extensão de reboque 300 km | AutoMais Casa - Proteção | 1.000,00 | Contratada            | Contratada       | Extensão Garantia Veíc.Novo-180 dias-Inc./Roubo | Contratada         | Contratada      | 100,00 | 100,00    | 100,00  | 100,00       | 100,00                | Não Contratada            | 5.000,00    | 5.000,00       | Não Contratada      | Não Contratada | 1 Veículo          | Extensão Garantia Veíc.Novo-180 dias | 3o EIXO        | 5.000,00           |
