package desafioProjetoDioDominio;

public class Curso extends Conteudo {

//atributos privados, acesso apenas por gets e sets
	
	private int cargaHoraria;
	
	public Curso() { //construtor v�zio
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXP() {
		return XP_padrao * cargaHoraria;
	}
	
	@Override
	
	public String toString() {
		return "Curso {" +
				"T�tulo = '" + getTitulo() + '\'' +
				", Descri��o = '" + getDescricao() + '\'' +
				", Carga Hor�ria = " + cargaHoraria + 
				"}";
	}
	
}
