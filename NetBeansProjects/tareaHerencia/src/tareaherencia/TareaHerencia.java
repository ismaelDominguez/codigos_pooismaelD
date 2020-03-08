
package tareaherencia;

import Helper.Circulo;
import Helper.Cuadrado;
import Helper.Linea;
import Helper.Triangulo;

public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuadrado cuadrado = new Cuadrado();
       Triangulo triangulo = new Triangulo();
       Linea linea = new Linea();
       Circulo circulo = new Circulo();
       
       System.out.println("cuadrado");
       System.out.println("triangulo");
       System.out.println("linea");
       System.out.println("circulo");
       Cuadrado.imprimirInformacion();
       Triangulo.imprimirInformacion();
       Linea.imprimirInformacion();
       Circulo.imprimirInformacion();
       
     }
    
}
