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

    Apartamento apartamento;
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
            System.out.println("3) Editar ");
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
                case 3:
                    Editar();
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

    /**
     * Método que Edita um imóvel utilizando o codigo
     */
    public void Editar() {
        System.out.println("Qual o código do imóvel você quer editar: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        apartamento = (Apartamento) lista.consultar(codigo);
        if (apartamento != null) {
            System.out.println(apartamento.toString());
            System.out.print("Qual atributo você quer editar: ");
            String atributo = entrada.nextLine();

            switch (atributo) {
                case "logradouro":
                    System.out.print("Digite o  logradouro: ");
                    apartamento.setLogradouro(entrada.nextLine());

                    break;
                case "numero":
                    System.out.print("Digite o número: ");
                    apartamento.setNumero(entrada.nextInt());
                    entrada.nextLine();

                    break;
                case "bairro":
                    System.out.print("Digite o Bairro: ");
                    apartamento.setBairro(entrada.nextLine());

                    break;
                case "cidade":
                    System.out.print("Digite a Cidade: ");
                    apartamento.setCidade(entrada.nextLine());

                    break;
                case "descricao":
                    System.out.print("Digite a Descrição: ");
                    apartamento.setDescricao(entrada.nextLine());

                    break;
                case "area total":
                    System.out.println("Digite a Área Total: ");
                    apartamento.setAreaTotal(entrada.nextDouble());
                    entrada.nextLine();

                    break;
                case "valor":
                    System.out.print("Digite o valor do Imóvel: ");
                    apartamento.setValor(entrada.nextDouble());
                    entrada.nextLine();

                    break;

                case "nome do edificio":
                    System.out.println("Digite o Nome do Edifício");
                    apartamento.setNomeEdificio(entrada.nextLine());
                    break;

                case "numero de quartos":
                    System.out.print("Digite o Número de Quartos: ");
                    apartamento.setNumeroQuartos(entrada.nextInt());
                    entrada.nextLine();
                    break;

                case "numero de vagas":
                    System.out.print("Digite o Número de vagas na garagem: ");
                    apartamento.setNumeroVagas(entrada.nextInt());
                    entrada.nextLine();
                    break;

                case "ano de construcao":
                    System.out.print("Digite o ano de Construção: ");
                    apartamento.setAnoDeConstrucao(codigo);
                    entrada.nextLine();
                    break;

                case "numero do apartamento":
                    System.out.print("Digite o número do apartamento: ");
                    apartamento.setNumeroDoApartamento(entrada.nextInt());
                    entrada.nextLine();
                    break;

                case " andar:":
                    System.out.print("Digite o Número do Andar: ");
                    apartamento.setAndar(entrada.nextInt());
                     entrada.nextLine();
                    break;

                case "valor do condominio":
                    System.out.print("Digite o Valor do Condominio:  ");
                    apartamento.setValorCondominio(entrada.nextDouble());
                    entrada.nextLine();
                    break;

            }
            lista.editar(codigo, apartamento);
        }

    }

}
