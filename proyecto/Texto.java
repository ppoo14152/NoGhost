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
    public Texto(int sel)
    {
        if (sel ==0)
        {
           score=0;
           setImage(new GreenfootImage(200,30));
           repintar(0);
        }
        
        if (sel ==1)
        {
           score=0;
           setImage(new GreenfootImage(200,30));
           repintar(1);
        }
        
    }
    
    public void agregar()
    {
        score++;
        repintar(0);
        repintar(1);
       
    }
    
    public void repintar(int n)
    {
        if(n==0)
        {
            GreenfootImage img = getImage();
            img.clear();
            img.setColor(Color.WHITE);
            img.drawString("Posimas: " + score+" Objetivo: 50", 4 , 20);
        }
        
        if(n==1)
        {
            GreenfootImage img = getImage();
            img.clear();
            img.setColor(Color.WHITE);
            img.drawString("Posimas: "+ score+" Objetivo: 100", 4 , 20);
        }
        
    }
    
    public void act() 
    {
        //repintar(0);
        //repintar(1);
    }
}
