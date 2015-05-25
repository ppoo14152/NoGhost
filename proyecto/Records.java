import greenfoot.*;

/**
 * Aqui se muestra las mejores puntuaciones del juego
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */

public class Records extends World
{
    private GreenfootSound trueno = new GreenfootSound("trueno.mp3");
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
        trueno.play();
        Regresa =new botones (3);//se crea boton de regresar
        addObject(new ScoreBoard(100, 400), getWidth() / 2, getHeight() / 2);
        addObject(Regresa,820,450);
        Imagenes();
        //volver.getImage().scale(150,150);
       
    }
    
   /**
     * Decoracion de escenario de Records.
     * 
     */
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
               this.stopped();
               Greenfoot.setWorld(new Menu());// al presional boton regresa a menu
            }
            
        }   
    }
    /**
     * Metodo para iniciar el juego al darle play 
     */
    public void started()
    {
        super.started();
        trueno.play();

    }

    /**
     * metodo para detener el juego.
     */
    public void stopped() 
    {
        super.stopped();
        trueno.pause();

    }
}
