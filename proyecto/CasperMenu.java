import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CasperMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasperMenu extends Actor
{
    public GreenfootImage imagen;
    public int z = 200;
    public int z2 = 200;
    public int a;
    public int sube;
    public int aux = 0;
    public boolean band = false;
    
    public CasperMenu(int x, int y, int tipo)
    {
        if(tipo == 1)
        {
            imagen = new GreenfootImage("Casper1.png");
        }
        if(tipo == 2)
        {
            imagen = new GreenfootImage("casperSaluda.png");
        }
        a = x;
        sube = y;
        
        setImage(imagen);
    }
    public void act() 
    {
        if(z == 0)
        {
            band = true;
        }else
        {
            setLocation(a, sube++);
            z--;
            z2 = 200;
        }
        if(band)
        {
            if(z2 != 0)
            {
                setLocation(a, sube--);
                z2--;
            }
            if(z2 == 0)
            {
                z = 200;
                band = false;
            }
        }
    }    
}
