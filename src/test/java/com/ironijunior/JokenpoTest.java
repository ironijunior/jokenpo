package com.ironijunior;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ironi Medina
 */

public class JokenpoTest {

    @Test
    public void shouldReturnJogador1WhenTesouraVsPapel() {
        Jokenpo jokenpo = new Jokenpo();

        assertEquals(String.format(Jokenpo.RESULTADO, "1", Maos.TESOURA),
                jokenpo.jogar(Maos.TESOURA, Maos.PAPEL));

    }

    @Test
    public void shouldReturnJogador2WhenTesouraVsPedra() {
        Jokenpo jokenpo = new Jokenpo();

        assertEquals(String.format(Jokenpo.RESULTADO, "2", Maos.PEDRA),
                jokenpo.jogar(Maos.TESOURA, Maos.PEDRA));

    }

    @Test
    public void shouldReturnEmpateWhenPapelVsPapel() {
        Jokenpo jokenpo = new Jokenpo();

        assertEquals("Empate",
                jokenpo.jogar(Maos.PAPEL, Maos.PAPEL));

    }

}
