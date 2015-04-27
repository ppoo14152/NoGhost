import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casper extends Actor
{
    public int direccion;
    private int bandElevador = 0;
    private int varEstatica = 0;
    
    public void act() 
    {
        Movimiento();
        
        LimitesPared();
        LimitesPiso();
        TocandoTuboYElevador();
    }  
    
    public void Movimiento()
    {
        int y=getY();
        
        if(Greenfoot.isKeyDown("right"))
        {
            this.setLocation(this.getX()+1,this.getY());
            direccion = 1;
        }   
        if(Greenfoot.isKeyDown("left"))
        {
            this.setLocation(this.getX()-1,this.getY());
            direccion = 2;
        }   
        if(Greenfoot.isKeyDown("up"))
        {
            this.setLocation(this.getX(),this.getY()-1);
            direccion = 3;
        }   
        if(Greenfoot.isKeyDown("down"))
        {
            this.setLocation(this.getX(),this.getY()+1);
            direccion = 4;
        }   
    }
    
    public void LimitesPared()
    {
        if(direccion == 1 && getOneObjectAtOffset(Ancho()/2,0,Pared.class) != null)
        {
            setLocation(getX()-1,getY());
        }
        
        if(direccion == 2 && getOneObjectAtOffset(-Ancho()/2,0,Pared.class) != null)
        {
            setLocation(getX()+1,getY());
        }
    }
    
    public void LimitesPiso()
    {
        if(direccion == 3 && getOneObjectAtOffset(Alto()/2,0,Pisos.class) != null)
        {
            setLocation(getX(),getY()+1);
        }
        if(direccion == 4 && getOneObjectAtOffset(Alto()/2,0,Pisos.class) != null)
        {
            setLocation(getX(),getY()-1);
        }
    }
    public void TocandoTuboYElevador()
    {   
        Elevador elev = (Elevador)(getWorld().getObjects(Elevador.class).get(0)); 
        
        Actor elevador = getOneIntersectingObject(Elevador.class); 
        Actor baseElev = getOneIntersectingObject(BaseElevador.class); 
        
        int x = elev.Parado();
        
        int varDinamica = elev.getY();
        
        if(direccion == 2 && getOneObjectAtOffset(-Ancho()/2,0,BaseElevador.class) != null)
        {
            setLocation(getX()+1,getY());
        }
        
        if(direccion == 1 && getOneObjectAtOffset(Ancho()/2,0,BaseElevador.class) != null)
        {
            setLocation(getX()-1,getY());
        }
        
        if(x == 1 && elevador != null) // Si el elevador esta detenido y esta tocando al elevador
        {
            Movimiento();
        }
        
        if(x == 1 && elevador != null && Greenfoot.isKeyDown("w"))
        { 
            getWorld().setPaintOrder(Elevador.class, Casper.class);
            
            bandElevador = 1;
            if(x == 1)
            {
                varEstatica = elev.getY();
            }
        }
        
        if(bandElevador == 1 && getOneObjectAtOffset(0,Alto()/2,Pisos.class) == null && x == 0)
        {
            if(varDinamica < varEstatica)
            {
                setLocation(getX(),getY()-1);
            }
            if(varDinamica > varEstatica)
            {
                setLocation(getX(),getY()+1);
            }
        }
        
        if(x == 1 && bandElevador == 1 && Greenfoot.isKeyDown("z"))
        {
            //getWorld().setPaintOrder(ImagenesJuego.class,Personajes.class,Bala.class, Enemigos.class,Puertas.class,BaseElevador.class,Elevador.class,Plataforma.class,Barrera.class,Ovni.class,BalaOvni.class);
            bandElevador = 0;
        }
    }
    private int Alto()
    {
        return getImage().getHeight();
    }
    
    public int Ancho()
    {
        return getImage().getWidth();
    }
}
