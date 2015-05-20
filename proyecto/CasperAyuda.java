import greenfoot.*;

/**
 * Write a description of class CasperAyuda here.
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class CasperAyuda extends EstaticosAyuda
{
    private GreenfootImage imagen;
    private int z = 10;
    private int z2 = 10;
    private int a;
    private int sube;
    private int aux = 0;
    private boolean band = false;
    private int i = 20;
    
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
