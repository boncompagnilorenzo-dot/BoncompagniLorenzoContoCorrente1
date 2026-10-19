/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boncompagnilorenzocontocorrente;

/**
 *
 * @author boncompagni.lorenzo
 */
public class ContoCorrente {
    public String nome;
    public String cognome;
    public float saldo,saldoA;
    
    
   /**
    * 
    * @param nome nome della persona
    * @param cognome cognome della persona
    * @param saldo saldo iniziale
    */
    public ContoCorrente(String nome,String cognome,float saldo)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.saldo=saldo;
        this.saldoA=this.saldo;
    }
    
    /**
     * ritorna il nome
     * @return 
     */
    public String getNome()
    {
        return nome;
    }
    
    
    /**
     * ritorna il cognome
     * @return 
     */
     public String getCognome()
    {
        return cognome;
    }
     
     /**
      * ritorna il saldo iniziale
      * @return 
      */
      public float getSaldo()
    {
        return saldo;
    }
    
      /**
       * 
       * @return 
       */
    public String ToString()
    {
        return "Il saldo iniziale e' di "+saldo+" Euro";
    }
    
    /**
     * ritorna il saldo attuale
     * @return 
     */
    public float getSaldoA()
    {
        return saldoA;
    }
    
    /**
     * calcola il saldo dopo il versamento
     * @param imp 
     */
    void versamento(float imp)
    {
        saldoA=saldoA+imp;
    }
    
    /**
     * calcola il saldo dopo il prelievo
     * @param imp 
     */
    void prelievo(float imp)
    {
        if(saldoA>=imp)
        {
            saldoA=saldoA-imp;
        }
    }
    
}
