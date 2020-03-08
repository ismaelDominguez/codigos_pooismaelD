
//sub clase Cuadrado

package Helper;
public class Cuadrado extends Formas {
    
   double area;
   int base;
   int altura; 

    public Cuadrado(String dibujar) {
        super(dibujar);
    }

    public void calcular (){
    
     area = base * altura ;
   }
   public Cuadrado(String color, Double area){
        super(color);
        this.area = area; 
    }
    
    public void Circulo(){
        setdibujar ("FIGURA");
        setColor ("NEGRO");
       
    }
    
    public void imprimirfigura(){
        
        System.out.println("CUADRADO");
    }
        
    }
    
    
    
    

    