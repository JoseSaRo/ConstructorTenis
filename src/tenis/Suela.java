/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenis;

/**
 *
 * @author Jose Salinas
 */
public class Suela {
     /**
     * Se declara una variable suela privada
     */
    private int suela=0;

    
    /**
     * Constructor de clase con suela
     */
    Suela (int suela) {
        this.suela = suela;
    }
    
    /**
     * Metodo en el que se evalua si tiene suela el tenis
     */
    public void camina(){
        if (suela==1)
            System.out.println("Si puedes caminar");
        else
            System.out.println("No puedes caminar");
    }
    
    
}
