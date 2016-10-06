/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import Imovel.Residencia;

/**
 *
 * @author Amanda Gobus
 */
public class Casa extends Residencia {

    private String tipo;
    private int numeroDeVagas;

    /**
     * @param tipo
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
     * @param numeroDeVagas
     */
    public Casa(String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor, double areaConstruida, int numeroQuartos, int anoConstucao, String tipo, int numeroDeVagas) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, areaConstruida, numeroQuartos, anoConstucao);
        this.tipo = tipo;
        this.numeroDeVagas = numeroDeVagas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public void setNumeroDeVagas(int numeroDeVagas) {
        this.numeroDeVagas = numeroDeVagas;
    }

    /**
     *
     * @return dados
     */
    @Override
    public String toString() {
        String dados = super.toString();
        dados += "Número De Vagas: " + numeroDeVagas + "\n";
        dados += "Tipo: " + tipo + "\n";

        return dados;
    }
}
