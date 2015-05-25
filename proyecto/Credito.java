import greenfoot.*;

/**
 * Aqui es donde mostramos los creditos de nuestro proyecto.
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class Credito extends World
{
    private Actor Regresar;
    private GreenfootSound trueno=new GreenfootSound("trueno.mp3");
    /**
     * Constructor para objetos de clase Credito.
     * 
     */
    public Credito()
    {    
        super(920, 530, 1); //Resolucion de escenario
        trueno.play();
        Regresar = new botones(3);//Se crea boton de regresar
        addObject(Regresar, 820, 450);
    }
      public void act()
    {
        
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == Regresar)
            {
                this.stopped();
                trueno.stop();
                Greenfoot.setWorld(new Menu());//Al presionar boton regresa a menu principal
                
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
