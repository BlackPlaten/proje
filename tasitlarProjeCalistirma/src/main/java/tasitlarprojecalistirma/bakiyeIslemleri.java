/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasitlarprojecalistirma;
import java.util.*;
/**
 *
 * @author User
 */
public class bakiyeIslemleri {
    
    Scanner input = new Scanner(System.in);
    private kullanici k1;
    public double butce  ;
    bakiyeIslemleri(kullanici k1){
        this.k1 = k1;
        this.butce = k1.getButce();
    }
    
    public void islemYapma(){
        int secim;
        System.out.println("Bakiye islemleri (1-Bakiye Ekle , 2-Bakiye Cek)");
        secim = input.nextInt();
        
        if(secim == 1){
            bakiyeEkle();
        }
        else if(secim == 2){
            bakiyeAzalt();
        }
        else{
            System.out.println("Gecersiz secim yaptiniz. Lutfen tekrar deneyiniz.");
            
        }
    }
    public void bakiyeEkle(){
        double bakiye;
        System.out.print("Eklemek istediginiz bakiye:");
        bakiye = input.nextDouble();
        butce = butce + bakiye;
        
        k1.setButce(butce); 
        System.out.println("Bakiyenize " +bakiye+ " TL eklenmistir.Mevcut bakiyeniz: " + butce + " TL ");
        
    }
    public void bakiyeAzalt() {
        double bakiye;
        System.out.print("Cekmek istediginiz bakiye: ");
        bakiye = input.nextDouble();

        if (bakiye > butce) { 
        System.out.println("Bu kadar bakiyeniz bulunmamaktadir. Mevcut bakiyeniz: " + butce + " TL");
        } else {
            butce = butce - bakiye;
            k1.setButce(butce); 
         System.out.println("Bakiyenizden " + bakiye + " TL cekilmistir.Mevcut bakiyeniz: " + butce + " TL");
    }
}

    
}
