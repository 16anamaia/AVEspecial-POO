package AvaliacaoEspecial;

import java.util.Date;


public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double valorTotal;
    private char statusPedido;

    public Pedido(int numeroPedido, Date dataHoraPedido, double valorTotal, char statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.valorTotal = valorTotal;
        this.statusPedido = statusPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public char getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(char statusPedido) {
        this.statusPedido = statusPedido;
    }

    public void alterarStatus() {
        if (statusPedido == '1') {
            statusPedido = '2';
        } else if (statusPedido == '2') {
            statusPedido = '3';
        }
    }

    public boolean consultarPedido(int numero) {
        return numeroPedido == numero;
    }

}

