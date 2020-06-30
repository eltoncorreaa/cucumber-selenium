package mapfre.automationTestsMcc.utils.enums;

public enum TipoProdutoEnum {
	
	AUTOMAIS_CAMINHAO_ONLINE("AutoMais Caminhão On-line");
	
	private String descProduto;

	
	TipoProdutoEnum(String descProduto) {
		this.descProduto = descProduto;
	}

	public String getDescricao() {
		return descProduto;
	}
	
}
