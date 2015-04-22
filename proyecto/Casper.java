import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casper extends Actor
{
    public int direccion;
    public int vel=5;
    
    
    public void act() 
    {
        Movimiento();
        LimitesPared();
        LimitesPiso();
    }  
    
    public void Movimiento()
    {
        int y=getY();
        direccion = 0;
        
        if(Greenfoot.isKeyDown("right"))
        {
            move(vel);
            direccion = 1;              //DERECHA
        }   
        if(Greenfoot.isKeyDown("left"))
        {
            move(-vel);                 //IZQUIERDA
            direccion = 2;
        }   
        if(Greenfoot.isKeyDown("up"))
        {
            y-=vel;
            direccion = 3;              //ARRIBA
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            y+=vel;
            direccion = 4;              //ABAJO
        }   
        setLocation(getX(),y);
    }
    
    public void LimitesPared()
    {
        if(direccion == 1 && getOneObjectAtOffset(Ancho()/2,0,Pared.class) != null)
        {
            setLocation(getX()-vel,getY());
        }
        
        if(direccion == 2 && getOneObjectAtOffset(-Ancho()/2,0,Pared.class) != null)
        {
            setLocation(getX()+vel,getY());
        }
    }
    
    public void LimitesPiso()
    {
        if(direccion == 3 && getOneObjectAtOffset(0,-Alto()/2,Pisos.class) != null)
        {
            setLocation(getX(),getY()+vel);
        }
        
        if(direccion == 4 && getOneObjectAtOffset(0,Alto()/2,Pisos.class) != null)
        {
            setLocation(getX(),getY()-vel);
        }
    }
    
    private int Alto()
    {
        return getImage().getHeight();
    }
    
    public int Ancho()
    {
        return getImage().getWidth();
    }
}
