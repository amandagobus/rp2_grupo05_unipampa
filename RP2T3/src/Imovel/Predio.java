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

    protected String nomeEdifico;
    protected int andar;
    protected double valorCondominio;

    public Predio( String logradouro, int numero, String bairro,
            String cidade, String descricao, double areaTotal, double valor,
            String nomeEdifico, int andar, double valorCondominio) {

        super( logradouro, numero, bairro, cidade, descricao, areaTotal, valor);

        this.nomeEdifico = nomeEdifico;
        this.andar = andar;
        this.valorCondominio = valorCondominio;
    }

    /**
     * @return the NomeEdifico
     */
    public String getNomeEdifico() {
        return NomeEdifico;
    }

    /**
     * @param NomeEdifico the NomeEdifico to set
     */
    public void setNomeEdifico(String NomeEdifico) {
        this.NomeEdifico = NomeEdifico;
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

    @Override
    public String toString() {
        String dados = " ";
        dados += "Nome Do Edíficio:" + NomeEdifico + "\n";
        dados += "Andar: " + andar + "\n";
        dados += "Valor Do Condominio: " + valorCondominio + "\n";

        return dados;
    }

}
