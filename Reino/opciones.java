/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;
import java.lang.Math; 
/**
 *
 * @author Yo
 */
public class opciones {

   public void option(int[] box){
    
    int boxCount[] = new int[10];
    for(int i=0; i < boxCount.length; i++)
    {
        //("Random Number ["+ (i+1) + "] : " + (int)(Math.random()*6));
        boxCount[i]  =  (int) (Math.random()*6) + 1;
    }
}

}
