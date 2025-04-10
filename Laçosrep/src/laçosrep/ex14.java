/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laçosrep;

/**
 *
 * @author User
 */public class ex14 {

    public static void main(String[] args) {
        // População inicial dos países A e B
        int populacaoA = 80000;
        int populacaoB = 200000;

        // Taxas de crescimento anual (em decimal)
        double taxaCrescimentoA = 0.03; // 3%
        double taxaCrescimentoB = 0.015; // 1.5%

        int anos = 0; // Contador de anos

        // Laço while para calcular o crescimento populacional
        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA); // Crescimento de A
            populacaoB += (int) (populacaoB * taxaCrescimentoB); // Crescimento de B
            anos++; // Incrementa o número de anos
        }

        // Exibir o resultado
        System.out.println("Número de anos necessários: " + anos);
        System.out.println("População final de A: " + populacaoA);
        System.out.println("População final de B: " + populacaoB);
    }
}