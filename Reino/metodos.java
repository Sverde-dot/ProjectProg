/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class metodos extends valores{
    
    public metodos(){        
    super();    
    } 

    //1subir Pueblo bajar Recursos
    public void invertirMateriales(){                
        Pueblo = Pueblo -5;        
        Recursos = Recursos - 10;      
    }
    public void noinvertirMateriales(){                
        Pueblo = Pueblo -15;              
    }
    //2Baja Pueblo sube Dinero
    public void recaudarImpuestos(){
        Pueblo = Pueblo -15;        
        Dinero = Dinero +15;                         
    }
    public void norecaudarImpuestos(){
        Pueblo = Pueblo +10;        
        Dinero = Dinero -15;                         
    }
    public void conseguirRecursos(){
        Recursos = Recursos +20;        
        Dinero = Dinero -15;                             
    }
    public void noconseguirRecursos(){
        Recursos = Recursos -20;        
        Dinero = Dinero +15;                             
    }
    //3Ejercito sube dinero baja
    public void conseguirSeguridad(){
        Ejercito = Ejercito +10;        
        Dinero = Dinero -15;                                     
    }
    public void noconseguirSeguridad(){
        Ejercito = Ejercito +15;        
        Dinero = Dinero -15;                                     
    }
    //4Ejercito Sube Pueblo baja DInero baja
    public void mejorarEjercito(){                
        Ejercito = Ejercito +25;        
        Dinero = Dinero -15;               
    }
    public void nomejorarEjercito(){                
        Ejercito = Ejercito +15;        
        Dinero = Dinero -15;             
    }
    //5Contruir seguridad
    public void invertirSeguridad(){        
        Ejercito = Ejercito +20;                        
        Recursos = Recursos -20;
        Dinero = Dinero -15;
    }
    public void noinvertirSeguridad(){        
        Ejercito = Ejercito -10;                        
        Recursos = Recursos +5;
        Dinero = Dinero +15;
    }
    //6Recursos sube dinero baja pueblo baja
    public void construirTorre(){       
        Ejercito = Ejercito +15;
        Dinero = Dinero -20;
        Recursos = Recursos -15;    
    }
    public void noconstruirTorre(){       
        Ejercito = Ejercito -15;
        Dinero = Dinero +20;
        Recursos = Recursos +5;    
    }
    
    public void curarEnfermedad(){
        Pueblo = Pueblo + 20;
        Recursos = Recursos -20;
        Dinero = Dinero -10; 
    }
    public void nocurarEnfermedad(){
        Pueblo = Pueblo - 30;
        Recursos = Recursos -5;
        Dinero = Dinero +30; 
    }
    public void obserquiarPueblo(){
        Pueblo = Pueblo + 10;       
        Dinero = Dinero - 10;             
    }
     public void noobserquiarPueblo(){
        Pueblo = Pueblo -5;       
        Dinero = Dinero +15;             
    }   
    public void cosechar(){
        Pueblo = Pueblo + 10;       
        Dinero = Dinero - 10;             
    }
    public void nocosechar(){
        Pueblo = Pueblo - 20;       
        Dinero = Dinero + 10;             
    }
    
    //Guardar partida
    public void guardarPartida(File fichero){
    PrintWriter esc = null;
    FileWriter fich;        
        try {
           fich = new FileWriter(fichero);
           esc = new PrintWriter(fich);
           esc.print(" Recursos :"+ Recursos 
                    +", Dinero :"+Dinero 
                    +", Pueblo :"+Pueblo
                    +", Ejercito :" + Ejercito);           
 
        } catch (FileNotFoundException ex) {
           ex.toString();
        }catch (IOException ex){
            ex.toString();           
        }finally{   
            esc.close();
                    }
        
    }     
    
   /* public void cargarPartida(File fich){
         Scanner sc = null;
         int cont=0;
    try {//Separando por coma.
                
                sc= new Scanner(fich).useDelimiter(":");
                while(sc.hasNext()){    
                    //System.out.println(sc.next().split(","));
                    
                  String [] opciones =sc.next().split(",", 2);

                    System.out.println(opciones[0]+"s");
                    
                    for (String i : opciones){
                    if (cont == 0){
                        int []prueba12 = null;
                    //ARREGLAR
                        System.out.println("|"+Arrays.toString(prueba12)+"|");
                            }
                    else if(cont ==1){
                        Dinero =  Integer.parseInt(i) ;
                        }
                    }
                }
            } catch (FileNotFoundException ex) {

                System.out.println("Erro lectura palabra"+ex.toString());   
             }finally{
                sc.close();
             }



    }*/
    
    
}
