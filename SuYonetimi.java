
package com.mycompany.sehiryonetimsistemi;

public class SuYonetimi {
    private int suRezervi; //mevcut su rezervi litre olarak
    private int gunlukTuketim;// günlük su tüketimi litre olarak
     public SuYonetimi(int suRezervi, int gunlukTuketim)
     {
         this.suRezervi=suRezervi;
         this.gunlukTuketim=gunlukTuketim;
         
     }
     // su durumu raporu oluşturma metodu
     public void suDurumu(){
         System.out.println("Mevcut su rezervi: "+ suRezervi + " litre");
         System.out.println("Gunluk su tuketimi : "+ gunlukTuketim +" litre");
     int kalanGun= suRezervi/gunlukTuketim;
         System.out.println("Bu rezervle yaklasik"+ kalanGun+" gun yetecek kadar su var.");
     }
     public void suEkle(int miktar){
         suRezervi+=miktar;
         System.out.println(miktar+ "litre su eklendi. Yeni su rezervi:"+suRezervi+ "litre");
         
     }
     public void tuketimGuncelle(int yeniTuketim)
     {
         gunlukTuketim=yeniTuketim;
         System.out.println("Gunluk su tuketimi: "+ yeniTuketim+" litre olarak guncellendi.");
     }
}
