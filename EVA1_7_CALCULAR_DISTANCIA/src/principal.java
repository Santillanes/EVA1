
import java.util.Scanner;

/*
 * 

 */

/**
 *
 * @author Luis Santillanes - 18550694
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner input = new Scanner (System.in);
      
        System.out.println("Introduce la velocidad inicial:");
        double dVelin;
        dVelin = input.nextDouble();
        
        System.out.println("Introduce la velocidad final:");
        double dVelfin;
        dVelfin = input.nextDouble();
        
        System.out.println("Introduce el tiempo empleado:");
        double t;
        t = input.nextDouble();
        
        double dist;
        dist = ((dVelin+dVelfin)/2)*t;
        System.out.println("La distancia recorrida es: "+dist);
    }
    
}
