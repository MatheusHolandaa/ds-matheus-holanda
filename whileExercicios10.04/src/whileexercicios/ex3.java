/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package whileexercicios;

/**
 *
 * @author User
 */import java.util.Scanner;
public class ex3 {
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();
        
        System.out.println("\nNúmeros pares de 1 a " + limite + ":");
        int i = 1;
        while (i <= limite) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        
        System.out.println("\n\nNúmeros ímpares de 1 a " + limite + ":");
        i = 1; 
        while (i <= limite) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
    }
}