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
    
    Casa casa;
    ListaDeImoveis lista = new ListaDeImoveis();
    Scanner entrada = new Scanner(System.in);

    /**
     * Método chamado menu, que exibe as opções Novo Imóvel e Consultar
     */
    public void menuInicial() {
        int opcao = -1;
        do {
            System.out.println(" \n");
            System.out.println("***** CASA *****\n");
            System.out.println("1) Novo Imóvel CASA ");
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
                    break;
                case 4:
                    //Excluir();
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
        
        int tipo;
        double areaConstruida;
        int numeroQuartos;
        int anoConstrucao;
        
        int numeroDeVagas;
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
        
        System.out.print("Digite a Área Construída:  ");
        areaConstruida = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.print("Digite o Número de Quartos:  ");
        numeroQuartos = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Digite o Número de Vagas na garagem:  ");
        numeroDeVagas = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Digite o Ano de Construção:  ");
        anoConstrucao = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Digite o Tipo do Imóvel: ");
        System.out.println("  1) RESIDENCIAL       2)COMERCIAL ");
        tipo = entrada.nextInt();
        Tipo t = Tipo.CasaTipo(tipo);
        Imovel casa = new Casa(logradouro, numero, bairro, cidade, descricao,
                numero, valor, areaConstruida, numeroQuartos, anoConstrucao,
                t, numeroDeVagas);
        System.out.println("=======================================");
        
        boolean objeto = lista.incluir(casa);
        
        System.out.println("\n\n");
        if (objeto == true) {
            System.out.println("Imóvel incluido com sucesso.");
        } else {
            System.out.println("Imóvel não foi incluido.");
        }
    }

    /**
     * Método de consultar por código
     */
    public void Consultar() {
        System.out.println("Digite o Código Que Deseja Consultar: ");
        Imovel Imo = lista.consultar(entrada.nextInt());
        entrada.nextLine();
        
        if ((Imo != null) && (Imo instanceof Casa)) {
            System.out.println("=======================================");
            System.out.println("*****INFORMAÇÕES DO IMÓVEL *****\n");
            System.out.println(Imo.toString());
            System.out.println("=======================================");
        } else {
            System.out.println("Imóvel Não Cadastrado.");
        }
        
    }

    /**
     * Método que exclui um imóvel
     */
    public void Excluir() {
        
    }

    /**
     * Método que edita atributos de um imóvel
     */
    public void Editar() {
        System.out.println("Qual o código do imóvel você quer editar: ");
        int codigo = entrada.nextInt();
        entrada.nextLine();
        casa = (Casa) lista.consultar(codigo);
        if (casa != null) {
            System.out.println(casa.toString());
            System.out.print("Qual atributo você quer editar: ");
            String atributo = entrada.nextLine();
            
            switch (atributo) {
                case "logradouro":
                    System.out.print("Digite o  logradouro: ");
                    casa.setLogradouro(entrada.nextLine());
                    
                    break;
                case "numero":
                    System.out.print("Digite o número: ");
                    casa.setNumero(entrada.nextInt());
                    entrada.nextLine();
                    
                    break;
                case "bairro":
                    System.out.print("Digite o Bairro: ");
                    casa.setBairro(entrada.nextLine());
                    
                    break;
                case "cidade":
                    System.out.print("Digite a Cidade: ");
                    casa.setCidade(entrada.nextLine());
                    
                    break;
                case "descricao":
                    System.out.print("Digite a Descrição: ");
                    casa.setDescricao(entrada.nextLine());
                    
                    break;
                case "area total":
                    System.out.println("Digite a Área Total: ");
                    casa.setAreaTotal(entrada.nextDouble());
                    entrada.nextLine();
                    
                    break;
                case "valor do imovel":
                    System.out.print("Digite o valor do Imóvel: ");
                    casa.setValor(entrada.nextDouble());
                    entrada.nextLine();
                    
                    break;
                case "area Construida":
                    System.out.print("Digite a Área Construída: ");
                    casa.setAreaConstruida(entrada.nextDouble());
                    entrada.nextLine();
                    break;
                case "numero de quartos":
                    System.out.print("Digite o Número de Quartos: ");
                    casa.setNumeroQuartos(entrada.nextInt());
                    entrada.nextLine();
                    break;
                case "numero de vagas":
                    System.out.print("Digite o Número de vagas na garagem: ");
                    casa.setNumeroDeVagas(entrada.nextInt());
                    entrada.nextLine();
                    break;
                
                case "ano de construcao":
                    System.out.print("Digite o ano de Construção: ");
                    casa.setAnoConstrucao(entrada.nextInt());
                    entrada.nextLine();
                    break;
                
                case "tipo":
                    System.out.println("Digite o Tipo do Imóvel: ");
                    System.out.println("  1) RESIDENCIAL       2)COMERCIAL ");
                    int tipo = entrada.nextInt();
                    Tipo novotipo = Tipo.CasaTipo(tipo);
                    casa.setTipo(novotipo);
                    
                    break;
                
            }
            lista.editar(codigo, casa);
        }
        
    }
    
}
