import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creando un submenu
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (1.0)
 */
public class Menu2 extends Actor
{
    GreenfootImage imagen1;
    GreenfootImage imagen2;
    
    private int indice = 100;
    private int aux = 20;
    private int aux2 = 30;
    private int aux3 = 30;
    private int aux4 = 190;
    
    private boolean band = false;
    private boolean band2 = false;
    private boolean band3 = false;
    
    /**
     * Constructor de Menu2 
     */
    public Menu2()
    {
        imagen1 = new GreenfootImage("1.jpg");
        imagen2 = new GreenfootImage("3.jpg");
        setImage(imagen1);
    }
    
    public void act() 
    {
        Relampago();
    }
    
    /**
     * Se encarga de simular la imagen de relampago en la pantalla al cargarce el menu
     */
    public void Relampago()
    {       
        if(indice == 0)
        {
            setImage(imagen2);
            aux--;
            if(aux == 0)
            {
                band = true;
                aux2 = 30;
            }
        }else
        {
            setImage(imagen1);
            indice--;
            aux = 20;
            
        }
        
        if(band)
        {
            setImage(imagen1);
            aux2--;
            if(aux2 == 0)
            {
                band = false;
                band2 = true;
                aux3 = 30;
            }
        }
        if(band2)
        {
            setImage(imagen2);
            aux3--;
            if(aux3 == 0)
            {
                band2 = false;
                band3 = true;
                aux4 = 190;
            }
        }
        if(band3)
        {
            setImage(imagen1);
            aux4--;
            if(aux4 == 0)
            {
                indice = 100;
                band3 = false;
            }
        }
        
    }
    
}
