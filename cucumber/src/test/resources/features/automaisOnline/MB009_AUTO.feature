#language: pt
Funcionalidade: MB_AUTO_009 - (Tipo Seguro: Renovação Brasil Veículos Sem Sinistro, Tipo Pessoa: Física, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: Debito + FCA)

  @MB009_AUTO
  Esquema do Cenário: MB_AUTO_009 - (Tipo Seguro: Renovação Brasil Veículos Sem Sinistro, Tipo Pessoa: Física, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: Debito + FCA)
    
    #----------------------------------- ACESSO AO SISTEMA -------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------

    #------------------------------------ SEGURADO/SEGURO --------------------------------------------
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Completo "<nome_completo>"
    Quando Auto - Segurado/Seguro - preencher o campo Data Nascimento "<data_nascimento>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"    
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando Auto - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    Quando Auto - Segurado/Seguro - preencher o campo Sinistro Ultima Vigencia "<sinistro>"
    Quando Auto - Segurado/Seguro - preencher o campo Nova Classe Bonus "<classe_bonus>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Chassis "<chassi>"
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- PERFIL -------------------------------------------------
    Quando Auto - Avaliacao Seguro - preencher pergunta com perfil "<perfil>"
    Quando Auto - Avaliacao Seguro - preencher o campo CEP "<cep>"
    Quando Auto - Avaliacao Seguro - preencher data nascimento principal condutor "<data_nascimento_principal>"
    Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_reside_pessoas_menores_26_anos>"
    Quando Auto - Avaliacao Seguro - preencher tempo habilitacao principal condutor "<tempo_habilitacao_principal_condutor>" 
    Quando Auto - Avaliacao Seguro - selecionar o campo Veiculo sera Conduzido por Quantos Condutores "<quantos_condutores>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
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
    Quando Auto - Calculo - clicar no botao franquia "<franquia>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Calculo - clicar no botão proposta
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- SEGURADO -----------------------------------------------
    Então Auto - Segurado - preencher o sexo "<sexo>"
    Quando Auto - Segurado - preencher campo estado civil "<estado_civil>"
    Quando Auto - Segurado - preencher campo renda mensal "<renda_mensal>"
    Quando Auto - Segurado - preencher pais de residencia "<pais_residencia>"
    #Quando Auto - Segurado - preencher o campo DDD Celular "<ddd_celular_segurado>"
    #Quando Auto - Segurado - preencher o campo Numero Celular "<numero_celular_segurado>"
    #Quando Auto - Segurado - preencher o campo DDD Residencial "<ddd_residencial_segurado>"
    #Quando Auto - Segurado - preencher o campo Numero Residencial "<numero_residencial_segurado>"
    Quando Auto - Segurado - preencher tipo de documento "<tipo_documento>"
	Quando Auto - Segurado - preencher numero do documento "<numero_documento>"
	Quando Auto - Segurado - preencher orgao expedidor "<orgao_expedidor>"
	Quando Auto - Segurado - preencher data de expedicao "<data_de_expedicao>"
	Quando Auto - Segurado - preencher e-mail "<email>"
	Quando Auto - Segurado - preencher cep "<cep_segurado>"
	Quando Auto - Segurado - preencher numero "<numero_endereco>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- SEGURO -------------------------------------------------
    Quando Auto - Seguro - preencher campo controle identificacao "<controle_identificacao>"
	Então Auto - Seguro - preencher o campo Numero Apolice Anterior "<apolice_anterior>"
	Então Auto - Seguro - preencher o campo Numero Item Apolice "<numero_item>"
	Quando Auto - Seguro - pergunta o veículo é o mesmo da apólice anterior "<veiculo_apolice_anterior>"
	Quando Auto - Seguro - pergunta foram incluídas coberturas opcionais diferentes da apólice anterior "<coberturas_diferente>"
	Então Auto - Seguro - preencher campo data Apolice Anterior "<data_apolice_anterior>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Seguro - clicar no botao proximo
    #-------------------------------------------------------------------------------------------------
    
    #----------------------------------- VEICULO/CONDUTOR --------------------------------------------
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
    Quando Auto - Efetivacao - preencher o campo Tipo de Documento "<tipo_documento>"
    Quando Auto - Efetivacao - preencher o campo Numero do Documento "<numero_documento>"
    Quando Auto - Efetivacao - preencher o campo Orgao Expedidor "<orgao_expedidor>"
    Quando Auto - Efetivacao - preencher o campo Data Expedicao "<data_expedicao>"    
    Quando Auto - Efetivacao - preencher o campo Email "<email>"
    
    #------Endereço do Responsável pelo Pagamento------
    Quando Auto - Efetivacao - preencher o campo CEP "<cep>"
    Quando Auto - Efetivacao - preencher o campo Numero do Endereco "<numero_endereco>"
    
    #------Forma Pagamento-----------------------------
    Quando Auto - Efetivacao - preencher o campo Forma de Pagamento "<forma_pagamento>"
    Quando Auto - Efetivacao - preencher o campo Quantidade de Parcelas "<qtd_parcelas>"
    Quando Auto - Efetivacao - preencher o campo Dia preferencial para vencimento "<dia_vencimento>"
    Quando Auto - Efetivacao - preencher o campo Banco "<banco>"
    Quando Auto - Efetivacao - preencher o campo Agencia "<numero_agencia>"
    Quando Auto - Efetivacao - preencher o campo Digito Agencia "<digito_agencia>"
    Quando Auto - Efetivacao - preencher o campo Conta Corrente "<numero_conta>"
    Quando Auto - Efetivacao - preencher o campo Digito Conta "<digito_conta>"
    Então Auto - Efetivacao - clicar no botao Efetivar
    Então tiro um print screen com altura "768" e largura "1366"
    #-------------------------------------------------------------------------------------------------
    
    Exemplos:  
	| corretor | cpf_cnpj    | nome_completo  | data_nascimento | ddd_celular | numero_celular | perfil | ddd_residencial | numero_residencial | tipo_seguro           | tipo_calculo  | inicio_vigencia | sinistro | classe_bonus | chassi            | data_nascimento_principal | fipe        | veiculo_zero_km | veiculo_blindado | uso        | isencao_imposto | chassis_remarcado | modalidade | segurado_principal_condutor | sexo_principal_condutor | estado_civil_princial_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor | residencia_principal_condutor | principal_condutor_reside_pessoas_menores_26_anos | principal_condutor_filhos_funcionarios | quantidade_veiculos_residencia | cep       | relacao_segurado_com_o_proprietario_legal_do_veiculo | veiculo_segurado_utilizado_mais_que_dois_dias_semana | veiculo_alienado_leasing | veiculo_antifurto_rastreador_bloqueador_localizador | fabricante_rastreador_localizador | propriedade_rastreador | bloqueador                  | dispositivo_anti_furto_comum | garagem_estacionamento_fechado_veiculo | na_residencia | no_trabalho | na_faculdade | cobertura_basica | danos_morais_esteticos | danos_materiais | danos_corporais | objetos_transportados | cobertura_adicional | vidros         | extensao_reboque | apo_morte_por_ocupante | apo_invalidez_por_ocupante | apo_decessos   | assitencia_basica | banco_relacionamento | operacao | msgSucesso                    | franquia | 	 sexo   | nome_completo_segurado | 	estado_civil	    | renda_mensal    | profissao | pais_residencia | tipo_documento | ddd_celular_segurado | numero_celular_segurado | ddd_residencial_segurado | numero_residencial_segurado | numero_documento | orgao_expedidor | data_de_expedicao |           email |      cep_segurado | numero_endereco |  placa  | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar | ano_fabricacao | ano_modelo | chassi_modal     | observacao  | quantos_condutores | controle_identificacao | apolice_anterior | numero_item | coberturas_diferente | veiculo_apolice_anterior | nome_condutor | cpf_condutor | rg_condutor | data_nascimento_condutor | tempo_habilitacao_condutor | sexo_condutor | data_apolice_anterior |                   cobertura             | responsavel |     forma_pagamento     |   qtd_parcelas   | dia_vencimento |       banco     | numero_agencia | digito_agencia | numero_conta | digito_conta | cpf_responsavel_pagamento | dt_nasc    | sexo      | nome_completo | estado_civil | renda_mensal  | profissao  | pais   | ddd_celular | fone_celular | ddd_residencial | fone_residencial | tipo_documento | numero_documento | orgao_expedidor | data_expedicao | email           |    cep   |
	|   86790  | 35140188473 |  TESTE TESTE   |    01021984     |          81 |      999729485 | não    |        81       |           34635273 | Ren. Brasil Veículos  | Anual         | Data atual      |    Não   |     Classe 1 | 9BGXL75X0BC145394 |         20021985          | 0030236     | Não             | Não              | Taxi       |   Sem Isenção   | Não               | RCF - V    | Não                         | Feminino                | Solteiro                       | Advogado                     | Até 10 anos                          | Casa em condomínio fechado    | Não                                               | Não                                    | Até 2                          | 52040-010 | Próprio; proprietário ou sócio                       | Não                                                  | Não                      | Sim                                                 |                             CIELO |                PRÓPRIO | Positron Bloqueador RD link |                    IDENTICAR | Sim                                    | Sim           | Sim         | Sim          | Básico           | Não Contratada         | Não Contratada  |            0,00 |                 00,00 | Não Contratada      | Não Contratada | Não Contratada   |                   0,00 |                      00,00 | Não Contratada | Gratuita          | 000 - Não Informado  |       10 | Cotação realizada com Sucesso |  Normal  |  Feminino | 		TESTE TESTE		 |  Divorciado/Separado | Até R$ 1.400,00 |  ADVOGADO |          BRASIL |             RG | 		11			    |	     999999999		  |			11	    	     |	         88888888		   |          1234567 |        SSP - PE |          01012010 | teste@teste.com |          50791230 |           12345 | KHA7891 | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não	 |   Sim      | 1991           | 1991       | 9BFZK53A39B115881| TESTE TESTE | 01 Condutor        | 61811111111117         | 1234567890999    | 02          | Não                  |                      Não | teste teste   | 12345678909  | 8277372     | 20021985                 | Até 10 anos                |    Masculino  |      01092016         | Casco - Colisão, Incêndio, Roubo e Furto|      Não    | Ficha Comp. + Deb.Conta | 1 FCA + 1 debito |        1       | BANCO DO BRASIL |      0037      |       X        |     438888   |      7       |         11144477735       | 04/10/1989 | Masculino | TESTE TESTE   | Solteiro     | Não Informado | ACOUGUEIRO | BRASIL | 81          | 98779877     | 81              | 32113211         | RG             | 1234567          | SSP - PE        | 06/06/2013     | teste@teste.com | 51020000 |