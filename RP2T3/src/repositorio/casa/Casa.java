/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.casa;

import Imovel.Residencia;

/**
 *
 * @author Amanda Gobus
 */
public class Casa extends Residencia {

    private String tipo;
    private int numerosDeVagas;

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
    public Casa(String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor, double areaConstruida, int numeroQuartos, int anoConstucao) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, areaConstruida, numeroQuartos, anoConstucao);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumerosDeVagas() {
        return numerosDeVagas;
    }

    public void setNumerosDeVagas(int numerosDeVagas) {
        this.numerosDeVagas = numerosDeVagas;
    }

}
