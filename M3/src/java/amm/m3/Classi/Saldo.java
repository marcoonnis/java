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
public class Saldo {
    private int saldo;
    
    public Saldo(){
        saldo = 10;
    }
    
    public void addSaldo(int gain){
        this.saldo+=gain;
    }
    
    public boolean subSaldo(int loss) {
        if(loss>0){
            if(this.saldo >= loss ) {
                this.setSaldo((Integer) (this.getSaldo()- loss));
                return true;
            } 
        }
        return false;
    }
    
    public int getSaldo() {
        return saldo;
    }
   
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
