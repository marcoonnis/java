/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone.Classi;

/**
 *
 * @author root
 */
public class Saldo {
    private int saldo;
    
    public Saldo(){
        saldo = 0;
    }
    
    public void addSaldo(int gain){
        this.saldo+=gain;
    }
    
    public void subSaldo(int loss) {
        if(this.saldo >= loss )
        this.saldo-=loss;
    }
    
    public int getSaldo() {
        return saldo;
    }
}
