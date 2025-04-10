/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package whileexercicios;

/**
 *
 * @author User
 */import java.util.Scanner;
public class ex4 {

   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
           System.out.print("Digite o número de alunos na turma: ");
           int numeroAlunos = scanner.nextInt();
           
           while (numeroAlunos <= 0) {
               System.out.print("Número inválido. Digite um número maior que zero: ");
               numeroAlunos = scanner.nextInt();
           }
           
           double somaNotas = 0;
           int contador = 1;
           
           System.out.println("Digite as notas dos alunos:");
           
           while (contador <= numeroAlunos) {
               System.out.print("Nota do aluno " + contador + ": ");
               double nota = scanner.nextDouble();
               
               while (nota < 0 || nota > 10) {
                   System.out.print("Nota inválida. Digite um valor entre 0 e 10: ");
                   nota = scanner.nextDouble();
               }
               
               somaNotas += nota;
               contador++;
           }
           
           
           double media = somaNotas / numeroAlunos;
           System.out.printf("\nA média da turma é: %.2f", media);
       }
    }
}