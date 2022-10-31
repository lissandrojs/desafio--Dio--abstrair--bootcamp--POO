package com.br.dio.dominio;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(cursoAnterior);
        bootcamp.getConteudos().add(cursoAtual);
        bootcamp.getConteudos().add(mentoria);

        Dev devLissandro = new Dev();
        devLissandro.setNome("Lissandro");
        devLissandro.inscreverBootcamp(bootcamp);
        devLissandro.progredir();
        devLissandro.progredir();
        System.out.println("Conteudo Inscrito lissandro"+ devLissandro.getConteudosInscritos());
        System.out.println("Conteudo Concluido lissandro"+ devLissandro.getConteudoConcluidos());
        System.out.println("Xp :" + devLissandro.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camilas");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        System.out.println("Conteudo Inscrito camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluido camila"+ devCamila.getConteudoConcluidos());
        System.out.println("Xp :" + devCamila.calcularTotalXp());


    }
}
