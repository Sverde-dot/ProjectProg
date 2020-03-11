/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;

import java.util.Scanner;
import Interfaz.Menu.*;
import com.sun.glass.ui.Menu;
import java.awt.Window;

/**
 *
 * @author Yo
 */
public class tarjetas {
    Reino.metodos metod = new Reino.metodos();
    Reino.valores valor = new Reino.valores();
    Menu.EventHandler menu= new Menu.EventHandler();
    int aleatorio;
    public String opcion = null;
    
    public String darnumero(){
    //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    //aleatorio = (int) Math.floor(Math.random()*(intArray.length));  
    int aleatorio = (int) (Math.random()*10+1);
        switch(aleatorio){
            case 1:
                opcion="Señor necesitamos materiales"; 
            break;  
            case 2:
                opcion="Señor nuestras arcas estan casi vacias"; 
            break;
            case 3:
                opcion="Señor nuestros almacenes estan vacios";
            break;
            case 4:
                opcion="Señor las calles del reino son poco seguras";
            break;
            case 5:
                opcion="Señor nuestro ejercito es debil";
            break;
            case 6:
                opcion="Señor nuestro enemigos acechan necesitamos invertir en nuestra seguridad";
            break;
            case 7:
                opcion="Señor un accidente ha destrozado una de nuestras torres de seguridad";
            break;
            case 8:
                opcion="Señor un barco acaba de llegar a nuestro reino y la salud de sus tripulantes no parece estar bien";
            break;
            case 9:
                opcion="Señor la moral de nuestro pueblo esta baja";
            break;
            case 10:
                opcion="Señor este año las cosechas han sido malas";
            break;
        }
        return opcion;

    }
}

