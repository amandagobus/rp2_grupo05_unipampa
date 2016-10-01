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

    protected int NumeroDeLocais;
    protected String NomeEdifico;
    protected int andar;
    protected int numeroDaSala;
    protected double valorCondominio;

    public Predio(int codigo, String logradouro, int numero, String bairro,
            String cidade, String descricao, int areaTotal, double valor,
            int NumeroDeLocais, String NomeEdifico, int andar, int numeroDaSala,
            double valorCondominio) {
        
        
        super(codigo, logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        
        this.NumeroDeLocais = NumeroDeLocais;
        this.NomeEdifico = NomeEdifico;
        this.andar = andar;
        this.numeroDaSala = numeroDaSala;
        this.valorCondominio = valorCondominio;
    }

    /**
     * @return the NumeroDeLocais
     */
    public int getNumeroDeLocais() {
        return NumeroDeLocais;
    }

    /**
     * @param NumeroDeLocais the NumeroDeLocais to set
     */
    public void setNumeroDeLocais(int NumeroDeLocais) {
        this.NumeroDeLocais = NumeroDeLocais;
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
     * @return the numeroDaSala
     */
    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    /**
     * @param numeroDaSala the numeroDaSala to set
     */
    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
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
    public String toString(){
    String dados=" ";
    dados += "Numero De Locais: " + NumeroDeLocais+"\n";
    dados += "Nome Do Edíficio:" +NomeEdifico +"\n";
    dados += "Andar: " +andar+ "\n";
    dados += "Numero: " + numeroDaSala + "\n";
    dados += "Valor Do Condominio: " + valorCondominio + "\n";
    
    return dados;
    }
    
    
    

}
