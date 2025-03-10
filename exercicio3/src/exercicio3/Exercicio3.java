
import java.util.Scanner;




public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        String nome;
        int salario;
        int vendas;
        int total;
        
        System.out.println("Escreva seu nome: ");
         nome = teclado.nextLine();
        
         System.out.println("Escreva seu salario fixo: ");
         salario = teclado.nextInt();
         
         System.out.println("Escreva o total de vendas no mes: ");
         vendas = teclado.nextInt();
         
         total = salario + (vendas*15/100);
         
         System.out.println("O salario total e: "+total);
    }
    
    
}
