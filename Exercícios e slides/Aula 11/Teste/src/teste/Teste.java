package teste;

/**
 *
 * @author daniel
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char c = 'c';
        int i = 10;
        double d = 10;
        long l = 1;
        String s = "Hello";
        
       // ERRO c = c + i;
       // CORRETA s += i; 
       // ERRO i += s;
       // ERRO c += s;
       // CORRETA i += l;
    }
    
}
