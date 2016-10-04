package repositorio.apartamento;

import Imovel.Predio;

/**
 *
 * @author Amanda Gobus
 */
public class Apartamento extends Predio {

    private int numeroQuartos;
    private int numeroVagas;
    private int ano;
    private int numeroDoApartamento;

    public Apartamento(String logradouro, int numero, String bairro, String cidade, String descricao, double areaTotal, double valor, String NomeEdifico, int andar, double valorCondominio) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, NomeEdifico, andar, valorCondominio);
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(int numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    @Override
    public String toString() {
        String dados = "";
        dados += "Número De Quartos: " + numeroQuartos + "\n";
        dados += "Número Do Apartamento: " + numeroDoApartamento + "\n";
        dados += "Ano Da Construção: " + ano + "\n";
        dados += "Numero De Vagas: " + numeroVagas + "\n";

        return dados;
    }

}
