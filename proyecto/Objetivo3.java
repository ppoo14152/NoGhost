import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Objetivo2 here.
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class Objetivo3 extends Estaticos
{
    /**
     * Act - do whatever the Objetivo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList imagenes;
    private int hab;
    public Objetivo3(int i)
    {
        hab = i;
        
        imagenes = new ArrayList();
        imagenes.add(new GreenfootImage("PC.png"));
    }
    
    public void act() 
    {
        // Add your action code here.
        setImage((GreenfootImage)imagenes.get(0));
    }   
    
    public int habilitado()
    {
        return hab;
    }
}
