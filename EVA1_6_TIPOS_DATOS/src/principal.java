
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
        System.out.println("Introduce tu nombre:");
        String sNombre; //DECLARANDO
        Scanner sInput; //DECLARANDO      
        //SCANNER ES UNA CLASE, PARA USAR CLASES
        //SE HACE A TRAVÉS DE OBJETOS, PARA USAR CLASES
        //SE CREAN CON LA PALABRA new
        sInput = new Scanner(System.in);
        //Scanner sInput2 = new Scanner(System.in);
        //int iVal = 10;
        sNombre = sInput.nextLine(); //Cuando da "enter"
        //CONCATENAR CADENAS "texto" + variable tipo texto
        System.out.println("El nombre es: "+sNombre); 
    }
    
}
