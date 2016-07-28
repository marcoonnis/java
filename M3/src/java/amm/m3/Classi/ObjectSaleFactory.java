/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.m3.Classi;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author root
 */
public class ObjectSaleFactory {
    private static ObjectSaleFactory singleton=null;
    
    synchronized public static ObjectSaleFactory getInstance() {
        if (singleton == null) {
            singleton = new ObjectSaleFactory();
        }
        return singleton;
    }
    
    List<Oggetto> listaOggetti = new ArrayList<>();
    
    private ObjectSaleFactory(){
    Oggetto oggetto_1= new Oggetto();
    oggetto_1.setDescrizione("blblblbllb");
    oggetto_1.setName("Oggetto 1");
    oggetto_1.setCat("roba");
    oggetto_1.setUrl("img/8-inch-floppy.jpg");
    oggetto_1.setDisponibili(10);
    oggetto_1.setPrezzo(10);
    oggetto_1.setId(1);
    listaOggetti.add(oggetto_1);
    
    Oggetto oggetto_2= new Oggetto();
    oggetto_2.setDescrizione("blblblbllb numero 2");
    oggetto_2.setName("Oggetto 2");
    oggetto_2.setCat("roba 2");
    oggetto_2.setUrl("img/pen_drive_usb_virus.gif");
    oggetto_2.setDisponibili(12);
    oggetto_2.setPrezzo(5);
    oggetto_2.setId(2);
    listaOggetti.add(oggetto_2);
    }
    
    public List<Oggetto> getObjectList()
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
    
    public List<Oggetto> getObjectSaleByCat(String cat) {
        
        List<Oggetto> objcat = new ArrayList<>();
        for(Oggetto o : listaOggetti){
            if(o.getCat().equals(cat))
                objcat.add(o);
        }
        
        return objcat;
    }
}
