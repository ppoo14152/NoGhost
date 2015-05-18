import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{
    private Actor Regresar;
    
    public Ayuda()
    {    
        super(920, 530, 1); //Resolucion de escenario
        
        Regresar = new botones(3);//se agrega el boton de regresar que te lleva al inicio
        addObject(Regresar, 820, 450);
        
        prepare();//llama a funcion prepara
    }
    
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == Regresar)
            {
                Greenfoot.setWorld(new Menu());//regresa a menu
                
            }
        }
    }
    
    public void prepare()//llama, crea y ubica a gasper de ayuda para señalar a jugador
    {
        CasperAyuda jug = new CasperAyuda(720, 235);
        addObject(jug, 735, 235);
    }
}
