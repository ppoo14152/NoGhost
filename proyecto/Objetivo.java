import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Objetivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objetivo extends Estaticos
{
    /**
     * Act - do whatever the Objetivo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList imagenes;
    private int hab;
    public Objetivo(int i)
    {
        //imagenes = new GreenfootImage("PC.png");
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
