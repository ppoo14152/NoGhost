import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class botones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class botones extends Actor
{
    public GreenfootImage imagen;
    
    public botones(int b)
    {
        if(b==1)
        {
            imagen=new GreenfootImage("Jugar.png");//b igual a 1 
        }
        if(b == 2)
        { 
            imagen=new GreenfootImage("Ayuda.png");//b igual a 2
        }
        if(b == 3)
        { 
            imagen=new GreenfootImage("Regresar.png");//b igual a 3
        }
        if(b == 4)
        { 
            imagen=new GreenfootImage("Creditos.png");//b igual a 4
        }
        
        setImage(imagen);
    }
    
    public void act() 
    {
        setImage(imagen);
    }    
}
