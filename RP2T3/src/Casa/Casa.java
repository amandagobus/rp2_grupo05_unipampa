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
    private int numerosDeVagas;

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
     * @param numerosDeVagas
     */
    public Casa(String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor, double areaConstruida, int numeroQuartos, int anoConstucao, String tipo, int numerosDeVagas) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, areaConstruida, numeroQuartos, anoConstucao);
        this.tipo = tipo;
        this.numerosDeVagas = numerosDeVagas;
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

    /**
     *
     * @return dados
     */
    @Override
    public String toString() {
        String dados = super.toString();
        dados += "Número De Vagas: " + numerosDeVagas + "\n";
        dados += "Tipo: " + tipo + "\n";

        return dados;
    }
}
