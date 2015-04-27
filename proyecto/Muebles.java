import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Muebles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muebles extends Estaticos
{
     private ArrayList imagenes;
    
    public Muebles(int sel)
    {
        
        imagenes  = new ArrayList();
        
        imagenes.add(new GreenfootImage("mueble1.png"));
        imagenes.add(new GreenfootImage("1c.png"));
        
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
