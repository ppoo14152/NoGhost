import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;


/**
 * Write a description of class Muebles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muebles extends Estaticos
{
     private ArrayList imagenes;
     
     private int numero;
     private boolean hola = false;
     private int timer = 1000;
        
    public Muebles(int sel)
    {
        imagenes  = new ArrayList();
        
        imagenes.add(new GreenfootImage("mueble1.png"));
        imagenes.add(new GreenfootImage("6a.png"));
        imagenes.add(new GreenfootImage("5a.png"));
        imagenes.add(new GreenfootImage("3c.png"));
        imagenes.add(new GreenfootImage("2a.png"));
        imagenes.add(new GreenfootImage("16a.png"));
        imagenes.add(new GreenfootImage("refri.png"));
        imagenes.add(new GreenfootImage("estufa.png"));
        imagenes.add(new GreenfootImage("4b.png"));
        imagenes.add(new GreenfootImage("lampara.png"));
        imagenes.add(new GreenfootImage("cuadro2.jpg"));
        imagenes.add(new GreenfootImage("cuadro1.jpg"));
        
        imagenes.add(new GreenfootImage("florero.png"));
        imagenes.add(new GreenfootImage("lamp.png"));
        imagenes.add(new GreenfootImage("tv.png"));
        imagenes.add(new GreenfootImage("wc.png"));
        imagenes.add(new GreenfootImage("baniera.png"));
        
         if(sel == 0)
        {
            setImage((GreenfootImage)imagenes.get(0));
            numero = 0;
        }
        if(sel == 1)
        {
            setImage((GreenfootImage)imagenes.get(1));
            numero = 1;
        }
        if(sel == 2)
        {
            setImage((GreenfootImage)imagenes.get(2));
            numero = 2;
        }
        if(sel == 3)
        {
            setImage((GreenfootImage)imagenes.get(3));
            numero = 3;
        }
        if(sel == 4)
        {
            setImage((GreenfootImage)imagenes.get(4));
            numero = 4;
        }
        if(sel == 5)
        {
            setImage((GreenfootImage)imagenes.get(5));
            numero = 5;
        }
        if(sel == 6)
        {
            setImage((GreenfootImage)imagenes.get(6));
            numero = 6;
        }
        if(sel == 7)
        {
            setImage((GreenfootImage)imagenes.get(7));
            numero = 7;
        }
        if(sel == 8)
        {
            setImage((GreenfootImage)imagenes.get(8));
            numero = 8;
        }
        if(sel == 9)
        {
            setImage((GreenfootImage)imagenes.get(9));
            numero = 9;
        }
        if(sel == 10)
        {
            setImage((GreenfootImage)imagenes.get(10));
            numero = 10;
        }
        if(sel == 11)
        {
            setImage((GreenfootImage)imagenes.get(11));
            numero = 11;
        }
         if(sel == 12)
        {
            setImage((GreenfootImage)imagenes.get(12));
            numero = 12;
        }
         if(sel == 13)
        {
            setImage((GreenfootImage)imagenes.get(13));
            numero = 13;
        }
         if(sel == 14)
        {
            setImage((GreenfootImage)imagenes.get(14));
            numero = 14;
        }
         if(sel == 15)
        {
            setImage((GreenfootImage)imagenes.get(15));
            numero = 15;
        }
         if(sel == 16)
        {
            setImage((GreenfootImage)imagenes.get(16));
            numero = 16;
        }
    }
    
    public void act() 
    {
        Prende();
    }    
    
    public void Prende()
    {
        Casper casper = (Casper)(getWorld().getObjects(Casper.class).get(0));
        Actor jug = getOneIntersectingObject(Casper.class); 
        
        boolean prendio = casper.PrendeObjeto();
        
        if(hola)
        {
            RegresaImagenInicial();
        }
        
        if(prendio)
        {
            if(numero == 1 && jug != null)//se cambiara 
            {
                setImage((GreenfootImage)imagenes.get(0));//nueva imagen
                hola = true;
            }
        }
    }
    
    public void RegresaImagenInicial()
    {
        if(timer != 0)
        {
            System.out.println(timer);
            timer--;
        }
        System.out.println(timer);
        if(timer == 0)
        {
            System.out.println("Entre al primer if");
            if(numero == 1)
            {
                setImage((GreenfootImage)imagenes.get(1));
            }
            timer = 1000;
            hola = false;
        }
    }
}
