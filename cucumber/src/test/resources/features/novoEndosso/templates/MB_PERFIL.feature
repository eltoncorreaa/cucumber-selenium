#language: pt
Funcionalidade: MB019 - Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

  @runTestMB_ENDOSSO_19
  Esquema do Cenário: MB019 - Teste tela Perfil
            
    #--------------------------- FLUXO DE ACESSO A TELA DE COBERTURAS ------------------------------- 
    Dado Endosso - Perfil - url do sistema
    Então Endosso - Perfil - clicar no menu Novo Endosso 
    Quando Endosso - Perfil - preencher o campo apolice "<apolice>"
    Então Endosso - Perfil - clicar no botao Localizar Apolice
    Então Endosso - Perfil - clicar no botao Alterar Apolice
    Então Endosso - Perfil - clicar no passo do wizard "<passo_perfil>"
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- PERFIL ---------------------------------------------    
    Quando Endosso - Perfil - preencher segurado é o principal condutor "<segurado_principal_condutor>"
    Quando Endosso - Perfil - preencher campo CPF "<cpf_condutor>"
    Quando Endosso - Perfil - preencher campo CNH "<cnh_condutor>"
    Quando Endosso - Perfil - preencher nome principal condutor "<nome_principal_condutor>"
    Quando Endosso - Perfil - preencher data nascimento principal condutor "<data_nascimento_principal_condutor>"
    Quando Endosso - Perfil - preencher sexo principal condutor "<sexo_principal_condutor>"
    Quando Endosso - Perfil - preencher estado civil principal condutor "<estado_civil_principal_condutor>"
    Quando Endosso - Perfil - preencher profissao principal condutor "<profissao_principal_condutor>"
    Quando Endosso - Perfil - preencher tempo habilitacao principal condutor "<tempo_habilitacao_principal_condutor>" 
    Quando Endosso - Perfil - preencher tipo residencia principal condutor "<tipo_residencia_principal_condutor>"
    Quando Endosso - Perfil - pergunta principal condutor reside com menores vinte seis anos "<reside_menores_26_anos>" 
    Quando Endosso - Perfil - pergunta principal condutor reside com condutores menores vinte seis anos "<condutores_menores_26_anos>" 
    Quando Endosso - Perfil - preenche quantidade de veículos na residencia "<qtd_veiculos_residencia>" 
	Então Endosso - Perfil - clicar no botao Nao sei o CEP
    Quando Endosso - Perfil - preencher o campo Estado "<estado>"
    Quando Endosso - Perfil - preencher o campo Cidade "<cidade>"
    Quando Endosso - Perfil - preencher o campo Logradouro "<logradouro>"
    Então Endosso - Perfil - clicar no botao Pesquisar CEP
    Então Endosso - Perfil - selecionar o CEP
    Então Endosso - Perfil - clicar no botao Confirmar CEP
    Quando Endosso - Perfil - relacao segurado proprietario legal "<relacao_segurado_proprietario>" 
    Quando Endosso - Perfil - veiculo é utilizado mais que 2 dias na semana "<veiculo_utilizado_mais_dois_dias>" 
    Quando Endosso - Perfil - veiculo alienado ou leasing "<veiculo_alienado_leasing>" 
    Quando Endosso - Perfil - veiculo possui disposisitivo anti furto "<dispositivo_anti_furto>" 
    Quando Endosso - Perfil - preencher fabricante rastreador/localizador "<fabricante_rastreador_localizador>" 
    Quando Endosso - Perfil - preencher propriedade do rastreador "<propriedade_rastreador>" 
    Quando Endosso - Perfil - preencher bloqueadores "<bloqueador>" 
    Quando Endosso - Perfil - preencher dispositivo anti furto comum "<dispositivo_anti_furto_comum>" 
    Quando Endosso - Perfil - possui garagem ou estacionamento fechado "<garagem_estacionamento_fechado>" 
    Quando Endosso - Perfil - preencher na garagem ou estacionamento na residencia "<garagem_estacionamento_na_residencia>" 
    Quando Endosso - Perfil - preencher na garagem ou estacionamento no trabalho "<garagem_estacionamento_no_trabalho>" 
    Quando Endosso - Perfil - preencher na garagem ou estacionamento na faculdade "<garagem_estacionamento_na_faculdade>" 
    Quando Endosso - Perfil - clicar no botao proximo   
    #------------------------------------------------------------------------------------------------
    
    
    Exemplos: 
      | apolice       | passo_perfil     | segurado_principal_condutor | cpf_condutor     | cnh_condutor  | nome_principal_condutor | data_nascimento_principal_condutor | sexo_principal_condutor | estado_civil_principal_condutor | profissao_principal_condutor | tempo_habilitacao_principal_condutor  | tipo_residencia_principal_condutor  | reside_menores_26_anos | condutores_menores_26_anos | qtd_veiculos_residencia | cep      | relacao_segurado_proprietario   | veiculo_utilizado_mais_dois_dias | veiculo_alienado_leasing  | dispositivo_anti_furto | fabricante_rastreador_localizador | propriedade_rastreador    | bloqueador                    | dispositivo_anti_furto_comum | garagem_estacionamento_fechado | garagem_estacionamento_na_residencia | garagem_estacionamento_no_trabalho | garagem_estacionamento_na_faculdade | estado        | cidade | logradouro         | 
      | 3897410409631 | 4                | Não                         |  11144477735     | 123456        | TESTE TESTE             | 26051978                           | Masculino               | Solteiro                        | Senador                      | Até 5 anos                            | Outros                              | Sim                    | Sim                        | Acima de 4              | 50791230 | Próprio; proprietário ou sócio  | Sim                              |  Não                      | Sim                    | CIELO                             | PRÓPRIO                   | Positron Bloqueador RD link   | IDENTICAR                    | Sim                            | Sim                                  | Sim                                | Sim                                 | Pernambuco PE | RECIFE | Rua Pereira Passos |
