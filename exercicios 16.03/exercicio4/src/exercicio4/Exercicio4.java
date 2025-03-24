
package exercicio4;

import java.util.Scanner;


public class Exercicio4 {

  
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
   
   int numeroA;
   int numeroB;
   int areaT;
   
        System.out.println("Escreva a medida em metros da base do retangulo:");
        numeroA = teclado.nextInt();
        
        System.out.println("Escreva a medida em metros da altura do retangulo: ");
        numeroB = teclado.nextInt();
        
        areaT = numeroA * numeroB;
        System.out.println("A area do retangulo e igual a: "+areaT);
        
    }
    
}
