package Model;

public enum Valor {

    ZERO, UM, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, INVERTER, PULAR, COMPRAR_DUAS,
    TROCAR_COR, MAIS_QUATRO;

    private static final Valor[] valor = Valor.values();

    public static Valor getCartas(int i) {
        return Valor.valor[i];
    }

}
