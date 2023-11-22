package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartidaTest {
    @Test
    void deveContarJogadoresRelacionadosTime() {
        Time time = new Time(
                new Jogador("Ganso", true),
                new Jogador("Andre", true),
                new Jogador("Cano", false),
                new Jogador("Fabio", true)
        );
        assertEquals(3, Partida.contarJogadoresRelacionadosTime(time));
    }

    @Test
    void deveContarTotalJogadoresTime() {
        Time time = new Time(
                new Jogador("Ganso", true),
                new Jogador("Andre", true),
                new Jogador("Cano", false),
                new Jogador("Fabio", true)
        );
        assertEquals(4, Partida.contarTotalJogadoresTime(time));
    }
}