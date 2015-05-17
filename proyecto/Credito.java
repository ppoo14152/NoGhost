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
        super(920, 530, 1);
        
        Regresar = new botones(3);
        addObject(Regresar, 820, 450);
    }
      public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == Regresar)
            {
                Greenfoot.setWorld(new Menu());
                
            }
        }
    }
}
