/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laçoex1;
import java.util.Scanner;

public class LaçoEx1 {

 
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
    System.out.println("Digite o primeiro numero: ");
    int numero1 = teclado.nextInt();
    {
        
        System.out.println("Digite o segundo numero: ");
        int numero2 = teclado.nextInt();
        
        while (numero2 == 0)
        {
            System.out.println("O numero digitado e invalido ");
            numero2 = teclado.nextInt();
        }
        
        int div = (numero1/numero2);
        System.out.println("O resultado divisao do primeiro numero pelo segundo e: " + div);
        
        
    }
    
    
        
    }
    
}
