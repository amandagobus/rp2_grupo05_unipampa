/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chacara;

import Imovel.Residencia;

/**
 *
 * @author Wilson
 */
public class Chacara extends Residencia {

    protected double distCidade;

    /**
     *
     * @param distCidade
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
    public Chacara(double distCidade, String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor, double areaConstruida, int numeroQuartos, int anoConstucao) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, areaConstruida, numeroQuartos, anoConstucao);
        this.distCidade = distCidade;
    }

    public double getDistCidade() {
        return distCidade;
    }

    public void setDistCidade(double distCidade) {
        this.distCidade = distCidade;
    }

    @Override
    public String toString() {
        String dados = "";
        dados += "Distância da cidade: " + distCidade + "\n";

        return dados;
    }
}
