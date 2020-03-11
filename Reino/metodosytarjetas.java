/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;


import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class metodosytarjetas extends tarjetas{
    tarjetas tarjet=new tarjetas();
    metodos metod=new metodos();
    Scanner sc = new Scanner(System.in);

    public String opt=null;
    
    public String mostrar(){
        
        if(tarjet.aleatorio==1){
             System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.conseguirRecursos();
                }
                if(opt=="no"){
                    metod.noconseguirRecursos();
                }
                valor.toString();       
        }
        if(tarjet.aleatorio==2){
           System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.recaudarImpuestos();
                }
                if(opt=="no"){
                    metod.norecaudarImpuestos();
                }          
                valor.toString();
        }
        if(tarjet.aleatorio==3){
            System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.conseguirRecursos();
                }
                if(opt=="no"){
                    metod.noconseguirRecursos();
                }
                valor.toString();
        }
        if(tarjet.aleatorio==4){
            System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.conseguirSeguridad();
                }
                if(opt=="no"){
                    metod.noconseguirSeguridad();
                }
                valor.toString();
        }
        if(tarjet.aleatorio==5){
            System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.mejorarEjercito();
                }
                if(opt=="no"){
                    metod.nomejorarEjercito();
                }
                valor.toString();
        }
        if(tarjet.aleatorio==6){
            System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.invertirSeguridad();
                }
                if(opt=="no"){
                    metod.noinvertirSeguridad();
                } 
                valor.toString();
        }
        if(tarjet.aleatorio==7){
            System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.construirTorre();
                }
                if(opt=="no"){
                    metod.noconstruirTorre();
                } 
                valor.toString();
        }
        if(tarjet.aleatorio==8){
            System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.curarEnfermedad();
                }
                if(opt=="no"){
                    metod.nocurarEnfermedad();
                } 
                valor.toString();
        }
        if(tarjet.aleatorio==9){
             System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.obserquiarPueblo();
                }
                if(opt=="no"){
                    metod.noobserquiarPueblo();
                } 
                valor.toString();
        }
        if(tarjet.aleatorio==10){
            System.out.println("que hacemos");
                opt=sc.toString();
                if(opt=="si"){
                    metod.cosechar();
                }
                if(opt=="no"){
                    metod.cosechar();
                }   
                valor.toString();
        }
        return opt;
    }
    
    
    public String completar(){
        tarjet.darnumero();
        mostrar();
        return ;
    }
}
