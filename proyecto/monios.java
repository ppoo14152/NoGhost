import greenfoot.*;
import java.util.*;

/**
 * Imagenes de el escenario de records y pantallas de perdiste y ganaste
 * 
 * @author (Maria Gpe. Velazquez Martinez) 
 * @version (a version number or a date)
 */
public class monios extends Estaticos
{
    private ArrayList imagenes;
    
    /**
     * Act - do whatever the moños wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public monios(int sel)
    {
      imagenes  = new ArrayList();
      
      imagenes.add(new GreenfootImage("GANA.png"));//se agrega al arreglo la imagen de los moños
      imagenes.add(new GreenfootImage("GAN.png"));//se agrega imagen de hombre con copa en records
      imagenes.add(new GreenfootImage("GANASTE.png"));//se agrega imagen de ganaste en el juego
      imagenes.add(new GreenfootImage("PERDISTE.png"));//se agrega imagen de perdiste en el juego
      
      
      if(sel == 0)//condicional para establecer la funcion del la clase
        {
            setImage((GreenfootImage)imagenes.get(0));
        }
      if(sel == 1)//condicional para establecer la funcion del la clase
        {
            setImage((GreenfootImage)imagenes.get(1));
        }
      if(sel == 2)//condicional para establecer la funcion del la clase
      {
            setImage((GreenfootImage)imagenes.get(2));
      }
      if(sel == 3)//condicional para establecer la funcion del la clase
      {
            setImage((GreenfootImage)imagenes.get(3));
      }
      
    }
        
    public void act() 
    {
        // Add your action code here.
    }    
}