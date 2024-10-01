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
     private TipoCombustible tipoCombustible;

    public VehiculoBase(String marca, String modelo, int velocidadActual, TipoCombustible tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void acelerar() {
        System.out.println("Velocidad inicial: "+this.velocidadActual);
        this.velocidadActual +=10;
        System.out.println("Se ha aumentado la velocidad en 10 millas por hora , velocidad actual: "+this.velocidadActual);
    }

    @Override
    public void frenar() {
        System.out.println("Velocidad inicial: "+this.velocidadActual);
        this.velocidadActual -=10;
        System.out.println("Se ha reducido la velocidad en 10 millas por hora, velocidad actual: "+this.velocidadActual);
    }

    @Override
    public TipoCombustible tipoCombustible() {
        return this.tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
     
     
             
}
