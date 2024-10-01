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
        System.out.println("el vehiculo esta acelerando"); 
    }

    @Override
    public void frenar() {
        System.out.println("el vehiculo esta frenando ");
    }

    @Override
    public void tipoCombustible() {
        
    }
     
     
             
}
