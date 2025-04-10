/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laçosrep;

/**
 *
 * @author CAMARGO
 */
public class ex12 {
public static void main(String[] args) {
        int numero = 8; // Número para o qual a tabuada será calculada

        System.out.println("Tabuada do " + numero + ":");

        // Laço for para calcular e imprimir a tabuada
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}