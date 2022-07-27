package desafioProjetoDioDominio;

public abstract class Conteudo { //não será instanciada pois é uma classe abstract

	protected static final double XP_padrao = 10d; //apenas classes filhas teram acesso

//atributos privados, acesso apenas por gets e sets
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXP();
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
