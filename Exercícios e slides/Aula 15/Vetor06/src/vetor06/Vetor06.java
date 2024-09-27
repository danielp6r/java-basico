package vetor06;

/**
 *
 * @author daniel
 */
public class Vetor06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EXERCICIO 1 AULA 13.
        int v[] = {2, 0, 3, 9};
        v[v[2]] = v[v[1]];
        for (int i: v){
            System.out.print(i + " ");
        }
    }
    
}
