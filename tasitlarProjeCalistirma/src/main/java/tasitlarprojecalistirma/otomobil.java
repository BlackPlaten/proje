/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasitlarprojecalistirma;

/**
 *
 * @author User
 */
public class otomobil extends karaTasitlari {
    public String arabaMarka[];
    public String model[];
    public double fiyat[];
    public String renk[];
    
    
    
    otomobil() {
            
        this.model = new String[15];
        this.renk = new String[3];
          
    }
    
    public void setArabaMarka(String arabaMarka[]){
        this.arabaMarka = arabaMarka;
    }
    public void setModel(String model[]){
        this.model = model;
    }
    public void setFiyat(double fiyat[]){
        this.fiyat = fiyat;
    }
    public void setRenk(String renk[]){
        this.renk = renk;
    }
    public String getRenk(int i){
        try{
            if (i >= 0 && i < this.renk.length) {
            return this.renk[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.renk[i];
    }
    public double getFiyat(int i){
        try{
            if (i >= 0 && i < this.fiyat.length) {
            return this.fiyat[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.fiyat[i];
    }
    public String getModel(int i){
        try{
            if (i >= 0 && i < this.model.length) {
            return this.model[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.model[i];
    }
    public String getMarka(int i){
        try{
            if (i >= 0 && i < this.arabaMarka.length) {
            return this.arabaMarka[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.arabaMarka[i];
    }
    @Override
    public void motorTasitSahibi(String motorModel, String motorRenk, motorsiklet motor) {
        System.out.println("İstediginiz motor bulanamamaktadir.");
    }

    @Override
    public void arabaTasitSahibi(String arabaModel, String arabaRenk, otomobil oto) {
        this.model[0] = arabaModel;
        this.renk[0] = arabaRenk;
    }
    
    
    class audi{
        String model[] = {"A3","A4","A5","A6","A7"};
        double fiyat[] = {200000,300000,400000,500000,600000};
        String renk[] = {"Siyah","Beyaz","Kirmizi"};
      
    
    }
    class bmw{
        String model[] = {"M3","M4","M5","M6","M8"};
        double fiyat[] = {100000,200000,300000,400000,500000};
        String renk[] = {"Siyah","Beyaz","Kirmizi"};
       
    }
    class mercedes{
        String model[] = {"A200","C200","E200","C63","C63S"};
        double fiyat[] = {300000,400000,500000,600000,700000};
        String renk[] = {"Siyah","Beyaz","Kirmizi"};
               
    }
}