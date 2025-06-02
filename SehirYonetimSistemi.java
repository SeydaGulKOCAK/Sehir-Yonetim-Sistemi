package com.mycompany.sehiryonetimsistemi;
import java.util.*;
import javax.swing.*;
//import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.mycompany.sehiryonetimsistemi.Binalar;
import com.mycompany.sehiryonetimsistemi.SuYonetimi;
import com.mycompany.sehiryonetimsistemi.TrafikYonetimi;
import com.mycompany.sehiryonetimsistemi.EnergyManagement;
import com.mycompany.sehiryonetimsistemi.EnerjiKaynagi;
import static java.util.Map.entry;

 interface Kullanici{
    void menu();
}

// yönetici sınıfı 
 class Yonetici implements Kullanici{
    private Map<String, Arac> araclar = new HashMap<>();
    private Map<String, Binalar> binalar = new HashMap<>();
    private Map<String, EnerjiKaynagi> enerjiKaynaklari = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
  
    @Override
    public void menu(){
        System.out.println("Yonetici Menusu");
        System.out.println("1.Varlik Ekle");
        System.out.println("2.Varlik Guncelle");
        System.out.println("3.Rapor Olustur.");
        System.out.println("4.Sorun Cozumu");
        
        System.out.println("0.Cikis");

        int secim = scanner.nextInt();
        scanner.nextLine();
        switch(secim){
            case 1 -> varlikEkle();
            case 2 -> varlikGuncelle();
            case 3 -> raporOlustur();
            case 4 -> sorunCoz();
            case 0 -> System.out.println("Cikis yapiliyor...");
            default -> System.out.println("Geçersiz seçim!");
        }
    
}
    private void varlikEkle(){
         Scanner scanner = new Scanner (System.in);
        System.out.println("Ne eklemek istiyorsunuz?(1:Arac\n 2:Bina \n 3: Enerji Kaynağı)");
        int secim = scanner.nextInt();
        scanner.nextLine();

        switch(secim){
            case 1 -> {
                System.out.print("Arac Tipi: ");
                String tip = scanner.nextLine();
                System.out.println("\n");
                System.out.print("Kapasite: ");
                int kapasite = scanner.nextInt();
                scanner.nextLine();
                System.out.println("\n");
                System.out.print("Sarj seviyesi: ");
                int sarj = scanner.nextInt();
                scanner.nextLine();
                System.out.println("\n");
                System.out.println("Elektrikli mi ? true/ false");
                Boolean ElektrikliMiAcaba= scanner.nextBoolean();
                scanner.nextLine();
                System.out.println("Lutfen eklemek istediginiz aracın ID numarasını giriniz.");
               String kimlikNumarasi= scanner.nextLine();
             //  Map<Integer, Arac> araclar = new HashMap<>();
 
                 Arac yeniArac = new Arac(tip, kapasite, sarj,ElektrikliMiAcaba,Integer.parseInt(kimlikNumarasi));
                araclar.put(kimlikNumarasi, yeniArac);
                System.out.println("Araç eklendi.");
            }
            case 2 -> {
                  
                System.out.print("Bina tipi: ");
                String binaTipi = scanner.nextLine();
                System.out.print("Kat sayisi: ");
                int katSayisi = scanner.nextInt();
                System.out.print("Enerji verimliligi  ");
                Double enerjiVerimliligi = scanner.nextDouble();
                 System.out.println("Lutfen cihazin id'sini giriniz.");
                     String idDegeriniGir= scanner.nextLine();

                System.out.println("Elektrikli mi cihaz? true/false ");
                Boolean elektrikliBirCihaz=scanner.nextBoolean();
                Binalar yeniBina = new Binalar(binaTipi, katSayisi, enerjiVerimliligi,elektrikliBirCihaz);
                binalar.put(idDegeriniGir, yeniBina);
                System.out.println("Bina eklendi.");
            }
            case 3 -> {
                System.out.println("Enerji kaynagi tipi:");
                String kaynakTipi = scanner.nextLine();
                System.out.println("Enerji seviyesi: ");
                int seviye = scanner.nextInt();
                EnerjiKaynagi yeniKaynak = new EnerjiKaynagi(kaynakTipi, seviye);
                enerjiKaynaklari.put(UUID.randomUUID().toString(), yeniKaynak);
                System.out.println("Enerji kaynagi eklendi.");
            }
            default -> System.out.println("Gecersiz Secim");
        }
    }

    private void varlikGuncelle(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Guncellemek istediginiz varlik turunu seciniz. 1- Arac guncelle \n 2- Bina guncelle \n 3- Enerji Kaynagi guncelle.");
        int secim = scanner.nextInt();
        scanner.nextLine(); // tampon temizliği

        switch(secim){
            case 1 -> aracGuncelle();
            case 2 -> binayiGuncelle();
            case 3 -> enerjiKaynagiGuncelle();
            default -> System.out.println("Gecersiz secim.");
        }}

    // başlangıç
    
    

// class ismi Yonetici idi Yoneticim yaptım.
class Yoneticim {
    private Map<String, Arac> araclar = new HashMap<>();

    public void menu() {
        JOptionPane.showMessageDialog(null, "Menüden bir işlem seçildi!");
        // Burada mevcut yöntemlerinizi çağırabilirsiniz.
    }
}
    
    // bitiş
 

  private void aracGuncelle(){
         Scanner scanner = new Scanner(System.in); 
        System.out.println("Guncellemek istediginiz aracin ID'sini girin: ");
        String id = scanner.nextLine();
        if(araclar.containsKey(id)) {
            
            Arac arac = araclar.get(id);
            System.out.println("ID:"+ id);
            
            System.out.print("Yeni tip: ");
            String yeniTip = scanner.nextLine();
            System.out.print("Yeni Kapasite: ");
            int yeniKapasite = scanner.nextInt();
            System.out.print("Yeni Sarj Seviyesi: ");
            int yeniSarj = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Acaba Elektrikli mi ? true/false");
            boolean acabaElektrikliMi=scanner.nextBoolean();
            
                      // ????   scanner.nextLine(); // tampon temizliği
           Arac yeniArac = new Arac(yeniTip,yeniKapasite, yeniSarj,acabaElektrikliMi,Integer.parseInt(id));
            araclar.put( id,yeniArac );
            System.out.println("Arac guncellendi.");
        }
        else{
            System.out.println("Belirtilen id'ye sahip arac bulunamadi.");
        }}

//deneme baş
    /*

*/
       
     
       
    
    
    
    private void enerjiKaynagiGuncelle(){
        System.out.println("Guncellemek istediginiz enerji kaynagi ID'sini girin: ");
        String id = scanner.nextLine();
        if(enerjiKaynaklari.containsKey(id)) {
            EnerjiKaynagi enerjiKaynagi = enerjiKaynaklari.get(id);
            System.out.print("Yeni enerji kaynagi tipi: ");
            String yeniKaynakTipi = scanner.nextLine();
            System.out.print("Yeni enerji seviyesi: ");
            int yeniSeviye = scanner.nextInt();
            scanner.nextLine(); // tampon temizliği
            enerjiKaynagi = new EnerjiKaynagi(yeniKaynakTipi, yeniSeviye);
            enerjiKaynaklari.put(id, enerjiKaynagi);
            System.out.println("Enerji kaynagi guncellendi.");
        }
        else{
            System.out.println("Belirtilen id'ye sahip enerji kaynagi bulunamadi.");
        }
    }

    private void binayiGuncelle(){
        
  binalar. put("2", new Binalar ("Geleneksel",15,84,false));
binalar.put("3", new Binalar("Apartman", 25,87,true) );
binalar.put("1", new Binalar ("Apartman", 10, 85.5, true));
     
        System.out.println("Guncellemek istediginiz binanin ID'sini girin.");
        String id= scanner.nextLine();
        
        if(binalar.containsKey(id)){
            Binalar bina = binalar.get(id);
            System.out.println("Yeni bina tipi: ");   
            String yeniBinaTipi= scanner.nextLine();
            System.out.println("yeni kat sayisi: ");
            int yeniKatSayisi= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Yeni enerji verimliligi (0-100) arasi bir deger: ");
            double yeniEnerjiVerimliligi=scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enerji tasarrufu modu acik mi yoksa kapali mi? true/false");
            boolean enerjiTasarrufuModuAcikMi = scanner.nextBoolean();
            scanner.nextLine();
            Binalar yeniBina=new Binalar (yeniBinaTipi, yeniKatSayisi,yeniEnerjiVerimliligi, enerjiTasarrufuModuAcikMi);
               binalar.put(id, yeniBina);
               System.out.println("Bina guncellendi.");
         
        }
        else{
            System.out.println("Belirtilen ID'ye sahip bina bulunamadi.");
        }
    }
    private void raporOlustur(){
    
        System.out.println("Rapor olusturuluyor. Oncelikle ne hakkinda rapor olusturmak istediginizi soylemelisiniz.");
        System.out.println("1-Su Yonetimi \n 2- Enerji Kaynagi \n 3- Trafik Yonetimi");
        Scanner scanner=new Scanner(System.in);
        int raporIcinGirilenSayi = scanner.nextInt();
        if(raporIcinGirilenSayi==1){
            System.out.println("Su rezervi giriniz: ");
           int suRezervi=scanner.nextInt();
           System.out.println("Gunluk su tuketimini giriniz: ");
           int gunlukSuTuketimi=scanner.nextInt();
            System.out.println("RAPOR OLUSTURULDU\n-----------------");
            System.out.println("Gunluk su tuketimi: "+ gunlukSuTuketimi);
            System.out.println("Su anki su rezervi: "+suRezervi);
        }
        else if(raporIcinGirilenSayi==2){
            System.out.println("Enerji kaynagini giriniz: ");
          String enerjiKaynagi=scanner.nextLine();
           System.out.println("Enerji seviyesini giriniz: ");
           int enerjiSeviyesi=scanner.nextInt();
            System.out.println("RAPOR OLUSTURULDU\n-----------------");
            System.out.println("Enerji Seviyesi"+ enerjiSeviyesi);
            System.out.println("Enerji Kaynagi: "+enerjiKaynagi);}
        //rapor3tendevam.
     else if(raporIcinGirilenSayi==3)
        {
            System.out.println("Su anki trafik yogunlugunu giriniz yani kac kisi oldugunu yaziniz:");
            String trafikYogunlugu=scanner.nextLine();
            System.out.println("Rapor olusturuluyor...\n");
            System.out.println("Trafik Yogunlugu: "+trafikYogunlugu);
        }
     else
     {
        System.out.println("Lutfen gecerli bir sayi giriniz: ");        
     }}

    public void sorunCoz(){

        System.out.println("Sorun cozumu yapiliyor...");
    
}}
class Vatandas implements Kullanici{
    @Override
    public void  menu(){
          System.out.println("Hosgeldiniz... Lutfen Yapmak istediginiz islemin numarasini giriniz.");
          System.out.println("1-Trafik Yogunlugu Bilgisi almak istiyorum");
          System.out.println("2-Sehirdeki enerji uretimi ve tuketimi hakkinda rapor gormek istiyorum.");
          System.out.println("3-Sehirdeki su rezervlerini ve tuketim seviyelerini takip etmek istiyorum.");
          System.out.println("4-Arac hakkinda bilgiler almak istiyorum. Kapasite, sarj, aracBilgisi ");
    
    Scanner scanner=new Scanner(System.in);
    int vatandasIslemi= scanner.nextInt();
    
    if(vatandasIslemi==1){
      TrafikYonetimi t1=new TrafikYonetimi(57); 
     t1.trafikTespit();
} 
   
   
    else if(vatandasIslemi==2)
    {
        EnerjiKaynagi e1= new EnerjiKaynagi("Gunes",100);
        e1.enerjiRaporu();
    }
    else if(vatandasIslemi==3){
    SuYonetimi s1=new SuYonetimi(1000,100);
    s1.suDurumu();
    }
    /* 
    */
    
    else
    System.out.println("Lutfen gecerli bir deger giriniz.");
    } 
    
}

public class SehirYonetimSistemi {
     public static void main(String[] args) {

           Map <String, Binalar> binalar = new HashMap<>();
     
  Scanner scanner = new Scanner(System.in);

binalar. put("2", new Binalar ("Geleneksel",15,84,false));
binalar.put("3", new Binalar("Apartman", 25,87,true) );
binalar.put("1", new Binalar ("Apartman", 10, 85.5, true));

 
       
        System.out.println("Eger Yonetici (Admin) iseniz 1'e \n Vatandas (Citizen) iseniz lutfen 0'a basiniz.");
       
      int kim=scanner.nextInt();
       if(kim==1){
           Yonetici y1= new Yonetici();
           y1.menu();
       }
       else if(kim==0)
       { 
           Vatandas v1= new Vatandas();
           v1.menu();
                     
       }
       else
          System.out.println("Lutfen gecerli bir deger giriniz. 0/1");
      HashMap <Integer, Arac> araclar = new HashMap <>();
 
    araclar.put(1,new Arac("Otobus", 50, 100, false, 1)) ; 
    
    }}
