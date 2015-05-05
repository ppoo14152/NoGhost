import greenfoot.*;
import java.awt.Color;
/**
 * Write a description of class BarraPresencial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarraPresencial extends Actor
{
    /**
     * Act - do whatever the BarraPresencial wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vida = 100;
    int VidaBarraAncho = 100;
    int VidaBarraAlto = 15;
    int pixelesDeBarra = (int)VidaBarraAncho/vida;
    public BarraPresencial()
    {
        Actualiza();
    }
    
    public void act() 
    {
        Actualiza();
    }
    
    public void Actualiza()
    {
        setImage(new GreenfootImage(VidaBarraAncho + 2,VidaBarraAlto + 2));
        GreenfootImage miImagen = getImage();
        miImagen.setColor(Color.WHITE);
        miImagen.drawRect(0,0,VidaBarraAncho + 1,VidaBarraAlto + 1);
        miImagen.setColor(Color.RED);
        miImagen.fillRect(1, 1,vida*pixelesDeBarra,VidaBarraAlto);
        
    }
    
    public void detectaPresencia()
    {
        vida --;
    }
}
