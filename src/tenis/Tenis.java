
package tenis;

/**
 *
 * @author Jose Salinas
 */
public class Tenis {

    
    
    public static void main(String[] args) {
        
        /**
         * Se llama al metodo enviando como valor 1
         */
        System.out.println("Tenis con suela");
        Suela conSuela = new Suela(1);
        conSuela.camina();
        /**
         * Se llama el metodo enviando como valor 0
         */
        System.out.println("Tenis sin suela");
        Suela sinSuela= new Suela(0);
        sinSuela.camina();
        
    }
    
}
