
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
public abstract class Predio extends Imovel {

    protected String nomeEdificio;
    protected int andar;
    protected double valorCondominio;
    /**
     * Metodo construtor da class predio.
     * @param logradouro
     * @param numero
     * @param bairro
     * @param cidade
     * @param descricao
     * @param areaTotal
     * @param valor
     * @param nomeEdificio
     * @param andar
     * @param valorCondominio 
     */

    public Predio(String logradouro, int numero, String bairro,
            String cidade, String descricao, double areaTotal, double valor,
            String nomeEdificio, int andar, double valorCondominio) {

        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor);

        this.nomeEdificio = nomeEdificio;
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    /**
     * @return the NomeEdifico
     */
    public String getNomeEdifico() {
        return nomeEdificio;
    }

    /**
     * @param NomeEdificio the NomeEdifico to set
     */
    public void setNomeEdifico(String NomeEdificio) {
        this.nomeEdificio = NomeEdificio;
    }

    /**
     * @return the andar
     */
    public int getAndar() {
        return andar;
    }

    /**
     * @param andar the andar to set
     */
    public void setAndar(int andar) {
        this.andar = andar;
    }

    /**
     * @return the valorCondominio
     */
    public double getValorCondominio() {
        return valorCondominio;
    }

    /**
     * @param valorCondominio the valorCondominio to set
     */
    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    
    /**
     * Metodo toString do objeto, predio.
     * @return 
     */
    @Override
    public String toString() {
        String dados = super.toString();
        dados += "Nome Do Edíficio:" + nomeEdificio + "\n";
        dados += "Andar: " + andar + "\n";
        dados += "Valor Do Condominio: " + valorCondominio + "\n";

        return dados;
    }

}
