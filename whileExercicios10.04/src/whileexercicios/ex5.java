/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package whileexercicios;

/**
 *
 * @author User
 */import java.util.Scanner;
public class ex5 {

   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           int contador = 1;
           double maior = Double.MIN_VALUE;
           
           System.out.println("Digite 10 números:");
           
           while (contador <= 10) {
               System.out.print("Número " + contador + ": ");
               double numero = scanner.nextDouble();
               
               if (numero > maior) {
                   maior = numero;
               }
               
               contador++;
           }
           
           System.out.println("\nO maior número digitado foi: " + maior);
       }
    }
}