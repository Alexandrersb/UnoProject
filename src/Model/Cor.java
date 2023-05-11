package Model;

public enum Cor {

    AMARELO, VERDE, AZUL, VERMELHO, ESPECIAL;

    public static final Cor[] cor = Cor.values();

    public static Cor getCores( int i) {
        return Cor.cor[i];
    }
}
