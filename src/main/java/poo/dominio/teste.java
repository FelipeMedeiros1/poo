package poo.dominio;

import java.time.LocalDate;

public class teste {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("Orientação a Objeto");
        curso.setCargaHoraria(8);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java POO");
        mentoria.setDescricao("Orientação a objeto");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);



    }
}
