/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terreno;

import Imovel.Imovel;

/**
 *
 * @author julielen
 */
public class Terreno extends Imovel{
    private double dimensaoFrente;
    private double dimensaoLado;

    public Terreno(String logradouro, int numero, String bairro, String cidade, String descricao, double areaTotal, double valor) {
        super(logradouro, numero, bairro, cidade, descricao, areaTotal, valor);
        this.dimensaoFrente = dimensaoFrente;
        this.dimensaoLado = dimensaoLado;
        
        
    }
    
    
    
    
}
