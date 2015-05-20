import greenfoot.*;

/**
 * Aqui se encuantran las pantallas de perdiste o ganaste ademas de elementos del escenario de records.
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class Fin extends World
{
    private Actor Regresar;
   /**
     * Constructor para objetos de clase Fin.
     * 
     */
    public Fin(int sel)
    {    
        super(920, 530, 1); //Resolucion
        
        if(sel  == 0)
        {
            monios gane = new monios(2); //llama a Gano
            addObject(gane, 460, 265);
        }
        if(sel  == 1)
        {
            monios gane = new monios(3); //llama a Perdio
            addObject(gane, 460, 265);
        }
        
        Regresar = new botones(3);//boton de regresar
        addObject(Regresar, 820, 450);
    }
    
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == Regresar)
            {
                Greenfoot.setWorld(new Menu());//Al presionar boton de regresar te manda a menu
            }
        }
    }
}
