/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boncompagnilorenzocontocorrente;

/**
 *
 * @author boncompagni.lorenzo
 */
public class BoncompagniLorenzoContoCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ContoCorrente c= new ContoCorrente("Lorenzo","Boncompagni",1222);
        c.versamento(60);   
        System.out.println(c.ToString());
        System.out.println("Il saldo dopo il versamento e' di "+ c.getSaldoA ());
        c.prelievo(20);  
        System.out.println("Il saldo dopo il prelievo e' di "+c.getSaldoA());
    }
    
}
