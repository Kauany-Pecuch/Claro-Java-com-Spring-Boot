/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Model.Aluno;
import Model.Bootcamp;
import Model.Curso;
import Model.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Bootcamp bootcampJava = new Bootcamp("Bootcamp Java", "Aprenda Java do zero ao avançado");

        bootcampJava.getConteudoBootcamp().add(new Curso(40, "Curso Java Básico", "Introdução ao Java."));
        bootcampJava.getConteudoBootcamp().add(new Curso(60, "Curso Java Avançado", "Técnicas avançadas em Java."));
        bootcampJava.getConteudoBootcamp().add(new Curso(45, "Curso Java para Web", "Desenvolvimento web com Java."));
        bootcampJava.getConteudoBootcamp().add(new Curso(50, "Curso Java e Spring", "Desenvolvimento com Spring Framework."));
        bootcampJava.getConteudoBootcamp().add(new Curso(55, "Curso Java e Hibernate", "Persistência com Hibernate."));
        bootcampJava.getConteudoBootcamp().add(new Mentoria(LocalDate.now().plusDays(7), "Mentoria Java", "Sessão de mentoria para o Bootcamp de Java."));

        Aluno alice = new Aluno("Alice");
        alice.inscreverBootcamp(bootcampJava);
        System.out.println("Conteus Inscritos: " + alice.getConteudoInscritos());
        System.out.println("Conteus Concluidos: " + alice.getConteudoFinalizados());
        alice.progredir();
        alice.progredir();
        System.out.println("Conteus Inscritos: " + alice.getConteudoInscritos());
        System.out.println("Conteus Concluidos: " + alice.getConteudoFinalizados());
        alice.calcularTotalXP();

        System.out.println("---------------------------------------------------------------");

        Aluno diana = new Aluno("Diana");
        diana.inscreverBootcamp(bootcampJava);
        System.out.println("Conteus Inscritos: " + diana.getConteudoInscritos());
        System.out.println("Conteus Inscritos: " + diana.getConteudoFinalizados());
        diana.progredir();
        System.out.println("Conteus Inscritos: " + diana.getConteudoInscritos());
        System.out.println("Conteus Concluidos: " + diana.getConteudoFinalizados());
        diana.calcularTotalXP();

    }

}
