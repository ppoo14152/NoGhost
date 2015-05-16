import greenfoot.*;

/**
 * Write a description of class ninia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ninio extends persona
{
    private GreenfootImage run1= new GreenfootImage("n.png");
    private GreenfootImage run2= new GreenfootImage("n1.png");
    private GreenfootImage run3= new GreenfootImage("n2.png");
    private GreenfootImage run4= new GreenfootImage("n0.png");
    
    private int speed = 1;
    private int frame = 1;
    private int avance = 0;
    private int id;
    private boolean parate = false;
    
    
    public ninio(int n)
    {
        setImage("n1.png");
        id = n;
    }
    
    public void act() 
    {
        World m=getWorld();
        if (parate==false)
        {
            if(getX()>=m.getWidth()-150||getX()<=120){
                run1.mirrorHorizontally();
                run2.mirrorHorizontally();
                run3.mirrorHorizontally();
                run4.mirrorHorizontally();
                speed=-speed;
            }
            setLocation(getX()+speed,getY());
            animacionDerecha();
        }
        
        if(parate == true)
        {
            setImage(run4);
        }
        parado();
    }
   
    public void parado()
    {
        Casper jug = (Casper)(getWorld().getObjects(Casper.class).get(0));        
        boolean x = jug.ParaPersona();
        if(x == false)
        {
            parate = false;
        }else
        {
            parate = true;
        }
        
    }
    
    public void animacionDerecha()
    {
        if(frame == 1)
        {
            setImage(run1);
        }
        else if(frame == 2)
        {
            setImage(run2);
        }
        else if(frame == 2)
        {
            setImage(run2);
        }
        else if(frame == 3)
        {
            setImage(run3);
        }
        else if(frame == 4)
        {
            setImage(run1);
            frame=1;
        }
        
        if(avance==10)
        {
            frame++;
            avance = 0;
        }
        avance++;
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
