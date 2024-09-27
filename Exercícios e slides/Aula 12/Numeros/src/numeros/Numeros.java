package numeros;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Quer continuar? [s/n] ");
            resp = teclado.next();
        } while (resp.equals("S") || resp.equals("s"));
        System.out.println("A soma é: " + s);
    }

}
