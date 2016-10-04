/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio.salaComercial;

import Imovel.Predio;


public class SalaComercial extends Predio {
    
    private int numeroDeBanheiros;
    private int numeroDeSala;

    public SalaComercial(String logradouro, int numero, String bairro, String cidade, String descricao, double areaTotal, double valor, String NomeEdifico, int andar, double valorCondominio) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor, NomeEdifico, andar, valorCondominio);
    }

    public int getNumeroDeBanheiros() {
        return numeroDeBanheiros;
    }

    public void setNumeroDeBanheiros(int numeroDeBanheiros) {
        this.numeroDeBanheiros = numeroDeBanheiros;
    }

    public int getNumeroDeSala() {
        return numeroDeSala;
    }

    public void setNumeroDeSala(int numeroDeSala) {
        this.numeroDeSala = numeroDeSala;
    }
    
}
