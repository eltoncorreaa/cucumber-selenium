#language: pt
Funcionalidade: Avaliacaodo Seguro/Perfil -

  @AvaliacaoSeguroPerfil
  Esquema do Cenário: AvaliacaoSeguroPerfil - Teste tela Perfil
    Dado   Auto - Segurado/Seguro - a url do sistema
    Quando Auto - Segurado/Seguro - preencher o campo CPF/CNPJ "<cpf_cnpj>"
    Quando Auto - Segurado/Seguro - preencher o campo Nome Completo "<nome_completo>"
    Quando Auto - Segurado/Seguro - preencher o campo Data Nascimento "<data_nascimento>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Celular "<ddd_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Celular "<numero_celular>"
    Quando Auto - Segurado/Seguro - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando Auto - Segurado/Seguro - preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando Auto - Segurado/Seguro - preencher o campo Inicio Vigencia "<inicio_vigencia>"
    Então  tiro um print screen com altura "768" e largura "1366"
    Então  Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    
    ############################# Veiculo ####################################################
    
    Então Auto - Veiculo - preencher os dados do Veiculo
    Quando Auto - Veiculo - preencher o campo Chassis "<chassis>"
    Quando Auto - Veiculo - preencher o campo Veiculo Blindado "<veiculo_blindado>"
    Quando Auto - Veiculo - preencher o campo Uso "<uso>"
    Quando Auto - Veiculo - preencher o campo Isencao de Imposto "<isencao_imposto>"
    Quando Auto - Veiculo - preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando Auto - Veiculo - preencher o campo Modalidade "<modalidade>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Veiculo - clicar no botao Proximo Dados do Veiculo Complemento

   
  
   ##################################### Avaliacao Seguro - Perfil ###################################################
		  
	
    Quando Auto - Avaliacao Seguro - preencher o campo Segurado Principal Condutor "<segurado_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Sexo Principal Condutor "<sexo_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Estado Civil Principal Condutor "<estado_civil_princial_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Profissao Principal Condutor "<profissao_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Tempo de Habilitacao do Principal Condutor "<tempo_habilitacao_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Tipo de Residencia do Principal Condutor "<residencia_principal_condutor>"
    Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_reside_pessoas_menores_26_anos>"
    Quando Auto - Avaliacao Seguro - preencher o campo Principal Condutor Possui Filhos ou Funcionarios Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_filhos_funcionarios>"
    Quando Auto - Avaliacao Seguro - preencher o campo Quantidade de Veiculos na Residencia "<quantidade_veiculos_residencia>"
    Quando Auto - Avaliacao Seguro - preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Segurado e Utilizado mais que Dois Dias da Semana "<veiculo_segurado_utilizado_mais_que_dois_dias_semana>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Alienado ou Com Leasing "<veiculo_alienado_leasing>"
    Quando Auto - Avaliacao Seguro - preencher o campo Veiculo Possui Anti-Furto, Rastreador, Bloqueador ou Localizador "<veiculo_antifurto_rastreador_bloqueador_localizador>"
    Quando Auto - Avaliacao Seguro - preencher fabricante rastreador/localizador "<fabricante_rastreador_localizador>"
    Quando Auto - Avaliacao Seguro - preencher propriedade do rastreador "<propriedade_rastreador>"
    Quando Auto - Avaliacao Seguro - preencher bloqueadores "<bloqueador>"
    Quando Auto - Avaliacao Seguro - preencher dispositivo anti furto comum "<dispositivo_anti_furto_comum>"
    Quando Auto - Avaliacao Seguro - preencher o campo Existe Garagem ou Estacionamento Fechado para Veiculo "<garagem_estacionamento_fechado_veiculo>"
    Quando Auto - Avaliacao Seguro - preencher o campo Na Residencia "<na_residencia>"
    Quando Auto - Avaliacao Seguro - preencher o campo No Trabalho "<no_trabalho>"
    Quando Auto - Avaliacao Seguro - preencher o campo Na Faculdade "<na_faculdade>"
    Quando Auto - Avaliacao Seguro - preencher o campo CEP "<cep>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então Auto - Avaliacao Seguro - clicar no botao Proximo Perfil de Uso do Veiculo
    
    
    
    Exemplos: 
    | cpf_cnpj    | nome_completo | data_nascimento | ddd_celular | numero_celular |ddd_residencial | numero_residencial | tipo_seguro | tipo_calculo | inicio_vigencia | chassis           | ano_fabricacao | ano_modelo | veiculo_zero_km | veiculo | fabricante | codigo_fipe | valor_referencia | veiculo_blindado | uso        | isencao_imposto | chassis_remarcado | modalidade | segurado_principal_condutor | sexo_principal_condutor | estado_civil_princial_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor | residencia_principal_condutor | principal_condutor_reside_pessoas_menores_26_anos | principal_condutor_filhos_funcionarios | quantidade_veiculos_residencia | cep       | relacao_segurado_com_o_proprietario_legal_do_veiculo | veiculo_segurado_utilizado_mais_que_dois_dias_semana | veiculo_alienado_leasing | veiculo_antifurto_rastreador_bloqueador_localizador | garagem_estacionamento_fechado_veiculo | na_residencia | no_trabalho | na_faculdade | cobertura_basica | danos_morais_esteticos | danos_materiais | danos_corporais | objetos_transportados | cobertura_adicional | vidros         | extensao_reboque | apo_morte_por_ocupante | apo_invalidez_por_ocupante | apo_decessos   | assitencia_basica | valor_seguro | banco_maior_relacionamento | operacao | grupo_afinidade | operador | msgSucesso                    | renda_mensal    | pais_residencia | tipo_documento | numero_documento | orgao_expedidor | data_de_expedicao |           email |      cep | numero_endereco | fabricante_rastreador_localizador | propriedade_rastreador | bloqueador                  | dispositivo_anti_furto_comum | 
    | 11144477735 | TESTE TESTE   |        15121977 |          11 |      912345678 |             11 |           12345678 | Seguro Novo | Anual        | Data atual      | KNALN414BC5062125 |           2011 |       2012 | Não             |         |            |             |                  | Não              | Particular |     Sem Isenção | Não               | RCF - V    | Sim                         | Feminino                | Solteiro                       | Advogado                     | Até 10 anos                          | Casa em condomínio fechado    | Não                                               | Não                                    | Até 2                          | 07077-070 | Próprio; proprietário ou sócio                       | Não                                                  | Não                      | Sim                                                 | Sim                                    | Sim           | Sim         | Sim          | Básico           | Não Contratada         | Não Contratada  |            0,00 |                 00,00 | Não Contratada      | Não Contratada | Não Contratada   |                   0,00 |                      00,00 | Não Contratada | Gratuita          |              | 000 - Não Informado        |       20 |                 |          | Cotação realizada com Sucesso | Até R$ 1.400,00 |          BRASIL |             RG |          1234567 |          SSP-SP |          01012010 | teste@teste.com | 50791230 |           12345 |                             CIELO |                PRÓPRIO | Positron Bloqueador RD link |                    IDENTICAR |
    