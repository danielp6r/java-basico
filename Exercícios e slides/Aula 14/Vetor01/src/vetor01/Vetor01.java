
package vetor01;

import java.util.Arrays;

/**
 *
 * @author daniel
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {10,22,43,4,9};
        
        System.out.println("Total de casas de N: "+ n.length);
        
        Arrays.sort(n);
        for (int c=0; c<n.length; c++){
            System.out.println("Na posição " + c + " Temos o valor " + n[c] + " ");
        }
    }
    
}
