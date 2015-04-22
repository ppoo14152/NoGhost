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
        super(920, 530, 1); 
        
        Regresar = new botones(3);
        addObject(Regresar, 100, 450);
        
        prepare();
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
    
    public void prepare()
    {
        CasperMenu cM = new CasperMenu(220, 200, 2);
        addObject(cM, 220, 200);

        botones teclado = new botones(4);
        addObject(teclado, 600, 400);
    }
}
