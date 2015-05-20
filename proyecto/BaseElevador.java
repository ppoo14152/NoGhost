import greenfoot.*;
import java.util.*;

/**
 * Write a description of class BaseElevador here.
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class BaseElevador extends Elevadores
{
   
    private ArrayList imagenes;
    
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
