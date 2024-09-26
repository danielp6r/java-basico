package programamedia;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) /2;
        System.out.println("Sua média foi: " + m);
        if (m>=9){
            System.out.println("Parabéns!");
        }
    }
    
}
