#language: pt
Funcionalidade: MB011 - Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

  @runTestMB_SEGURADO
  Esquema do Cenário: MB011 - Renovacao Mapfre sem Sinistro Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)
            
    #--------------------------- FLUXO DE ACESSO A TELA DE SEGURADO ------------------------------- 
    Dado   Endosso - url do sistema
    Então  Endosso - clicar no menu Novo Endosso 
    Quando Endosso - preencher o campo apolice "<apolice>"
    Então  Endosso - clicar no botao Localizar Apolice
    Então  Endosso - clicar no botao Alterar Apolice
    #------------------------------------------------------------------------------------------------
    
    #--------------------------------------- SEGURADO ---------------------------------------------
    Quando Endosso - Segurado - preencher o campo Data Nascimento "<data_nascimento>"
    Quando Endosso - Segurado - preencher o campo Sexo Principal Condutor "<sexo_principal_condutor>"
    Quando Endosso - Segurado - preencher o campo Nome Completo "<nome_completo>"
    Quando Endosso - Segurado - preencher o campo Estado Civil Principal Condutor "<estado_civil_princial_condutor>"
    Quando Endosso - Segurado - preencher campo renda mensal "<renda_mensal>"
    Quando Endosso - Segurado - Profissao Principal Condutor "<profissao_principal_condutor>"
    Quando Endosso - Segurado - preencher pais de residencia "<pais_residencia>"
    Quando Endosso - Segurado - preencher o campo DDD Celular "<ddd_celular>"
    Quando Endosso - Segurado - preencher o campo Numero Celular "<numero_celular>"
    Quando Endosso - Segurado - preencher o campo DDD Residencial "<ddd_residencial>"
    Quando Endosso - Segurado - preencher o campo Numero Residencial "<numero_residencial>"
    Quando Endosso - Segurado - preencher o campo DDD Comercial "<ddd_comercial>"
    Quando Endosso - Segurado - preencher o campo Numero Comercial "<numero_comercial>"
    Quando Endosso - Segurado - preencher o campo DDD Outros "<ddd_outros>"
    Quando Endosso - Segurado - preencher o campo Numero Outros "<numero_outros>"
    Quando Endosso - Segurado - preencher tipo de documento "<tipo_documento>"
	Quando Endosso - Segurado - preencher numero do documento "<numero_documento>"
	Quando Endosso - Segurado - preencher orgao expedidor "<orgao_expedidor>"
	Quando Endosso - Segurado - preencher data de expedicao "<data_de_expedicao>"
	Quando Endosso - Segurado - preencher e-mail "<email>"
	Então Endosso - Segurado - clicar no botao Nao sei o CEP
    Quando Endosso - Segurado - preencher o campo Estado "<estado>"
    Quando Endosso - Segurado - preencher o campo Cidade "<cidade>"
    Quando Endosso - Segurado - preencher o campo Logradouro "<logradouro>"
    Então Endosso - Segurado - clicar no botao Pesquisar CEP
    Então Endosso - Segurado - selecionar o CEP
    Então Endosso - Segurado - clicar no botao Confirmar CEP
	Quando Endosso - Segurado - preencher numero "<numero_endereco>"
	Quando Endosso - Segurado - preencher complemento "<complemento_endereco>"
	Então tiro um print screen com altura "768" e largura "1366"
    Então Endosso - Segurado - clicar no botao proximo 
    Então Endosso - Segurado - clicar no botao popup   
    #------------------------------------------------------------------------------------------------
    
    
    Exemplos: 
      | apolice       | data_nascimento | sexo_principal_condutor | nome_completo | estado_civil_princial_condutor | renda_mensal    | profissao_principal_condutor | pais_residencia | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | tipo_documento | numero_documento | orgao_expedidor | data_de_expedicao |           email |      cep | numero_endereco | complemento_endereco | estado        | cidade | logradouro         |
      | 3897410409631 |        15121977 | Feminino                | TESTE TESTE   | Solteiro                       | Até R$ 1.400,00 | ADVOGADO                     |          BRASIL |          81 |       98779877 |              81 |           32113211 |            81 |         32113211 |         81 |      32113211 |             RG |          1234567 |        SSP - SP |          01012010 | teste@teste.com | 50791230 |           12345 | teste teste          | Pernambuco PE | RECIFE | Rua Pereira Passos |
