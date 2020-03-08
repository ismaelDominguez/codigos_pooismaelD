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
public class Persona extends CiudadanoAbstraccion  {

    @Override
    public String getNombre() {
            return "Ismael Dominguez, + 44, 5 años de experiencia";
    }

    @Override
    int getEdad() {
        throw new UnsupportedOperationException("la edad es:."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String getExperiencia() {
        throw new UnsupportedOperationException("sus años de experiencia son:"); //To change body of generated methods, choose Tools | Templates.
    }
   
}
   
   
