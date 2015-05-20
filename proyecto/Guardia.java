import greenfoot.*;

/**
 * Crea un guardia en el escenario que solo salta 
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class Guardia extends persona
{
    private int speed = 1;
    private int frame = 1;
    private int tiempoAnimacion = 0;
    private int id;
    private boolean parate = false;
    
    // ********** variables para el salto **********/
    private int velCaida = 0;
    private int aceleracion = 2;
    private boolean saltando;
    private int tamSalto = 15;
    private int tiempoSalto;
    //************************************************
    /**
     * Constructor de la clase guardia cada que es llamada para inicializar las variables.
     * @param n es un id con el que se reconocera al actor.
     */
    public Guardia(int n)
    {
        setImage("guardia.png");
        id = n;
    }
    
    /**
     * Clase donde el guardia salta y actua solo
     */
    public void act() 
    {
        if(parate == false){
            chekaPiso();
            saltoAutomatico();
        }
        parado();
    }
    
    /**
     * Clase para activar el salto automatico cada cierto tiempo y si esta en el suelo.
     */
    public void saltoAutomatico()
    {
        if( tiempoSalto == 150 && saltando == false)
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