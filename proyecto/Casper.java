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
    private int speed = 5 ;
    private Texto mitexto = new Texto();
    
    public void act() 
    {
        Movimiento();
        tocaPosima();
    }
    
    public void tocaPosima() 
    {
        Actor botella;
        botella = getOneObjectAtOffset(0,0,posion.class);
        if(botella !=null){
        World mundo;
        mundo=getWorld();
        mundo.removeObject(botella);
        java.util.List lstTexto = mundo.getObjects(Texto.class);
        Texto objTexto = (Texto)lstTexto.get(0);
        objTexto.agregar();
        // mitexto.agregar();
        }
        
    }
    
    public void Movimiento()
    {
        int y=getY();
        
        if(Greenfoot.isKeyDown("right"))
        {
            direccion = 1;                                  //1 Derecha
            this.setLocation(this.getX()+speed,this.getY());
            LimitesPared();
         
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            direccion = 2;                                  //2 Izquierda
            this.setLocation(this.getX()-speed,this.getY());
            LimitesPared();
        
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            direccion = 3;                                  //3 Arriba
            this.setLocation(this.getX(),this.getY()-speed);
            LimitesPiso();
            
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            direccion = 4;
            this.setLocation(this.getX(),this.getY()+speed);
            //LimitesPared();
            LimitesPiso();
            
        }   
    }
    
    public void LimitesPared()
    {
        if(direccion == 1 && getOneIntersectingObject(Pared.class) != null)
        {
            setLocation(getX()-speed,getY());
        }
        
        if(direccion == 2 && getOneIntersectingObject(Pared.class) != null)
        {
            setLocation(getX()+speed,getY());
        }
        /*if(direccion == 1 && getOneObjectAtOffset(Ancho()/2,0,Pared.class) != null)
        {
            setLocation(getX()-speed,getY());
        }
        
        if(direccion == 2 && getOneObjectAtOffset(-Ancho()/2,0,Pared.class) != null)
        {
            setLocation(getX()+speed,getY());
        }*/
        
        
    }
    
    public void LimitesPiso()
    {
        if(direccion == 3 && getOneObjectAtOffset(0,-Alto()/2,Pisos.class) != null)
        {
            setLocation(getX(),getY()+speed);
        }
        
        if(direccion == 4 && getOneObjectAtOffset(0,Alto()/2,Pisos.class) != null)
        {
            setLocation(getX(),getY()-speed);
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
            setLocation(getX()+speed,getY());
        }
        
        if(direccion == 1 && getOneObjectAtOffset(Ancho()/2,0,BaseElevador.class) != null)
        {
            setLocation(getX()-speed,getY());
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
                setLocation(getX(),getY()-speed);
            }
            
            if(varDinamica > varEstatica)
            {
                setLocation(getX(),getY()+speed);
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
