package Model;

public class Carta {

    private Cartas cartasEnum;
    private CoresEnum coresEnum;

    public Carta(Cartas cartasEnum, CoresEnum coresEnum) {
        this.cartasEnum = cartasEnum;
        this.coresEnum = coresEnum;
    }

    public Cartas getCartasEnum() {
        return cartasEnum;
    }

    public CoresEnum getCoresEnum() {
        return coresEnum;
    }

    public void setCartasEnum(Cartas cartasEnum) {
        this.cartasEnum = cartasEnum;
    }

    public void setCoresEnum(CoresEnum coresEnum) {
        this.coresEnum = coresEnum;
    }
}
