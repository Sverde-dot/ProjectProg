/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reino;

/**
 *
 * @author Yo
 */
public class metodos extends valores{
    
    public metodos(){        
    super();    
    } 
    
    
    public void Fin (){
        if(Pueblo == 0) {
            System.out.println("Señor ya no tiene un pueblo que le obedezca el reino acabara en la miseria");
            System.exit(0);
        } 
        if(Pueblo == 100) {
            System.out.println("Señor el pueblo esta prosperando demasiado la opinion publica ya no le necesita");
            System.exit(0);
        } 
        if(Dinero == 0) {
            System.out.println("Mi lord las arcas del reino estan vacias a este paso no sobreviviremos");
            System.exit(0);
        } 
        if(Dinero == 100) {
            System.out.println("Mi rey somos ricos realizemos un festin en su nombre");
            System.out.println("--Unas horas mas tarde el rey cae muerto debido al exeso de comida--");
            System.exit(0);
        } 
        if(Ejercito == 0) {
            System.out.println("Mi lord no tenemos ejercito y por desgracia nuestros enemigos estan a las puertas del castillo");
            System.exit(0);
        } 
        if(Ejercito == 100) {
            System.out.println("Mi rey los altos mandos de nuestro ejercito se han rebelado contra usted esto es un golpe de estado");
            System.exit(0);
        } 
        if(Recursos == 0) {
            System.out.println("Mi lord el pueblo se muere de hambre");
            System.exit(0);
        }
        if(Recursos == 100) {
            System.out.println("Mi rey las reservas de comida este año son exelentes realizemos un festin en su nombre");
            System.out.println("--Unas horas mas tarde el rey cae muerto debido al exeso de comida--");
            System.exit(0);
        }
        
    
    }
    //subir Pueblo bajar Recursos
    public void invertirMateriales(){                
        Pueblo = Pueblo -10;        
        Recursos = Recursos - 10;      
    }
    //Baja Pueblo sube Dinero
    public void recaudarImpuestos(){
        Pueblo = Pueblo -10;        
        Dinero = Dinero +(int) (Math.random()*15);                         
    
    }
    
    
    
    
    
    
}