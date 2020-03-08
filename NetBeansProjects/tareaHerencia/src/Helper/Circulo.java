//sub clase Circulo//
package Helper;
public class Circulo extends Formas {
    
    double radio = 0;
    double area = 0;
    double PI = 0;
    double calcularArea;      

    public void calcularArea(double aradio, double bpi ){
     this.radio = aradio;   
     this.PI = bpi;
     this.calcularArea = (aradio / 2 * PI);
     
     
      }  
    public Circulo(String color, double radio){
        super(color);
        
     this.radio = radio;   
    }
    public void Circulo(){
        setdibujar ("FIGURA");
        setColor ("AZUL");
       
    }
          
   public void imprimirFigura(){
        
        System.out.println("CIRCULO");
        
        
    }
       
   }
       
   
