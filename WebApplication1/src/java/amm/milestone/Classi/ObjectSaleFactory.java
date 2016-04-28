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
public class ObjectSaleFactory {
    private static ObjectSaleFactory singleton=null;
    public static ObjectSaleFactory getInstance() {
        if (singleton == null) {
            singleton = new ObjectSaleFactory();
        }
        return singleton;
    }
    
    private ArrayList<Oggetto> listaOggetti = new ArrayList<Oggetto>();
    
    private ObjectSaleFactory(){
    Oggetto oggetto_1= new Oggetto();
    oggetto_1.setDescrizione("blblblbllb");
    oggetto_1.setName("Oggetto 1");
    oggetto_1.setCat("roba");
    oggetto_1.setUrl("/img/8-inch-floppy.jpg");
    oggetto_1.setDisponibili(10);
    oggetto_1.setPrezzo(10.0);
    listaOggetti.add(oggetto_1);
    
    Oggetto oggetto_2= new Oggetto();
    oggetto_2.setDescrizione("blblblbllb numero 2");
    oggetto_2.setName("Oggetto 2");
    oggetto_2.setCat("roba 2");
    oggetto_2.setUrl("/img/pen_drive_usb_virus.gif");
    oggetto_2.setDisponibili(12);
    oggetto_2.setPrezzo(13.9);
    listaOggetti.add(oggetto_2);
    }
    
    public ArrayList<Oggetto> getObjectList()
    {
        return listaOggetti;
    }
    
    public Oggetto getObjectSaleById(int id)
    {
        for(Oggetto o : listaOggetti)
        {
            if(o.getId() == id)
                return o;
        }
        
        return null;
    }
    
    public ArrayList<Oggetto> getObjectSaleByCat(String cat) {
        
        ArrayList<Oggetto> objcat = new ArrayList<Oggetto>();
        for(Oggetto o : listaOggetti){
            if(o.getCat().equals(cat))
                objcat.add(o);
        }
        
        return objcat;
    }
}
