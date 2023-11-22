package org.example;

import java.util.Iterator;

public class Partida {
    public static Integer contarJogadoresRelacionadosTime(Time time) {
        int quantidade = 0;
        for (Jogador jogador : time) {
            if (jogador.isRelacionado()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalJogadoresTime(Time time) {
        int quantidade = 0;
        for (Iterator a = time.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
