//sub clase Linea//
package Helper;

public class Linea extends Formas{
    
    double largo;
    int a;
    int b; 

    public void calcularDistancia(){
        
    }
    public Linea(String color, double largo){
        super(color);
        this.largo = largo; 
        }
    public void Circulo(){
        setdibujar ("FIGURA");
        setColor ("ROJO");
       
    }    

     public void imprimirFigura(){
        
        System.out.println("LINEA");
        
        
    }

    
    }


    
    
    
    
    
    
