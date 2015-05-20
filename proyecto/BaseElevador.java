import greenfoot.*;
import java.util.*;

/**
 * Crea la base del elevador
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class BaseElevador extends Elevadores
{
   
    private ArrayList imagenes;
    
    /**
     * Constructor de la Base elige entre 
     * @param sel selecciona el elevador a usar
     */
    public BaseElevador(int sel)
    {
        imagenes  = new ArrayList();
        
        imagenes.add(new GreenfootImage("G1.png"));
        imagenes.add(new GreenfootImage("G2.png"));
        
        if(sel == 0)
        {
            setImage((GreenfootImage)imagenes.get(0));
        }
        
        if(sel == 1)
        {
            setImage((GreenfootImage)imagenes.get(1));
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
