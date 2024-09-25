package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Daniel
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension d = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println("Sua tela tem resolução "+ d.width + "x" + d.height);
    }

}
