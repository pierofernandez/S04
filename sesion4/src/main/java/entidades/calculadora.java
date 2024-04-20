/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class calculadora {
    
    
    private float valor1;
    
    private float valor2;

    public calculadora(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public float sumar(){
        return this.valor1+this.valor2;
    }
    public float restar(){
        return this.valor1-this.valor2;

    }
    public float multiplicar(){
        return this.valor1*this.valor2;
}
    public float dividir(){
    
        return this.valor1/this.valor2;
}

           
    
}
