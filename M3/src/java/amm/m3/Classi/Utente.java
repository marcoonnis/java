/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.m3.Classi;

/**
 *
 * @author root
 */
public abstract class Utente {
  
    private int id;
    private String username;
    private String password;
    public Saldo saldo;
    
    public Utente()
    {
        id = 0;
        username="";
        password="";        
        saldo = new Saldo();
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Saldo getSaldo() {
        return saldo;
    }
}
