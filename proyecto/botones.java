import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea los botones , ya sea ayuda,menu,juego etc...
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class botones extends Actor
{
    private GreenfootImage imagen;
    
    /**
     * Cosntructor de los botones
     * @param b que define que boton se desea utilizar.
     */
    public botones(int b)
    {
        if(b==1)
        {
            imagen=new GreenfootImage("BOTONJUGAR.png");//b igual a 1 
        }
        if(b == 2)
        { 
            imagen=new GreenfootImage("BOTONAYUDA.png");//b igual a 2
        }
        if(b == 3)
        { 
            imagen=new GreenfootImage("BOTONREGRESAR.png");//b igual a 3
        }
       
        if(b == 4)
        { 
            imagen=new GreenfootImage("BOTONCREDITOS.png");//b igual a 4
        }
        if(b == 5)
        { 
            imagen=new GreenfootImage("BOTONRECORDS.png");//b igual a 4
        }
        setImage(imagen);
    }
    /**
     * Clase actua que muestra la imagen que se eligio al ser creada
     */
    public void act() 
    {
        setImage(imagen);
    }    
}
