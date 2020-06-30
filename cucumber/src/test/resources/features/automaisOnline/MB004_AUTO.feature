#language: pt
Funcionalidade: MB004_AUTO - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Fisica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)

  @MB004_AUTO
  Esquema do Cenário: MB004_AUTO - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Fisica, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------    
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"    
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Comercial "<numero_comercial>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Outros "<ddd_outros>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Outros "<numero_outros>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Completo "<nome_completo>"
    Quando Auto - Segurado/Seguro - preencher o campo Data Nascimento "<data_nascimento>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando Auto - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    Quando Auto - Segurado/Seguro - preencher o campo Sinistro Ultima Vigencia "<sinistro_vigencia>"
    Quando Auto - Segurado/Seguro - preencher o campo Nova Classe Bonus "<classe_bonus>"
    Quando Auto - Segurado/Seguro - preencher o campo Renovacao Propio Corretor "<renovacao_corretor>"
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Segurado/Seguro - clicar no botao Iniciar Calculo    
    #-------------------------------------------------------------------------------------------------
   
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Chassis "<chassi>"
    Então Auto - Veiculo - preencher opcao modal "<num_opcao_primeiro_veiculo>"
    Então Auto - Veiculo - clicar no botao salvar
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- Avaliacao do Seguro - PERFIL -------------------------------------
    Quando Auto - Avaliacao Seguro - preencher o campo Segurado Principal Condutor "<segurado_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Sexo Principal Condutor "<sexo_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Estado Civil Principal Condutor "<estado_civil_princial_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Tempo de Habilitacao do Principal Condutor "<tempo_habilitacao_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_reside_pessoas_menores_26_anos>"
    Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Possui Filhos ou Funcionarios Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_filhos_funcionarios>"
    Quando Auto - Avaliacao Seguro - preencher o campo CEP "<cep>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"   
    Quando Auto - Avaliacao Seguro - preencher tipo carroceria "<tipo_carroceria>" 
    Quando Auto - Avaliacao Seguro - preencher carga transportada "<carga_transportada>"
    Quando Auto - Avaliacao Seguro - preencher equipamento "<equipamento>"
    Quando Auto - Avaliacao Seguro - preencher veiculo possui cabine complementar "<cabine_complementar>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Possui Anti-Furto, Rastreador, Bloqueador ou Localizador "<veiculo_antifurto_rastreador_bloqueador_localizador>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- COBERTURA ----------------------------------------------
    Quando Auto - Coberturas - preencher o campo Franquia "<opcao_franquia>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Coberturas - clicar no botão Proximo
    #-------------------------------------------------------------------------------------------------
         
    #---------------------------------------- CALCULO ----------------------------------------------    
    Quando Auto - Calculo - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"
    Quando Auto - Calculo - preencher o campo Operacao "<operacao>"
    Então Auto - Calculo - clicar no botao Calcular
    Quando Auto - Calculo - clicar no botao franquia "<opcao_franquia>"    
    Então Auto - Calculo - clicar no botão proposta
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------------ SEGURADO ----------------------------------------------
    Quando Auto - Efetivacao - preencher o campo renda mensal "<renda_mensal>"        
    Quando Auto - Segurado - preencher campo profissao "<profissao_exerce>"
    Quando Auto - Segurado - preencher pais de residencia "<pais>"    
    Quando Auto - Segurado - preencher tipo de documento "<tipo_documento>"
    Quando Auto - Segurado - preencher numero do documento "<numero_documento>"
    Quando Auto - Segurado - preencher orgao expedidor "<orgao_expedidor>"
    Quando Auto - Segurado - preencher data de expedicao "<data_expedicao>" 
    Quando Auto - Segurado - preencher cep "<cep>"
    Quando Auto - Segurado - preencher numero "<num_endereco>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------------ SEGURO ----------------------------------------------
    Quando Auto - Seguro - preencher campo controle identificacao "<controle_identificacao>"
    Quando Auto - Seguro - preencher o campo Numero Apolice Anterior "<apolice_anterior>"
    Quando Auto - Seguro - preencher o campo Numero Item Apolice "<num_item_apolice>"
    Quando Auto - Seguro - pergunta o veículo é o mesmo da apólice anterior "<veiculo_apolice_anterior>"
    Quando Auto - Seguro - preencher campo data Apolice Anterior "<data_apolice_anterior>"
    Quando Auto - Seguro - pergunta foram incluídas coberturas opcionais diferentes da apólice anterior "<coberturas_opcionais_diferentes>"
    Então tiro um print screen com altura "768" e largura "1366"
    Entao  Auto - Seguro - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------- VEICULO/CONDUTOR -----------------------------------------
    Quando Auto - Veiculo/Condutor - preencher o campo Placa "<placa>"
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Veiculo/Condutor - clicar no botao proximo
    Então tiro um print screen com altura "768" e largura "1366"
    Entao Auto - Veiculo/Condutor - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
          
    #---------------------------------------- EFETIVACAO ---------------------------------------------
    Quando Auto - Efetivacao - preencher o campo Segurado Responsavel Pagamento "<segurado_responsavel_pagamento>"
    Quando Auto - Efetivacao - preencher o campo CPF CNPJ "<cpf_responsavel_pagamento>"
    Quando Auto - Efetivacao - preencher o campo Data Nascimento "<dt_nasc>"
    Quando Auto - Efetivacao - preencher o campo Sexo "<sexo>"
    Quando Auto - Efetivacao - preencher o campo Nome Completo "<nome_completo>"
    Quando Auto - Efetivacao - preencher o campo Estado Civil "<estado_civil>"
    Quando Auto - Efetivacao - preencher o campo Atividade do Segurado "<profissao>"
    Quando Auto - Efetivacao - preencher o campo Pais de Residencia "<pais>"
    Quando Auto - Efetivacao - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Efetivacao - preencher o campo Fone Celular "<fone_celular>"
    Quando Auto - Efetivacao - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Efetivacao - preencher o campo Fone Residencial "<fone_residencial>"
    Quando Auto - Efetivacao - preencher o campo DDD Outros "<ddd_outros>"
    Quando Auto - Efetivacao - preencher o campo Fone Outros "<fone_outros>"
    Quando Auto - Efetivacao - preencher o campo Tipo de Documento "<tipo_documento>"
    Quando Auto - Efetivacao - preencher o campo Numero do Documento "<numero_documento>"
    Quando Auto - Efetivacao - preencher o campo Orgao Expedidor "<orgao_expedidor>"
    Quando Auto - Efetivacao - preencher o campo Data Expedicao "<data_expedicao>"    
    Quando Auto - Efetivacao - preencher o campo Email "<email>"
    
    #------Endereço do Responsável pelo Pagamento------
    #Então Endosso - Perfil - clicar no botao Nao sei o CEP
    #Quando Endosso - Perfil - preencher o campo Estado "<estado>"
    #Quando Endosso - Perfil - preencher o campo Cidade "<cidade>"
    #Quando Endosso - Perfil - preencher o campo Logradouro "<logradouro>"
    #Então Endosso - Perfil - clicar no botao Pesquisar CEP
    #Então Endosso - Perfil - selecionar o CEP
    #Então Endosso - Perfil - clicar no botao Confirmar CEP
    Quando Auto - Efetivacao - preencher o campo CEP "<cep>"
    Quando Auto - Efetivacao - preencher o campo Numero do Endereco "<numero_endereco>"
    
    #------Endereço do Responsável pelo Pagamento------
    Quando Auto - Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Auto - Efetivacao - preencher o campo Quantidade de Parcelas "<qtd_parcelas>"
    Entao Auto - Efetivacao - clicar no botao Efetivar
    Então tiro um print screen com altura "768" e largura "1366"
    #--------------------------------------------------------------------------------------------------
        
    Exemplos:  
    | corretor | cpf_cnpj    | nome_completo | data_nascimento | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | tipo_seguro          | tipo_calculo | inicio_vigencia | sinistro_vigencia | classe_bonus | renovacao_corretor | chassi            | chassi_2          | uso                 | segurado_principal_condutor | sexo_principal_condutor | estado_civil_princial_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor | residencia_principal_condutor | principal_condutor_reside_pessoas_menores_26_anos | principal_condutor_filhos_funcionarios | quantidade_veiculos_residencia | cep      | numero_endereco | relacao_segurado_com_o_proprietario_legal_do_veiculo | veiculo_segurado_utilizado_mais_que_dois_dias_semana | veiculo_alienado_leasing | veiculo_antifurto_rastreador_bloqueador_localizador | garagem_estacionamento_fechado_veiculo | na_residencia | no_trabalho | na_faculdade | dispositivo_anti_furto_comum | banco_relacionamento | operacao | grupo_afinidade               | num_opcao_primeiro_veiculo | num_opcao_segundo_veiculo | pais   | renda_mensal  | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | controle_identificacao | apolice_anterior | num_item_apolice | veiculo_apolice_anterior | coberturas_opcionais_diferentes | placa   | segurado_responsavel_pagamento | dt_nasc  | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | ddd_outros | fone_outros | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           | forma_pagamento      | qtd_parcelas | cpf_responsavel_pagamento | data_apolice_anterior | tipo_carroceria | carga_transportada | equipamento | cabine_complementar | opcao_franquia | profissao_exerce | num_endereco | estado        | cidade | logradouro         |
    | 86790    | 11144477735 | TESTE TESTE   |        15121977 |          11 |      912345678 |             11  |           12345678 | 11            | 912345678        | 11         | 912345678     | Ren. Brasil Veículos | Bianual      | Data atual      | Sim               | Classe 1     | Sim                | 9BWA452R25R533493 | 9BD17164G72836091 | Transporte de Carga |  Sim                        | Masculino               | Solteiro                       | Advogado                     | Até 10 anos                          | Casa em condomínio fechado    | Não                                               | Não                                    | Até 2                          | 07077070 | 284 			 | Próprio; proprietário ou sócio                       | Não                                                  | Não                      | Não                                                 | Sim                                    | Sim           | Sim         | Sim          | Não  						 | 000 - Não Informado  | 10	   | GRUPO BB&MAPFRE (FUNC E CONJ) | 1						    | 2						    | BRASIL | Não Informado | RG             | 1234567          | SSP - PE        | 06062013       | 61800078761744		 | 1084801535031    | 1 			   | Não					  | Não 							| KHA9867 | Não 						   | 04101989 | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | 81         | 32113211    | RG             | 1234567          | SSP - PE        | 06062013       | teste@teste.com | Ficha de Compensação | 1 FCA   	   | 10791177416			   | 01092016			   |  Outros         | AGUA               | Outros      | Não                 | Reduzida       |  AGENTE          | 290 		 | Pernambuco PE | RECIFE | Rua Pereira Passos |