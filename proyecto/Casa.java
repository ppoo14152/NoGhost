import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa extends World
{

    /**
     * Constructor for objects of class Casa.
     * 
     */
    public Casa()
    {    
        super(920, 530, 1); //Resolucion//
        
        prepare();
        posiones();
        creaPersonas(5);
    }
    
    public void posiones()
    {
        Texto newTexto =new Texto();
        addObject(newTexto,165,20);
    }
    
    public void prepare()
    {
        Imagenes();
    }
    
    public void creaPersonas(int numero){
        for(int i=0;i<numero;i++){
            persona p=new persona();
            int y;
            int v=Greenfoot.getRandomNumber(3);
            int x=Greenfoot.getRandomNumber(getWidth());  //getWidth()
            
            if(x<=100){
                x=x+115;
            }
            
            if(x>=590){
            x=x-10;
            }
            
            if(v==1){
               y=115;
            }
            else if(v==2){
               y=238;
            }
            else{
               y=362;
            }
            
            addObject(p,x,y);
        }
    }
    
    public void Imagenes()
    { 
        //////////////Techo/////////////////
        Pisos a1 = new Pisos();
        addObject(a1,183,147);
        Pisos a2 = new Pisos();
        addObject(a2,228,147);
        Pisos a3 = new Pisos();
        addObject(a3,356,147);
        Pisos a4 = new Pisos();
        addObject(a4,484,147);
        Pisos a5 = new Pisos();
        addObject(a5,612,147);
        Pisos a6 = new Pisos();
        addObject(a6,740,147);
        Pisos a7 = new Pisos();
        addObject(a7,770,147);
        /////////////Piso 3///////////////////
        Pisos b0 = new Pisos();
        addObject(b0,145,268);
        Pisos b1 = new Pisos();
        addObject(b1,155,268);
        Pisos b2 = new Pisos();
        addObject(b2,228,268);
        Pisos b3 = new Pisos();
        addObject(b3,356,268);
        Pisos b4 = new Pisos();
        addObject(b4,484,268);
        Pisos b5 = new Pisos();
        addObject(b5,612,268);
        Pisos b6 = new Pisos();
        addObject(b6,703,268);
        Pisos b7 = new Pisos();
        addObject(b7,120,268);
        /////////////Piso 2///////////////////
        Pisos c1 = new Pisos();
        addObject(c1,183,387);
        Pisos c2 = new Pisos();
        addObject(c2,228,387);
        Pisos c3 = new Pisos();
        addObject(c3,356,387);
        Pisos c4 = new Pisos();
        addObject(c4,484,387);
        Pisos c5 = new Pisos();
        addObject(c5,612,387);
        Pisos c6 = new Pisos();
        addObject(c6,740,387);
        Pisos c7 = new Pisos();
        addObject(c7,770,387);
        /////////////Piso 1///////////////////
        Pisos d1 = new Pisos();
        addObject(d1,155,510);
        Pisos d2 = new Pisos();
        addObject(d2,228,510);
        Pisos d3 = new Pisos();
        addObject(d3,356,510);
        Pisos d4 = new Pisos();
        addObject(d4,484,510);
        Pisos d5 = new Pisos();
        addObject(d5,612,510);
        Pisos d6 = new Pisos();
        addObject(d6,740,510);
        Pisos d8 = new Pisos();
        addObject(d8,770,510);
        Pisos d7 = new Pisos();
        addObject(d7,120,510);
        ///////////Pared izquierda////////////
        Pared pi1 = new Pared();
        addObject(pi1, 40,80);
        Pared pi2 = new Pared();
        addObject(pi2, 40,208);
        Pared pi3 = new Pared();
        addObject(pi3, 40,336);
        Pared pi4 = new Pared();
        addObject(pi4, 40,462);
        ///////////Pared derecha////////////
        Pared pd1 = new Pared();
        addObject(pd1, 850,80);
        Pared pd2 = new Pared();
        addObject(pd2, 850,208);
        Pared pd3 = new Pared();
        addObject(pd3, 850,336);
        Pared pd4 = new Pared();
        addObject(pd4, 850,462);

        //////////Muebles/////////////////
        Muebles m1 = new Muebles();
        addObject(m1, 200,70);
                
        /////////Puerta///////////////////
        Puerta p1 = new Puerta();
        addObject(p1, 805, 447);
        /////////Elevador/////////////////
        Elevador el1 = new Elevador(0);
        addObject(el1, 88, 87);
        BaseElevador be1 = new BaseElevador(2);
        addObject( be1, 87, 147);
        
        Elevador el2 = new Elevador(0);
        addObject(el2, 88, 327);
        BaseElevador be2 = new BaseElevador(2);
        addObject( be2, 87, 390);
        
        Elevador el3 = new Elevador(0);
        addObject(el3, 800, 207);
        BaseElevador be3 = new BaseElevador(2);
        addObject( be3, 800, 267);
        /////////Gasper//////////////////
        Casper jugador = new Casper();
        addObject(jugador,750,80);
        
        
        
    }
}
