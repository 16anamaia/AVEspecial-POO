package AvaliacaoEspecial;

public class ItemCompra {
    private String nomeEvento;
    private int qtdeIngresso;
    private double valor;

    public ItemCompra(String nomeEvento, int qtdeIngresso, double valor) {
        this.nomeEvento = nomeEvento;
        this.qtdeIngresso = qtdeIngresso;
        this.valor = valor;
    }


    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void atualizaEstoqueItem() {

    }

    public void atualizaIngresso(Evento evento) {
        int qtdeComprada = this.qtdeIngresso;
        if (qtdeComprada <= evento.getQtdeIngresso()) {
            int novoEstoque = evento.getQtdeIngresso() - qtdeComprada;
            evento.setQtdeIngresso(novoEstoque);
        } else {
            System.out.println("Quantidade de ingressos indisponível para compra.");
        }
    }

}

