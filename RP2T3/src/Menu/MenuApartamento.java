/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Apartamento.Apartamento;
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

    /**
     * Método chamado menu, que exibe as opções Novo Imóvel e Consultar
     */
    public void menuInicial() {
        int opcao = -1;
        do {
            System.out.println(" \n");
            System.out.println("***** APARTAMENTO *****\n");
            System.out.println("1) Novo Imóvel APARTAMENTO ");
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

    /**
     * Método de Incluir um novo Imóvel
     */
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

        System.out.println("=======================================");
        System.out.print("Digite o Logradouro:  ");
        logradouro = entrada.nextLine();

        System.out.print("Digite o Número:  ");
        numero = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o Bairro:  ");
        bairro = entrada.nextLine();

        System.out.print("Digite a Cidade:  ");
        cidade = entrada.nextLine();

        System.out.print("Digite Uma Descrição:  ");
        descricao = entrada.nextLine();

        System.out.print("Digite a Área Total:  ");
        areaTotal = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Digite o Valor do Imóvel:  ");
        valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Digite o Nome do Edifício:  ");
        nomeEdificio = entrada.nextLine();

        System.out.print("Digite o Número de Quartos:  ");
        numeroQuartos = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o Número de Vagas na garagem:  ");
        numeroVagas = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o Ano de Construção:  ");
        anoDeConstrucao = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o Número do Apartamento:  ");
        numeroDoApartamento = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o Número do Andar:  ");
        andar = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o Valor do Condominio:  ");
        valorCondominio = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("=======================================");

        Imovel apartamento = new Apartamento(logradouro, numero, bairro,
                cidade, descricao, areaTotal, valor, nomeEdificio, andar,
                valorCondominio, numeroDoApartamento, anoDeConstrucao,
                numeroVagas, numeroQuartos);

        boolean objeto = lista.incluir(apartamento);
        System.out.println("\n\n");
        if (objeto == true) {
            System.out.println("Imóvel incluido com sucesso.");
        } else {
            System.out.println("Imóvel não foi incluido.");
        }
    }

    /**
     * Método que consulta o imóvel por código
     */
    public void Consultar() {
        System.out.println("Digite o Código Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt());
        entrada.nextLine();

        if ((Imo != null) && (Imo instanceof Apartamento)) {
            System.out.println("=======================================");
            System.out.println("*******INFORMAÇÕES DO IMÓVEL *****\n");
            System.out.println(Imo.toString());
            System.out.println("=======================================");

        } else {
            System.out.println("Imóvel Não Cadastrado.");
        }



    }
    
}
