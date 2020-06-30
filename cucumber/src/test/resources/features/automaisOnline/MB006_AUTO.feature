#language: pt
Funcionalidade: MB_AUTO_006 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Jurídica, Multiitem, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)

  @MB006_AUTO
  Esquema do Cenário: MB_AUTO_006 - (Tipo Seguro: Seguro Novo, Tipo Pessoa: Jurídica, Multiitem, Cobertura: Colisão, Incêncio, Roubo e Furto, Calculo: Normal, Pagamento: FCA)
    
    #------------------------------------ ACESSO AO SISTEMA ------------------------------------------
    Dado Auto - a url do sistema para nova cotacao "<corretor>"
    #-------------------------------------------------------------------------------------------------
    
    #------------------------------------ SEGURADO/SEGURO --------------------------------------------
    Quando Auto - Segurado/Seguro - preencher o campo cpf/cpnj "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Empresa "<nome_completo>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"    
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando Auto - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    #Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- VEICULO ------------------------------------------------
    Quando Auto - Veiculo - preencher o campo Codigo Fipe "<fipe>"
    Então Auto - Veiculo - preencher opcao modal "<opcao>" 
    Então Auto - Veiculo - clicar no botao salvar
    Quando Auto - Veiculo - preencher o campo Ano de Fabricacao "<ano_fabricacao>"
    Quando Auto - Veiculo - preencher o campo Ano do Modelo "<ano_modelo>"
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Quando Auto - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Auto - Veiculo - preencher o campo Modalidade "<modalidade>"
    #Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- PERFIL -------------------------------------------------
    Quando Auto - Avaliacao Seguro - preencher pergunta com perfil "<perfil>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Alienado ou Com Leasing "<veiculo_alienado_leasing>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
	Quando Auto - Avaliacao Seguro - preencher o campo CEP "<cep>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Alienado ou Com Leasing "<veiculo_alienado_leasing>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
    #Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- COBERTURA ----------------------------------------------
    #Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Coberturas - clicar no botão Proximo
    #-------------------------------------------------------------------------------------------------
    
    #---------------------------------------- CALCULO ------------------------------------------------
    Quando Auto - Calculo - preencher o campo Banco de Maior Relacionamento "<banco_relacionamento>"
    Então Auto - Calculo - preencher o campo Operacao "<operacao>"
    Então Auto - Calculo - clicar no botao Calcular
	Então Auto - Calculo - clicar no botao Sim Modal Sem Aceitacao
    Então Auto - Calculo - preencher chassi Modal Sem Aceitacao "<chassi_modal>"
    Então Auto - Calculo - preencher observacao Modal Sem Aceitacao "<observacao>"
    Então Auto - Calculo - clicar no botao Enviar Modal Sem Aceitacao
    #Então tiro um print screen com altura "768" e largura "1366"
    #-------------------------------------------------------------------------------------------------

    Exemplos:  
  | corretor | cpf_cnpj       | nome_completo  | data_nascimento   | ddd_celular | numero_celular | perfil | ddd_residencial | numero_residencial | tipo_seguro  | tipo_calculo  | inicio_vigencia | fipe        | veiculo_zero_km | veiculo_blindado | uso        | isencao_imposto | chassis_remarcado | modalidade | segurado_principal_condutor | sexo_principal_condutor | estado_civil_princial_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor | residencia_principal_condutor | principal_condutor_reside_pessoas_menores_26_anos | principal_condutor_filhos_funcionarios | quantidade_veiculos_residencia | cep       | relacao_segurado_com_o_proprietario_legal_do_veiculo | veiculo_segurado_utilizado_mais_que_dois_dias_semana | veiculo_alienado_leasing | veiculo_antifurto_rastreador_bloqueador_localizador | fabricante_rastreador_localizador | propriedade_rastreador | bloqueador                  | dispositivo_anti_furto_comum | garagem_estacionamento_fechado_veiculo | na_residencia | no_trabalho | na_faculdade | cobertura_basica | danos_morais_esteticos | danos_materiais | danos_corporais | objetos_transportados | cobertura_adicional | vidros         | extensao_reboque | apo_morte_por_ocupante | apo_invalidez_por_ocupante | apo_decessos   | assitencia_basica | banco_relacionamento | operacao | msgSucesso                    | franquia | 	 sexo    | nome_completo_segurado | 	estado_civil	 | renda_mensal    | profissao | pais_residencia | tipo_documento | ddd_celular_segurado | numero_celular_segurado | ddd_residencial_segurado | numero_residencial_segurado | numero_documento | orgao_expedidor | data_de_expedicao |           email |      cep_segurado | numero_endereco |  placa  | abs | cambio_automatico | retrovisor_eletrico | travas_eletricas | air_bag | computador_bordo | rodas_liga | vidros_eletricos | ar_condicionado | direcao_eletrica | sensor_estacinamento | banco_couro | hidraulica | teto_solar | ano_fabricacao | ano_modelo | chassi_modal     | observacao  | opcao | estado        | cidade | logradouro         |
  | 86790    | 23418742000137 |  TESTE TESTE   |    01011980  	   |          11 |      999999999 | não    |        11 	     |           88888888 | Seguro Novo  | Anual         | Data atual      | 0030236     | Não             | Não              | Particular |   Sem Isenção   | Não               | RCF - V    | Não                         | Feminino                | Solteiro                       | Advogado                     | Até 10 anos                          | Casa em condomínio fechado    | Não                                               | Não                                    | Até 2                          | 07077-070 | Próprio; proprietário ou sócio                       | Não                                                  | Não                      | Sim                                                 |                             CIELO |                PRÓPRIO | Positron Bloqueador RD link |                    IDENTICAR | Sim                                    | Sim           | Sim         | Sim          | Básico           | Não Contratada         | Não Contratada  |            0,00 |                 00,00 | Não Contratada      | Não Contratada | Não Contratada   |                   0,00 |                      00,00 | Não Contratada | Gratuita          | 000 - Não Informado  |       10 | Cotação realizada com Sucesso |  normal  |  Feminino | 		TESTE TESTE		  |  Divorciado/Separado | Até R$ 1.400,00 |  ADVOGADO |          BRASIL |             RG | 		11			 |	     999999999		   |			11	    	  |	         88888888		    |          1234567 |        SSP - SP |          01012010 | teste@teste.com | 	50791230	   |           12345 | KHA7891 | Não |        Não        |         Não         |        Não       |   Não   |        Não       |     Não    |       Não        |       Não       |       Não        |         Não          |    Sim      |    Não	  |   Sim  	   | 1991           | 1991       | 9BFZK53A39B115881| TESTE TESTE |	  1   | Pernambuco PE | RECIFE | Rua Pereira Passos |
