import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escenario de la ayuda, ademas de mostrar a nuestro jugador
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{
    private Actor Regresar;
    private GreenfootSound musica=new GreenfootSound("trueno.mp3");
    
    /**
     * Constructor para objetos de clase Ayuda.
     * 
     */
    public Ayuda()
    {    
        super(920, 530, 1); //Resolucion de escenario
        musica.play();
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
                this.stopped();
                Greenfoot.setWorld(new Menu());//regresa a menu

            }
        }
    }
    
    public void prepare()//llama, crea y ubica a gasper de ayuda para señalar a jugador
    {
        CasperAyuda jug = new CasperAyuda(720, 235);
        addObject(jug, 735, 235);
    }
    
       public void started()
    {
        super.started();
        musica.play();

    }

    /**
     * metodo para detener el juego.
     */
    public void stopped() 
    {
        super.stopped();
        musica.pause();

    }
}
