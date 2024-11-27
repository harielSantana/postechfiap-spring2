package org.example;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> estudantes = Arrays.asList(
                "Hariel", "Pedro", "Marcela", "Rafaela"
        );

        System.out.println("Utilizando o forecast");

        for (String nome: estudantes) {
            System.out.println("Estudante: " + nome);
        }

        System.out.println("Utilizando o interator");

        Iterator<String> iterator = estudantes.iterator();

        while(iterator.hasNext()) {
            System.out.println("Estudante: " + iterator.next());
        }

        System.out.println("Utilizando a stream");
        Stream<String> stream = estudantes.stream();
        stream.forEach(System.out::println);


    }
}