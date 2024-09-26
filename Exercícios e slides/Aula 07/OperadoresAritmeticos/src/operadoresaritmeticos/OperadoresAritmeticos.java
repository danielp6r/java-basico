package operadoresaritmeticos;

/**
 *
 * @author daniel
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é: " + m);*/
        
        /*int numero = 5;
        int valor = 5 + ++numero;
        System.out.println(valor);*/
        
        /*int x = 4;
        x += 2;
        System.out.println(x);*/
        
        /*float v = 8.5f;
        int ar = (int)Math.floor(v);
        System.out.println(ar);*/
        
        /*float v = 8.5f;
        int ar = (int)Math.ceil(v);
        System.out.println(ar);*/
        
        /*float v = 8.5f;
        int ar = (int)Math.round(v);
        System.out.println(ar);*/
        
        /*double ale = Math.random();
        System.out.println(ale);*/
        
        double ale = Math.random();
        int n = (int) (5 + ale * (11-5));
        System.out.printf("O número é %.2f \n", ale);
        System.out.println(n);
       
    }
    
}
