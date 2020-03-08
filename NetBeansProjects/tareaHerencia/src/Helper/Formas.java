package Helper;

/**
 //super clase Formas
 */
public class Formas {
    //ATRIBUTOS//
    
    public String dibujar;
    public String color;
    
    
    public Formas ( String dibujar){
        //constructor vacio       
    }
    
    //ESTABLECER Y OBTENER//
    
    
    public void setdibujar(String dibujar){
        this.dibujar = dibujar;      
           
    }
    
    
    public String getdibujar(){
        return this.dibujar;
    
    }
    
        public void setColor(String color){
        this.color = color;      
           
    }
    
    
    public String getColor( String color){
        return this.color;
       
    }
    
    
    public void imprimirInformacion(){
        
        System.out.println("color"+color);
        
        
    }
}
        
    
    
    

