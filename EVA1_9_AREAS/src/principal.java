
import java.util.Scanner;

/*
 * Calcular área del trapecio
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
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la medida de la base mayor");
        double b;
        b = input.nextDouble();
        
        System.out.println("Ingrese la medida de la base menor");
        double B;
        B = input.nextDouble();
        
        System.out.println("Ingrese la medida de la altura");
        double h;
        h = input.nextDouble();
        
        double area;
        area = ((B+b)/2)*h;
        
        System.out.println("El área del trapecio es: "+area);
        
        
    }
    
}
