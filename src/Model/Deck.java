package Model;

import java.util.ArrayDeque;
import java.util.Deque;

import static Model.Cartas.ZERO;
import static Model.CoresEnum.*;

public class Deck {
        private static final int CARTAS_DO_BARALHO = 63;
        private static final int JOGADORES_PARA_COMECAR = 2;

        private Deque<Carta> deque = new ArrayDeque<>(CARTAS_DO_BARALHO);

        public Deck() {
        gerardeque();
        }

        public void gerardeque() {
                for (CoresEnum c : CoresEnum.values()) {
                        for(Cartas ca: Cartas.values()) {
                                //deque.addFirst(new Carta(, AZUL));
                                //deque.addFirst(new Carta(, AMARELO));
                                //deque.addFirst(new Carta(, VERDE));
                                //deque.addFirst(new Carta(, VERMELHO));
                        }
                }
            }
        }

