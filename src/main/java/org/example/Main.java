package org.example;

public class Main {

    public static void main(String[] args) {
        Perro perroSam = new Perro("Corto", "Criolla", "Amarillo y negro", "Medium", "Casa");
        perroSam.adivinarHabitat(); // como se hereda el sabe que es un metodo de animal pero corresponde a perro

        Ave aveSam = new Ave("Brillantes", "colibri", "Amarillo y verde", "small", "arbol");
        aveSam.getTipoAlas();
        System.out.println("El perro llamado Sam tiene las siguientes caracteristicas: " + " Tipo de Pelo: " + perroSam.getTipoPelo() + " Es de raza: " + perroSam.getRaza() + " Tiene un color de pelo: " + perroSam.getColor() + " Su tamaño es: " + perroSam.getTamaño() + " Su habitat es: " + perroSam.getHabitat());
        System.out.println("El ave llamada Sam tiene las sigueintes caracteristicas: " + " El tipo de alas es: " + aveSam.getTipoAlas() + " La raza es: " + aveSam.getRaza() + " El color es: " + aveSam.getColor() + " Su tamaño es: " + aveSam.getColor() + " " + aveSam.adivinarHabitat());


    }
}