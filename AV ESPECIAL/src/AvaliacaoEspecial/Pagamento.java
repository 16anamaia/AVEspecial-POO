package AvaliacaoEspecial;

import java.util.Date;


public class Pagamento {
    private Date dataHoraPagamento;
    private int numeroPagamento;
    private double valorPago;
    private double desconto;

    public Pagamento(Date dataHoraPagamento, int numeroPagamento, double valorPago, double desconto) {
        this.dataHoraPagamento = dataHoraPagamento;
        this.numeroPagamento = numeroPagamento;
        this.valorPago = valorPago;
        this.desconto = desconto;
    }

    public Date getDataHoraPagamento() {
        return dataHoraPagamento;
    }

    public void setDataHoraPagamento(Date dataHoraPagamento) {
        this.dataHoraPagamento = dataHoraPagamento;
    }

    public int getNumeroPagamento() {
        return numeroPagamento;
    }

    public void setNumeroPagamento(int numeroPagamento) {
        this.numeroPagamento = numeroPagamento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    public void alterarStatus() {

    }

    public boolean consultarPagamento(int numero) {
        return numeroPagamento == numero;
    }

}

