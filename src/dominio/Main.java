package dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso cursoAtual = new Curso();
        cursoAtual.setTitulo("curso Java");
        cursoAtual.setDescricao("um curso muito complexo e cheio de conteudo maravilhoso , onde se aprende uma ferramenta muito forte JAVA.");
        cursoAtual.setCargaHoraria(8);

        Curso cursoAnterior = new Curso();
        cursoAnterior.setTitulo("Curso javascript");
        cursoAnterior.setDescricao("um curso sobre uma liguagem muito amigavel e presente e toda a web. e sempre tem algo novo e inovador a cada semana");
        cursoAnterior.setCargaHoraria(2000);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("juntos dos experts mais didaticos do mercado");
        mentoria.setDate(LocalDate.now());

        System.out.println(cursoAnterior);
        System.out.println(cursoAtual);
        System.out.println(mentoria);
    }
}
