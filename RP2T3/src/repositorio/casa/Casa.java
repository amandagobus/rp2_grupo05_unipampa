/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.casa;

import Imovel.Imovel;

/**
 *
 * @author Amanda Gobus
 */
public class Casa extends Imovel {

    private String tipo;
    private double area;
    private int vagasgaragem;
    private int ano;
    private int numeroquartos;

    /**
     * Construtor da classe casa
     *
     * @param codigo
     * @param logradouro
     * @param numero
     * @param bairro
     * @param cidade
     * @param descricao
     * @param areaTotal
     * @param valor
     * @param tipo
     */
    public Casa(int codigo, String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor, String tipo) {
        super(codigo, logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getVagasgaragem() {
        return vagasgaragem;
    }

    public void setVagasgaragem(int vagasgaragem) {
        this.vagasgaragem = vagasgaragem;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroquartos() {
        return numeroquartos;
    }

    public void setNumeroquartos(int numeroquartos) {
        this.numeroquartos = numeroquartos;
    }

}
