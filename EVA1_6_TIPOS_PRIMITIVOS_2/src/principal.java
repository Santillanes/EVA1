/*
 * 

 */

/**
 *
 * @author Luis Santillanes - 18550694
 */
import java.util.Scanner;

public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sInput = new Scanner (System.in);
        
        System.out.println("Ingresa tu nombre");
        String sNombre;
        sNombre = sInput.nextLine();
        
        System.out.println("Ingresa tu edad");
        int iEdad;
        iEdad = sInput.nextInt();
        
        int iAnnio = 2018 - iEdad;
        
        System.out.println(sNombre+", tu año de nacimiento es: "+iAnnio);
    }
    
}
