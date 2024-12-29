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
public class kullanici {
    private String isim,cinsiyet,sifre;
    private String ehliyet[] = new String[5];
    private double butce;
    private int yas ;
    private otomobil otomobilAit = new otomobil();
    private motorsiklet motorsikletAit = new motorsiklet();
    bakiyeIslemleri b1;
    garajim g1;
    
    otomobil.audi audiGosterim;
    otomobil.bmw bmwGosterim;
    otomobil.mercedes mercedesGosterim;
    motorsiklet.kawasaki kawasakiGosterim;
    motorsiklet.yamaha yamahaGosterim;
    
    Scanner input = new Scanner(System.in);
    
    
    public double getButce(){
        return butce;
    }
    public void setButce(double butce){
        this.butce = butce;
        
    }
    
    
    kullanici(){
        
    }
    
    
    public otomobil getOtomobilAit(){
        return otomobilAit;
    }
    public motorsiklet getMotorsikletAit(){
        return motorsikletAit;
    }
    
    
    public void kullaniciKayit(){
       String ad = "";
       boolean isimGecerli = false;
       System.out.println("CarStore'a Hosgeldiniz..");
       System.out.println("Kayit olmak icin asagidaki bilgileri doldurunuz.");
       System.out.println("");
       while (!isimGecerli) {
       System.out.print("Kullanici isminizi giriniz: ");
       try {
            ad = input.nextLine();

           
           if (ad.matches(".*\\d.*")) { 
               throw new IllegalArgumentException("Isim alanina sayi girmeyiniz!");
            }

           isimGecerli = true;
        }  
        catch (IllegalArgumentException e) {
            System.out.println("Lutfen harfleri kullanin: " + e.getMessage());
            }
        }   
       
       System.out.println("");
       System.out.print("Sifrenizi belirleyiniz:");
       String sifre = input.nextLine();
       System.out.println("");
       System.out.print("Ehliyet sinifini giriniz:");
       String ehliyet = input.nextLine();
       System.out.println("");
       
       

       String cinsiyet = "";
       boolean cinsiyetGecerli = false;

       while (!cinsiyetGecerli) {
            try {
                System.out.print("Cinsiyetinizi giriniz (erkek/kadin): ");  
                cinsiyet = input.nextLine().toLowerCase(); 

                if (!cinsiyet.equals("erkek") && !cinsiyet.equals("kadin")) {
                    throw new IllegalArgumentException("Gecersiz cinsiyet! Sadece 'erkek' veya 'kadin' yazabilirsiniz.");
                }

                cinsiyetGecerli = true; 
            } 
            catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
            }
        }

       
        double butce = -1; 
        boolean butceGecerli = false;

        while (!butceGecerli) {
            try {
                System.out.println("");
                System.out.print("Butcenizi giriniz: ");
                butce = input.nextDouble(); 

            if (butce < 0) { 
                throw new IllegalArgumentException("Butce negatif olamaz!");
            }

            butceGecerli = true; 
            } 
            catch (InputMismatchException e) {
            System.out.println("Lutfen sayi giriniz.");
            input.nextLine(); 
            } 
            catch (IllegalArgumentException e) {
            System.out.println("Hata: " + e.getMessage());
            }
        }  
       
        int yas = -1; 
        boolean yasGecerli = false;

        while (!yasGecerli) {
            try {
                System.out.println("");
                System.out.print("Yasinizi giriniz: ");
                yas = input.nextInt(); 

                if (yas < 0) { 
                    throw new IllegalArgumentException("Yas negatif olamaz!");
                }

                yasGecerli = true; 
            } 
            catch (InputMismatchException e) {
                System.out.println("Lutfen sayi giriniz.");
                input.nextLine(); 
            } 
            catch (IllegalArgumentException e) {
                System.out.println("Hata: " + e.getMessage());
            }
        }
    
       System.out.println("Kayit olma isleminiz basarili sekilde tamamlanmistir.");
       System.out.println("");
       
