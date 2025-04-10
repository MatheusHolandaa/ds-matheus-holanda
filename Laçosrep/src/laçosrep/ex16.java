/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package laçosrep;

/**
 *
 * @author User
 */
public class ex16 {

  public static void main(String[] args) {
        // Inicializar os dois primeiros termos da série
        int termo1 = 0, termo2 = 1;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");

        // Imprimir os dois primeiros termos
        System.out.print(termo1 + " " + termo2 + " ");

        // Calcular e imprimir os termos restantes até que o valor seja maior que 500
        while (true) {
            int proximoTermo = termo1 + termo2;

            // Verificar se o próximo termo ultrapassou 500
            if (proximoTermo > 500) {
                break; // Sai do loop
            }

            System.out.print(proximoTermo + " ");

            // Atualizar os valores dos termos anteriores
            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}