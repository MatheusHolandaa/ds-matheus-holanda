/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciospatineteevacina;

/**
 *
 * @author CAMARGO
 */
import java.util.*;

public class patinte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as notas em blocos de 2 linhas, com 4 números inteiros por linha separados por espaço.");
        System.out.println("Exemplo:");
        System.out.println("7 8 9 10");
        System.out.println("3 4 5 6\n");

        while (sc.hasNextLine()) {
            String linha1 = sc.nextLine().trim();
            if (linha1.isEmpty()) continue;

            if (!sc.hasNextLine()) {
                System.out.println("❌ Erro: A segunda linha de notas está faltando.");
                System.out.println("Cada competidor deve ter DUAS linhas de 4 números cada.");
                continue;
            }

            String linha2 = sc.nextLine().trim();

            // Divide as linhas em arrays de strings
            String[] partes1 = linha1.split("\\s+");
            String[] partes2 = linha2.split("\\s+");

            // Verifica a quantidade de números na entrada
            if (partes1.length != 4 || partes2.length != 4) {
                System.out.println("❌ Erro: Cada linha deve conter exatamente 4 números inteiros.");
                System.out.println("Você digitou:");
                System.out.println("Linha 1: " + partes1.length + " valores");
                System.out.println("Linha 2: " + partes2.length + " valores");
                System.out.println("✅ Exemplo correto:");
                System.out.println("8 7 6 5");
                System.out.println("4 3 2 1\n");
                continue;
            }

            int[] notas = new int[8];
            boolean entradaValida = true;

            // Tenta converter todas as entradas para inteiros
            try {
                for (int i = 0; i < 4; i++) {
                    notas[i] = Integer.parseInt(partes1[i]);
                    notas[i + 4] = Integer.parseInt(partes2[i]);
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Erro: Todas as entradas devem ser números inteiros.");
                System.out.println("✅ Exemplo correto:");
                System.out.println("10 9 8 7");
                System.out.println("6 5 4 3\n");
                entradaValida = false;
            }

            if (!entradaValida) continue;

            // Ordena as notas e calcula a média
            Arrays.sort(notas);
            int soma = 0;
            for (int n : notas) soma += n;
            int media = soma / 8;

            // Imprime notas e média
            for (int n : notas) System.out.print(n + " ");
            System.out.println("- " + media);
        }

        sc.close();
    }
}