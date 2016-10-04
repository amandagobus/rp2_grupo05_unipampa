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

    protected int areaConstruida;
    protected int numeroQuartos;
    protected int anoConstrucao;

    public Residencia(String logradouro, int numero, String bairro,
            String cidade, String descricao, int areaTotal, double valor,
            int areaConstruida, int numeroQuartos, int anoConstucao) {

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
    public int getAreaCosntruida() {
        return areaConstruida;
    }

    /**
     * @param areaConstruida the areaConstruida to set
     */
    public void setAreaConstruida(int areaConstruida) {
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
        String dados = "";
        dados += "Area Construida: " + areaConstruida + "\n";
        dados += "Número De Quartos: " + numeroQuartos + "\n";
        dados += "Ano Da Costrução: " + anoConstrucao + "\n";

        return dados;
    }

}
