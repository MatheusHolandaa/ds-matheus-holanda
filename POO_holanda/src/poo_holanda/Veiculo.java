/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_holanda;

/**
 *
 * @author CAMARGO
 */
// Classe base: Veiculo
public class Veiculo {
    // Atributos
    private String marca;
    private String modelo;

    // Construtor da classe base
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método da classe base
    public void mostrarInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}