package vetor07;

/**
 *
 * @author daniel
 */
public class Vetor07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "CURSOEMVIDEO";
        char [] r = new char[12];
        for (int c = s.length()-1; c>=0; c--){
            r[c] = s.charAt(c);
        }
        for (char i:r) {
            System.out.print(i);
        }
        System.out.println("");
    }
    
}
