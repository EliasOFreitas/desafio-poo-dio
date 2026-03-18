import br.com.dio.desafiopoo.dominio.Bootcamp;
import br.com.dio.desafiopoo.dominio.Curso;
import br.com.dio.desafiopoo.dominio.Dev;
import br.com.dio.desafiopoo.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java Essentials");
        curso1.setDescricao("Domine a sintaxe, POO e as principais bibliotecas da plataforma Java.");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript Moderno");
        curso2.setDescricao("Aprenda ES6+, manipulação de DOM e conceitos assíncronos para web.");
        curso2.setCargaHoraria(40);

        Curso curso3 = new Curso();
        curso3.setTitulo("Python para Dados");
        curso3.setDescricao("Introdução à análise de dados, automação e bibliotecas científicas.");
        curso3.setCargaHoraria(60);

        Curso curso4 = new Curso();
        curso4.setTitulo("TypeScript Avançado");
        curso4.setDescricao("Adicione tipagem estática e escalabilidade aos seus projetos front-end.");
        curso4.setCargaHoraria(30);

        Curso curso5 = new Curso();
        curso5.setTitulo("Desenvolvimento Go (Golang)");
        curso5.setDescricao("Criação de microserviços eficientes e sistemas de alta performance.");
        curso5.setCargaHoraria(50);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("AlmavivA - Back-end com Java & QA");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNatalia = new Dev();
        devNatalia.setNome("Natália");
        devNatalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Natália:" + devNatalia.getConteudosInscritos());
        devNatalia.progredir();
        devNatalia.progredir();
        devNatalia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Natália:" + devNatalia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Natália:" + devNatalia.getConteudosConcluidos());
        System.out.println("XP:" + devNatalia.calcularTotalXp());

        System.out.println("-------");

        Dev devElias = new Dev();
        devElias.setNome("Elias");
        devElias.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Elias:" + devElias.getConteudosInscritos());
        devElias.progredir();
        devElias.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Elias:" + devElias.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Elias:" + devElias.getConteudosConcluidos());
        System.out.println("XP:" + devElias.calcularTotalXp());

    }

}
