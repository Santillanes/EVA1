
import MisClases.OtraClase;
import java.util.Scanner;

/*
 * Demostración de la POO.

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
        int iVal = 10;
        Ejemplo eMiObjetoEjem;
        eMiObjetoEjem = new Ejemplo();
        
        Ejemplo eObj2 = new Ejemplo();
        //eObj2.iVal
                
        //Ejemplo eObj3;
        
        OtraClase oOtroObj = new OtraClase();
        
        //===================================================================
        System.out.println("Ingrese el valor de x1:");
        double x1;
        x1 = input.nextDouble();
        
        System.out.println("Ingrese el valor de y1:");
        double y1;
        y1 = input.nextDouble();
        
        System.out.println("Ingrese el valor de x2:");
        double x2;
        x2 = input.nextDouble();
        
        System.out.println("Ingrese el valor de y2:");
        double y2;
        y2 = input.nextDouble();
        
        double m = (y2-y1)/(x2-x1);
        System.out.println("La pendiente es: "+m);
        
        
        
    }
    
}
//TIPOS ABSTRACTOS DE DATOS
class Ejemplo{  //SON CATEGORIAS, SE PUEDEN CREAR MUCHOS OBJETOS CON LAS MISMAS CARACTERÍSTICAS.
    int iVal = 10;
}