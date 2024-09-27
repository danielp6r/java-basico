package contador01;

/**
 *
 * @author Daniel
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int contador = 1;
        while (contador<=20) {
            System.out.println("Contador " + contador);
            contador++;*/
        
        /*int contador = 0;
        while (contador<10) {
            contador++;
            if (contador == 5 || contador == 7 || contador ==9){
                continue;
            }
            System.out.println("Contador " + contador);*/
        
        int contador = 0;
        while (contador<10) {
            contador++;
            if (contador == 2 || contador == 3 || contador ==4){
                continue;
            }
            if (contador == 7){
                break;
            }
            System.out.println("Contador " + contador);
            
        }
    }

}
