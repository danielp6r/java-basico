package vetor04;

import java.util.Arrays;

/**
 *
 * @author daniel
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = {3, 7, 6, 1, 9, 4, 2};
        for (int i:v){
            System.out.print(i + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(v, 1);
        System.out.println("O valor " + v[p]+ " está na posição "+p);
    }
    
}
