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
        } catch (Exception ex) {
            Logger.getLogger(MenuSalaComercial.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    public void editarControle() {
        
        System.out.println("\n");
        System.out.println("***********  MENU EDITAR ************ ");
        System.out.println("\n ");
        System.out.println("DIGITE O CODIGO DO IMOVÉL QUE DESEJA EDITAR:");
        int codigoConsulta = entrada.nextInt();
        entrada.nextLine();
        Imovel editarLista = lista.consultar(codigoConsulta);
        entrada.nextLine();

        
        int editar = 0;

        if (editarLista != null) {
            do {
                System.out.println(" \n");
                System.out.println("QUAL INFORMAÇÂO DESEJA EDITAR:");
                System.out.println(" \n");
                System.out.println("1)  LOGRADOURO ");
                System.out.println("2)  NÚMERO");
                System.out.println("3)  BAIRRO ");
                System.out.println("4)  CIDADE ");
                System.out.println("5)  DESCRIÇÃO");
                System.out.println("6)  ARÉA TOTAL ");
                System.out.println("7)  VALOR");
                System.out.println("8)  NOME DO EDÍFIFIO ");
                System.out.println("9)  ANDAR");
                System.out.println("10) VALOR DO CONDOMINIO ");
                System.out.println("11) NÚMERO DE SALAS");
                System.out.println("12) NÚMERO DE BANHEIROS");
                System.out.println(" \n");
                System.out.print("OPÇÃO:    ");
                editar = entrada.nextInt();
                entrada.nextLine();

                switch (editar) {
                    case 1:
                        System.out.print("\n ");
                        System.out.print("DIGITE O NOVO LOGRADOURO: ");
                        editarLista.setLogradouro(entrada.nextLine());
                        break;
                    case 2:

                        System.out.print("\n\n");
                        System.out.print("DIGITE O NÚEMRO:");
                        editarLista.setNumero(entrada.nextInt());
                        entrada.nextLine();

                        break;

                    case 3:

                        System.out.print("\n");
                        System.out.print("DIGITE O BAIRRO:");
                        editarLista.setBairro(entrada.nextLine());

                        break;

                    case 4:

                        System.out.print("\n");
                        System.out.print("DIGITE A CIDADE:");
                        editarLista.setCidade(entrada.nextLine());

                        break;

                    case 5:

                        System.out.print("\n");
                        System.out.print("DIGITE A DESCRIÇÂO:");
                        editarLista.setCidade(entrada.nextLine());

                        break;

                    case 6:

                        System.out.print("\n");
                        System.out.print("DIGITE A ARÉA TOTAL:");
                        editarLista.setAreaTotal(entrada.nextDouble());
                        entrada.nextLine();

                        break;
                     
                    case 7: 
                        System.out.print("\n");
                        System.out.print("DIGITE O VALOR:");
                        editarLista.setValor(entrada.nextDouble());
                        
                        break;
                        
                    case 8: 
                        System.out.print("\n");
                        System.out.print("DIGITE O NOME DO EDIFICIO:");
                        editarLista.setNomeEdificio(entrada.nextLine());
                        
                        break;
                        
                    case 9:
                        
                        System.out.print("\n");
                        System.out.print("DIGITE O ANDAR:");
                        editarLista.setAndar(entrada.nextInt());
                        entrada.nextLine();
                        break;
                        
                        
                    case 10:
                        
                        System.out.print("\n");
                        System.out.print("DIGITE O VALOR DO CONDOMINIO:");
                        editarLista.setValor(entrada.nextDouble());
                        entrada.nextLine();
                        break;
                        
                        
                    case 11:
                        
                        System.out.print("\n");
                        System.out.print("DIGITE O NÚMERO DA SALA:");
                        editarLista.setNumeroDaSala(entrada.nextInt());
                        entrada.nextLine();
                        
                        break;
                        
                        
                    case 12:
                        
                        System.out.print("\n");
                        System.out.print("DIGITE O NÚMERO DE BANHEIRO:");
                        editarLista.setNumeroDeBanheiros(entrada.nextInt());
                        entrada.nextLine();
                        
                        break;
 
                }

            } while (editar != 0);
            lista.editar(codigoConsulta, editarLista);
            try {
                lista.gravar();
            } catch (Exception ex) {
                Logger.getLogger(MenuSalaComercial.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println(" \nResumo Não Encotrado ");
        }

    }

    public void menuInicial() {
        int i;
       
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
