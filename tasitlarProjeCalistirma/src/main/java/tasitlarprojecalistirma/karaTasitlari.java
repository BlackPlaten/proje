/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasitlarprojecalistirma;

/**
 *
 * @author User
 */
public abstract class karaTasitlari implements tasitlar {
    private String tasitTuru[] ;
    
    
    karaTasitlari(){
        this.tasitTuru = new String[2];
       
    }
    public void setTasitTuru(String tasitTuru[]){
        this.tasitTuru = tasitTuru;
        
    }
    public String getTasitTuru(int i){
         try{
                if (i >= 0 && i < this.tasitTuru.length) {
                return this.tasitTuru[i];
            }
        }
         catch(Exception e){
            System.out.println("Gecersiz girdi:"+i);
        }
         return this.tasitTuru[i];
    }

}