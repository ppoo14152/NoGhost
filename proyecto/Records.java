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
        Regresa =new botones (3);//se crea boton de regresar
        addObject(new ScoreBoard(100, 400), getWidth() / 2, getHeight() / 2);
        addObject(Regresa,820,450);
        Imagenes();
        //volver.getImage().scale(150,150);
       
    }
    public void Imagenes()
    {
        monios m1 = new monios(0);//se crea la imagen de los moños en records
        addObject(m1, 265,270);
        monios m2 = new monios(1);//se crea hombre con copa en los records
        addObject(m2, 695,370);
    }
    
        
        
    public void act()
    {
       
        
        if(Greenfoot.getMouseInfo()!=null){
           
           if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor()==Regresa){
                Greenfoot.setWorld(new Menu());// al presional boton regresa a menu
            }
            
        }   
    }
}
