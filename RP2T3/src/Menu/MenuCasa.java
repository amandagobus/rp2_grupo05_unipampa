/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Imovel.Imovel;
import ListaImoveis.ListaDeImoveis;
import java.util.Scanner;
import Casa.Casa;
import Imovel.Tipo;

/**
 *
 * @author Amanda Gobus
 */
public class MenuCasa {

    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner entrada = new Scanner(System.in);

    public void menuInicial() {
        int opcao = -1;
        do {
            System.out.println(" \n");
            System.out.println("***** CASA *****\n");
            System.out.println("1) Novo Imóvel CASA ");
            System.out.println("2) Consultar");
            //System.out.println("3) Editar ");
            //System.out.println("4) Excluir");
            System.out.println("0) Sair ");
            System.out.println(" ");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    IncluirImovel();
                    break;
                case 2:
                    Consultar();
                    break;
            }
        } while (opcao != 0);

    }

  

    public void IncluirImovel() {
        String logradouro;
        int numero;
        String bairro;
        String cidade;
        String descricao;
        double areaTotal;
        double valor;

        int tipo;
        double areaConstruida;
        int numeroQuartos;
        int anoConstrucao;

        int numeroDeVagas;

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

        System.out.println("Digite a Área Total:  ");
        areaTotal = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o Valor do Imóvel:  ");
        valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite a Área Construída:  ");
        areaConstruida = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Digite o Número de Quartos:  ");
        numeroQuartos = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Número de Vagas na garagem:  ");
        numeroDeVagas = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Ano de Construção:  ");
        anoConstrucao = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Tipo do Imóvel: ");
        System.out.println("  1) RESIDENCIAL       2)COMERCIAL ");
        tipo = entrada.nextInt();
        Tipo t = Tipo.CasaTipo(tipo);
        Imovel casa = new Casa(logradouro, numero, bairro, cidade, descricao,
                numero, valor, areaConstruida, numeroQuartos, anoConstrucao,
                t, numeroDeVagas);

        lista.incluir(casa);
    }

    public void Consultar() {
        System.out.println("Digite o Código Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt());
        entrada.nextLine();

        if ((Imo != null) && (Imo instanceof Casa)) {
            System.out.println(Imo.toString());

        } else {
            System.out.println("Imóvel Não Cadastrado.");
        }

    }

   
}
