/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Apartamento.Apartamento;
import Casa.Casa;
import Imovel.Imovel;
import ListaImoveis.ListaDeImoveis;
import java.util.Scanner;

/**
 *
 * @author Amanda Gobus
 */
public class MenuApartamento {

    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner entrada = new Scanner(System.in);

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

    public void IncluirImovel() {
        String logradouro;
        int numero;
        String bairro;
        String cidade;
        String descricao;
        double areaTotal;
        double valor;

        String nomeEdificio;
        int numeroQuartos;
        int numeroVagas;
        int anoDeConstrucao;
        int numeroDoApartamento;
        int andar;
        double valorCondominio;
        
       
    
        
        
        
        

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

        System.out.println("Digite o Nome do Edifício:  ");
        nomeEdificio = entrada.nextLine();

        System.out.println("Digite o Número de Quartos:  ");
        numeroQuartos = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Número de Vagas na garagem:  ");
        numeroVagas = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Ano de Construção:  ");
        anoDeConstrucao = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Número do Apartamento:  ");
        numeroDoApartamento = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Número do Andar:  ");
        andar = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o Valor do Condominio:  ");
        valorCondominio = entrada.nextDouble();
        entrada.nextLine();
        
           Imovel apartamento = new Apartamento(logradouro, numero, bairro, cidade,
                descricao, areaTotal, valor, numeroQuartos,numeroVagas
                  anoDeConstrucao, numeroDoApartamento, andar, valorCondominio);
        lista.incluir(apartamento);
    }


      
    public void Consultar() {
        System.out.println("Digite o Código Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt());
        entrada.nextLine();

        if ((Imo != null)&&(Imo instanceof Apartamento) ) {
            System.out.println(Imo.toString());

        } else if (Imo == null) {
            System.out.println("Imóvel Não Cadastrado.");
        }

    }
}
