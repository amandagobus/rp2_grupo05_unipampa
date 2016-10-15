/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Imovel.Imovel;
import static Imovel.EntradasTeclado.inInt;
import static Imovel.EntradasTeclado.inDouble;
import static Imovel.EntradasTeclado.inString;
import ListaImoveis.ListaDeImoveis;
import SalaComercial.SalaComercial;
import java.io.IOException;
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
        System.out.println("3) EDITAR ");
        System.out.println("4) EXCLUIR");
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

        logradouro = inString("Digite o Logradouro:  ");
        numero = inInt("Digite o Número:  ");
        bairro = inString("Digite o Bairro:  ");
        cidade = inString("Digite a Cidade:  ");
        descricao = inString("Digite Uma Descrição:  ");
        areaTotal = inDouble("Digite a Área Total:  ");
        valor = inDouble("Digite o Valor do Imóvel:  ");
        nomeEdifico = inString("Digite o Nome do Edifício:  ");
        andar = inInt("Digite o Número do Andar:  ");
        valorCondominio = inDouble("Digite o Valor do Condominio:  ");
        numeroDaSala = inInt("Digite o Número da Sala:  ");
        numeroDeBanheiros = inInt("Digite o Número de Banheiros:  ");
        
        
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
            lista.escreverArquivo();
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
        } catch (IOException ex) {
            Logger.getLogger(MenuSalaComercial.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void excluirControle() {
        System.out.println(" DIGITE O CODIGO DO IMÓVEL: ");
        boolean objeto = lista.excluir(entrada.nextInt());
        if (objeto == true) {

            System.out.println("IMÓVEL EXCUIDO");
            lista.escreverArquivo();
        } else {

            System.out.println("IMÓVEL NÂO ENCONTRADO");
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
        
        int i;
        double d;
        String st;

        int k = 1;

        if (editarLista != null) {

            while (k != 0) {
                System.out.println(" \n");
                System.out.println("QUAL INFORMAÇÂO DESEJA EDITAR:");
                System.out.println(" \n");
                System.out.println("0)  VOLTAR AO MENU ANTERIOR");
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
                k = entrada.nextInt();
                entrada.nextLine();

                switch (k) {
                    case 1:
                        System.out.print("\n ");
                        st = inString("DIGITE O NOVO LOGRADOURO: ");
                        editarLista.setLogradouro(st);
                        break;
                    case 2:

                        System.out.print("\n\n");
                        i = inInt("DIGITE O NÚEMRO:  ");
                        editarLista.setNumero(i);
                        

                        break;

                    case 3:

                        System.out.print("\n");
                        st = inString("DIGITE O BAIRRO:  ");
                        editarLista.setBairro(st);

                        break;

                    case 4:

                        System.out.print("\n");
                        st = inString("DIGITE A CIDADE:  ");
                        editarLista.setCidade(st);

                        break;

                    case 5:

                        System.out.print("\n");
                        st = inString("DIGITE A DESCRIÇÂO: ");
                        editarLista.setCidade(st);

                        break;

                    case 6:

                        System.out.print("\n");
                        d = inDouble("DIGITE A ARÉA TOTAL:  ");
                        editarLista.setAreaTotal(d);
                        entrada.nextLine();

                        break;

                    case 7:
                        System.out.print("\n");
                        d = inDouble("DIGITE O VALOR:  ");
                        editarLista.setValor(d);

                        break;

                    case 8:
                        System.out.print("\n");
                        st = inString("DIGITE O NOME DO EDIFICIO:  ");
                        editarLista.setNomeEdificio(st);

                        break;

                    case 9:

                        System.out.print("\n");
                        i = inInt("DIGITE O ANDAR:  ");
                        editarLista.setAndar(i);
                        
                        break;

                    case 10:

                        System.out.print("\n");
                        d = inDouble("DIGITE O VALOR DO CONDOMINIO:  ");
                        editarLista.setValor(d);
                        
                        break;

                    case 11:

                        System.out.print("\n");
                        i = inInt("DIGITE O NÚMERO DA SALA:  ");
                        editarLista.setNumeroDaSala(i);
                        

                        break;

                    case 12:

                        System.out.print("\n");
                        i = inInt("DIGITE O NÚMERO DE BANHEIRO:  ");
                        editarLista.setNumeroDeBanheiros(i);
                        

                        break;

                }

            }

            lista.editar(codigoConsulta, editarLista);
            try {
                lista.escreverArquivo();
            } catch (Exception ex) {
                Logger.getLogger(MenuSalaComercial.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            System.out.println("\n IMÓVEL NÂO ENCONTRADO ");
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
                    System.out.println("*********** INCUIR IMÓVEL ************");
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
                            System.out.println("******** CONSULTAR IMÓVEL POR CÓDIGO ********");
                            System.out.println("\n\n");
                            Consultar();
                            break;

                        default:
                            break;

                    }
                    break;

                case 3:
                    editarControle();
                    break;

                case 4:
                    System.out.println("\n");
                    System.out.println("******** EXCLUIR IMÓVEL ********");
                    System.out.println("\n");
                    excluirControle();
                    break;

                case 5:

                default:
                    break;

            }

        } while (i != 0);

    }

}
