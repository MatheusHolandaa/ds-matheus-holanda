/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula03;
import java.util.Scanner;

public class Aula03 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        
        for (int i = numero; i <=10; i++)       
        {
            System.out.println("O seu numero e: " + i);
        }      
      
    }
     
    
}
