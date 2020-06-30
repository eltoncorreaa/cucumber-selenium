#language: pt
Funcionalidade: MB_Teste - Automais. Realizarcotacao e imprimir.

  @runTestMB_Teste
  Esquema do Cenário: MB_Teste - Automais. Realizarcotacao e imprimir.
    Dado a url do sistema
    Então preencher os Dados do Segurado
    Quando preencher o campo CPF
    Quando preencher o campo Nome Completo "<nome_completo>"
    Quando preencher o campo Data Nascimento "<data_nascimento>"
    Quando preencher o campo DDD Celular "<ddd_celular>"
    Quando preencher o campo Numero Celular "<numero_celular>"
    Quando preencher o campo DDD Residencial "<ddd_residencial>"
    Quando preencher o campo Numero Residencial "<numero_residencial>"
    Então preencher os Dados do Seguro
    Quando preencher o campo Tipo de Seguro "<tipo_seguro>"
    Quando preencher o campo Tipo de Calculo "<tipo_calculo>"
    Quando preencher o campo Inicio Vigencia "<inicio_vigencia>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então clicar no botao Iniciar Calculo
    Então preencher os dados do Veiculo
    Quando preencher o campo Chassis "<chassis>"
    Então validar o campo Ano de Fabricacao "<ano_fabricacao>"
    Então validar o campo Ano do Modelo "<ano_modelo>"
    Então validar o campo Veiculo Zero Km "<veiculo_zero_km>"
    Então validar o campo Veiculo "<veiculo>"
    Então validar o campo Fabricante "<fabricante>"
    Então validar o campo Codigo Fipe "<codigo_fipe>"
    Então validar o campo Valor de Referencia "<valor_referencia>"
    Então preencher os Dados do Veiculo Complemento
    Quando preencher o campo Veiculo Blindado "<veiculo_blindado>"
    Quando preencher o campo Uso "<uso>"
    Quando preencher o campo Categoria tarifaria
    Quando preencher o campo Isencao de Imposto "<isencao_imposto>"
    Quando preencher o campo Chassis Remarcado "<chassis_remarcado>"
    Quando preencher o campo Modalidade "<modalidade>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então clicar no botao Proximo Dados do Veiculo Complemento
    Então preencher o Perfil do Principal Condutor
    Quando preencher o campo Segurado Principal Condutor "<segurado_principal_condutor>"
    Quando preencher o campo Sexo Principal Condutor "<sexo_principal_condutor>"
    Quando preencher o campo Estado Civil Principal Condutor "<estado_civil_princial_condutor>"
    Quando preencher o campo Profissao Principal Condutor "<profissao_principal_condutor>"
    Quando preencher o campo Tempo de Habilitacao do Principal Condutor "<tempo_habilitacao_principal_condutor>"
    Quando preencher o campo Tipo de Residencia do Principal Condutor "<residencia_principal_condutor>"
    Quando preencher o campo Principal Condutor Reside com Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_reside_pessoas_menores_26_anos>"
    Quando preencher o campo Principal Condutor Possui Filhos ou Funcionarios Menores de vinte e seis anos que Possam Utilizar o Veiculo "<principal_condutor_filhos_funcionarios>"
    Quando preencher o campo Quantidade de Veiculos na Residencia "<quantidade_veiculos_residencia>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então preencher o Perfil de Uso do Veiculo
    Quando preencher o campo Relacao do Segurado com o Proprietario Legal do Veiculo "<relacao_segurado_com_o_proprietario_legal_do_veiculo>"
    Quando preencher o campo Veiculo Segurado e Utilizado mais que Dois Dias da Semana "<veiculo_segurado_utilizado_mais_que_dois_dias_semana>"
    Quando preencher o campo Veiculo Alienado ou Com Leasing "<veiculo_alienado_leasing>"
    Quando preencher o campo Veiculo Possui Anti-Furto, Rastreador, Bloqueador ou Localizador "<veiculo_antifurto_rastreador_bloqueador_localizador>"
    Quando preencher o campo Existe Garagem ou Estacionamento Fechado para Veiculo "<garagem_estacionamento_fechado_veiculo>"
    Quando preencher o campo Na Residencia "<na_residencia>"
    Quando preencher o campo No Trabalho "<no_trabalho>"
    Quando preencher o campo Na Faculdade "<na_faculdade>"
    Quando preencher o campo CEP "<cep>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então clicar no botao Proximo Perfil de Uso do Veiculo
    Quando preencher os Pacotes de Cobertura Basica "<cobertura_basica>"
    Então validar RCF - Danos Morais / Esteticos "<danos_morais_esteticos>"
    Então validar RCF - Danos Materiais "<danos_materiais>"
    Então validar RCF - Danos Corporais "<danos_corporais>"
    Então validar RCF - Objetos Transportados "<objetos_transportados>"
    Então validar Vidros "<vidros>"
    Então validar Extensao Reboque "<extensao_reboque>"
    Então validar APO - Morte (por Ocupante) "<apo_morte_por_ocupante>"
    Então validar APO - Invalidez (por Ocupante) "<apo_invalidez_por_ocupante>"
    Então validar APO - Decessos "<apo_decessos>"
    Então validar Assistencia basica "<assitencia_basica>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então clicar no botão Proximo Pacotes de Coberturas
    Então validar o Valor do Seguro "<valor_seguro>"
    Quando preencher o campo Descontos/Campanha "<descontos_campanha>"
    Quando preencher o campo Banco Maior Relacionamento "<banco_maior_relacionamento>"
    Quando preencher o campo Grupo de Afinidade "<grupo_afinidade>"
    Quando preencher o campo Operador "<operador>"
    Quando preencher o campo Operacao "<operacao>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então clicar no botao Calcular
    Então validar mensagem de sucesso "<msgSucesso>"
    Então tiro um print screen com altura "768" e largura "1366"
    Então clicar no botao Imprimir
    Então troca de aba e clicar no botão Imprimir
    Então tiro um print screen com altura "768" e largura "1366"

    Exemplos: 
      | nome_completo | data_nascimento | ddd_celular | numero_celular |ddd_residencial | numero_residencial | tipo_seguro | tipo_calculo | inicio_vigencia | chassis           | ano_fabricacao | ano_modelo | veiculo_zero_km | veiculo | fabricante | codigo_fipe | valor_referencia | veiculo_blindado | uso        | isencao_imposto | chassis_remarcado | modalidade | segurado_principal_condutor | sexo_principal_condutor | estado_civil_princial_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor | residencia_principal_condutor | principal_condutor_reside_pessoas_menores_26_anos | principal_condutor_filhos_funcionarios | quantidade_veiculos_residencia | cep       | relacao_segurado_com_o_proprietario_legal_do_veiculo | veiculo_segurado_utilizado_mais_que_dois_dias_semana | veiculo_alienado_leasing | veiculo_antifurto_rastreador_bloqueador_localizador | garagem_estacionamento_fechado_veiculo | na_residencia | no_trabalho | na_faculdade | cobertura_basica | danos_morais_esteticos | danos_materiais | danos_corporais | objetos_transportados | cobertura_adicional | vidros         | extensao_reboque | apo_morte_por_ocupante | apo_invalidez_por_ocupante | apo_decessos   | assitencia_basica | valor_seguro | banco_maior_relacionamento | operacao | grupo_afinidade | operador | msgSucesso                    |
      | TESTE TESTE   |        15121977 |          11 |      912345678 |             11 |           12345678 | Seguro Novo | Anual        | Data atual      | KNALN414BC5062125 |           2011 |       2012 | Não             |         |            |             |                  | Não              | Particular |                 | Não               | RCF - V    | Sim                         | Feminino                | Solteiro                       | Advogado                     | Até 10 anos                          | Casa em condomínio fechado    | Não                                               | Não                                    | Até 2                          | 07077-070 | Próprio; proprietário ou sócio                       | Não                                                  | Não                      | Não                                                 | Sim                                    | Sim           | Sim         | Sim          | Básico           | Não Contratada         | Não Contratada  |            0,00 |                 00,00 | Não Contratada      | Não Contratada | Não Contratada   |                   0,00 |                      00,00 | Não Contratada | Gratuita          |              | 000 - Não Informado        |       20 |                 |          | Cotação realizada com Sucesso |
