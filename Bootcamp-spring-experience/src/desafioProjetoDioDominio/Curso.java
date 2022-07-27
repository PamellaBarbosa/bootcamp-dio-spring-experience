package desafioProjetoDioDominio;

public class Curso extends Conteudo {

//atributos privados, acesso apenas por gets e sets
	
	private int cargaHoraria;
	
	public Curso() { //construtor vázio
		
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
				"Título = '" + getTitulo() + '\'' +
				", Descrição = '" + getDescricao() + '\'' +
				", Carga Horária = " + cargaHoraria + 
				"}";
	}
	
}
