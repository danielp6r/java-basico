package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *2
 * @author daniel
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(0 para interromper.)</em></html>"));
            s += n;
        } while(n != 0);   
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "<br>Somatório vale " + s + "</html>");
    }
    
}
