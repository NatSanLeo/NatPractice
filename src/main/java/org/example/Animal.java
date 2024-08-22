package org.example;

public class Animal {
    private String raza;
    private String color;
    private String tamaño;
    private String habitat;
    public static int numeroPatas;

    public static int getNumeroPatas() {
        return numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public String getHabitat() {
        return habitat;
    }

    public Animal(String raza, String color, String tamaño, String habitat) {
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
        this.habitat = habitat;
        this.numeroPatas = 4;
    }

    //va a permitir que otra clase vea el tañamo del animal
    public String getTamaño() {
        return tamaño;
    }

    //Va a permitir cambiar el tamaño del animal desde otra clase
    public void setTamaño(String tamaño) { //todos los tipos de dato
        this.tamaño = tamaño;
    }

    public String adivinarHabitat() { // es un metodo get ya que vamos a modificar el dato mas adelante
        return ("Este animal vive en " + this.habitat); // cuado un return es string va sin el sout

    }

    public void cambiarHabitat(String nuevoHabitat) { // void = vacio porque solo necesito cambiarlo no necesito ver
        this.habitat = nuevoHabitat;// cuando es asignación no tiene return, ademas porque es vacio
    }

    public static int mostrarNumeroPatas() { // int en el metodo es el tipo de retorno, puede ser void,string, int, etc
        return numeroPatas;

    }

}
