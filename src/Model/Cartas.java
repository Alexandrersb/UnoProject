package Model;

public enum Cartas {

    ZERO, UM, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, INVERTER, PULAR, COMPRAR_DUAS,
    TROCAR_COR, MAIS_QUATRO;


    public enum CartasEnum {
        ZERO(0), UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7),
        OITO(8), NOVE(9), DEZ(10), INVERTER(11), PULAR(12), COMPRAR_DUAS(13),
        TROCAR_COR(14), MAIS_QUATRO(15);

        public int valorCarta;
        CartasEnum(int valorCarta) {
            this.valorCarta = valorCarta;
        }

        }

        ;
}
