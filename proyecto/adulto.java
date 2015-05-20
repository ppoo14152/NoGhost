import greenfoot.*;

/**
 * La clase muestra a un Actor que es un adulto que se esta paseando por el escenario brincando y corriendo
 * 
 * @author Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano.
 * @version 15 Mayo 2015.
 */
public class adulto extends persona
{
    private GreenfootImage run1;
    private GreenfootImage run2;
    private GreenfootImage run3;
    private GreenfootImage run4;
    
    private int speed;
    private int frame;
    private int avance;
    private int id;
    private boolean parate = false;
    
     // ********** variables para el salto **********/
    private int velCaida;
    private int aceleracion;
    private boolean saltando;
    private int tamSalto;
    private int tiempoSalto;
    //************************************************
    
    /**
     * Constructor de la clase adulto cada que es llamada para inicializar las variables.
     * @param n es un id con el que se reconocera al actor.
     */
    public adulto(int n)
    {
        run1= new GreenfootImage("r.png");
        run2= new GreenfootImage("r1.png");
        run3= new GreenfootImage("r2.png");
        run4= new GreenfootImage("r.png");
        //***** inicializacion de variables para el salto *********//
        velCaida = 0;
        aceleracion = 2;
        tamSalto = 15;
        tiempoSalto = 0;
        //*********************************************************//
        speed = 2;
        frame = 1;
        avance = 0;
        setImage("r1.png");
        id = n;
    }
    
    /**
     * Clase donde el adulto camina, salta y se mueve sobre el escenario.
     */
    public void act() 
    {
        World m=getWorld();
        if (parate==false)
        {
            if(getX()>=m.getWidth()-170||getX()<=120){
                run1.mirrorHorizontally();
                run2.mirrorHorizontally();
                run3.mirrorHorizontally();
                run4.mirrorHorizontally();
                speed=-speed;
            }
            setLocation(getX()+speed,getY());
            animacionDerecha();
            chekaPiso();
            saltoAutomatico();
        }
        
        
        if(parate == true)
        {
            setImage(run4);
        }
        parado();
    }
   
    /**
     * Esta Clase hace que el jugador cambie su estado de interaccion, falso para caminar y true para 
     * que se pare.
     */
    public void parado()
    {
        Casper jug = (Casper)(getWorld().getObjects(Casper.class).get(0));        
        boolean x = jug.ParaPersona();
        if(x == false)
        {
            parate = false;
        }else
        {
            parate = true;
        }
        
    }
    
    /**
     * Solo muestra la animacion derecha al estar actuando en el escenario.
     */
    public void animacionDerecha()
    {
        if(frame == 1)
        {
            setImage(run1);
        }
        else if(frame == 2)
        {
            setImage(run2);
        }
        else if(frame == 2)
        {
            setImage(run2);
        }
        else if(frame == 3)
        {
            setImage(run3);
        }
        else if(frame == 4)
        {
            setImage(run1);
            frame=1;
        }
        
        if(avance==10)
        {
            frame++;
            avance = 0;
        }
        avance++;
    }
    
    /**
     * Clase para activar el salto automatico cada cierto tiempo y si esta en el suelo.
     */
    public void saltoAutomatico()
    {
        if( tiempoSalto == 120 && saltando == false)
        {
            saltar();
            tiempoSalto = 0;
        }
        tiempoSalto++;
    }
    
    /**
     * Clase para la caida cambia cada que se ejecuta cambia la variable saltando en true.
     */
    private void caida()
    {
            setLocation(getX(),getY()+velCaida);
            if(velCaida <=9)
            {
                velCaida = velCaida + aceleracion;
            }
            saltando = true;
    }
    
    
    /**
     * Retorna si el actor esta tocando el suelo o saltando
     * @return true cuando el actor esta en el suelo
     * @return false cuando el actor esta saltando
     */
    public boolean enPiso()
    {
        int miraPiso = (int) (altoImagen()/2)+1;
        Actor piso = getOneObjectAtOffset(0,miraPiso,Pisos.class);
        if(piso==null)
        {
            saltando = true ;
            return false;
        }
        else
        {
            moveraTierra(piso);
            return true;
        }
        
    }
    
    /**
     * Mueve a tierra al personaje, lo deja fijo en el piso.
     */
    public void moveraTierra(Actor piso)
    {
        int pisoAltura = piso.getImage().getHeight();
        int nuevaY = piso.getY() - ((pisoAltura + altoImagen())/2);
        setLocation(getX(),nuevaY);
        saltando = false;
    }
    
    
    /**
     * checa si el actor ha llegado al piso, si no esta en el piso efectua la caida
     * si esta en el piso  la velocidad de caida vuelve a 0.
     */
    public void chekaPiso()
    {
        if(enPiso())
        {
            velCaida = 0;
        }
        else{
            caida();
        }
    }
    
    /**
     * Efectua la simulacion de saltado , cambia la variable saltando a true.
     */
    public void saltar()
    {
        velCaida = velCaida - tamSalto;
        saltando = true;
        caida();
    }
    
    /**
     * retorna el alto de la imagen
     * @return alto
     */
   public int altoImagen()
    {
        return getImage().getHeight();
    }
    
    /**
     * retorna el ancho de la imagen
     * @return ancho
     */
    public int anchoImagen()
    {
        return getImage().getWidth();
    }
}