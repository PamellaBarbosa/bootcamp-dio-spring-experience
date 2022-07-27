import java.time.LocalDate;

//importa��o pois encontra-se em pacote diferente da classe main
import desafioProjetoDioDominio.Curso;
import desafioProjetoDioDominio.Dev;
import desafioProjetoDioDominio.Mentoria;
import desafioProjetoDioDominio.Bootcamp;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso(); //instanciando a classe curso
		
		curso.setTitulo("Programa��o Orientada a Objetos");
		curso.setDescricao("Praticando com a dio POO");
		curso.setCargaHoraria(8);
		//System.out.println(curso);
		
		Mentoria mentoria = new Mentoria(); //instanciando a classe mentoria
		mentoria.setTitulo("Mentoria de POO");
		mentoria.setDescricao("Mentoria POO");
		mentoria.setData(LocalDate.now());
		//System.out.println(mentoria);
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Spring Experience");
		bootcamp.setDescricao("Springboot e Java");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);

		
		Dev devClara = new Dev();
		devClara.setNome("Clara");
		devClara.inscreverBootcamp(bootcamp);
		System.out.println("Clara - Conte�dos Inscritos: " + devClara.getConteudosInscritos());
		devClara.progredir();
		devClara.progredir();
		System.out.println("---");
		System.out.println("Clara - Conte�dos Inscritos: " + devClara.getConteudosInscritos());
		System.out.println("Clara - Conte�dos Concluidos: " + devClara.getConteudosConcluidos());
		System.out.println("XP: " + devClara.calcularTotalXp());
		
		Dev devPedro = new Dev();
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Pedro - Conte�dos Inscritos: " + devPedro.getConteudosInscritos());
		devPedro.progredir();
		System.out.println("---");
		System.out.println("Pedro - Conte�dos Inscritos: " + devPedro.getConteudosInscritos());
		System.out.println("Pedro - Conte�dos Concluidos: " + devPedro.getConteudosConcluidos());
		System.out.println("XP: " + devPedro.calcularTotalXp());

	}
}
