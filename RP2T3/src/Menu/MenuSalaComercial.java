/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Imovel.Imovel;
import ListaImoveis.ListaDeImoveis;
import SalaComercial.SalaComercial;
import java.util.Scanner;

/**
 *
 * @author Arcano
 */
public class MenuSalaComercial {

    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner entrada = new Scanner(System.in);

    public static void menu() {
        System.out.println(" \n");
        System.out.println("***** Menu *****\n");
        System.out.println("1) Novo Imovél ");
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

    public void IncluirImovel() {

        String logradouro;
        int numero;
        String bairro;
        String cidade;
        String descricao;
        double areaTotal;
        double valor;
        String nomeEdifico;
        int andar;
        double valorCondominio;
        int numeroDeBanheiros;
        int numeroDaSala;

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
        System.out.println("Digite o Nome do Edíficio:  ");
        nomeEdifico = entrada.nextLine();

        System.out.println("Digite o Número do Andar:  ");
        andar = entrada.nextInt();

        System.out.println("Digite o Valor do Condominio:  ");
        valorCondominio = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Digite o Número da Sala:  ");
        numeroDaSala = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Número de Banheiros:  ");
        numeroDeBanheiros = entrada.nextInt();
        entrada.nextInt();

        Imovel salaC = new SalaComercial(logradouro, numero, bairro, cidade,
                descricao, areaTotal, valor, nomeEdifico, andar, valorCondominio,
                numeroDeBanheiros, numeroDaSala);

        lista.incluir(salaC);

    }

    public void Consultar() {
        System.out.println("Digite o Codigo Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt());
        entrada.nextLine();

        if (Imo != null) {
            System.out.println(Imo.toString());

        } else if (Imo == null) {
            System.out.println("Imovél Não Cadastrado;");
        }

    }

}
