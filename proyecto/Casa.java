import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa extends World
{

    /**
     * Constructor for objects of class Casa.
     * 
     */
    public Casa()
    {    
        super(920, 530, 1);
        prepare();
    }
    
    public void prepare()
    {
        Imagenes();
    }
    
    public void Imagenes()
    { 
        //////////////Techo/////////////////
        Pisos a1 = new Pisos();
        addObject(a1,155,120);
        Pisos a2 = new Pisos();
        addObject(a2,228,120);
        Pisos a3 = new Pisos();
        addObject(a3,356,120);
        Pisos a4 = new Pisos();
        addObject(a4,484,120);
        Pisos a5 = new Pisos();
        addObject(a5,612,120);
        Pisos a6 = new Pisos();
        addObject(a6,740,120);
        /////////////Piso 3///////////////////
        Pisos b1 = new Pisos();
        addObject(b1,155,250);
        Pisos b2 = new Pisos();
        addObject(b2,228,250);
        Pisos b3 = new Pisos();
        addObject(b3,356,250);
        Pisos b4 = new Pisos();
        addObject(b4,484,250);
        Pisos b5 = new Pisos();
        addObject(b5,612,250);
        Pisos b6 = new Pisos();
        addObject(b6,740,250);
        /////////////Piso 2///////////////////
        Pisos c1 = new Pisos();
        addObject(c1,155,380);
        Pisos c2 = new Pisos();
        addObject(c2,228,380);
        Pisos c3 = new Pisos();
        addObject(c3,356,380);
        Pisos c4 = new Pisos();
        addObject(c4,484,380);
        Pisos c5 = new Pisos();
        addObject(c5,612,380);
        Pisos c6 = new Pisos();
        addObject(c6,740,380);
        /////////////Piso 1///////////////////
        Pisos d1 = new Pisos();
        addObject(d1,155,510);
        Pisos d2 = new Pisos();
        addObject(d2,228,510);
        Pisos d3 = new Pisos();
        addObject(d3,356,510);
        Pisos d4 = new Pisos();
        addObject(d4,484,510);
        Pisos d5 = new Pisos();
        addObject(d5,612,510);
        Pisos d6 = new Pisos();
        addObject(d6,740,510);
        ///////////Pared izquierda////////////
        Pared pi1 = new Pared();
        addObject(pi1, 105,80);
        Pared pi2 = new Pared();
        addObject(pi2, 105,208);
        Pared pi3 = new Pared();
        addObject(pi3, 105,336);
        Pared pi4 = new Pared();
        addObject(pi4, 105,462);
        ///////////Pared derecha////////////
        Pared pd1 = new Pared();
        addObject(pd1, 790,80);
        Pared pd2 = new Pared();
        addObject(pd2, 790,208);
        Pared pd3 = new Pared();
        addObject(pd3, 790,336);
        Pared pd4 = new Pared();
        addObject(pd4, 790,462);
        //////////Muebles/////////////////
        Muebles m1 = new Muebles();
        addObject(m1, 200,70);
        
        Casper jugador = new Casper();
        addObject(jugador,750,80);
    }
}
