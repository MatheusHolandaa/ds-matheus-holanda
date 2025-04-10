/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laçosrep;

/**
 *
 * @author User
 */import java.util.Scanner;
public class ex15 {

     public static void main(String[] args) {
         // Ler o valor de n
         try (Scanner scanner = new Scanner(System.in)) {
             // Ler o valor de n
             System.out.print("Digite o valor de n (número de termos da série de Fibonacci): ");
             int n = scanner.nextInt();
             
             // Verificar se n é válido
             if (n <= 0) {
                 System.out.println("O valor de n deve ser maior que zero.");
             } else {
                 // Inicializar os dois primeiros termos da série
                 int termo1 = 1, termo2 = 1;
                 
                 System.out.println("Série de Fibonacci até o " + n + "º termo:");
                 
                 // Imprimir os dois primeiros termos
                 if (n >= 1) {
                     System.out.print(termo1 + " ");
                 }
                 if (n >= 2) {
                     System.out.print(termo2 + " ");
                 }
                 
                 // Calcular e imprimir os termos restantes
                 for (int i = 3; i <= n; i++) {
                     int proximoTermo = termo1 + termo2;
                     System.out.print(proximoTermo + " ");
                     
                     // Atualizar os valores dos termos anteriores
                     termo1 = termo2;
                     termo2 = proximoTermo;
                 }
             }}
    }
}