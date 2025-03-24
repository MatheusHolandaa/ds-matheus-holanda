/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3rep1;

import java.util.Scanner;

public class Aula3rep1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        
        for (int i = 0; i <=numero; i++)       
        {
            System.out.println("O seu numero e: " + i);
        }      
      
    }
     
    
}