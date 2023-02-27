import com.br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(2);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Curso de Java Script");
        curso2.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConsteudos().add(curso1);
        bootcamp.getConsteudos().add(curso2);
        bootcamp.getConsteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Tarcizo Leite");
        dev.inscreverEmBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos inscritos" + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + dev.getConteudosInscritos());
        System.out.println("XP" + dev.calcularXp());


    }
}