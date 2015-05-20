import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Muestra la cadena de vida
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class TextoVidas extends Actor
{
    private GreenfootImage texto;
    
    private int posX = 0;
    private int posY = 0;
    private String cadena1;
    
    /**
     * Cosntructor de la clase
     */
    public TextoVidas(String cad)
    {
        cadena1 = cad;
    }
    
    /**
     * Despliega la cadena de vidas
     */
    public void Despliega(String cadena)
    {
        super.setImage(new GreenfootImage(cadena1+cadena,15,java.awt.Color.WHITE,null));
    }
    
    /**
     * Metodo actua que se ejecuta siempre
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
