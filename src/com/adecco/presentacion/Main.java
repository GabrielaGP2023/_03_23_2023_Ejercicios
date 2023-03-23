package com.adecco.presentacion;


import com.adecco.modelo.Saludo;

public class Main {
    public static void main(String[] args) {

        Saludo objSaludo = new Saludo();
        objSaludo.setMensajeSaludo("Hola mundo");
        System.out.println(objSaludo.saludar());
    }
}