package com.ironijunior;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Set<String> validos = new HashSet<>(Arrays.asList(Maos.values()))
                .stream()
                .map(Maos::toString)
                .collect(Collectors.toSet());

        Jokenpo game = new Jokenpo();
        if (validos.contains(args[0]) && validos.contains(args[1])) {
            System.out.println(game.jogar(Maos.valueOf(args[0]), Maos.valueOf(args[1])));
        } else {
            System.out.println("Valor invalido");
        }

    }
}
