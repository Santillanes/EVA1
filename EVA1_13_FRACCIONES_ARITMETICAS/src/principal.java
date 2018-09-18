
import java.util.Scanner;

/*
 *  Operaciones con dos fracciones aritméticas
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
        
        int f1, f2;
        int multiNum, multiDen, sumNum, resNum, divNum, divDen;
        
        System.out.println("Ingrese el numerador de la primera fracción: ");
        int n1;
        n1 = input.nextInt();
        
        System.out.println("Ingrese el denominador de la primera fracción: ");
        int d1;
        d1 = input.nextInt();
        
        System.out.println("Ingrese el numerador de la segunda fracción: ");
        int n2;
        n2 = input.nextInt();
        
        System.out.println("Ingrese el denominador de la segunda fracción: ");
        int d2;
        d2 = input.nextInt();

               
        multiNum=n1*n2;
        multiDen=d1*d2;
        System.out.println("La multiplicación de ambas fracciones es: "+multiNum+"/"+multiDen);        
        
        divNum=n1*d2;
        divDen=d1*n2;
        System.out.println("La división de ambas fracciones es: "+divNum+"/"+divDen);
        
        sumNum=((n1*d2)+(d1*n2));
        System.out.println("La suma de ambas fracciones es: "+sumNum+"/"+multiDen);
        
        resNum= ((n1*d2)-(d1*n2));
        System.out.println("La resta de ambas fracciones es: "+resNum+"/"+multiDen);
        
    }
    
}
