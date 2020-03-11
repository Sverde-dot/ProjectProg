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
public class valores {
    public int Pueblo=50;
    public int Recursos=50;
    public int Dinero=50;
    public int Ejercito=50;

    public valores() {
    }

    public int getPueblo() {
        return Pueblo;
    }

    public int getRecursos() {
        return Recursos;
        
    }

    public int getDinero() {
        return Dinero;
    }

    public int getEjercito() {
        return Ejercito;
    }

    public void setPueblo(int Pueblo) {
        this.Pueblo = Pueblo;
    }

    public void setRecursos(int Recursos) {
        this.Recursos = Recursos;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public void setEjercito(int Ejercito) {
        this.Ejercito = Ejercito;
    }

    @Override
    public String toString() {
        System.out.println("Mi lord el reino esta de esta manera " +
                " Pueblo= " + Pueblo 
                + " Recursos= " + Recursos  
                +" Dinero= " + Dinero 
                + " Ejercito= " + Ejercito);
        return null;
    }
    /*
    public void Fin (){
        if(Pueblo == 0) {
            System.out.println("Mi lord el pueblo esta prosperando demasiado la opinion publica ya no le necesita");
            System.exit(0);
        } 
        if(Dinero == 0) {
            System.out.println("Mi lord las arcas del reino estan vacias a este paso no sobreviviremos");
            System.exit(0);
        } 
        if(Ejercito == 0) {
            System.out.println("Mi señor ya no tenemos ejercito y nuestros enemigos estan a las puertas del castillo que hacemos");
            System.exit(0);
        } 
        if(Recursos == 0) {
            System.out.println("Mi lord el pueblo se muere de hambre");
            System.exit(0);
        }            
    }
    */   
}