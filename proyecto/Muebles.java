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
     public boolean hola;
     private int timer = 500;
     private boolean band = false;
     private boolean entra;
        
    public Muebles(int sel)
    {
        imagenes  = new ArrayList();
        
        imagenes.add(new GreenfootImage("mueble1.png"));
        imagenes.add(new GreenfootImage("6aPrendida.png"));
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
        imagenes.add(new GreenfootImage("focoBanioPrendido.png"));
        imagenes.add(new GreenfootImage("comedor.png"));
        imagenes.add(new GreenfootImage("focoCocinaPrendido.png"));
        imagenes.add(new GreenfootImage("tele.png"));
        imagenes.add(new GreenfootImage("buro7.png"));
        imagenes.add(new GreenfootImage("florero2.png"));
        imagenes.add(new GreenfootImage("buro2.png"));
        imagenes.add(new GreenfootImage("reloj.png"));
        imagenes.add(new GreenfootImage("focoPrimerpisoPrendido.png"));
        imagenes.add(new GreenfootImage("buro.png"));
        imagenes.add(new GreenfootImage("globos.png"));
        imagenes.add(new GreenfootImage("pelota.png"));
        imagenes.add(new GreenfootImage("silla.png"));
        imagenes.add(new GreenfootImage("flores.png"));
        
        imagenes.add(new GreenfootImage("focoPrimerpisoApagado.png"));
        imagenes.add(new GreenfootImage("6a.png"));
        imagenes.add(new GreenfootImage("focoBanioApagado.png"));
        imagenes.add(new GreenfootImage("focoCocinaApagado.png"));
        imagenes.add(new GreenfootImage("lamp2.png"));
        imagenes.add(new GreenfootImage("lamparaApagada.png"));
        imagenes.add(new GreenfootImage("teleApagada.png"));
        imagenes.add(new GreenfootImage("tvApagada.png"));
        
        imagenes.add(new GreenfootImage("gabinete blanco.png"));
        imagenes.add(new GreenfootImage("juego de sala.png"));
        imagenes.add(new GreenfootImage("mueble cafe.png"));
        imagenes.add(new GreenfootImage("mueble de tv blanco.png"));
        imagenes.add(new GreenfootImage("nuevo buro.png"));
        imagenes.add(new GreenfootImage("sillon rojo.png"));
        imagenes.add(new GreenfootImage("cuarto.png"));    
        
                    
        
        
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
        if(sel == 9)//lampara pequeña ultimo piso
        {
            setImage((GreenfootImage)imagenes.get(9));
            numero = 9;
        }
        if(sel == 10)//cuadro cafe
        {
            setImage((GreenfootImage)imagenes.get(10));
            numero = 10;
        }
        if(sel == 11)//cuadro azul
        {
            setImage((GreenfootImage)imagenes.get(11));
            numero = 11;
        }
         if(sel == 12)//florero1
        {
            setImage((GreenfootImage)imagenes.get(12));
            numero = 12;
        }
         if(sel == 13)//lampara de piso
        {
            setImage((GreenfootImage)imagenes.get(13));
            numero = 13;
        }
         if(sel == 14)//tv google
        {
            setImage((GreenfootImage)imagenes.get(14));
            numero = 14;
        }
         if(sel == 15)//wc
        {
            setImage((GreenfootImage)imagenes.get(15));
            numero = 15;
        }
         if(sel == 16)//bañera
        {
            setImage((GreenfootImage)imagenes.get(16));
            numero = 16;
        }
         if(sel == 17)//foco baño
        {
            setImage((GreenfootImage)imagenes.get(17));
            numero = 17;
        }
         if(sel == 18)//comedor
        {
            setImage((GreenfootImage)imagenes.get(18));
            numero = 18;
        }
        if(sel == 19)//foco comedor
        {
            setImage((GreenfootImage)imagenes.get(19));
            numero = 19;
        }
        if(sel == 20)//tele de piso
        {
            setImage((GreenfootImage)imagenes.get(20));
            numero = 20;
        }
        if(sel == 21)//buro bajo tele
        {
            setImage((GreenfootImage)imagenes.get(21));
            numero = 21;
        }
        if(sel == 22)//florero rojo
        {
            setImage((GreenfootImage)imagenes.get(22));
            numero = 22;
        }
        if(sel == 23)//buro 2
        {
            setImage((GreenfootImage)imagenes.get(23));
            numero = 23;
        }
        if(sel == 24)//reloj
        {
            setImage((GreenfootImage)imagenes.get(24));
            numero = 24;
        }
        if(sel == 25)//foco triple
        {
            setImage((GreenfootImage)imagenes.get(25));
            numero = 25;
        }
        if(sel == 26)//buro blanco
        {
            setImage((GreenfootImage)imagenes.get(26));
            numero = 26;
        }
        if(sel == 27)//globos
        {
            setImage((GreenfootImage)imagenes.get(27));
            numero = 27;
        }
         if(sel == 28)//pelota
        {
            setImage((GreenfootImage)imagenes.get(28));
            numero = 28;
        }
        if(sel == 29)//silla
        {
            setImage((GreenfootImage)imagenes.get(29));
            numero = 29;
        }
        if(sel == 30)//flores
        {
            setImage((GreenfootImage)imagenes.get(30));
            numero = 30;
        }
         if(sel == 31)//focoPrimer Piso Apagado
        {
            setImage((GreenfootImage)imagenes.get(31));
            numero = 31;
        }
        if(sel == 32)//mueble de tv
        {
            setImage((GreenfootImage)imagenes.get(32));
            numero = 32;
        }
        if(sel == 33)//foco de banio Apagado
        {
            setImage((GreenfootImage)imagenes.get(33));
            numero = 33;
        }
         if(sel == 34)//foco de cocina Apagado
        {
            setImage((GreenfootImage)imagenes.get(34));
            numero = 34;
        }
        if(sel == 35)//lampara de piso apagada
        {
            setImage((GreenfootImage)imagenes.get(35));
            numero = 35;
        }
        if(sel == 36)//lampara pequeña ultimo piso
        {
            setImage((GreenfootImage)imagenes.get(36));
            numero = 36;
        }
         if(sel == 37)//tele de piso Apagada
        {
            setImage((GreenfootImage)imagenes.get(37));
            numero = 37;
        }
        if(sel == 38)//tv google apagada
        {
            setImage((GreenfootImage)imagenes.get(38));
            numero = 38;
        }
        if(sel == 39)//gabinete blanco
        {
            setImage((GreenfootImage)imagenes.get(39));
            numero = 39;
        }
        if(sel == 40)//juego sala
        {
            setImage((GreenfootImage)imagenes.get(40));
            numero = 40;
        }
        if(sel == 41)//mueble cafe
        {
            setImage((GreenfootImage)imagenes.get(41));
            numero = 41;
        }
        if(sel == 42)//mueble blanco de tv
        {
            setImage((GreenfootImage)imagenes.get(42));
            numero = 42;
        }
        if(sel == 43)//nuevo buro
        {
            setImage((GreenfootImage)imagenes.get(43));
            numero = 43;
        }
        if(sel == 44)//sillon rojo
        {
            setImage((GreenfootImage)imagenes.get(44));
            numero = 44;
        }
        if(sel == 45)//cuarto
        {
            setImage((GreenfootImage)imagenes.get(45));
            numero = 45;
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
            if(numero == 13 && jug != null)//se cambiara lampara de piso 
            {
                setImage((GreenfootImage)imagenes.get(35));//nueva imagen
                hola = true;
            }
            if(numero == 9 && jug != null)//se cambiara  lampara pequeña ultimo piso
            {
                setImage((GreenfootImage)imagenes.get(36));//nueva imagen
                hola = true;
            }
            if(numero == 1 && jug != null)//se cambiara mueble de televisor
            {
                setImage((GreenfootImage)imagenes.get(32));//nueva imagen
                hola = true;
            }
            if(numero == 17 && jug != null)//se cambiara  lampara de banio
            {
                setImage((GreenfootImage)imagenes.get(33));//nueva imagen
                hola = true;
            }
            if(numero == 20 && jug != null)//se cambiara tv de piso
            {
                setImage((GreenfootImage)imagenes.get(37));//nueva imagen
                hola = true;
            }
            if(numero == 14 && jug != null)//se cambiara tv google
            {
                setImage((GreenfootImage)imagenes.get(38));//nueva imagen
                hola = true;
            }
            if(numero == 19 && jug != null)//se cambiara foco de la cocina
            {
                setImage((GreenfootImage)imagenes.get(34));//nueva imagen
                hola = true;
            }
            if(numero == 25 && jug != null)//se cambiara foco del primer piso
            {
                setImage((GreenfootImage)imagenes.get(31));//nueva imagen
                hola = true;
            }
        }
    }
    
    public void RegresaImagenInicial()
    {
        if(timer != 0)
        {
            //System.out.println(timer);
            timer --;
            entra = true;
        }
        //System.out.println(timer);
        if(timer == 0)
        {
            entra = false;
            //System.out.println("Entre al primer if");
            if(numero == 13)
            {
                setImage((GreenfootImage)imagenes.get(13));
            }
            if(numero == 9)
            {
                setImage((GreenfootImage)imagenes.get(9));
            }
            if(numero == 1)
            {
                setImage((GreenfootImage)imagenes.get(1));
            }
            if(numero == 17)
            {
                setImage((GreenfootImage)imagenes.get(17));
            }
            if(numero == 14)
            {
                setImage((GreenfootImage)imagenes.get(14));
            }
            if(numero == 19)
            {
                setImage((GreenfootImage)imagenes.get(19));
            }
            if(numero == 25)
            {
                setImage((GreenfootImage)imagenes.get(25));
            }
            if(numero == 20)
            {
                setImage((GreenfootImage)imagenes.get(20));
            }
            timer = 500;
            hola = false;
        }
    }
}
