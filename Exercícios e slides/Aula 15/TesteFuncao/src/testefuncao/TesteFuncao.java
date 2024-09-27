    package testefuncao;

/**
 *
 * @author daniel
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int sm = soma(5,2);
        System.out.println("Começou o programa");
        System.out.println("A soma vale " +sm);
    }
    
}
