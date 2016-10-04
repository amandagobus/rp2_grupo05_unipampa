/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.chacara;

import Imovel.Residencia;

/**
 *
 * @author Amanda Gobus
 */
public class Chacara extends Residencia {
    
    protected double distCidade;

    public Chacara(double distCidade, String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor, int areaConstruida, int numeroQuartos, int numeroVagas, int anoConstucao) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, areaConstruida, numeroQuartos, numeroVagas, anoConstucao);
        
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