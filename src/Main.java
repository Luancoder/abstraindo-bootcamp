import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso POO");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Curso POO js");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Java");
        mentoria.setDate(LocalDate.now());
        //System.out.println(mentoria);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de Js");
        mentoria2.setDescricao("Descrição Js");
        mentoria2.setDate(LocalDate.now());
        //System.out.println(mentoria2);

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Descrição bootcamp Java");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devLuan = new Dev("Luan");
        devLuan.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Incritos Luan" + devLuan.getConteudoInscritos());

        devLuan.progredir();
        devLuan.progredir();
        System.out.println("Conteúdos Concluidos Luan" + devLuan.getConteudosConcluidos());
        System.out.println(devLuan.getConteudoInscritos());
        System.out.println("XP:" + devLuan.calcularTotalXp());

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Incritos João" + devJoao.getConteudoInscritos());


        devJoao.progredir();
        System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println(devJoao.getConteudoInscritos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
