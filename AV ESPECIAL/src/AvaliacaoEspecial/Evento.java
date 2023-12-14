package AvaliacaoEspecial;

import javax.swing.text.html.HTML;
import java.util.ArrayList;

public class Evento {
    private String nomeEvento;
    private double dataRealizacao;
    private String descEvento;
    private String local;
    private int qtdeIngresso;
    private double valor;
    protected ArrayList tags;

    public Evento(String nomeEvento, double dataRealizacao, String descEvento, String local, int qtdeIngresso, double valor) {
        this.nomeEvento = nomeEvento;
        this.dataRealizacao = dataRealizacao;
        this.descEvento = descEvento;
        this.local = local;
        this.qtdeIngresso = qtdeIngresso;
        this.valor = valor;
        this.tags = new ArrayList<>();
    }
    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public double getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(double dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
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

    public boolean consultarEvento(String nome) {
        return nomeEvento.equalsIgnoreCase(nome);
    }
    public void inserirTag(HTML.Tag tag) {
        tags.add(tag);
    }

}

