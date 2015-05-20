import greenfoot.*;

/**
 * Muestra la ayuda del juego
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (15 Mayo 2015) 
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
    
    /**
     * Cosntructor de la ayuda carga una imagen de gasper
     */
    public CasperAyuda(int x, int y)
    {
        imagen = new GreenfootImage("CasperJuego.png");
        
        setImage(imagen);
        
        a = x;
        sube = y;
    }
    
    /**
     * Hace el movimiento de casper arriba y abajo en el menu
     */
    public void act() 
    {
        Movimiento();
    }
    
    /**
     * Hace el movimiento de arriba y abajo para casper
     */
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
