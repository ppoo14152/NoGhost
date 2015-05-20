import greenfoot.*;

/**
 * La clase muestra a un Actor que es un ninio que se esta paseando por el escenario
 * 
 * @author Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano 
 * @version 15 Mayo 2015
 */
public class ninio extends persona
{
    private GreenfootImage run1;
    private GreenfootImage run2;
    private GreenfootImage run3;
    private GreenfootImage run4;
    
    private int speed;
    private int frame;
    private int avance;
    private int id;
    private boolean parate;
    
    /**
     * Constructor de la clase ninio cada que es llamada solo inicializa las variables.
     * @param n es un numero con el que se reconocera al actor
     */
    public ninio(int n)
    {
        run1= new GreenfootImage("n.png");
        run2= new GreenfootImage("n1.png");
        run3= new GreenfootImage("n2.png");
        run4= new GreenfootImage("n0.png");
        setImage("n1.png");
        speed = 1;
        frame = 1;
        avance = 0;
        parate = false;
        id = n;
    }
    
    
    /**
     * Mantiene al jugador Activo es decir moviendose sobre el escenario
     * mientras no se tenga la variable parate en true
     */
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
   
    /**
     * Esta Clase hace que el jugador cambie su estado de interaccion, falso para caminar y true para 
     * que se pare
     */
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
    
    /**
     * Solo muestra la animacion derecha al estar actuando en el escenario
     */
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
}
