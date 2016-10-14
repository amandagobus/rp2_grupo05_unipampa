/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Imovel.Imovel;
import ListaImoveis.ListaDeImoveis;
import SalaComercial.SalaComercial;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 **
 * @author Arcano
 */
public class MenuSalaComercial {

    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner entrada = new Scanner(System.in);

    public static void menu() {
        System.out.println(" \n");
        System.out.println("***** MENU *****\n");
        System.out.println("1) NOVO IMÓVEL SALA COMERCIAL");
        System.out.println("2) CONSULTAR");
        //System.out.println("3) Editar ");
        //System.out.println("4) Excluir");
        System.out.println("0) VOLTAR ");
        System.out.println(" ");
        System.out.print("OPÇÃO:    ");

    }

    public static void menu2() {
        System.out.println(" \n");
        System.out.println("*************** MENU DE CONSULTA *****************");
        System.out.println(" \n");
        System.out.println("1) CÓDIGO  ");
        System.out.println("0) VOLTAR ");
        System.out.println("\n ");
        System.out.print("OPÇÃO:     ");

    }

    /**
     * Metodo que faz a interação com o usuário, passando após as informações
     * para o construtor.
     */
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
        nomeEdifico = entrada.nextLine();

        System.out.print("Digite o Número do Andar:  ");
        andar = entrada.nextInt();

        System.out.print("Digite o Valor do Condominio:  ");
        valorCondominio = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Digite o Número da Sala:  ");
        numeroDaSala = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite o Número de Banheiros:  ");
        numeroDeBanheiros = entrada.nextInt();
        entrada.nextLine();

        Imovel salaC = new SalaComercial(logradouro, numero, bairro, cidade,
                descricao, areaTotal, valor, nomeEdifico, andar, valorCondominio,
                numeroDeBanheiros, numeroDaSala);

        boolean objeto = lista.incluir(salaC);

        System.out.println("\n\n");
        if (objeto == true) {
            System.out.println("Imóvel incluido com sucesso.");
        } else {
            System.out.println("Imóvel não foi incluido.");
        }
        try {
            lista.gravar();
        } catch (Exception ex) {
            Logger.getLogger(MenuSalaComercial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Metodo que recebe uma informação do usuario, e consulta se o objeto esta
     * na listaImoveis.
     */
    public void Consultar() {
        System.out.println("\n");
        System.out.println("Digite o Código Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt());
        entrada.nextLine();

        if ((Imo != null) && (Imo instanceof SalaComercial)) {
            System.out.println(Imo.toString());

        } else if (Imo == null) {
            System.out.println("Imóvel Não Cadastrado;");
        }

    }

    public void Carregar() {

        try {
            lista.ler();
        } catch (Exception e) {
        }

    }

    public void editarControle() {
        
        System.out.println("\n");
        System.out.println("***********  Menu Editar ************ ");
        System.out.println("\n ");
        System.out.println("Digite Titulo Que Deseja  Editar:");
        int codigoConsulta = entrada.nextInt();
        entrada.nextLine();
        Imovel editarLista = lista.consultar(codigoConsulta);
        entrada.nextLine();

        
        int editar = 0;

        if (editarLista != null) {
            do {
                System.out.println(" \n");
                System.out.println("Escolha a Opção a Ser Editada:");
                System.out.println(" \n");
                System.out.println("1) Titulo ");
                System.out.println("2) Autores");
                System.out.println("3) Instituição ");
                System.out.println("4) Palavras Chave ");
                System.out.println("5) Situação");
                System.out.println("0) Voltar ");
                System.out.println(" ");
                System.out.print("Opção:    ");
                editar = entrada.nextInt();
                entrada.nextLine();

                switch (editar) {
                    case 1:
                        System.out.println("\n ");
                        System.out.println("DIGITE O NOVO LOGRADOURO: ");
                        editarLista.setLogradouro(entrada.nextLine());
                        break;
                    case 2:

                        System.out.println("\n\n");
                        System.out.println("DIGITE O NÚEMRO:");
                        editarLista.setNumero(entrada.nextInt());
                        entrada.nextLine();

                        break;

                    case 3:

                        System.out.println("\n");
                        System.out.println("DIGITE O BAIRRO:");
                        editarLista.setBairro(entrada.nextLine());

                        break;

                    case 4:

                        System.out.println("\n");
                        System.out.println("DIGITE A CIDADE:");
                        editarLista.setCidade(entrada.nextLine());

                        break;

                    case 5:

                        System.out.println("\n");
                        System.out.println("DIGITE A DESCRIÇÂO:");
                        editarLista.setCidade(entrada.nextLine());

                        break;

                    case 6:

                        System.out.println("\n");
                        System.out.println("DIGITE A ARÉA TOTAL:");
                        editarLista.setAreaTotal(entrada.nextDouble());
                        entrada.nextLine();

                        break;
                     
                    case 7: 
                        System.out.println("\n");
                        System.out.println("DIGITE O VALOR:");
                        editarLista.setValor(entrada.nextDouble());
                        
                        break;
                        
                    case 8: 
                        System.out.println("\n");
                        System.out.println("DIGITE O NOME DO EDIFICIO:");
                        editarLista.setNomeEdificio(entrada.nextLine());
                        
                        break;
                        
                    case 9:
                        
                        System.out.println("\n");
                        System.out.println("DIGITE O ANDAR:");
                        editarLista.setAndar(entrada.nextInt());
                        entrada.nextLine();
                        break;
                        
                        
                    case 10:
                        
                        System.out.println("\n");
                        System.out.println("DIGITE O VALOR DO CONDOMINIO:");
                        editarLista.setValor(entrada.nextDouble());
                        entrada.nextLine();
                        break;
                        
                        
                    case 11:
                        
                        System.out.println("\n");
                        System.out.println("DIGITE O NÚMERO DA SALA:");
                        editarLista.setNumeroDaSala(entrada.nextInt());
                        entrada.nextLine();
                        
                        break;
                        
                        
                    case 12:
                        
                        System.out.println("\n");
                        System.out.println("DIGITE O NÚMERO DE BANHEIRO:");
                        editarLista.setNumeroDeBanheiros(entrada.nextInt());
                        entrada.nextLine();
                        
                        break;
 
                }

            } while (editar != 0);

            lista.editar(codigoConsulta, editarLista);

        } else {
            System.out.println(" \nResumo Não Encotrado ");
        }

    }

    public void menuInicial() {
        int i;
        Carregar();
        do {
            MenuSalaComercial.menu();
            i = entrada.nextInt();
            entrada.nextLine();

            switch (i) {
                case 1:
                    System.out.println("\n");
                    System.out.println("*********** Incluir Imóvel ************");
                    System.out.println("\n");
                    IncluirImovel();
                    break;

                case 2:
                    MenuSalaComercial.menu2();
                    int opcao = entrada.nextInt();
                    entrada.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.println("\n");
                            System.out.println("******** Consultar Imóvel Por Codigo ********");
                            System.out.println("\n\n");
                            Consultar();
                            break;

                        default:
                            break;

                    }
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                default:
                    break;

            }

        } while (i != 0);

    }

}
