/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laçosrep;

/**
 *
 * @author CAMARGO
 */import java.util.Scanner;
public class ex5 {

   public static void main(String[] args) {
       // Ler a primeira nota (deve estar entre 0 e 10)
       try (Scanner scanner = new Scanner(System.in)) {
           // Ler a primeira nota (deve estar entre 0 e 10)
           double nota1;
           do {
               System.out.print("Digite a nota da 1ª avaliação (0 a 10): ");
               nota1 = scanner.nextDouble();
               if (nota1 < 0 || nota1 > 10) {
                   System.out.println("VALOR INVÁLIDO! A nota deve estar entre 0 e 10.");
               }
           } while (nota1 < 0 || nota1 > 10);
           
           // Ler a segunda nota (deve estar entre 0 e 10)
           double nota2;
           do {
               System.out.print("Digite a nota da 2ª avaliação (0 a 10): ");
               nota2 = scanner.nextDouble();
               if (nota2 < 0 || nota2 > 10) {
                   System.out.println("VALOR INVÁLIDO! A nota deve estar entre 0 e 10.");
               }
           } while (nota2 < 0 || nota2 > 10);
           
           // Calcular e imprimir a média
           double media = (nota1 + nota2) / 2;
           System.out.println("A média do aluno é: " + media);
       }
    }
}
