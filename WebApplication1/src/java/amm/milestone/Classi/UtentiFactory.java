/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone.Classi;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class UtentiFactory {
    private static UtentiFactory singleton=null;
    synchronized public static UtentiFactory getInstance () {
        if(singleton==null)
            singleton= new UtentiFactory();

        return singleton;
    }
    
    private ArrayList<Cliente> listaClienti = new ArrayList<>();
    private ArrayList<Venditore> listaVenditori = new ArrayList<>();
    
    
    private UtentiFactory(){
        
    Cliente cliente_1= new Cliente();
    cliente_1.setId(1);
    cliente_1.setUsername("cliente");
    cliente_1.setPassword("psw");
    
    listaClienti.add(cliente_1);
    
    Cliente cliente_2= new Cliente();
    cliente_2.setId(2);
    cliente_2.setUsername("cliente2");
    cliente_2.setPassword("psw2");
    
    listaClienti.add(cliente_2);
    
    Venditore venditore_1= new Venditore();
    venditore_1.setId(3);
    venditore_1.setUsername("venditore");
    venditore_1.setPassword("psw");
    
    listaVenditori.add(venditore_1);
    }
    
    public ArrayList<Cliente> getClientiList()
    {
        return listaClienti;
    }
    
    public ArrayList<Venditore> getVenditoriList()
    {
        return listaVenditori;
    }
    
      public ArrayList<Utente> getUtentiList()
    {
        ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
        listaUtenti.addAll(listaClienti);
        listaUtenti.addAll(listaVenditori);
       
        return listaUtenti;
    
    }
    
    public Utente getUtenteById(int id) {
        for(Utente u : getUtentiList()) {
            if(u.getId() == id)
                return u;
        }
        return null;
    }
    
}
    

