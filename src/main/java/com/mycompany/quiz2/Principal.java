package com.mycompany.quiz2;

public class Principal {

    public static void main(String[] args) {
        // TODO: Aquí va tu código
        Coche coche1 = new Coche("mazda","323",120);
        Lancha lancha = new Lancha("mercedes","z82",210);
        
        coche1.acelerar();
        System.out.println("--------------------------------------------------");
        coche1.frenar();
        System.out.println("--------------------------------------------------");
        lancha.acelerar();
        System.out.println("--------------------------------------------------");
        lancha.frenar();
        System.out.println("--------------------------------------------------");
        
        coche1.tipoCombustible();
        System.out.println("--------------------------------------------------");
        lancha.tipoCombustible();
        System.out.println("--------------------------------------------------");
    }
}
