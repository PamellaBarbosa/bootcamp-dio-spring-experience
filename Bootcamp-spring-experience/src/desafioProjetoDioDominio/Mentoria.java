package desafioProjetoDioDominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

//atributos privados, acesso apenas por gets e sets
	
	private LocalDate data;
	
	public Mentoria() { //construtor vázio
		
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public double calcularXP() { 
		return XP_padrao + 20d;
	}
	
	@Override
	
	public String toString() { 
		return '\n' + "Mentoria {" +
				"Título = '" + getTitulo() + '\'' +
				", Descrição = '" + getDescricao() + '\'' +
				", Data = " + data +
				"}";
				
								
	}

	
}
