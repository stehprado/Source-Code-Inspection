/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31385427
 */
public class main {
    public static void main(String[] args) {
       
        try {
            TicketMachine tm = new TicketMachine();
            
            tm.setValor(5);
            tm.inserir(10);
            tm.imprimir();
            tm.getTroco();
            tm.imprimir();
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SaldoInsuficienteException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
                
           
     
        
        
    
}
    
}
