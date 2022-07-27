package desafioProjetoDioDominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

//atributos privados, acesso apenas por gets e sets

	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //ao decorrer das inscri��es ser� guardadas as mesmas
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); //ao decorrer das conclus�es ser� guardadas as mesmas
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) { //m�todo de inscri��o no boot
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() { //m�todo de progress�o
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.err.println("N�o h� matricula em nenhum conte�do.");
		}
		
	}
	
	public double calcularTotalXp() { ///m�todo de c�lculo de XP 
		return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	
	
	
}
