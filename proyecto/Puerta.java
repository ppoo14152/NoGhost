import greenfoot.*;

/**
 * Crea la puerta del elevador
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class Puerta extends Elevadores
{
    private GreenfootImage imagen;
    /**
     * Constructor de la clase puerta 
     */
    public Puerta()
    {
        imagen = new GreenfootImage("PC.png");
        setImage(imagen);
    }
    
    /**
     * No contiene ningun actua solo esta estatica
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
