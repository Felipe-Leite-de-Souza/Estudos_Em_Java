package exemploxml;

import java.math.BigDecimal;

public class Produto {
	private Long codigo;
	private String descricao;
	private BigDecimal valor;
	
	public Produto(Long codigo, String descricao, BigDecimal valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Long getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
