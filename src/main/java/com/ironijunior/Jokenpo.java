package com.ironijunior;

import java.util.*;

/**
 * @author Ironi Medina
 */

public class Jokenpo {

    private final Map<Maos, Maos> gabarito;

    protected static final String RESULTADO = "Quem ganhou foi o jogador %s, que escolheu %s";

    public Jokenpo() {
        gabarito = new HashMap<>();
        gabarito.put(Maos.PAPEL, Maos.PEDRA);
        gabarito.put(Maos.PEDRA, Maos.TESOURA);
        gabarito.put(Maos.TESOURA, Maos.PAPEL);
    }

    public String jogar(Maos jogador1, Maos jogador2) {

        if (jogador1.equals(jogador2)) {
            return "Empate";
        }

        if (gabarito.get(jogador1).equals(jogador2)) {
            return String.format(RESULTADO, "1", jogador1);
        }
        return String.format(RESULTADO, "2", jogador2);
    }

}
