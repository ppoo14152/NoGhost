import greenfoot.*;

/**
 * Write a description of class ninio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public Guardia(int n)
    {
        setImage("guardia.png");
        id = n;
    }
    
    public void act() 
    {
        chekaPiso();
        saltoAutomatico();
    }
    
    public void saltoAutomatico()
    {
        if( tiempoSalto == 150 && saltando == false)
        {
            saltar();
            tiempoSalto = 0;
        }
        tiempoSalto++;
    }
    
    private void caida()
    {
            setLocation(getX(),getY()+velCaida);
            if(velCaida <=9)
            {
                velCaida = velCaida + aceleracion;
            }
            saltando = true;
    }
    
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
    
    
    public void moveraTierra(Actor piso)
    {
        int pisoAltura = piso.getImage().getHeight();
        int nuevaY = piso.getY() - ((pisoAltura + altoImagen())/2);
        setLocation(getX(),nuevaY);
        saltando = false;
    }
    
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
    
    public void saltar()
    {
        velCaida = velCaida - tamSalto;
        saltando = true;
        caida();
    }
    
    
    public int altoImagen()
    {
        return getImage().getHeight();
    }
    
    public int anchoImagen()
    {
        return getImage().getWidth();
    }
}