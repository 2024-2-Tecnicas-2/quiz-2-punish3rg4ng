/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
public abstract class VehiculoBase implements IVehiculo{
     private String marca; 
     private String modelo;        
     private int velocidadActual;

    public VehiculoBase(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    @Override
    public void acelerar() {
        this.velocidadActual +=10;
    }

    @Override
    public void frenar() {
        this.velocidadActual -=10;
    }

    @Override
    public void tipoCombustible() {
        
    }
     
     
             
}
