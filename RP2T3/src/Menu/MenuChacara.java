/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Imovel.Imovel;
import ListaImoveis.ListaDeImoveis;
import Chacara.Chacara;
import java.util.Scanner;

/**
 **
 * @author Wilson
 */
public class MenuChacara {

    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner entrada = new Scanner(System.in);

    /**
     *Este método faz as interações com o usuário, de modo que quando este escolhe a opção é chamado outro método para realizar a ação
     */
    public void menuInicial() {
        int opcao = -1;
        do {
            System.out.println(" \n");
            System.out.println(">>>> CHACARA <<<<\n");
            System.out.println("1) Novo Imóvel CHACARA ");
            System.out.println("2) Consultar");
            //System.out.println("3) Editar ");
            //System.out.println("4) Excluir");
            System.out.println("0) Sair ");
            System.out.println(" ");
            System.out.print("Digite a opção desejada: ");
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
     *Esse método recebe informações do usuário e passa para o construtor (parâmetros)
     */
    public void IncluirImovel() {

        String logradouro;
        int numero;
        String bairro;
        String cidade;
        String descricao;
        double areaTotal;
        double valor;
        double areaConstruida;
        int numeroQuartos;
        int anoConstucao;
        double distCidade;

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

        System.out.println("Digite o Ano da Construção:  ");
        anoConstucao = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite a Distância da Cidade:  ");
        distCidade = entrada.nextDouble();

        Imovel chacara = new Chacara(distCidade, logradouro, numero, bairro, cidade, descricao, areaTotal, valor,
                areaConstruida, numeroQuartos, anoConstucao);

        boolean objeto = lista.incluir(chacara);
        System.out.println("\n");
        
        if (objeto == true) {
            System.out.println("Imóvel incluido com sucesso!");
        } else {
            System.out.println("Imóvel não foi incluido!");
        }
                

    }

    /**
     * Consulta pela entrada do usuário (inteiro - código)
     */
    public void Consultar() {
        System.out.println("Digite o Código Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt()); //Cria um objeto do tipo Imóvel e consulta pela entrada do usuário
        entrada.nextLine();

        if ((Imo != null) && (Imo instanceof Chacara)) {
            System.out.println("--------------------------------------------");
            System.out.println(">>> Informações do Imóvel <<<\n");
            System.out.println(Imo.toString());
            System.out.println("--------------------------------------------");

        } else {
            System.out.println("Imóvel Não Cadastrado.");
        }

    }

}
