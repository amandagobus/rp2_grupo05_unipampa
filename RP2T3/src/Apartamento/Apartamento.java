/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apartamento;

import Imovel.Predio;

/**
 *
 * @author Arcano
 */
public class Apartamento extends Predio {

    protected int numeroQuartos;
    protected int numeroVagas;
    protected int ano;
    protected int numeroDoApartamento;

    public Apartamento(int codigo, String logradouro, int numero, String bairro,
            String cidade, String descricao, int areaTotal, double valor,
            String NomeEdifico, int andar, double valorCondominio, int numeroQuartos, int numeroVagas, int ano, int numeroDoApartamento) {

        super(codigo, logradouro, numero, bairro, cidade, descricao, areaTotal,
                valor, NomeEdifico, andar, valorCondominio);

        this.numeroQuartos = numeroQuartos;
        this.numeroVagas = numeroVagas;
        this.ano = ano;
        this.numeroDoApartamento = numeroDoApartamento;

    }

    /**
     * @return the numeroQuartos
     */
    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    /**
     * @param numeroQuartos the numeroQuartos to set
     */
    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    /**
     * @return the numeroVagas
     */
    public int getNumeroVagas() {
        return numeroVagas;
    }

    /**
     * @param numeroVagas the numeroVagas to set
     */
    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the numeroDoApartamento
     */
    public int getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    /**
     * @param numeroDoApartamento the numeroDoApartamento to set
     */
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
