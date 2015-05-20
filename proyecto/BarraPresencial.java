import greenfoot.*;
import java.awt.Color;
/**
 * Esta clase crea una Barra para que esta se modifique conforme la requiera el usuario
 * 
 * @author Cristobal Zavala Cano
 * @version (15 Mayo 2015)
 */
public class BarraPresencial extends Actor
{
    
    private int vida;
    private int VidaBarraAncho;
    private int VidaBarraAlto;
    private int pixelesDeBarra;
    /**
     * Constructor de la Barra inicializa la barra , es decir esta al 100%
     */
    public BarraPresencial()
    {
        vida = 100;
        VidaBarraAncho = 100;
        VidaBarraAlto = 15;
        pixelesDeBarra = (int)VidaBarraAncho/vida;
        Actualiza();
    }
    
    
    /**
     * Esta clase siempre esta ejecutandose cada que el Actor BarraPresencial fue llamado
     */
    public void act() 
    {
        Actualiza();
    }
    
    /**
     * Esta clase solo Actualiza la Barra con los nuevos valores y la modifica para vaciarla
     */
    public void Actualiza()
    {
        setImage(new GreenfootImage(VidaBarraAncho + 2,VidaBarraAlto + 2));
        GreenfootImage miImagen = getImage();
        miImagen.setColor(Color.WHITE);
        miImagen.drawRect(0,0,VidaBarraAncho + 1,VidaBarraAlto + 1);
        miImagen.setColor(Color.RED);
        miImagen.fillRect(1, 1,vida*pixelesDeBarra,VidaBarraAlto);
        
    }
    
    /**
     * Esta clase al ejecutarse modifica el total de tu vida restando una unidad a ella
     */
    public void detectaPresencia()
    {
        vida --;
    }
}
