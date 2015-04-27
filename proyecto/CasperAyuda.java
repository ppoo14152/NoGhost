import greenfoot.*;

/**
 * Write a description of class CasperAyuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CasperAyuda extends EstaticosAyuda
{
    public GreenfootImage imagen;
    public int z = 10;
    public int z2 = 10;
    public int a;
    public int sube;
    public int aux = 0;
    public boolean band = false;
    public int i = 20;
    
    public CasperAyuda(int x, int y)
    {
        imagen = new GreenfootImage("CasperJuego.png");
        
        setImage(imagen);
        
        a = x;
        sube = y;
    }
    
    public void act() 
    {
        Movimiento();
    }
    
    public void Movimiento()
    {
        if(z == 0)
        {
            i--;
            
        }else
        {
            setLocation(a, sube++);
            z--;
        }
        if(i == 0)
        {
            band = true;
            i = 20;
            z2 = 10;
            
        }
        if(band == true)
        {
            if(z2 != 0)
            {
                setLocation(a, sube--);
                z2--;
                
            }
            if(z2 == 0)
            {
                z = 10;
                band = false;
            }
        }
    }
}
