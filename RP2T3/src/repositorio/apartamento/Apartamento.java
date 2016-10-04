package repositorio.apartamento;

import Imovel.Imovel;

/**
 *
 * @author Amanda Gobus
 */
public class Apartamento extends Imovel {

    private int numeroquartos;
    private int vagasgaragem;
    private int ano;
    private String nomeedificio;
    private int andar;
    private int numeroapartamento;
    private int valorcondominio;

    /**
     * Construtor da classe apartamento
     *
     * @param codigo
     * @param logradouro
     * @param numero
     * @param bairro
     * @param cidade
     * @param descricao
     * @param areaTotal
     * @param valor
     */
    public Apartamento(int codigo, String logradouro, int numero, String bairro, String cidade, String descricao, int areaTotal, double valor) {
        super(codigo, logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
    }

    public int getNumeroquartos() {
        return numeroquartos;
    }

    public void setNumeroquartos(int numeroquartos) {
        this.numeroquartos = numeroquartos;
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

    public String getNomeedificio() {
        return nomeedificio;
    }

    public void setNomeedificio(String nomeedificio) {
        this.nomeedificio = nomeedificio;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumeroapartamento() {
        return numeroapartamento;
    }

    public void setNumeroapartamento(int numeroapartamento) {
        this.numeroapartamento = numeroapartamento;
    }

    public int getValorcondominio() {
        return valorcondominio;
    }

    public void setValorcondominio(int valorcondominio) {
        this.valorcondominio = valorcondominio;
    }

    @Override
    public String toString() {
        String dados = "";
        dados += "Número De Quartos: " + numeroquartos + "\n";
        dados += "Número Do Apartamento: " + numeroapartamento + "\n";
        dados += "Ano Da Construção: " + ano + "\n";
        dados += "Numero De Vagas: " + vagasgaragem + "\n";

        return dados;
    }

}
