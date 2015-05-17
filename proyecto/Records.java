import greenfoot.*;

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends World
{
    private Actor Regresa;
    private ScoreBoard scoreBoard;
    /**
     * Constructor for objects of class Records.
     * 
     */
    public Records()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(920, 530, 1); 
        Regresa =new botones (3);
        addObject(new ScoreBoard(600, 400), getWidth() / 2, getHeight() / 2);
        addObject(Regresa,820,450);
        //volver.getImage().scale(150,150);
       
    }
    public void act()
    {
       
        
        if(Greenfoot.getMouseInfo()!=null){
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==Regresa){
                Greenfoot.setWorld(new Menu());
            }
            
        }   
    }
}
