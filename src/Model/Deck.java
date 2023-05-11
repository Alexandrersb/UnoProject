package Model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Collections;

import static Model.Cor.*;

public class Deck {

    //private Deque[] cartas;
    private static final int CARTAS_DO_BARALHO = 63;
    private static final int JOGADORES_PARA_COMECAR = 2;

    private Deque<Carta> deque = new ArrayDeque<>(CARTAS_DO_BARALHO);

    public void gerarDeque(){for (Cor c : Cor.values())
        for (Valor ca : Valor.values()) {
            deque.addFirst(new Carta(ca, c));
        }
        embaralhar();
    }

    private void embaralhar() {
        ArrayList<Carta> temp = new ArrayList<>(deque);
        Collections.shuffle(temp);
        deque = new ArrayDeque<>(temp);
    }

    





}


