package AvaliacaoEspecial;

public class Promotor {
    private String CNPJ;
    private String endereco;

    public Promotor(String cnpj, String endereco) {
        CNPJ = cnpj;
        this.endereco = endereco;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cnpj) {
        CNPJ = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean consultarEvento(String nomeEvento) {

        return false;
    }

}

