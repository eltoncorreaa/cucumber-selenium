#language: pt
Funcionalidade: MB_AUTO_008 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Jurídica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)

  @MB008_AUTO
  Esquema do Cenário: MB_AUTO_008 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Jurídica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando Auto - Segurado/Seguro - preencher o campo Sinistro Ultima Vigencia "<sinistro>"
    Quando Auto - Segurado/Seguro - preencher o campo Nova Classe Bonus "<classe_bonus>"
    Quando Auto - Segurado/Seguro - preencher o campo Seguradora Anterior "<seguradora_anterior>"
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Empresa "<nome_empresa>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"    
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    #Então Auto - Veiculo - preencher os dados do Veiculo
    Quando Auto - Veiculo - preencher o campo Codigo Fipe "<fipe>"
    Quando Auto - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Auto - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Quando Auto - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Auto - Veiculo - preencher o campo Modalidade "<modalidade>"
    Quando Auto - Veiculo - preencher o campo Fator de Ajuste "<fator_ajuste>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- PERFIL -------------------------------------------------
    Quando Auto - Avaliacao Seguro - preencher data nascimento principal condutor "<data_nascimento_principal>"
    Quando Auto - Avaliacao Seguro - preencher tempo habilitacao principal condutor "<tempo_habilitacao_principal_condutor>" 
    Quando Auto - Avaliacao Seguro - selecionar o campo Veiculo sera Conduzido por Quantos Condutores "<quantos_condutores>"
    Quando Auto - Avaliacao Seguro - selecionar o Possui Condutores Menores de 26 Anos "<condutores_menores_26_anos>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
	Quando Auto - Avaliacao Seguro - preencher o campo CEP "<cep>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- COBERTURA ----------------------------------------------
    Quando Auto - Coberturas - preencher o campo Cobertura de Casco "<cobertura>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Coberturas - clicar no botão Proximo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- CALCULO ------------------------------------------------
    Quando Auto - Calculo - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"
    Então Auto - Calculo - preencher o campo Operacao "<operacao>"
    Então Auto - Calculo - clicar no botao Calcular
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Calculo - clicar no botão proposta
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- SEGURADO -----------------------------------------------
    Quando Auto - Segurado - preencher campo nome completo "<nome_completo_segurado>"
    Quando Auto - Segurado - preencher pais de residencia "<pais_residencia>"
	Quando Auto - Segurado - preencher e-mail "<email>"
	Quando Auto - Segurado - preencher cep "<cep_segurado>"
	Quando Auto - Segurado - preencher numero "<numero_endereco>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- SEGURO -------------------------------------------------
    Quando Auto - Seguro - preencher campo controle identificacao "<codigo_identificacao>"
    Então Auto - Seguro - preencher o campo Numero Apolice Anterior "<apolice_anterior>"
    Então Auto - Seguro - preencher o campo Numero Item Apolice "<numero_item>"
    Então Auto - Seguro - preencher campo data Apolice Anterior "<data_apolice>"
    Quando Auto - Seguro - pergunta o veículo é o mesmo da apólice anterior "<mesmo_apolice>"
    Quando Auto - Seguro - pergunta foram incluidas corbeturas opicionais diferentes da apolice anterior "<coberturas_diferentes>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Seguro - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #----------------------------------- VEICULO/CONDUTOR --------------------------------------------
    Quando Auto - Veiculo/Condutor - preencher o campo Chassi "<chassi>"
    Quando Auto - Veiculo/Condutor - preencher o campo Placa "<placa>"
    Quando Auto - Veiculo/Condutor - preencher o campo nome condutor "<nome_condutor>"
	Quando Auto - Veiculo/Condutor - preencher o campo cpf condutor "<cpf_condutor>"
	Quando Auto - Veiculo/Condutor - preencher o campo rg condutor "<rg_condutor>"
	Quando Auto - Veiculo/Condutor - preencher o campo sexo condutor "<sexo_condutor>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo/Condutor - clicar no botao proximo
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo/Condutor - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------

    #-------------------------------------- EFETIVAÇÃO -----------------------------------------------
    Quando Auto - Efetivacao - preencher o campo Segurado Responsavel Pagamento "<responsavel>"
    Quando Auto - Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Auto - Efetivacao - preencher o campo Quantidade de Parcelas "<qtd_parcelas>"
    Então Auto - Efetivacao - clicar no botao Efetivar
    Então tiro um print screen com altura "768" e largura "1366"
    #-------------------------------------------------------------------------------------------------
    
    Exemplos:  
  | corretor | cpf_cnpj       |  nome_empresa  | ddd_celular | numero_celular | ddd_residencial | numero_residencial | tipo_seguro      | tipo_calculo  | inicio_vigencia | sinistro | classe_bonus | seguradora_anterior | fipe        | num_opcao_primeiro_veiculo | ano_fabricacao | ano_modelo |      chassi       | veiculo_zero_km | veiculo_blindado | uso        | chassis_remarcado |           modalidade          | fator_ajuste | data_nascimento_principal | tempo_habilitacao_principal_condutor | quantos_condutores | condutores_menores_26_anos | cep       | relacao_segurado_com_o_proprietario_legal_do_veiculo |     cobertura              | danos_morais_esteticos | danos_materiais | danos_corporais | objetos_transportados | cobertura_adicional | vidros         | extensao_reboque | apo_morte_por_ocupante | apo_invalidez_por_ocupante | apo_decessos   | assitencia_basica | banco_relacionamento | operacao | msgSucesso                    | franquia | nome_completo_segurado | pais_residencia | ddd_celular_segurado | numero_celular_segurado | ddd_residencial_segurado | numero_residencial_segurado |           email |      cep_segurado | numero_endereco | codigo_identificacao | apolice_anterior | numero_item | data_apolice | mesmo_apolice | coberturas_diferentes |  placa  | nome_condutor | cpf_condutor | rg_condutor | sexo_condutor | responsavel |     forma_pagamento     |   qtd_parcelas   | 
  | 86790    | 48045380000107 |  TESTE TESTE   |          11 |      999999999 |        11       |           88888888 | Ren. Congênere	| Anual         | Data atual      |    Sim   |   Classe 1   |         AZUL        | 0251399     | 2						     | 2012           | 2012       | 93ylsr7uhcj366068 | Não             | Não              | Taxi       | Não               | Valor de Mercado Referenciado |      100     |         01011980          | Até 10 anos                          | 01 Condutor        |         Não                | 07077070  | Próprio; proprietário ou sócio                       | Casco - Colisão e Incêndio | Não Contratada         | Não Contratada  |            0,00 |                 00,00 | Não Contratada      | Não Contratada | Não Contratada   |                   0,00 |                      00,00 | Não Contratada | Gratuita          | 000 - Não Informado  |       10 | Cotação realizada com Sucesso |  normal  | 		TESTE TESTE	     |          BRASIL | 		11			  |	     999999999		    |			11	    	   |	         88888888		 | teste@teste.com | 50791230          |           12345 |    53522JS5BMON57    |   1111111111111  |      1      |   07092016   |      Não      |          Não          | KHA7891 | TESTE TESTE   | 11144477735  | 8277372     |   Masculino   |    Sim      |   Ficha de Compensação  |       1 FCA      | 
