package programaidade;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite o ano de nascimento: ");
        Scanner teclado = new Scanner(System.in);
        int nasc = teclado.nextInt();
        int idade = 2024 - nasc;
        System.out.println("Idade: " + idade);
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        
    }

}
