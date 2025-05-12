/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_holanda;

/**
 *
 * @author CAMARGO
 */
// Classe derivada: Carro (herda de Veiculo)
public class Carro extends Veiculo {
    // Atributo adicional exclusivo para Carro
    private int numeroDePortas;

    // Construtor da classe derivada
    public Carro(String marca, String modelo, int numeroDePortas) {
        // Chama o construtor da classe base (superclasse)
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    // Método sobrescrito para exibir informações adicionais
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // Chama o método da classe base
        System.out.println("Número de portas: " + numeroDePortas);
    }
}