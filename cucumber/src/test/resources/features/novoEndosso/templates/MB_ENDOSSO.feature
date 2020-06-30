#language: pt
Funcionalidade: MB011 - Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

  @runTestMB_ENDOSSO
  Esquema do Cenário: MB011 - Renovacao Mapfre sem Sinistro Renovacao Mapfre sem Sinistro (PF, Importacao de Apolice,  Multi Item, V. Outros)

    #--------------------------- FLUXO DE ACESSO A TELA DE ENDOSSO -----------------------------------
    Dado Endosso - url do sistema
    Então Endosso - clicar no menu Novo Endosso
    Quando Endosso - preencher o campo apolice "<apolice>"
    Quando Endosso - preencher o campo CPF/CNPJ "<cpf_cnpj>"
    Quando Endosso - preencher o campo nome "<nome_segurado>"
    Quando Endosso - preencher o campo placa "<placa>"
    Quando Endosso - preencher o campo chassi "<chassi>"
    Então Endosso - clicar no botao Localizar Apolice
    Então Endosso - clicar no botao Alterar Apolice
    Então Endosso - clicar no botao Cancelar Apolice
    Então Endosso - clicar no botao Excluir Item
    Então Endosso - clicar no passo do wizard "<passo>"
    #------------------------------------------------------------------------------------------------

    Exemplos:
      | apolice       |		cpf_cnpj	|	nome_segurado	|	placa	|		chassi   	| passo |
      | 3897410409631 |	  11144477735	|	 TESTE TESTE	|  KHA9867	| KNALN414BC5062125 | 3     |