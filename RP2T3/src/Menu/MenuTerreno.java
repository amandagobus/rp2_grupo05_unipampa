/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;
import Imovel.Imovel;
import ListaImoveis.ListaDeImoveis;
import Terreno.Terreno;

/**
 *
 * @author Julielen
 */
public class MenuTerreno {
    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner entrada = new Scanner(System.in);
    
    public static void menu() {
        System.out.println(" \n");
        System.out.println("***** Menu *****\n");
        System.out.println("[1] Novo Imóvel ");
        System.out.println("[2] Consultar");
        System.out.println("[3] Editar ");
        System.out.println("[4] Excluir");
        System.out.println("[0] Voltar ");
        System.out.println(" ");
        System.out.print("Opção:    ");
    }
    
    
    public void IncluirImovel() {

        String logradouro;
        int numero;
        String bairro;
        String cidade;
        String descricao;
        double areaTotal;
        double valor;
        double dimensaoFrente;
        double dimensaoLado;
        
        System.out.println("Digite o Logradouro:  ");
        logradouro = entrada.nextLine();

        System.out.println("Digite o Número:  ");
        numero = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Bairro:  ");
        bairro = entrada.nextLine();

        System.out.println("Digite a Cidade:  ");
        cidade = entrada.nextLine();

        System.out.println("Digite Uma Descrição:  ");
        descricao = entrada.nextLine();

        System.out.println("Digite a Aréa Total:  ");
        areaTotal = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o Valor do Imovél:  ");
        valor = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.println("Digite a Dimensão Frente:  ");
        dimensaoFrente = entrada.nextDouble();
        
        System.out.println("Digite a Dimensão Lado:  ");
        dimensaoLado = entrada.nextDouble();
        
        Imovel Terreno = new Terreno(logradouro, numero, bairro, cidade,
                descricao, areaTotal, valor, dimensaoFrente, dimensaoLado);
        
        lista.incluir(Terreno);       
}
    public void Consultar() {
        System.out.println("Digite o Código Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt());
        entrada.nextLine();

        if ((Imo != null)&&(Imo instanceof Terreno) ) {
            System.out.println(Imo.toString());

        } else if (Imo == null) {
            System.out.println("Imovél Não Cadastrado;");
            
            
        }
    }
}
