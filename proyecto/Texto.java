import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para mostrar cualquier texto en la pantalla que se pueda agregar al mundo
 * 
 * @author Cristobal Zavala Cano
 * @version 0.1
 */
public class Texto extends Actor
{
    private GreenfootImage texto;
    
    public int posX = 0;
    public int posY = 0;
    public String cadena1;
    
    /**
    * Constructor de la clase Texto solo recibe la cadena para inicializar su variable
    */
    public Texto(String cad)
    {
        cadena1 = cad;
    }
    
    /**
    * Clase para desplegar el texto recibido, recibe como parametros 
    * la cadena a mostrar y el tamaño de la cadena
    */
    public void Despliega(String cadena,int tam)
    {
        super.setImage(new GreenfootImage(cadena1+cadena,tam,java.awt.Color.WHITE,null));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
