/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparastring;

/**
 *
 * @author daniel
 */
public class ComparaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Daniel";
        String nome2 = "Daniel";
        String nome3 = new String("Daniel");
        String res1, res2, res3;
        
        //COMPARANDO NOMES COM ==
        res1 = (nome1==nome2)?"Igual.":"Diferente.";
        res2 = (nome1==nome3)?"Igual.":"Diferente.";
        
        //PARA OBJETOS COMPARAR COM .equals()
        res3 = (nome1.equals(nome3))?"Igual.":"Diferente.";
        System.out.println(res1 + "\n" + res2 + "\n" + res3);
    }
    
}
