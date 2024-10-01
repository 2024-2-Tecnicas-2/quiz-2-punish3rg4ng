/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author USUARIO
 */
public class Lancha extends VehiculoBase{
    
    private TipoCombustible tipoCombustible;

    public Lancha(String marca, String modelo, int velocidadActual) {
        super(marca, modelo, velocidadActual);
        this.tipoCombustible = TipoCombustible.ELECTRICO;
    }

    @Override
    public void tipoCombustible() {
        System.out.println("El tipo de combustible es "+ this.tipoCombustible);
    }
    
    
    
}
