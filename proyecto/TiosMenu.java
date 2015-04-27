import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TiosMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TiosMenu extends Actor
{
    public GreenfootImage imagen;
    
    public TiosMenu(int tipo)
    {
        if(tipo == 1)
        {
            imagen = new GreenfootImage("tio1.png");
        }
        if(tipo == 2)
        {
            imagen = new GreenfootImage("tio2.png");
        }
        if(tipo == 3)
        {
            imagen = new GreenfootImage("tio3.png");
        }
        if(tipo ==4)
        {
            imagen = new GreenfootImage("fondonegro1.jpg");//Titulo del juego
        }
        setImage(imagen);
    }
    
    public void act() 
    {
    }    
}
