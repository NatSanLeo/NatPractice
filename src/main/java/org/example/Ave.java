package org.example;

public class Ave extends  Animal{
  private String tipoAlas;
  public Ave (String tipoAlas,String raza, String color, String tamaño, String habitat){
    super(raza, color,tamaño, habitat);
    this.tipoAlas=tipoAlas;

  }
  public String getTipoAlas (){
    return  this.tipoAlas=tipoAlas;
  }

}
