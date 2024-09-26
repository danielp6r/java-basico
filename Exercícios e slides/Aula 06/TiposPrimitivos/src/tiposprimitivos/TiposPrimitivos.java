package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();
        System.out.print("Digite a idade de " + nome + ": ");
        int idade = teclado.nextInt();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        System.out.println(nome + " tem " + idade + " anos.");
        
    }

}
