import greenfoot.*;
public class persona extends Actor
{
    private GreenfootImage run1= new GreenfootImage("n.png");
    private GreenfootImage run2= new GreenfootImage("n1.png");
    private GreenfootImage run3= new GreenfootImage("n2.png");
    private GreenfootImage run4= new GreenfootImage("n1.png");
    
    private int speed = 1;
    private int frame = 1;
    private int avance = 0;
    public persona()
    {
        setImage("n1.png");
        
    }
    public void act() 
    {
        World m=getWorld();
        if(getX()>=m.getWidth()-5||getX()<=100){
            run1.mirrorHorizontally();
            run2.mirrorHorizontally();
            run3.mirrorHorizontally();
            run4.mirrorHorizontally();
            speed=-speed;
        }
        setLocation(getX()+speed,getY());
        animacionDerecha();
        //Restricciones();
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
            //frame=1;
            //return;
        }
        else if(frame == 4)
        {
            setImage(run4);
            frame=1;
            return;
        }
        
        if(avance==10)
        {
        frame++;
        avance = 0;
        }
        avance++;
    }
    
    public void Restricciones()
    {
        if(getOneObjectAtOffset(Ancho()/2,0,BaseElevador.class) != null)
        {
            setLocation(getX()-5, getY());
        }
        
        if(getOneObjectAtOffset(Ancho()/2,0,Elevador.class) != null)
        {
            setLocation(getX()-5, getY());
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