/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Imovel.Residencia;
import ListaImoveis.ListaDeImoveis;
import Chacara.Chacara;
import java.util.Scanner;

/**
 *
 * @author Arcano
 */
public class MenuImoveis {

    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner imput = new Scanner(System.in);

    public static void menu() {
        System.out.println(" \n");
        System.out.println("***** Menu *****\n");
        System.out.println("1) Novo Imóvel ");
        System.out.println("2) Consultar");
        System.out.println("3) Editar ");
        System.out.println("4) Excluir");
        System.out.println("0) Voltar ");
        System.out.println(" ");
        System.out.print("Opção:    ");

    }

    public static void menu2() {
        System.out.println(" \n");
        System.out.println("*************** Menu de Consulta *****************");
        System.out.println(" \n");
        System.out.println("1) Código  ");
        System.out.println("0) Voltar ");
        System.out.println("\n ");
        System.out.print("Opcao:     ");

    }

    String logradouro;
    int numero;
    String bairro;
    String cidade;
    String descricao;
    double areaTotal;
    double valor;

}
