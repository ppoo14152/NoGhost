import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class Texto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Texto extends Actor
{
    /**
     * Act - do whatever the Texto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score;
    public Texto()
    {
        score=0;
        setImage(new GreenfootImage(200,30));
        repintar();
    }
    
    public void agregar()
    {
        score++;
        repintar();
    }
    
    public void repintar()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.WHITE);
        img.drawString("Posimas: " + score, 4 , 20);
    }
    
    public void act() 
    {
        repintar();
    }    
}
