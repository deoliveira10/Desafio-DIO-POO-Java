import Model.Bootcamp;
import Model.Curso;
import Model.Dev;
import Model.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Do Básico ao avançado");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Intermediário");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("description java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Do Básico ao Avançado");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXP());

        System.out.println("----------");


        Dev devValdeir = new Dev();
        devValdeir.setNome("Valdeir");
        devValdeir.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Valdeir" + devValdeir.getConteudosInscritos());
        devValdeir.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Valdeir" + devValdeir.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Valdeir" + devValdeir.getConteudosConcluidos());
        System.out.println("XP:" + devValdeir.calcularTotalXP());
    }
}