package funcao01;

/**
 *
 * @author daniel
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
    
}
