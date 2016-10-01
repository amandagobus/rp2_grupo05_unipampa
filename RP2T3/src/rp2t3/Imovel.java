/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rp2t3;

/**
 *
 * @author Arcano
 */
public abstract class Imovel {
    protected int codigo;
    protected int numero;
    protected String bairro;
    protected String cidade;
    protected String descricao;
    protected int areaTotal;
    protected double valor;

    public Imovel(int codigo, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor) {
        this.codigo = codigo;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.descricao = descricao;
        this.areaTotal = areaTotal;
        this.valor = valor;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the areaTotal
     */
    public int getAreaTotal() {
        return areaTotal;
    }

    /**
     * @param areaTotal the areaTotal to set
     */
    public void setAreaTotal(int areaTotal) {
        this.areaTotal = areaTotal;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Imovel{" + "codigo=" + codigo + ", numero=" + numero 
                + ", bairro=" + bairro + ", cidade=" + cidade + ", descricao=" 
                + descricao + ", areaTotal=" + areaTotal + ", valor=" + valor + '}';
    }

    
   
    
    
    
            
}
