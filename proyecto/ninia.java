import greenfoot.*;

/**
 * Crea a una ninia que va corriendo en el escenario
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class ninia extends persona
{
    private GreenfootImage run1= new GreenfootImage("girl.png");
    private GreenfootImage run2= new GreenfootImage("girl1.png");
    private GreenfootImage run3= new GreenfootImage("girl2.png");
    private GreenfootImage run4= new GreenfootImage("girl.png");
    
    private int speed = 1;
    private int frame = 1;
    private int avance = 0;
    private int id;
    private boolean parate = false;
    private boolean p;
    
    /**
     * Constructor de la clase ninio cada que es llamada solo inicializa las variables.
     * @param n es un numero con el que se reconocera al actor
     */
    public ninia(int n)
    {
        setImage("girl.png");
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
}
