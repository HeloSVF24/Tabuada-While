/*código sobre a tabuada entre 1 e 10
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadawhile;

/**
 *
 * @author Heloisa Silva 1 DS/AMS
 */

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deverá digitar um número entre 1 e 10 para ver sua tabuada
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = sc.nextInt();

        int i = 1; // contador inicial
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++; // incrementa o contador
        }

        sc.close();
    }
}


