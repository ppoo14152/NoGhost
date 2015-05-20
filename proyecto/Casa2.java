import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; // Clase para importar color
/**
 * Este es el escenario del segundo nivel, ademas de mostrar a las personas que debes evitar.
 * @author (Maria Gpe. Velazquez Martinez y Cristobal Zavala Cano) 
 * @version (a version number or a date)
 */
public class Casa2 extends World
{

    /**
     * Constructor for objects of class Casa2.
     * 
     */
    BarraPresencial vidaBarra = new BarraPresencial();
    
    public Casa2()
    {    
        super(920, 530, 1);                     //Resolucion
        getBackground().setColor(Color.BLACK);  //Establece el fondo color negro
        getBackground().fill();                 //Pone el fondo establecido
        prepare();
        creaPeople();;
    }
    
    public  BarraPresencial getVidaBarra()
    {
        return vidaBarra;
    }
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare()
    {
        Imagenes();
        addObject(vidaBarra,780,25);//Ubicacion de la barra de vida
    }
    
    public void creaPeople()
    {
        int x;
        /////////////////////personas de el escenario/////////////////////////
        ninio pe1 = new ninio(1);
        ninio pe2 = new ninio(2);
        ninio pe3 = new ninio(3);
        ninio pe4 = new ninio(4);
        ninio pe5 = new ninio(5);
        ninio pe6 = new ninio(6);
        
        Guardia gu1 = new Guardia(1);
        Guardia gu2 = new Guardia(2);
        Guardia gu3 = new Guardia(3);
        adulto ad1 = new adulto(1);
        adulto ad2 = new adulto(2);
        adulto ad3 = new adulto(3);
        
        
        for(int i = 0; i < 7; i++ ){
            x=Greenfoot.getRandomNumber(getWidth());  //getWidth()
            if(x<=120){
               x=x+120;
            }
            
            if(x>=getWidth()-150){
               x=x-150;
            }
        
            if(i==1){    
                addObject(pe1,x,115);      //creando en el piso 1
                addObject(gu3,300,238);    //creando guardia en el piso 2
                addObject(gu2,450,100);    //creando guardia en el piso 3
            }
            
            if(i==2){
                addObject(pe2,x,238);   //creando en el piso 2
                addObject(ad2,x,355);   //creando adulto en el piso 1
                
            }
            
            if(i==3){
                addObject(pe3,x,238);   //creando en el piso 2
                addObject(ad3,x,480);   //creando adulto en el piso 0
                
            }
            
            if(i==4){
               addObject(pe4,x,355);    //creando en el piso 3
               addObject(gu1,450,355);  //creando guardia en el piso 3
            }
            
            if(i==5){
                addObject(pe5,x,480);   //creando en el piso 4
            }
            if(i==6){
                addObject(pe6,x,480);   //creando en el piso 1
            }
            
       }
    }
    public void creaPersonas(int numero){
        for(int i=0;i<numero;i++){
            persona p=new ninio(i);
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
    /**
     * Crea el escenario, muebles, elevadores y jugador.
     */
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
        addObject(m1, 270,340);
        Muebles m2 = new Muebles(1);//mueble de la tv
        addObject(m2, 450,458);
        //Muebles m3 = new Muebles(2);//mueble delgado cafe ultimo piso
        //addObject(m3, 260,80);
        //Muebles m4 = new Muebles(3);//sillon cafe de ultimo piso
        //addObject(m4, 330,110);
        Muebles m5 = new Muebles(4);//sillon blanco ultimo piso
        addObject(m5, 260,105);
        Muebles m6 = new Muebles(13);//lampara de piso
        addObject(m6, 310,81);
        //Muebles m7 = new Muebles(5);//mueble blanco con libros de primer piso
        //addObject(m7, 425,453);
        //Muebles m8 = new Muebles(6);//refrigerador
        //addObject(m8, 230,330);
        Muebles m9 = new Muebles(7);//estufa
        addObject(m9, 580,225);
        Muebles m10 = new Muebles(42);//mueble blanco de tv
        addObject(m10, 600,90);
        //Muebles m11 = new Muebles(9);//lampara1
        //addObject(m11, 618,52);
        Muebles m12 = new Muebles(10);//cuadro cafe
        addObject(m12, 670,315);
        Muebles m13 = new Muebles(11);//cuadro azul
        addObject(m13, 200,430);
        Muebles m14 = new Muebles(12);//florero flores blancas
        addObject(m14, 510,79);
        Muebles m15 = new Muebles(41);//mueble cafe tercer piso
        addObject(m15, 222,223);
        //Muebles m16 = new Muebles(16);//bañera
        //addObject(m16, 479,235);
        Muebles m17 = new Muebles(17);//foco comedor floreado
        addObject(m17, 490,180);
        Muebles m18 = new Muebles(18);//comedor
        addObject(m18, 390,235); 
        //Muebles m19 = new Muebles(19);//foco comedor
        //addObject(m19, 500,300); 
        Muebles m20 = new Muebles(43);//mueble nuevo
        addObject(m20, 539,354); 
        Muebles m50 = new Muebles(20);//tele de piso
        addObject(m50, 175,354); 
        Muebles m21 = new Muebles(21);//buro bajo flor roja
        addObject(m21, 650,240); 
        Muebles m22 = new Muebles(22);// florero rojo
        addObject(m22, 650,217);
        Muebles m42 = new Muebles(22);// florero rojo
        addObject(m42, 679,186);
        Muebles m23 = new Muebles(23);// buro 2 bajo flores rojas
        addObject(m23, 680,225);
        Muebles m24 = new Muebles(24);// reloj
        addObject(m24, 540,305);
        Muebles m25 = new Muebles(25);// foco triple
        addObject(m25, 360,325);
        Muebles m26 = new Muebles(26);// buro blanco primer piso
        addObject(m26, 321,475);
        Muebles m27 = new Muebles(26);// buro blanco ultimo piso
        addObject(m27, 510,115);
        Muebles m28 = new Muebles(27);// globos
        addObject(m28, 660,435);
        Muebles m29 = new Muebles(28);// pelota
        addObject(m29, 245,483);
        //Muebles m30 = new Muebles(29);// silla
        //addObject(m30, 620,483);
        //Muebles m31 = new Muebles(14);// tele google
        //addObject(m31, 620,450);
        Muebles m32 = new Muebles(30);//  flores rosas morado
        addObject(m32, 320,445);
        /////////Puerta///////////////////
        Puerta p1 = new Puerta();
        addObject(p1, 790, 85);
        
        Objetivo3 obj2 = new Objetivo3(0);
        addObject(obj2, 805, 447);
        Objetivo obj1 = new Objetivo(0);
        addObject(obj1, 805, 447);
        Objetivo2 obj = new Objetivo2(1);
        addObject(obj, 805, 447);
        
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
