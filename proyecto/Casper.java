import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Crea el jugador principal que es un fantasma
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class Casper extends Actor
{
    private Save jugador=new Save();
    private GreenfootImage gasperIzq= new GreenfootImage("CasperJuego.png");
    private GreenfootImage gasperDer= new GreenfootImage("CasperJuegoder.png");
    private int direccion;
    private int speed = 5 ;
    private boolean bandEntrada = false;
    private boolean bandPara;
    private int timer = 3000;
    //********** VariablesPara crear y usar posion**********//
    private int timeCreaPosion = 0;
    private int timeUsaPosion = 0;
    //******************************************************//
    private int vida = 100;
    private Texto txVida;
    private Texto txPosima;
    private Texto txItem;
    private int pocimasRecolectadas = 0;
    private int itemRecolectados = 0;
    /////////////////// variables para el elevador /////////////////////
    private int dirQueEntre;  // checando en la direccion que estoy 
    private boolean tocandoElevador = false;
    private int activado = 0;
    int distancia = 0; 
    
    /**
     * Constructor de la clase casper que inicializa las vidas,posiones y items.
     */
    public Casper()
    {
        //sVida = Integer.toString(vida);
        txVida = new Texto("Vida");
        txPosima = new Texto("Posiones:");
        txItem = new Texto("Items:");
    }
    
    /**
     * Clase para activar todas las funciones de casper
     */
    public void act() 
    {
        if(tocandoElevador == false)            //Solo si no toca el elevador se mueve hacia abajo/arriba
        {
            movAbajoArriba();
        }
        
        if( activado == 0 ){
            movDerIzq();
        }
        
        tocaPosima();
        tocaItem();
        Tocandotubo();
        PrendeObjeto();
        desocultarItem();
        danio();
        gana();
        MuestraVida();
        MuestraPosiones();
        MuestraItems();
        usaPosima();
        
    }
    
    
    /**
     * Esta clase cambia la variable tocandoElevador si lo toca e indica en que direccion del mapa estas
     * ademas es el encargado de que entres o salgas del elevador
     */
    public void Tocandotubo()
    {
        Actor baseElev = getOneIntersectingObject(BaseElevador.class);
        Elevador elev = (Elevador)(getWorld().getObjects(Elevador.class).get(0));
        Actor elevador = getOneIntersectingObject(Elevador.class);
        int parado = elev.Parado();
        
       if(getX()<460){
           dirQueEntre = 0 ;                        //Estoy del lado izquierdo
       }
       else{
            dirQueEntre = 1;                        ////Estoy del lado derecho
       }
       
       if(baseElev != null)
       {
           tocandoElevador = true;
       }
       else{
           tocandoElevador = false;
       }
       
       if(baseElev != null && bandEntrada == false){
           
           if(dirQueEntre == 1){
               setLocation(getX()-speed,getY());
           }
            
           if(dirQueEntre == 0){
              setLocation(getX()+speed,getY());
           }
       }
       
       if(parado == 1 && elevador != null)
       {
           bandEntrada = true;
       }
       else{
           if(activado == 0)
           bandEntrada = false;
       }
       
       if( bandEntrada == true && elevador != null ){
       
           if(Greenfoot.isKeyDown("e")){
               getWorld().setPaintOrder(BaseElevador.class, Elevador.class, Casper.class);
               activado=1;
               distancia = getY() - elev.getY();
               bandEntrada= true;
      
            }
           if(parado == 1){
               if(Greenfoot.isKeyDown("s")){
                   activado=0;
                   getWorld().setPaintOrder(Casper.class, BaseElevador.class, Elevador.class);
                   //bandEntrada = false;
                }
            }
       
           if(activado==1){
           
                    if(parado==0){ 
                        setLocation(getX(),elev.getY()+distancia);
                    }
           }
        }
    }

    /**
     * Aumenta las posimas recolectadas +1
     */
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
    
    /**
     * aumenta los items recolectados +1
     */
    public void tocaItem() 
    {
        Actor unItem;
        unItem = getOneObjectAtOffset(0,0,Item.class);
        if(unItem !=null){
        World mundo;
        mundo=getWorld();
        mundo.removeObject(unItem);
        itemRecolectados++;
        }
        
    }
    
    /**
     * Al presionar la tecla "d" y tocando mueble
     * @return band que es si encendera el mueble o no.
     */
    public boolean PrendeObjeto()
    {
        boolean band = false;                       // Bandera para detectar si Prendio el objeto   
        if(isTouching(Muebles.class))
        {
            if(Greenfoot.isKeyDown("d"))
            {
                band = true;                        // Objeto prendido
            }
            
        }else
        {
            band = false;                           // Objeto Apagado
        }
        return band;                                //Retorna si el objeto esta Encendido/Apagado
    }
    
    /**
     * Se usa la posima con la tecla "z" redice posimas -1
     * y asi detendra a las personas en el escenario
     */
    public void usaPosima()
    {
        if(Greenfoot.isKeyDown("z"))
            {
                if(timeUsaPosion >= 800 && pocimasRecolectadas > 0 ){
                    bandPara = true;
                    pocimasRecolectadas--;
                    timeUsaPosion=0;
                }
            }
        timeUsaPosion ++ ;
    }
    
    /**
     * Al tocar mueble y presionar tecla "d" desoculta un item o posion 
     */
    public void desocultarItem()
    {
        World mundo;
        mundo=getWorld();
        java.util.List lstMuebles = mundo.getObjects(Muebles.class);
        int cualItem= 0;
        if(isTouching(Muebles.class)){
            
             if(Greenfoot.isKeyDown("d")){
                 cualItem = Greenfoot.getRandomNumber(2);
                if(timeCreaPosion >= 100 ){
                   if(direccion==1){
                            
                            if(cualItem == 1){
                                getWorld().addObject(new posion(),getX()+50,getY());
                            }
                            else{
                                getWorld().addObject(new Item(),getX()+50,getY());
                            }
                   }    
                   
                   if(direccion == 2){
                            if(cualItem == 1){
                                getWorld().addObject(new posion(),getX()-50,getY());
                            }
                            else{
                                getWorld().addObject(new Item(),getX()-50,getY());
                            }
                            
                   }
                   
                   timeCreaPosion=0;
                }
             }
        }
        timeCreaPosion++;
    }
    
    /**
     * Clase para parar a una persona 
     * @return stop para pararla durante un tiempo
     */
    public boolean ParaPersona()
    {
        boolean stop = false;
        if(bandPara)
        {
            if(timer != 0)
            {
                timer--;
                stop = true;
            }
            if(timer == 0)
            {
                timer = 3000;
                stop = false;
                bandPara = false;
            }
        }
        //System.out.println(timer);
        return stop;
    }
    
    /**
     * Detecta todo el daño hecho al jugador resta vida si lo tocan los personajes del mundo
     */
    public void danio()
    {
        World miMundo = getWorld();
        Objetivo objetivo = (Objetivo)(getWorld().getObjects(Objetivo.class).get(0));  
        Objetivo2 objetivo1 = (Objetivo2)(getWorld().getObjects(Objetivo2.class).get(0));
        Objetivo3 objetivo2 = (Objetivo3)(getWorld().getObjects(Objetivo3.class).get(0));
        
        int op = objetivo.habilitado();
        int op1 = objetivo1.habilitado();
        int op2 = objetivo2.habilitado();
        
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
        if(op2 == 1)
        {
            Casa3 casa = (Casa3)miMundo;
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
            jugador.saveHighscore(itemRecolectados);
            Greenfoot.setWorld(new Fin(1)); 
        }
    }
    
    /**
     * Cambia de niveles cada vez que logra los objetivos planteados
     */
    public void gana()
    { 
        Objetivo objetivo = (Objetivo)(getWorld().getObjects(Objetivo.class).get(0));  
        Objetivo2 objetivo1 = (Objetivo2)(getWorld().getObjects(Objetivo2.class).get(0));
        Objetivo3 objetivo2 = (Objetivo3)(getWorld().getObjects(Objetivo3.class).get(0));
        
        int op = objetivo.habilitado();
        int op1 = objetivo1.habilitado();
        int op2 = objetivo2.habilitado();
        
        if (isTouching(Objetivo.class) && op == 1 && itemRecolectados >= 10)//pasar de primer nivel a segundo nivel
        {
            Greenfoot.setWorld(new Casa2());
        }
        if (isTouching(Objetivo2.class) && op1 == 1 && itemRecolectados >= 15)//pasar de segundo nivel a tercer nivel
        { 
            Greenfoot.setWorld(new Casa3()); 
        }
        if (isTouching(Objetivo3.class) && op2 == 1 && itemRecolectados >= 25)//pasar de tercer nivel a ganar
        { 
            Greenfoot.setWorld(new Fin(0)); 
        }

    }
    
    /**
     * Clase utilizada solo para mostrar la vida en el mundo
     */
    public void MuestraVida()
    {
        txVida.Despliega("",30);
        getWorld().addObject(txVida,710,25);
    }
    
    /**
     * Clase utilizada solo para mostrar las posiones en el mundo.
     */
    public void MuestraPosiones()
    {
        txPosima.Despliega(""+pocimasRecolectadas,16);
        getWorld().addObject(txPosima,93,25);
    }
    
    /**
     * Clase utilizada solo para mostrar los items en el mundo.
     */
    public void MuestraItems()
    {
        txItem.Despliega(""+itemRecolectados,16);
        getWorld().addObject(txItem,203,25);
    }
    
    /**
     * Clase que solo mueve al actor en direccion izquierda y derecha
     */
    public void movDerIzq()
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
    }
    
    /**
     * Clase que solo mueve al actor en direccion arriba y abajo.
     */
    public void movAbajoArriba()
    {
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
    
    /**
     * Crea las restricciones para que le sea imposible atravesar paredes y piso dependiendo de su direccion
     */
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
    
    /**
     * @return alto de la imagen
     */
     private int Alto()
    {
        return getImage().getHeight();
    }
    
    /**
     * @return ancho de la imagen
     */
    public int Ancho()
    {
        return getImage().getWidth();
    }
}
