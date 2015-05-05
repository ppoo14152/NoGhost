import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextoVidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextoVidas extends Actor
{
    private GreenfootImage texto;
    
    public int posX = 0;
    public int posY = 0;
    public String cadena1;
    
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
