/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Menu.MenuApartamento;
import Menu.MenuCasa;
import Menu.MenuSalaComercial;
import java.util.Scanner;

/**
 *
 * @author Arcano
 */
public class RP2T3 {

    public static void main(String[] args) {

        MenuSalaComercial salaC = new MenuSalaComercial();
        MenuApartamento Ap = new MenuApartamento();
        MenuCasa casa = new MenuCasa();
        int op = 1;
        Scanner entrada = new Scanner(System.in);

        while (op != 0) {
            System.out.println(" ");
            System.out.println("******** BEM VINDO AO MENU ********");
            System.out.println("0) SAIR \n1) APARTAMENTO \n2) CASA \n3) CHACARA\n"
                    + "4) SALA COMERCIAL \n5) TERRENO");
            System.out.println(" ");
            System.out.print("Opção: ");
            op = entrada.nextInt();
            entrada.hasNextLine();

            switch (op) {
                case (1):
                    System.out.println(" ");
                    Ap.menuInicial();

                    break;

                case (2):
                    System.out.println(" ");
                    casa.menuInicial();
                    break;
                case (3):
                    System.out.println(" ");
                    //chacara.menuInicial();
                    break;
                case (4):
                    System.out.println(" ");
                    salaC.menuInicial();
                    break;
                case (5):
                    // terreno.MenuInicial();
                    break;
            }
        }
    }
}
