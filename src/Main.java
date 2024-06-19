import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdos Inscritos Leonardo:" + devLeonardo.getConteudosInscritos());
        devLeonardo.progredir();
        devLeonardo.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos Inscritos Leonardo:" + devLeonardo.getConteudosInscritos());
        System.out.printf("Conteúdos Concluídos Leonardo:" + devLeonardo.getConteudosConcluidos());
        System.out.printf("XP:" + devLeonardo.calcularTotalXp());

        System.out.println("--------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.printf("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.printf("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.printf("Conteúdos Concluídos Joao:" + devJoao.getConteudosConcluidos());
        System.out.printf("XP:" + devJoao.calcularTotalXp());
    }
}
