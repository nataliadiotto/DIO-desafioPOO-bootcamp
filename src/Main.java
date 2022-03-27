import java.beans.JavaBean;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso(null, null, 0);
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso(null, null, 0);
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria("Mentoria Java", "descrição mentoria Java", LocalDate.now()); //modificar data
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devNatalia = new Dev();
		devNatalia.setNome("Natália");
		devNatalia.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + devNatalia.getConteudosInsctritos());
		devNatalia.progredir();
		devNatalia.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos: " + devNatalia.getConteudosInsctritos());
		System.out.println("Conteúdos concluídos: " + devNatalia.getConteudosConcluidos());
		
		System.out.println("XP: " + devNatalia.calcularXP());
		
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		Dev devGiovanni = new Dev();
		devGiovanni.setNome("Giovanni");
		devGiovanni.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos: " + devGiovanni.getConteudosInsctritos());
		devGiovanni.progredir();
		devGiovanni.progredir();
		devGiovanni.progredir();		
		System.out.println("-");
		System.out.println("Conteúdos inscritos: " + devGiovanni.getConteudosInsctritos());
		System.out.println("Conteúdos concluídos: " + devGiovanni.getConteudosConcluidos());
		System.out.println("XP: " + devGiovanni.calcularXP());
		
		
	}

}
