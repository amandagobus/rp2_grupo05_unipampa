/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imovel;

/**
 *
 * @author Arcano
 */
public abstract class Residencia extends Imovel {

    protected double areaConstruida;
    protected int numeroQuartos;
    protected int anoConstrucao;

    /**
     *
     * @param logradouro
     * @param numero
     * @param bairro
     * @param cidade
     * @param descricao
     * @param areaTotal
     * @param valor
     * @param areaConstruida
     * @param numeroQuartos
     * @param anoConstucao
     */
    public Residencia(String logradouro, int numero, String bairro,
            String cidade, String descricao, double areaTotal, double valor,
            double areaConstruida, int numeroQuartos, int anoConstucao) {

        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.areaConstruida = areaConstruida;
        this.numeroQuartos = numeroQuartos;

        this.anoConstrucao = anoConstucao;
    }

    /**
     * get AreaConstruida
     *
     * @return areaCosntruida, int.
     */
    public double getAreaCosntruida() {
        return areaConstruida;
    }

    /**
     * @param areaConstruida the areaConstruida to set
     */
    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
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
     * @return the anoConstrucao
     */
    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    /**
     * @param anoConstrucao the anoConstrucao to set
     */
    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    @Override
    public String toString() {
        String dados = super.toString();
        dados += "Area Construida: " + areaConstruida + "\n";
        dados += "Número De Quartos: " + numeroQuartos + "\n";
        dados += "Ano Da Costrução: " + anoConstrucao + "\n";

        return dados;
    }

}
