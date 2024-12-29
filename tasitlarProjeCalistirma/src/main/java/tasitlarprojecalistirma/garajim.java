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
public class garajim {
    Scanner input = new Scanner(System.in);
    private kullanici s1;
    
    garajim(kullanici s1){
        this.s1 = s1;
    }
    public void garajSecimEkrani(){
        int secim;
        
        System.out.println("1.Arabalariniz");
        System.out.println("2.Motorlariniz");
        System.out.println("-----------------------");
        secim = input.nextInt();
        
        if(secim == 1){
            arabalarimiGoster();
          
        }
        else if(secim==2){
            motorlarimiGoster();
        }
        else{
           s1.anasayfaMenu();
        }
    }
    public void arabalarimiGoster(){
        if(s1.getOtomobilAit() == null || s1.getOtomobilAit().arabaMarka == null || s1.getOtomobilAit().model[0] == null || s1.getOtomobilAit().renk == null){
            System.out.println("Size ait bir araba bulunmamaktadir.");
        }
        else{
            System.out.println("Arabanizin markasi: " + s1.getOtomobilAit().arabaMarka[0]);
            System.out.println("Arabanizin modeli: " + s1.getOtomobilAit().model[0]);
            System.out.println("Arabanizin rengi: " + s1.getOtomobilAit().renk[0]);
        }
    }
    public void motorlarimiGoster(){
        if(s1.getMotorsikletAit() == null || s1.getMotorsikletAit().motorMarka == null || s1.getMotorsikletAit().motorModel[0] == null || s1.getMotorsikletAit().motorRenk == null){
            System.out.println("Size ait bir motor bulunmamaktadir.");
        }
        else{
            System.out.println("Motorunuzun markasi: " + this.s1.getMotorsikletAit().motorMarka[0]);
            System.out.println("Motorunuzun modeli: " + this.s1.getMotorsikletAit().motorModel[0]);
            System.out.println("Motorunuzun rengi: " + this.s1.getMotorsikletAit().motorRenk[0]);
        }
    }

}
