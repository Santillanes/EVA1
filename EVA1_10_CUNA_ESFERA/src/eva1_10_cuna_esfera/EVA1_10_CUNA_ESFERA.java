/*
 * Volumen de huso cuña esferica
 */
package eva1_10_cuna_esfera;

import java.util.Scanner;

/**
 *
 * @author Luis Santillanes - 18550694
 */
public class EVA1_10_CUNA_ESFERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio:");
        double r;
        r = input.nextDouble();
        
        System.out.println("Ingrese el valor del ángulo:");
        double a;
        a = input.nextDouble();
        
        double vol;
        vol = (3.1416)*(Math.pow(r, 3))*(a/270);
        System.out.println("El volumen de la cuña esférica es: "+vol);
        
        
        //4/3 * (PI*R^3)/360 * n 
        
        
    }
    
}
