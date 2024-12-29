/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasitlarprojecalistirma;

/**
 *
 * @author User
 */
public class motorsiklet extends karaTasitlari {
    public String motorMarka[];
    public String motorModel[];
    public double motorFiyat[];
    public String motorRenk[];    
    
    
    
     motorsiklet() {
        
        
        this.motorMarka = new String[2];
        this.motorRenk = new String[3];
        this.motorModel = new String[10];
        this.motorFiyat = new double[10];
        
        
    }
    
    public void setMotorMarka(String motorMarka[]){
        this.motorMarka = motorMarka;
    }
    public void setMotorModel(String motorModel[]){
        this.motorModel = motorModel;
    }
    public void setMotorFiyat(double fiyat[]){
        this.motorFiyat = fiyat;
    }
    public void setMotorRenk(String renk[]){
        this.motorRenk = renk;
    }
    public String getMotorRenk(int i){
        try{
            if (i >= 0 && i < this.motorRenk.length) {
            return this.motorRenk[i];
        }
        }catch(Exception e){        
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorRenk[i];
    }
    

    public double getMotorFiyat(int i){
        try{
            if (i >= 0 && i < this.motorFiyat.length) {
            return this.motorFiyat[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorFiyat[i];
    }
    public String getMotorModel(int i){
        try{
            if (i >= 0 && i < this.motorModel.length) {
            return this.motorModel[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorModel[i];
    }
    public String getMotorMarka(int i){
        try{
            if (i >= 0 && i < this.motorMarka.length) {
            return this.motorMarka[i];
        }
        }catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
        
        
        return this.motorMarka[i];
    }
    
    @Override
    public void motorTasitSahibi(String motorModel, String motorRenk, motorsiklet motor) {
        this.motorModel[0] = motorModel;
        this.motorRenk[0] = motorRenk;
    }

    @Override
    public void arabaTasitSahibi(String arabaModel, String arabaRenk, otomobil oto) {
        System.out.println("İstediginiz otomobil bulanamamaktadir.");
    }
    

    
    class yamaha{
        String model[] = {"R1","R3","R7","R25","MT-10"};
        double fiyat[] = {174800,37250,50000,18500,85000};
        String renk[] = {"Siyah","Beyaz","Kirmizi"};
        
        
    }
    class kawasaki{
       String model[] = {"Z500","Eliminator 500","Z7 Hybrid","Ninja7 Hybrid","Ninja 500"};
       double fiyat[] = {38000,40000,82000,80000,42000};
       String renk[] = {"Siyah","Beyaz","Kirmizi"};
       
    }
    
}
