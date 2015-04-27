import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{   
    private Actor ayuda;
    private Actor jugar;
    private Actor credito;
    
    public Menu()
    {    
        super(920, 530, 1); //Tamaño del fondo
        
        ayuda = new botones(2);
        addObject(ayuda, 230, 450);
        
        jugar = new botones(1);
        addObject(jugar, 100, 450);
        
        credito = new botones(4);
        addObject(credito, 360, 450);
        
        setPaintOrder(botones.class);
        
        prepare(); //Llama a la funcion prepare
    }
    
    public void act()
    {
        if(Greenfoot.getMouseInfo()!=null)
        {
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == ayuda)
            {
                Greenfoot.setWorld(new Ayuda());
            }
            if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == jugar)
            {
                Greenfoot.setWorld(new Casa());
            }
             if(Greenfoot.getMouseInfo().getButton()==1 && Greenfoot.getMouseInfo().getActor() == credito)
            {
                Greenfoot.setWorld(new Credito());
            }
        }
    }
    
    public void prepare()
    {
        
        Menu2 m2 = new Menu2(); //Nombro al objeto de la clase menu2 como m2
        addObject(m2, 450, 265); //Adhiero el objeto al proyecto
        
        TiosMenu tM1 = new TiosMenu(1);
        addObject(tM1, 860, 270);
        
        TiosMenu tM3 = new TiosMenu(3);
        addObject(tM3, 740, 240);
        
        TiosMenu tM2 = new TiosMenu(2);
        addObject(tM2, 800, 400);
        
        TiosMenu tM4 = new TiosMenu(4);
        addObject(tM4, 180, 80);
         
        
        CasperMenu cM = new CasperMenu(620, 200, 1);
        addObject(cM, 620, 200);
    }
}
