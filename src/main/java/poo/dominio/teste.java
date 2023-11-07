package poo.dominio;

import java.time.LocalDate;

public class teste {
    private static final String SEPARADOR = "========================================================================================";
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Orientação a Objeto");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java POO");
        mentoria.setDescricao("Orientação a objeto");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Desenvolvimento Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Felipe");
        dev.inscricaoCurso(bootcamp);

        System.out.println(SEPARADOR);
        System.out.println("Conteúdos inscritos Felipe: "+ dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println(SEPARADOR);
        System.out.println("Conteúdos inscritos Felipe: "+ dev.getConteudosInscritos());
        System.out.println(SEPARADOR);
        System.out.println("Conteúdos concluídos Felipe: "+ dev.getConteudosConcluidos());
        System.out.println(SEPARADOR);
        System.out.println("Pontuação: "+ dev.calcularPontuacao());










    }
}
