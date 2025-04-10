/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laçosrep;

/**
 *
 * @author User
 */import java.util.Scanner;
public class ex18 {

   public static void main(String[] args) {
       // Ler a quantidade de números
       try (Scanner scanner = new Scanner(System.in)) {
           // Ler a quantidade de números
           System.out.print("Digite a quantidade de números (N): ");
           int N = scanner.nextInt();
           
           // Verificar se N é válido
           if (N <= 0) {
               System.out.println("A quantidade de números deve ser maior que zero.");
           } else {
               // Inicializar variáveis
               double menor = Double.MAX_VALUE; // Inicializa com o maior valor possível
               double maior = Double.MIN_VALUE; // Inicializa com o menor valor possível
               double soma = 0;
               
               // Ler os N números
               for (int i = 1; i <= N; i++) {
                   System.out.print("Digite o " + i + "º número: ");
                   double numero = scanner.nextDouble();
                   
                   // Atualizar menor valor
                   if (numero < menor) {
                       menor = numero;
                   }
                   
                   // Atualizar maior valor
                   if (numero > maior) {
                       maior = numero;
                   }
                   
                   // Atualizar soma
                   soma += numero;
               }
               
               // Exibir resultados
               System.out.println("Menor valor: " + menor);
               System.out.println("Maior valor: " + maior);
               System.out.println("Soma dos valores: " + soma);
           }
       }
    }
}