/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author pc
 */
public abstract class CiudadanoAbstraccion {

    private static Persona persona;
    private static Experencia experiencia;

 //declaracion de un metodo asbtracto
 abstract String getNombre();
 abstract int getEdad();
 abstract String getExperiencia();
 
 
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        persona = new Persona ();
        experiencia = new Experencia ();
        // TODO code application logic here
    }

    private static class Experencia {

        public Experencia() {
        }
    }
    System.out.println("");
    System.out.println("");
    
}
