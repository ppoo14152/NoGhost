import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Casa2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Casa2 extends World
{

    /**
     * Constructor for objects of class Casa2.
     * 
     */
    public Casa2()
    {    
        super(920, 530, 1); //Resolucion//
        prepare();
        posiones();
        creaPersonas(10);
    }
    public void posiones()
    {
        Texto newTexto =new Texto(1);
        addObject(newTexto,165,20);
    }
    
    public void prepare()
    {
        Imagenes();
    }
    
    public void creaPersonas(int numero){
        for(int i=0;i<numero;i++){
            persona p=new persona(i);
            int y;
            int v=Greenfoot.getRandomNumber(3);
            int x=Greenfoot.getRandomNumber(getWidth());  //getWidth()
            
            if(x<=120){
                x=x+120;
            }
            
            if(x>=getWidth()-150){
            x=x-150;
            }
            
            if(v==1){
               y=482;
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
        Muebles m1 = new Muebles(0);//sillon cafe claro
        addObject(m1, 680,220);
        Muebles m2 = new Muebles(1);//mueble de la tv
        addObject(m2, 550,217);
        Muebles m3 = new Muebles(2);
        addObject(m3, 260,80);
        Muebles m4 = new Muebles(3);
        addObject(m4, 330,110);
        Muebles m5 = new Muebles(4);
        addObject(m5, 250,470);
        Muebles m6 = new Muebles(13);//lampara de piso
        addObject(m6, 200,85);
        Muebles m7 = new Muebles(5);
        addObject(m7, 425,453);
        Muebles m8 = new Muebles(6);
        addObject(m8, 230,330);
        Muebles m9 = new Muebles(7);
        addObject(m9, 280,350);
        Muebles m10 = new Muebles(8);//
        addObject(m10, 600,100);
        Muebles m11 = new Muebles(9);//lampara1
        addObject(m11, 618,52);
        Muebles m12 = new Muebles(10);//cuadro cafe
        addObject(m12, 450,52);
        Muebles m13 = new Muebles(11);//cuadro azul
        addObject(m13, 500,430);
        Muebles m14 = new Muebles(12);//florero1
        addObject(m14, 580,52);
        Muebles m15 = new Muebles(15);//wc
        addObject(m15, 222,223);
        Muebles m16 = new Muebles(16);//bañera
        addObject(m16, 279,235);
        Muebles m17 = new Muebles(17);//foco baño
        addObject(m17, 290,180);
        Muebles m18 = new Muebles(18);//comedor
        addObject(m18, 500,355); 
        Muebles m19 = new Muebles(19);//foco comedor
        addObject(m19, 500,300); 
        Muebles m20 = new Muebles(20);//tele
        addObject(m20, 575,354); 
        Muebles m21 = new Muebles(21);//buro bajo flor roja
        addObject(m21, 180,360); 
        Muebles m22 = new Muebles(22);// florero rojo
        addObject(m22, 180,337);
        Muebles m23 = new Muebles(23);// buro 2
        addObject(m23, 150,345);
        Muebles m24 = new Muebles(24);// reloj
        addObject(m24, 150,312);
        Muebles m25 = new Muebles(25);// foco triple
        addObject(m25, 360,425);
        Muebles m26 = new Muebles(26);// buro blanco
        addObject(m26, 321,475);
        Muebles m27 = new Muebles(26);// buro blanco
        addObject(m27, 500,475);
        Muebles m28 = new Muebles(27);// globos
        addObject(m28, 660,435);
        Muebles m29 = new Muebles(28);// pelota
        addObject(m29, 575,483);
        Muebles m30 = new Muebles(29);// silla
        addObject(m30, 620,483);
        Muebles m31 = new Muebles(14);// tele google
        addObject(m31, 620,450);
        Muebles m32 = new Muebles(30);//  flores rosas morado
        addObject(m32, 320,445);
        
        /////////Puerta///////////////////
        Puerta p1 = new Puerta();
        addObject(p1, 790, 85);
        Objetivo2 obj = new Objetivo2();
        addObject(obj, 805, 447);
        /*Objetivo obj = new Objetivo();
        addObject(obj, 805, 447 );*/
        
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
        
        //TextoVidas tx1 = new TextoVidas("Puntaje:",1);
        //addObject(tx1,700,30);
        
    }
}