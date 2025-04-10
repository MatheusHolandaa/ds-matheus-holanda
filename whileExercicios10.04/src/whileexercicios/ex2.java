/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package whileexercicios;

/**
 *
 * @author User
 */
public class ex2 {

    public static void main(String[] args) {
        int numero = 1; 
        
        System.out.println("Números pares de 1 a 100:");
        
        while (numero <= 100) {
            
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
            numero++; 
        }
    }
}