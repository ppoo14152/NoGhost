import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para mostrar cualquier texto en la pantalla que se pueda agregar al mundo
 * 
 * @author Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano
 * @version 15 Mayo 2015
 */
public class Texto extends Actor
{
    private GreenfootImage texto;
    
    private int posX;
    private int posY;
    private String cadena1;
    
    /**
    * Constructor de la clase Texto solo recibe la cadena para inicializar su variable
    * @param cad es la cadena que se mostrara
    */
    public Texto(String cad)
    {
        posX = 0;
        posY = 0;
        cadena1 = cad;
    }
    
    /**
    * Clase para desplegar el texto recibido
    * @param cadena es el parametro de la cadena a mostrar
    * @param tam es el tamaño del texto a mostrar
    */
    public void Despliega(String cadena,int tam)
    {
        super.setImage(new GreenfootImage(cadena1+cadena,tam,java.awt.Color.WHITE,null));
    }
    
    /**
     * Clase actua de texto, esta inactivo
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
