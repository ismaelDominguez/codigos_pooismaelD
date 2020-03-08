
// sub clase Triangulo//
package Helper;

import java.util.Scanner;

public class Triangulo extends Formas {
    
   double angulo;
   double base;
   double altura; 

    public void calcularArea(){
       
       double area;
       area = base * altura / 2;
       Scanner Scn = new Scanner (System.in);
       
       System.out.println ("ingrese la base");
       double base = Scn.nextDouble();
       System.out.println ("ingrese la altura");
        double altura = Scn.nextDouble();
       System.out.println ("el area es"+area);
   }
   
   public Triangulo(String color, double angulo){
        super(color);
        this.angulo = angulo; 
    }
    
    public void Circulo(){
        setdibujar ("FIGURA");
        setColor ("VERDE");
       
    }   
    
    public void imprimirFigura(){
        
        System.out.println("TRIANGULO");
        
        
    }
    
    }
    
   