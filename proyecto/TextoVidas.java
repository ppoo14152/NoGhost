import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextoVidas here.
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class TextoVidas extends Actor
{
    private GreenfootImage texto;
    
    private int posX = 0;
    private int posY = 0;
    private String cadena1;
    
    public TextoVidas(String cad)
    {
        cadena1 = cad;
    }
    
    public void Despliega(String cadena)
    {
        super.setImage(new GreenfootImage(cadena1+cadena,15,java.awt.Color.WHITE,null));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
