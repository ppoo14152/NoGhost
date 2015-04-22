import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu2 extends Actor
{
    GreenfootImage imagen1;
    GreenfootImage imagen2;
    
    public int indice = 100;
    public int aux = 20;
    public int aux2 = 30;
    public int aux3 = 30;
    public int aux4 = 190;
    
    public boolean band = false;
    public boolean band2 = false;
    public boolean band3 = false;
    
    private GreenfootSound musica=new GreenfootSound("Truenos.mp3");
    
    public Menu2()
    {
        imagen1 = new GreenfootImage("1.jpg");
        imagen2 = new GreenfootImage("3.jpg");
        
        musica.setVolume(50);
        //setImage(imagen1);
    }
    
    public void act() 
    {
        Relampago();
    }
    
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
            
            musica.play();
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
                musica.stop();
                band3 = false;
            }
        }
    }
}
