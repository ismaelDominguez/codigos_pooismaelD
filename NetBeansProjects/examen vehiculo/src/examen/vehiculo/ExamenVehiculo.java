/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.vehiculo;

/**
 *
 * @author pc
 */
public class ExamenVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
        
         //Creando el objeto vehiculo //

    Vehiculo vehiculo = new vehiculo();

    vehiculo.setMarca(" toyota");

    vehiculo.setModelo("corolla");

    vehiculo.setPlaca ("PCA-2030");
     vehiculo.setColor ("rojo");

System.out.println("Marca: " + vehiculo.getMarca() );

System.out.println("modelo: " + vehiculo.getModelo() );

System.out.println("Placa: " + vehiculo.getPlaca() );

System.out.println("color: " + vehiculo.getColor() );



}



public static class Vehiculo{

    private String marca;

    private String modelo;

    private String placa;

    private String color;   



    public String getMarca(){

        return marca;

    }

    public String getModelo(){

        return modelo;

    }

    public int getPlaca(){

        return placa;

    }

    public String getColor(){

        return color;

    }



        public void setMarca(String marca){

        this.marca = marca;

    }

    public void setModelo(String modelo){

        this.modelo = modelo;

    }

    public void setPlaca(int placa){

        this.placa = placa;

    }

    public void setColor(String color){

        this.color = color;

    }

   }

  }

        // TODO code application logic here
    
