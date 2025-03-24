/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3rep2;
import java.util.Scanner ;

public class Aula3rep2 {

   
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner (System.in);    
        System.out.println("Digite um numero");
        int numero = teclado.nextInt();
        
        while (numero <=10)
        {
            System.out.println("O Numero e: " + numero++);
        }
    }
    
}
