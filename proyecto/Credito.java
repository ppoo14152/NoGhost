import greenfoot.*;

/**
 * Write a description of class Credito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credito extends World
{
    private Actor Regresar;
    
    public Credito()
    {    
        super(920, 530, 1); //Resolucion de escenario
        
        Regresar = new botones(3);//Se crea boton de regresar
        addObject(Regresar, 820, 450);
    }
      public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == Regresar)
            {
                Greenfoot.setWorld(new Menu());//Al presionar boton regresa a menu principal
                
            }
        }
    }
}
