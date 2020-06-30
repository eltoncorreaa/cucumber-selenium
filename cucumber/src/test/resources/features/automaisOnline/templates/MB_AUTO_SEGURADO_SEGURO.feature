#language: pt
Funcionalidade: MB_Teste - Automais. Realizarcotacao e imprimir.

  @MB_AUTO_SEGURADO_SEGURO
  Esquema do Cenário: MB_Teste - Automais. Realizarcotacao e imprimir.
  
  	############################# SEGURADO/SEGURO #################################################
    Dado Auto - Segurado/Seguro - a url do sistema
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
    Entao Auto - Segurado/Seguro - clicar no botao Iniciar Calculo
    #Então tiro um print screen com altura "768" e largura "1366"
       
    # ---------------------SEGURO----------------------------------
 
	
	
	
    Exemplos: 
    | cpf_cnpj    | nome_completo | data_nascimento | ddd_celular | numero_celular | ddd_residencial | numero_residencial | ddd_comercial | numero_comercial | ddd_outros | numero_outros | tipo_seguro         | tipo_calculo | inicio_vigencia | sinistro_vigencia | classe_bonus | renovacao_corretor |
    | 11144477735 | TESTE TESTE   |        15121977 |          11 |      912345678 |             11  |           12345678 | 11            | 912345678        | 11         | 912345678     | Ren. Mapfre Seguros | Bianual      | Data atual      | Sim               | Classe 1     | Sim                |
