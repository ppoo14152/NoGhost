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
    private boolean bandEntrada = false;
    private boolean bandPara;
    private int timer = 3000;
    private int timeCreaPosion = 0;
    private int vida=100;
    private Texto txVida;
    private int pocimasRecolectadas=0;
    private Texto txPosima;
    private Texto tocandoBase;// 
    private boolean hola = false;
    int dirQueEntre = 0;//
    
    public Casper()
    {
        //sVida = Integer.toString(vida);
        txVida = new Texto("Vida");
        txPosima = new Texto("Posiones:");
    }
    
    public void act() 
    {
        if(!hola)
        {
            Movimiento();
        }
        tocaPosima();
        TocandoTuboYElevador();
        //Tocandotubo();
        PrendeObjeto();
        desocultarItem();
        danio();
        gana();
        MuestraVida();
        MuestraPosiones();
    }
    
    
    
    /*public void Tocandotubo()
    {
        //boolean bandEntrada = false;
        Elevador elev = (Elevador)(getWorld().getObjects(Elevador.class).get(0));
        Actor elevador = getOneIntersectingObject(Elevador.class); //Checa si tocamos elevador
        int elevParado = elev.Parado();
        
        if( getOneIntersectingObject(BaseElevador.class) != null ){
            if(bandEntrada == false ){              //Si la bandera es falsa no me dejara entrar
                if(dirQueEntre == 2){       
                        setLocation(getX()+speed,getY());
                }
            }
            
        }
        
        if(elevParado == 1 && elevador != null)              // Si el elevador esta detenido y esta tocando al elevador
        {
            Movimiento();
            bandEntrada = true;
            if(direccion == 2 ){
                dirQueEntre = 2;
            }
        }
        else{
            bandEntrada = false;
        }
    }*/
    
    
    
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
            if(!hola)
            {
                Movimiento();
            }
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
                hola = true;
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
            hola = false;
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
        pocimasRecolectadas++;
        }
        
    }
    
    public boolean PrendeObjeto()
    {
        boolean band = false;
        if(isTouching(Muebles.class))
        {
            if(Greenfoot.isKeyDown("space"))
            {
                band = true;
                bandPara = true;
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
            
             if(Greenfoot.isKeyDown("d")){
                if(timeCreaPosion >= 100 ){
                   if(direccion==1){
                       
                       //if(objMueble.setobjInteractivo()==true)
                            getWorld().addObject(new posion(),getX()+50,getY());
                            
                   }    
                   
                   if(direccion == 2){
                       
                       //if(objMueble.setobjInteractivo()==true)
                            getWorld().addObject(new posion(),getX()-50,getY());
                            
                   }
                   
                   timeCreaPosion=0;
                }
             }
        }
        timeCreaPosion++;
    }
    
    public boolean ParaPersona()
    {
        boolean oli = false;
        if(bandPara)
        {
            if(timer != 0)
            {
                timer--;
                oli = true;
            }
            if(timer == 0)
            {
                timer = 3000;
                oli = false;
                bandPara = false;
            }
        }
        //System.out.println(timer);
        return oli;
    }
    
    public void danio()
    {
        World miMundo = getWorld();
        Objetivo objetivo = (Objetivo)(getWorld().getObjects(Objetivo.class).get(0));  
        Objetivo2 objetivo1 = (Objetivo2)(getWorld().getObjects(Objetivo2.class).get(0));
        
        int op = objetivo.habilitado();
        int op1 = objetivo1.habilitado();
        
        if(op == 1)
        {
            Casa casa = (Casa)miMundo;
            BarraPresencial vidaBarra = casa.getVidaBarra();
            if(isTouching(persona.class) && bandPara == false)
            {
                vida--;
                vidaBarra.detectaPresencia();
            }
        }
        if(op1 == 1)
        {
            Casa2 casa = (Casa2)miMundo;
            BarraPresencial vidaBarra = casa.getVidaBarra();
            if(isTouching(persona.class) && bandPara == false)
            {
                vida--;
                vidaBarra.detectaPresencia();
            }
        }
        
        if(isTouching(persona.class) && bandPara == true)
        {
        }
        
        if(vida == 0)
        {
            Greenfoot.setWorld(new Menu()); 
        }
    }
    
    public void gana()
    { 
        Objetivo objetivo = (Objetivo)(getWorld().getObjects(Objetivo.class).get(0));  
        Objetivo2 objetivo1 = (Objetivo2)(getWorld().getObjects(Objetivo2.class).get(0));
        
        int op = objetivo.habilitado();
        int op1 = objetivo1.habilitado();
        
        if (isTouching(Objetivo.class) && op == 1)
        {
            Greenfoot.setWorld(new Casa2());
        }
        if (isTouching(Objetivo2.class) && op1 == 1)
        { 
            Greenfoot.setWorld(new Menu()); 
        }
    }
    
    public void MuestraVida()
    {
        txVida.Despliega("",30);
        getWorld().addObject(txVida,700,25);
    }
    
    public void MuestraPosiones()
    {
        txPosima.Despliega(""+pocimasRecolectadas,16);
        getWorld().addObject(txPosima,93,25);
    }
    
    public void Movimiento()
    {
        
        if(Greenfoot.isKeyDown("right"))
        {
            direccion = 1;                                  //1 Derecha
            this.setLocation(this.getX()+speed,this.getY());
            setImage(gasperDer);
            LimitesParedPiso();
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            direccion = 2;                                  //2 Izquierda
            this.setLocation(this.getX()-speed,this.getY());
            setImage(gasperIzq);
            LimitesParedPiso();
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            direccion = 3;                                  //3 Arriba
            this.setLocation(this.getX(),this.getY()-speed);
            LimitesParedPiso();
        }
        
        if(Greenfoot.isKeyDown("down"))                     //4 Abajo
        {
            direccion = 4;
            this.setLocation(this.getX(),this.getY()+speed);
            LimitesParedPiso();
        }   
    }
    
    public void LimitesParedPiso()
    {
        if((getOneIntersectingObject(Pared.class) != null) || (getOneIntersectingObject(Pisos.class) != null )){
            if(direccion == 1){
                setLocation(getX()-speed,getY());
            }
            else if(direccion == 2){
                setLocation(getX()+speed,getY());
            }
            else if(direccion == 3){
                setLocation(getX(),getY()+speed);
            }
            else if(direccion == 4){
                setLocation(getX(),getY()-speed);
            }
            
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
