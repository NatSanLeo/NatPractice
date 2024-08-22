package org.example;

public class Perro extends Animal {
    private String tipoPelo;

    public Perro(String tipoPelo, String raza, String color, String tamaño, String habitat) {
        super(raza, color, tamaño, habitat);
        this.tipoPelo = tipoPelo;

    }

    public String getTipoPelo() {
        return this.tipoPelo = tipoPelo;
    }



}
