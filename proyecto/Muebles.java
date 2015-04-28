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
        imagenes.add(new GreenfootImage("6a.png"));
        imagenes.add(new GreenfootImage("5a.png"));
        imagenes.add(new GreenfootImage("3c.png"));
        imagenes.add(new GreenfootImage("2a.png"));
        imagenes.add(new GreenfootImage("16a.png"));
        imagenes.add(new GreenfootImage("refri.png"));
        imagenes.add(new GreenfootImage("estufa.png"));
        imagenes.add(new GreenfootImage("4b.png"));
        imagenes.add(new GreenfootImage("lampara.png"));
        imagenes.add(new GreenfootImage("cuadro2.jpg"));
        imagenes.add(new GreenfootImage("cuadro1.jpg"));
        
         if(sel == 0)
        {
            setImage((GreenfootImage)imagenes.get(0));
        }
        if(sel == 1)
        {
            setImage((GreenfootImage)imagenes.get(1));
        }
        if(sel == 2)
        {
            setImage((GreenfootImage)imagenes.get(2));
        }
        if(sel == 3)
        {
            setImage((GreenfootImage)imagenes.get(3));
        }
        if(sel == 4)
        {
            setImage((GreenfootImage)imagenes.get(4));
        }
        if(sel == 5)
        {
            setImage((GreenfootImage)imagenes.get(5));
        }
        if(sel == 6)
        {
            setImage((GreenfootImage)imagenes.get(6));
        }
        if(sel == 7)
        {
            setImage((GreenfootImage)imagenes.get(7));
        }
        if(sel == 8)
        {
            setImage((GreenfootImage)imagenes.get(8));
        }
        if(sel == 9)
        {
            setImage((GreenfootImage)imagenes.get(9));
        }
        if(sel == 10)
        {
            setImage((GreenfootImage)imagenes.get(10));
        }
        if(sel == 11)
        {
            setImage((GreenfootImage)imagenes.get(11));
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
