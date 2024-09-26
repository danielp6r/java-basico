package operadoreslogicos;

/**
 *
 * @author daniel
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OPERADOR && E
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        
        boolean r;
        r = (x<y && y<z)?true:false;
        System.out.println(r);
        
        r = (x<y && y==z)?true:false;
        System.out.println(r);
        
        //OPERADOR || OU
        boolean r2;
        r2 = (x<y || y==z)?true:false;
        System.out.println(r2);
        
        //OPERADOR ^ OU EXCLUSIVO
        boolean r3;
        r3 = (x<y ^ y==z)?true:false;
        System.out.println(r3);
        
        r3 = (x<y ^ y<z)?true:false;
        System.out.println(r3);
    }
    
}