       this.yas = yas;
       this.isim = ad;
       this.cinsiyet = cinsiyet;
       this.ehliyet[0] = ehliyet;
       this.sifre = sifre;
       this.butce = butce;
       
    }
    public void girisYap(){
        String ad;
        String parola;
        input.nextLine();
        do {
            System.out.println("CarStore'a giris yapiniz.");
            System.out.print("Kullanici isminizi giriniz:");
            ad = input.nextLine();
            System.out.print("Kullanici sifrenizi giriniz:");
            parola = input.nextLine();
        } while (!ad.equals(this.isim) || !parola.equals(this.sifre));
        System.out.println("Basariyla giris yaptiniz.");
        System.out.println("");
        anasayfaMenu();
        
    }
    public void anasayfaMenu(){
        int secim;
        System.out.println("");
        System.out.println("Anasayfa");
        System.out.println("1.Araclar");
        System.out.println("2.Hesabim");
        System.out.println("3.Garajim");
        System.out.println("4.Bakiye Islemleri");
        System.out.println("5.Hesap bilgi guncelle");
        System.out.println("6.Cikis Yap");
        secim = input.nextInt();
        
        if(secim == 1){
            System.out.println("1.Otomobil");
            System.out.println("2.Motor");
            secim = input.nextInt();
            if(secim == 1){
                System.out.println("Otomobil");
                System.out.println("1.Audi");
                System.out.println("2.BMW");
                System.out.println("3.Mercedes");
                secim = input.nextInt();
                if(secim == 1){
                    otomobil otomobil1 = new otomobil();
                    audiGosterim = otomobil1.new audi();
                    
                    
                    for (int i = 0; i < audiGosterim.model.length; i++) {
                        System.out.println("Model: " + audiGosterim.model[i] + 
                                           ", Fiyat: " + audiGosterim.fiyat[i] + 
                                           ", Renkler: " + String.join(", ", audiGosterim.renk));
                    }
                    
                    System.out.println("Satin almak istiyor musunuz. (1:Evet, 2:Hayir)");
                    secim = input.nextInt();
                    
                    if(secim == 1){
                        satinAlmaAudi(otomobil1);
                        anasayfaMenu();
                    }
                    else{
                        anasayfaMenu();
                    }
                    
                    
                }
                else if(secim == 2){
                    otomobil otomobil1 = new otomobil();
                    bmwGosterim = otomobil1.new bmw();
                    
                    
                    for (int i = 0; i < bmwGosterim.model.length; i++) {
                        System.out.println("Model: " + bmwGosterim.model[i] + 
                                           ", Fiyat: " + bmwGosterim.fiyat[i] + 
                                           ", Renkler: " + String.join(", ", bmwGosterim.renk));
                    } 
                    
                    System.out.println("Satin almak istiyor musunuz. (1:Evet, 2:Hayir)");
                    secim = input.nextInt();
                    
                    if(secim == 1){
                        satinAlmaBmw(otomobil1);
                        anasayfaMenu();
                    }
                    else{
                        anasayfaMenu();
                    }
                    
                }
                else if(secim == 3){
                    otomobil otomobil1 = new otomobil();
                    mercedesGosterim = otomobil1.new mercedes();
                    
                    
                    for (int i = 0; i < mercedesGosterim.model.length; i++) {
                        System.out.println("Model: " + mercedesGosterim.model[i] + 
                                           ", Fiyat: " + mercedesGosterim.fiyat[i] + 
                                           ", Renkler: " + String.join(", ", mercedesGosterim.renk));
                    }
                    
                    
                    System.out.println("Satin almak istiyor musunuz. (1:Evet, 2:Hayir)");
                    secim = input.nextInt();
                    
                    if(secim == 1){
                        satinAlmaMercedes(otomobil1);
                        anasayfaMenu();
                    }
                    else{
                        anasayfaMenu();
                    }

                }
                else{
                    System.out.println("Gecersiz secim yaptiniz.");
                    anasayfaMenu();
                }
            }
            else if(secim == 2){
                System.out.println("Motorsiklet");
                System.out.println("1.Yamaha");
                System.out.println("2.Kawasaki");
                secim = input.nextInt();
                if(secim == 1){
                    motorsiklet motorsiklet1 = new motorsiklet();
                    yamahaGosterim = motorsiklet1.new yamaha();
                    
                    
                    for (int i = 0; i < yamahaGosterim.model.length; i++) {
                        System.out.println("Model: " + yamahaGosterim.model[i] + 
                                           ", Fiyat: " + yamahaGosterim.fiyat[i] + 
                                           ", Renkler: " + String.join(", ", yamahaGosterim.renk));
                    }
                    
                    System.out.println("Satin almak istiyor musunuz. (1:Evet, 2:Hayir)");
                    secim = input.nextInt();
                    
                    if(secim == 1){
                        
                        satinAlmaYamaha(motorsiklet1);
                        anasayfaMenu();
                    }
                    else{
                        anasayfaMenu();
                    }
                    
                }
                else if(secim == 2){
                    motorsiklet motorsiklet1 = new motorsiklet();
                    kawasakiGosterim = motorsiklet1.new kawasaki();
                    
                    
                    for (int i = 0; i < kawasakiGosterim.model.length; i++) {
                        System.out.println("Model: " + kawasakiGosterim.model[i] + 
                                           ", Fiyat: " + kawasakiGosterim.fiyat[i] + 
                                           ", Renkler: " + String.join(", ", kawasakiGosterim.renk));
                    } 
                    
                    System.out.println("Satin almak istiyor musunuz. (1:Evet, 2:Hayir)");
                    secim = input.nextInt();
                    
                    if(secim == 1){
                        satinAlmaKawasaki(motorsiklet1);
                        anasayfaMenu();
                    }
                    else{
                        anasayfaMenu();
                    }
                    
                }
            }
            else{
                    System.out.println("Gecersiz secim yaptiniz.");
                    anasayfaMenu();
                }
        } 
        else if (secim == 2) {
            hesapBilgiGoster();
            System.out.println("Ehliyet eklemek istiyor musunuz. (1-Evet, 2-Hayir)");
            secim = input.nextInt();
            
            if(secim==1){
                ehliyetEkleme();
            }
            else{
                anasayfaMenu();
            }
            anasayfaMenu();
            
        } 
        else if (secim == 3) {
            g1 = new garajim(this);
            g1.garajSecimEkrani();
            anasayfaMenu();
        } 
        else if (secim == 4) {
            b1 = new bakiyeIslemleri(this);
            b1.islemYapma();
            
            anasayfaMenu();
        } 
        else if(secim == 5){
            String ad;
            int yas;
            String cinsiyet,sifre;
            
            System.out.println("Degistirmek istediginiz bilgileri seciniz.");
            System.out.println("1- Isim ve Yas");
            System.out.println("2- Isim, Yas ve Cinsiyet");
            System.out.println("3- Isim, Yas, CinsiyeT ve Sifre");
            secim = input.nextInt();
            
            if(secim == 1){
                
                System.out.print("Yeni isminizi giriniz:");
                ad = input.next();
                System.out.println("");
                System.out.print("Yeni yasinizi giriniz:");
                yas = input.nextInt();
                System.out.println("");
                
                hesapBilgiGuncelle(ad,yas);
                anasayfaMenu();
            }
            else if(secim == 2){
                
                System.out.print("Yeni isminizi giriniz:");
                ad = input.next();
                System.out.println("");
                System.out.print("Yeni yasinizi giriniz:");
                yas = input.nextInt();
                System.out.println("");
                System.out.print("Yeni cinsiyet giriniz:");
                cinsiyet = input.next();
                
                hesapBilgiGuncelle(ad,yas,cinsiyet);
                anasayfaMenu();
            }
            else if(secim == 3){
                System.out.print("Yeni isminizi giriniz:");
                ad = input.next();
                System.out.println("");
                System.out.print("Yeni yasinizi giriniz:");
                yas = input.nextInt();
                System.out.println("");
                System.out.print("Yeni cinsiyet giriniz:");
                cinsiyet = input.next();
                 System.out.println("");
                System.out.print("Yeni sifrenizi giriniz:");
                sifre = input.next();
                
                hesapBilgiGuncelle(ad,yas,cinsiyet,sifre);
                anasayfaMenu();
            }
            
        }
        else if(secim== 6){
            cikisYap();
        }
        else {
            System.out.println("Gecersiz secim! Lutfen tekrar deneyin.");
            anasayfaMenu();
        }
    }
    public void hesapBilgiGuncelle(String isim, int yas){
        this.isim = isim;
        this.yas = yas;
        System.out.println("Kullanici bilgileri guncellendi: Isim - " + isim + ", Yas - " + yas);
    }
    public void hesapBilgiGuncelle(String isim, int yas, String cinsiyet){
        this.isim = isim;
        this.yas = yas;
        this.cinsiyet = cinsiyet; 
        System.out.println("Kullanici bilgileri guncellendi: Isim - " + isim + ", Yas - " + yas+", Cinsiyet - "+cinsiyet);
    }
    public void hesapBilgiGuncelle(String isim, int yas, String cinsiyet, String sifre){
        this.isim = isim;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.sifre = sifre;
        System.out.println("Kullanici bilgileri guncellendi: Isim - " + isim + ", Yas - " + yas +", Cinsiyet - "+cinsiyet+", Sifre - "+sifre);
    }
    
    public void satinAlmaKawasaki(motorsiklet motorsiklet1){
        
        int modelSecim,renkSecim;
        motorsiklet.kawasaki kawasaki1  = motorsiklet1.new kawasaki(); 
        String secilenModel = "";
        String secilenRenk = "";
        
        
        System.out.println("Satin almak istediginiz motor modeli:");
        for (int i = 0; i < kawasaki1.model.length; i++) {
        System.out.println((i + 1) + ". Model: " + kawasaki1.model[i]);
        }
        modelSecim = input.nextInt() - 1;
        if(butce < kawasaki1.fiyat[modelSecim]){
            System.out.println("Bakiye yetersizdir.");
            System.out.println("Lutfen bakiyenizi guncelleyiniz.");
            anasayfaMenu();
        }
        if (modelSecim >= 0 && modelSecim < kawasaki1.model.length) {
        secilenModel = kawasaki1.model[modelSecim];
        } else {
        System.out.println("Gecersiz Secim!");
        return;
        }
        
        
        
        System.out.println("Satin almak istediginiz motor rengini seciniz:");
        for (int i = 0; i < kawasaki1.renk.length; i++) {
        System.out.println((i + 1) + ". Renk: " + kawasaki1.renk[i]);
        }
        renkSecim = input.nextInt() - 1;
        if (renkSecim >= 0 && renkSecim < kawasaki1.renk.length) {
            secilenRenk = kawasaki1.renk[renkSecim];
        } else {
            System.out.println("Gecersiz secim!");
            return;
        }
        
        
        motorsikletAit.motorTasitSahibi(secilenModel, secilenRenk, motorsiklet1);
        
        
        this.motorsikletAit.motorMarka = new String[]{"Kawasaki"}; 
        this.motorsikletAit.motorModel = new String[]{secilenModel};
        this.motorsikletAit.motorRenk = new String[]{secilenRenk};
        
        
        System.out.println("Satin alma islemi tamamlandi. Yeni motorunuz hayirli olsun.");
        System.out.println("Secilen Model: " + secilenModel);
        System.out.println("Secilen Renk: " + secilenRenk);
        butce = butce - kawasaki1.fiyat[modelSecim];
        
    }
    
    
    public void satinAlmaYamaha(motorsiklet motorsiklet1){
        
        int modelSecim,renkSecim;
        motorsiklet.yamaha yamaha1  = motorsiklet1.new yamaha(); 
        String secilenModel = "";
        String secilenRenk = "";
        
        
        System.out.println("Satin almak istediginiz motor modeli:");
        for (int i = 0; i < yamaha1.model.length; i++) {
        System.out.println((i + 1) + ". Model: " + yamaha1.model[i]);
        }
        modelSecim = input.nextInt() - 1;
        if(butce < yamaha1.fiyat[modelSecim]){
            System.out.println("Bakiye yetersizdir.");
            System.out.println("Lutfen bakiyenizi guncelleyiniz.");
            anasayfaMenu();
        }
        
        if (modelSecim >= 0 && modelSecim < yamaha1.model.length) {
        secilenModel = yamaha1.model[modelSecim];
        } else {
        System.out.println("Gecersiz secim!");
        return;
        }
        
        
        
        System.out.println("Satin almak istediginiz motor rengini seciniz:");
        for (int i = 0; i < yamaha1.renk.length; i++) {
        System.out.println((i + 1) + ". Renk: " + yamaha1.renk[i]);
        }
        renkSecim = input.nextInt() - 1;
        if (renkSecim >= 0 && renkSecim < yamaha1.renk.length) {
            secilenRenk = yamaha1.renk[renkSecim];
        } else {
            System.out.println("Gecersiz secim!");
            return;
        }
        
        
        
        
        this.motorsikletAit.motorMarka = new String[]{"Yamaha"}; 
        this.motorsikletAit.motorModel = new String[]{secilenModel};
        this.motorsikletAit.motorRenk = new String[]{secilenRenk};
        
        
        System.out.println("Satin alma islemi tamamlandi. Yeni motorunuz hayirli olsun.");
        System.out.println("Secilen Model: " + secilenModel);
        System.out.println("Secilen Renk: " + secilenRenk);
        butce = butce - yamaha1.fiyat[modelSecim];
        
    }
    
    public void satinAlmaMercedes(otomobil otomobil3){
        
        int modelSecim,renkSecim;
        otomobil.mercedes mercedes1  = otomobil3.new mercedes(); 
        String secilenModel = "";
        String secilenRenk = "";
        
        
        System.out.println("Satin almak istediginiz araba modeli:");
        for (int i = 0; i < mercedes1.model.length; i++) {
        System.out.println((i + 1) + ". Model: " + mercedes1.model[i]);
        }
        modelSecim = input.nextInt() - 1;
        if(butce < mercedes1.fiyat[modelSecim]){
            System.out.println("Bakiye yetersizdir.");
            System.out.println("Lutfen bakiyenizi guncelleyiniz.");
            anasayfaMenu();
        }
        if (modelSecim >= 0 && modelSecim < mercedes1.model.length) {
        secilenModel = mercedes1.model[modelSecim];
        } else {
        System.out.println("Gecersiz secim!");
        return;
        }
        
        
        
        System.out.println("Satin almak istediginiz araba rengini seciniz:");
        for (int i = 0; i < mercedes1.renk.length; i++) {
        System.out.println((i + 1) + ". Renk: " + mercedes1.renk[i]);
        }
        renkSecim = input.nextInt() - 1;
        if (renkSecim >= 0 && renkSecim < mercedes1.renk.length) {
            secilenRenk = mercedes1.renk[renkSecim];
        } else {
            System.out.println("Gecersiz secim!");
            return;
        }
        
        
        
        
        this.otomobilAit.arabaMarka = new String[]{"Mercedes"}; 
        this.otomobilAit.model = new String[]{secilenModel};
        this.otomobilAit.renk = new String[]{secilenRenk};
        
        
        System.out.println("Satin alma islemi tamamlandi. Yeni araciniz hayirli olsun.");
        System.out.println("Secilen Model: " + secilenModel);
        System.out.println("Secilen Renk: " + secilenRenk);
        butce = butce - mercedes1.fiyat[modelSecim];
        
    }
    
    public void satinAlmaBmw(otomobil otomobil2){
        
        int modelSecim,renkSecim;
        otomobil.bmw bmw1  = otomobil2.new bmw(); 
        String secilenModel = "";
        String secilenRenk = "";
        
        
        System.out.println("Satin almak istediginiz araba modeli:");
        for (int i = 0; i < bmw1.model.length; i++) {
        System.out.println((i + 1) + ". Model: " + bmw1.model[i]);
        }
        modelSecim = input.nextInt() - 1;
        if(butce < bmw1.fiyat[modelSecim]){
            System.out.println("Bakiye yetersizdir.");
            System.out.println("Lutfen bakiyenizi guncelleyiniz.");
            anasayfaMenu();
        }
        if (modelSecim >= 0 && modelSecim < bmw1.model.length) {
        secilenModel = bmw1.model[modelSecim];
        } else {
        System.out.println("Gecersiz secim!");
        return;
        }
        
        
        
        System.out.println("Satin almak istediginiz araba rengini seciniz:");
        for (int i = 0; i < bmw1.renk.length; i++) {
        System.out.println((i + 1) + ". Renk: " + bmw1.renk[i]);
        }
        renkSecim = input.nextInt() - 1;
        if (renkSecim >= 0 && renkSecim < bmw1.renk.length) {
            secilenRenk = bmw1.renk[renkSecim];
        } else {
            System.out.println("Gecersiz secim!");
            return;
        }
        
        
        
        this.otomobilAit.arabaMarka = new String[]{"Bmw"}; 
        this.otomobilAit.model = new String[]{secilenModel};
        this.otomobilAit.renk = new String[]{secilenRenk};
        
        
        System.out.println("Satin alma islemi tamamlandi. Yeni araciniz hayirli olsun.");
        System.out.println("Secilen Model: " + secilenModel);
        System.out.println("Secilen Renk: " + secilenRenk);
        butce = butce - bmw1.fiyat[modelSecim];
        
    }
    
    public void satinAlmaAudi(otomobil otomobil1){
        
        int modelSecim,renkSecim;
        otomobil.audi audi1  = otomobil1.new audi(); 
        String secilenModel = "";
        String secilenRenk = "";
        
        
        System.out.println("Satin almak istediginiz araba modeli:");
        for (int i = 0; i < audi1.model.length; i++) {
        System.out.println((i + 1) + ". Model: " + audi1.model[i]);
        }
        modelSecim = input.nextInt() - 1;
        if(butce < audi1.fiyat[modelSecim]){
            System.out.println("Bakiye yetersizdir.");
            System.out.println("Lutfen bakiyenizi guncelleyiniz.");
            anasayfaMenu();
}
        if (modelSecim >= 0 && modelSecim < audi1.model.length) {
        secilenModel = audi1.model[modelSecim];
        } else {
        System.out.println("Gecersiz secim!");
        return;
        }
        
        
        
        System.out.println("Satin almak istediginiz araba rengini seciniz:");
        for (int i = 0; i < audi1.renk.length; i++) {
        System.out.println((i + 1) + ". Renk: " + audi1.renk[i]);
        }
        renkSecim = input.nextInt() - 1;
        if (renkSecim >= 0 && renkSecim < audi1.renk.length) {
            secilenRenk = audi1.renk[renkSecim];
        } else {
            System.out.println("Gecersiz secim!");
            return;
        }
        
        
        
        
        this.otomobilAit.arabaMarka = new String[]{"Audi"}; 
        this.otomobilAit.model = new String[]{secilenModel};
        this.otomobilAit.renk = new String[]{secilenRenk};
        
        
        System.out.println("Satin alma islemi tamamlandi. Yeni araciniz hayirli olsun.");
        System.out.println("");
        System.out.println("Secilen Model: " + secilenModel);
        System.out.println("Secilen Renk: " + secilenRenk);
        System.out.println("");
        butce = butce - audi1.fiyat[modelSecim];
        
}
    
    public void cikisYap(){
        System.out.println("Sistemden cikisiniz yapilmistir.");
        System.exit(0);
    }
 
        
   
    public void hesapBilgiGoster(){
        System.out.println("Isminiz: " + isim);
        System.out.println("Guncel bakiyeniz :" + butce);
        System.out.println("Cinsiyetiniz:" +cinsiyet);
        System.out.println("Yasiniz: "+yas);
        System.out.print("Ehliyetleriniz :" );    
        for(int i=0 ; i<ehliyet.length; i++){
            if(ehliyet[i]==null){
                break;
            }
            else{
                System.out.println(ehliyet[i]);
                
            }
        }
       
    }
    

    
    public void ehliyetKontrol(){
        System.out.println("Ehliyetleriniz:");
        for(int i=0 ; i< ehliyet.length ; i++){
            System.out.println("1-"+ehliyet);
        }
    }
    
    
    public void ehliyetEkleme() {
         System.out.println("Eklemek istediginiz ehliyet sinifini seciniz:");
         String[] ehliyetSiniflari = {"A1", "A2", "A", "B1", "B"};
         for (int i = 0; i < ehliyetSiniflari.length; i++) {
         System.out.println((i + 1) + "- " + ehliyetSiniflari[i]);
    }
    
        int secim = input.nextInt();
            if (secim < 1 || secim > ehliyetSiniflari.length) {
            System.out.println("Gecersiz secim!");
           return;
    }

    String yeniEhliyet = ehliyetSiniflari[secim - 1];
        for (int i = 0; i < ehliyet.length; i++) {
            if (ehliyet[i] != null && ehliyet[i].equals(yeniEhliyet)) {
                System.out.println("Sizde zaten " + yeniEhliyet + " ehliyeti bulunuyor!");
            return;
            }
            if (ehliyet[i] == null) {
                ehliyet[i] = yeniEhliyet;
                System.out.println(yeniEhliyet + " ehliyeti basariyla eklendi!");
            return;
        }
    }
    System.out.println("Ehliyet eklenemedi, yer yok!");
}

    
}
