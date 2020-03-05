/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;
import java.lang.Math; 
import Reino.metodos.*;
/**
 *
 * @author Yo
 */
public class opciones {

    private int Aleatorio;
    
    Reino.metodos met = new Reino.metodos();
    
    
    public metodos representar(){
        int Aleatorio = (int) (Math.random()*2+1);
        switch(Aleatorio) {
            case 1:
                met.invertirMateriales();
            break;
            case 2:
                met.recaudarImpuestos();
            break;

        }     
        return met;
    }
}


