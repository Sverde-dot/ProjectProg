/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;
import java.lang.Math; 
import Reino.metodos.*;
import Interfaz.menu;

/**
 *
 * @author Yo
 */
public class opciones {

    private int Aleatorio;
    public String bot1;
    
    Reino.metodos met = new Reino.metodos();
    Reino.valores var = new Reino.valores();
    
    public String representar(){
        int Aleatorio = (int) (Math.random()*2+1);
        int caso = 0;
        String texto = null;
        switch(Aleatorio) {
            case 1:
                texto="Nuestros recursos son escasos que hacemos";
                    
                            var.Pueblo = var.Pueblo -10;        
                            var.Recursos = var.Recursos + 10;
                    
                    break;
                    case 2:
                            var.Pueblo = var.Pueblo -10;        
                            var.Recursos = var.Recursos - 10;
                    break;
                }
            break;
            case 2:
                texto="Nuestro ejercito es debil que hacemos";
                switch(caso){
                    case 1:
                            var.Pueblo = var.Pueblo -10;        
                            var.Ejercito = var.Ejercito + 10;
                    break;
                    case 2:
                            var.Pueblo = var.Pueblo +15;        
                            var.Ejercito = var.Ejercito-5;
                    break;
                }
            break;

        }     
        return texto;
    }
}


