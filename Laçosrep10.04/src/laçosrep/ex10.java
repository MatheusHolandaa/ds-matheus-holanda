/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laçosrep;

/**
 *
 * @author CAMARGO
 */import java.util.Scanner;
public class ex10 {

    public static void main(String[] args) {
        // Ler o valor de N
        try (Scanner scanner = new Scanner(System.in)) {
            // Ler o valor de N
            System.out.print("Digite um valor para N (maior que zero): ");
            int N = scanner.nextInt();
            
            // Verificar se N é maior que zero
            if (N > 0) {
                // Laço for para imprimir os valores de 1 a N
                for (int i = 1; i <= N; i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Valor inválido! N deve ser maior que zero.");
            }
        }
    }
}