import greenfoot.*;
import java.util.*;

/**
 * Write a description of class Elevador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elevador extends Elevadores
{
    private ArrayList[] imagenes;
    
    private int avanzar = 120; // Numero de pasos que da el ascensor de piso a piso
    
    private int una = 0;
    
    private int contador = 0; // Contador de pasos que da el ascensor de piso a piso
    
    private int tamEdificio = 6; // Numero de pisos que tiene el edificio
    private int noPiso = 0; // Piso en el que se encuentra el elevador
    
    private boolean banderaMovimiento = false; // Bandera de el metodo Movimiento
    private boolean banderaDireccion = false; // Bandera del metodo Direccion
    private boolean banderaStop = false; //Bandera que se le manda la respuesta del metodo Direccion al metodo Movimiento
    private boolean bandera = false; //Bandera auxiliar del metodo de Direccion
    
    private int x1 = 0; // Variable que se utiliza para que el ascensor suba 
    
    private int x = 400; // Direccion en X del ascensor
    private int y = 84; // Direccion en Y del ascensor
    
    public int detenido = 0;
    
    public Elevador(int selElevador)
    {
        if(selElevador == 0)
        {
            tamEdificio = 1;
        }else
        {
            tamEdificio = 2;
        }
        
        imagenes = new ArrayList[1];
        
        imagenes[0] = new ArrayList();
        
        imagenes[0].add(new GreenfootImage("Elevador.png"));
        imagenes[0].add(new GreenfootImage("Elevador2.png"));
    }
    public void act() 
    {
        int x = 0;
        
        setImage((GreenfootImage)imagenes[0].get(1));
        
        Movimiento();
        x = Parado();
    }    
    private void Movimiento()
    {
        x = getX();
        y = getY();
        
        if(contador < avanzar && banderaMovimiento ==  false) // Si el contador es menos a el numero de pasos que da el ascensor 
        {
            if(!banderaStop) // Si la bandera es negativa baja el ascensor
            {
                y++;
            }
            
            if(noPiso == 0 && una == 0)
            {
                noPiso += 1;
                una = 1;
            }
            
            if(banderaStop) // Si la nadera es positiva sube el ascensor
            {
                y--;
            }
            setLocation(x, y); // Cambia la posicion del ascensor
            
            contador++; // Incrementa el contador
        }
        
        if(contador == avanzar) // Si el contador llega al limite la bandera cambia por lo cual no entra al if anterior
        {
            banderaMovimiento = true;
        }
        
        if(banderaMovimiento == true) // Si la bandera esta positiva entonces el contador disminuye y se pausa el ascensor
        {
            contador--;
            detenido = 1;
        }
        
        if(contador == 0) // Si el contador regresa a 0 se desactiva la bandera por lo cual se activa el primer if y se mueve el elevador
        {
            banderaMovimiento = false;
            
            if(detenido == 0)
            {
            detenido = 1;
            }else
            {
            detenido = 0;
            }
            banderaStop = Direccion(); // Manda llamar al metodo Direccion
        }
    }
    
    private boolean Direccion()
    {
        boolean aux = false; //Auxiliar para mandar la respuesta al metodo Movimiento
        
        if(noPiso < tamEdificio && banderaDireccion == false)
        {
            if(una == 1 && tamEdificio != 1)
            {
                aux = false;
                una = 2;
            }else
            {
                if(tamEdificio == 1)
                {
                    noPiso ++;
                    aux = true;
                }else
                {
                    noPiso ++;
                    aux = false;
                }
            }
        }
        
        if(x1 == 1 && banderaDireccion == true)
        {
            aux = true;
            noPiso--;
            if(noPiso == 0)
            {
                x1 = 0;
                banderaDireccion = false;
                aux = false;
            }
        }
        
        if(noPiso == tamEdificio && banderaDireccion == false)
        {
            x1 = 1;
            aux = true;
            banderaDireccion = true;
        }
        
        return aux;
    }
    
    public int Parado()
    {   
        if(detenido == 1)
        {
            setImage((GreenfootImage)imagenes[0].get(0));
            return 1;
        }
        else
        {
            setImage((GreenfootImage)imagenes[0].get(1));
            return 0;
        }
    }
}

