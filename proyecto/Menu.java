import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la presentacion del juego, donde puedes visualizar tus records, revisar la ayuda e iniciar el juego
 * 
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class Menu extends World
{   
    private Actor ayuda;//creando actor de boton ayuda
    private Actor jugar;//creando actor de boton jugar
    private Actor credito;//creando actor de boton credito
    private Actor record;//creando actor de boton records
    
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Menu()
    {    
        super(920, 530, 1); //Tamaño del fondo
        
        jugar = new botones(1);//se crea boton jugar
        addObject(jugar, 100, 450);
        
        ayuda = new botones(2);//se crea boton de ayuda
        addObject(ayuda, 260, 450);
                
        credito = new botones(4);//se crea boton de creditos
        addObject(credito, 420, 450);
        
        record = new botones(5);//se crea boton de records
        addObject(record, 580, 450);
        
        setPaintOrder(botones.class);
        prepare(); //Llama a la funcion prepare
    }
    
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == ayuda)
            {
                Greenfoot.setWorld(new Ayuda());//manda al escenario de ayuda
            }
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == jugar)
            {
                Greenfoot.setWorld(new Casa());//manda al escenario de casa
            }
             if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == credito)
            {
                Greenfoot.setWorld(new Credito());//manda al escenario de credito
            }
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == record)
            {
                Greenfoot.setWorld(new Records());//manda al escenario de records
            }
            
        }
    }
    /**
     * Agrega cambio en el menu y decoracion para darle mejor apariencia al menu.
     */
    public void prepare()
    {
        
        Menu2 m2 = new Menu2(); //Nombro al objeto de la clase menu2 como m2
        addObject(m2, 450, 265); //Adhiero el objeto al proyecto
        
        TiosMenu tM1 = new TiosMenu(1);//creo a tio numero uno
        addObject(tM1, 860, 270);
        
        TiosMenu tM3 = new TiosMenu(3);//creo a tio numero dos
        addObject(tM3, 740, 240);
        
        TiosMenu tM2 = new TiosMenu(2);//creo a tio numero tres
        addObject(tM2, 800, 400);
        
        TiosMenu tM4 = new TiosMenu(4);//creo a tio numero cuatro
        addObject(tM4, 180, 80);
        
        CasperMenu cM = new CasperMenu(620, 200, 1);//se agrega y se le da el movimiento a el protagonista
        addObject(cM, 620, 200);
    }
    
}
