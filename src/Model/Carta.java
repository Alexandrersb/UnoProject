package Model;

public class Carta {

    private Valor valor;
    public Cor cor;

    public Carta(Valor valor, Cor cor) {
        this.valor = valor;
        this.cor = cor;
    }

    public Valor getValor() {
        return valor;
    }

    public Cor getCor() {
        return cor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public String toString(){
        String carta = "Carta:" + getValor() + getCor();
        return carta;
    }
}
