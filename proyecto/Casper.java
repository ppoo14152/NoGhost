import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casper extends Actor
{
    private GreenfootImage gasperIzq= new GreenfootImage("CasperJuego.png");
    private GreenfootImage gasperDer= new GreenfootImage("CasperJuegoder.png");
    public int direccion;
    private int bandElevador = 0;
    private int varEstatica = 0;
    private int speed = 5 ;
    private Texto mitexto = new Texto();
    private boolean bandEntrada = false;
    private int timeCreaPosion = 0;
    
    public void act() 
    {
        Movimiento();
        tocaPosima();
        TocandoTuboYElevador();
        PrendeObjeto();
        desocultarItem();
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
         if(direccion == 3 && getOneIntersectingObject(Pisos.class) != null)
        {
            setLocation(getX(),getY()+speed);
        }
        
        if(direccion == 4 && getOneIntersectingObject(Pisos.class) != null)
        {
            setLocation(getX(),getY()-speed);
        }
        
        /*if(direccion == 3 && getOneObjectAtOffset(0,-Alto()/2,Pisos.class) != null)
        {
            setLocation(getX(),getY()+speed);
        }
        
        if(direccion == 4 && getOneObjectAtOffset(0,Alto()/2,Pisos.class) != null)
        {
            setLocation(getX(),getY()-speed);
        }*/
    }
    
    public void TocandoTuboYElevador()
    {   
        Elevador elev = (Elevador)(getWorld().getObjects(Elevador.class).get(0)); 
        
        Actor elevador = getOneIntersectingObject(Elevador.class); 
        Actor baseElev = getOneIntersectingObject(BaseElevador.class);
        int x = elev.Parado();
        int varDinamica = elev.getY();
        
        
        
  
        if(direccion == 2 && getOneObjectAtOffset(-Ancho()/2,0,BaseElevador.class) != null && bandEntrada == false)
        {
            
            setLocation(getX()+speed,getY());
           
        }
        
        if(direccion == 1 && getOneObjectAtOffset(Ancho()/2,0,BaseElevador.class) != null && bandEntrada == false)
        {
            
            setLocation(getX()-speed,getY());
           
        }
        
        if(x == 1 && elevador != null) // Si el elevador esta detenido y esta tocando al elevador
        {
            Movimiento();
            bandEntrada = true;
        }
        
        if(x == 0 && elevador == null) // Si el elevador esta detenido y no esta tocando al elevador
        {
            bandEntrada = false;
        }
        
        if(x == 1 && elevador != null && Greenfoot.isKeyDown("e"))
        { 
            getWorld().setPaintOrder(BaseElevador.class, Elevador.class, Casper.class);
            
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
        
        if(x == 1 && bandElevador == 1 && Greenfoot.isKeyDown("s"))
        {
            getWorld().setPaintOrder(Casper.class, BaseElevador.class, Elevador.class);
            bandElevador = 0;
            bandEntrada = false;
        }
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
    
    private int Alto()
    {
        return getImage().getHeight();
    }
    
    public int Ancho()
    {
        return getImage().getWidth();
    }
    
    public boolean PrendeObjeto()
    {
        boolean band = false;
        if(isTouching(Muebles.class))
        {
            if(Greenfoot.isKeyDown("space"))
            {
                band = true;
                //getWorld().addObject(new posion(),getX(),getY());
            }
        }else
        {
            band = false;
        }
        return band;
    }
    
    public void desocultarItem()
    {
        World mundo;
        mundo=getWorld();
        java.util.List lstMuebles = mundo.getObjects(Muebles.class);
        Muebles objMueble = (Muebles)lstMuebles.get(7);
        
        if(isTouching(Muebles.class)){
            
             if(Greenfoot.isKeyDown("space")){
                if(timeCreaPosion >= 100 ){
                   if(direccion==1){
                      getWorld().addObject(new posion(),getX()+100,getY());
                   }    
                   
                   if(direccion == 2){
                    getWorld().addObject(new posion(),getX()-100,getY());
                   }
                   
                   timeCreaPosion=0;
                }
             }
        }
        timeCreaPosion++;
    }
    
    
    public void Movimiento()
    {
        int y=getY();
        
        if(Greenfoot.isKeyDown("right"))
        {
            direccion = 1;                                  //1 Derecha
            this.setLocation(this.getX()+speed,this.getY());
            setImage(gasperDer);
            LimitesPared();
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            direccion = 2;                                  //2 Izquierda
            this.setLocation(this.getX()-speed,this.getY());
            setImage(gasperIzq);
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
}
