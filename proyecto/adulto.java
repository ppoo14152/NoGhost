import greenfoot.*;

/**
 * Write a description of class ninia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class adulto extends persona
{
    private GreenfootImage run1= new GreenfootImage("r.png");
    private GreenfootImage run2= new GreenfootImage("r1.png");
    private GreenfootImage run3= new GreenfootImage("r2.png");
    private GreenfootImage run4= new GreenfootImage("r.png");
    
    private int speed = 2;
    private int frame = 1;
    private int avance = 0;
    private int id;
    private boolean parate = false;
    
     // ********** variables para el salto **********/
    private int velCaida = 0;
    private int aceleracion = 2;
    private boolean saltando;
    private int tamSalto = 15;
    private int tiempoSalto;
    //************************************************
    
    
    public adulto(int n)
    {
        setImage("r1.png");
        id = n;
    }
    
    public void act() 
    {
        World m=getWorld();
        if (parate==false)
        {
            if(getX()>=m.getWidth()-150||getX()<=120){
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