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
public abstract class Imovel {

    protected static int codigo;
    protected String logradouro;
    protected int numero;
    protected String bairro;
    protected String cidade;
    protected String descricao;
    protected int areaTotal;
    protected double valor;

    public Imovel(int codigo, String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor) {
        this.codigo = codigo;
        this.logradouro = logradouro;
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
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        
        String dados = " ";
        dados += "\n";
        dados += "Codigo: " + codigo + "\n";
        dados += "Logradouro: " + logradouro + "\n";
        dados += "Número: " + numero + "\n";
        dados += "Bairro: " + bairro + "\n";
        dados += "Cidade: " + cidade + "\n";
        dados += "Descrição: " + descricao + "\n";
        dados += "Area Total: " + areaTotal + "\n";
        dados += "Valor:" + valor + "\n";

        return dados;
    }

}