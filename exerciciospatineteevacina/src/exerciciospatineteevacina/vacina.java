/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciospatineteevacina;

/**
 *
 * @author CAMARGO
 */
import java.util.Scanner;

public class vacina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tamanho do arranjo genético
        int N = scanner.nextInt();
        int[] genes = new int[N];

        // Lê os N genes
        for (int i = 0; i < N; i++) {
            genes[i] = scanner.nextInt();
        }

        // Lê o gene a ser analisado
        int geneAnalise = scanner.nextInt();

        // Conta quantas vezes o gene aparece
        int contador = 0;
        for (int i = 0; i < N; i++) {
            if (genes[i] == geneAnalise) {
                contador++;
            }
        }

        // Verifica a quantidade de vezes e dá o resultado
        if (contador > 1) {
            System.out.println("Achei o danado");
        } else if (contador == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Sumiuu!");
        }

        scanner.close();
    }
}