
package com.mycompany.sehiryonetimsistemi;
public class EnerjiKaynagi {
    private String kaynakTipi;
    private int enerjiSeviyesi;
    
    public EnerjiKaynagi(String kaynakTipi, int enerjiSeviyesi)
    {
        this.enerjiSeviyesi=enerjiSeviyesi;
        this.kaynakTipi=kaynakTipi;
        
    }
    //BU KISMI TEKRAR İNCELE RÜZGAR TÜRBİNİ YÖNETİCİYİ UYAR kısmı 
    //orayı tam yapamadım.
    //enerji kaynağı bilgilerini görüntüleme metodu
public void enerjiRaporu(){
    System.out.println("Enerji kaynagi: "+ kaynakTipi);
    System.out.println("Enerji seviyesi: "+ enerjiSeviyesi+" MW ");
}
    
    //Enerji üretimini arttırma metodu
public void enerjiArtir(int miktar){
    enerjiSeviyesi+=miktar;
    System.out.println(miktar+ "MW enerji eklendi.Yeni enerji seviyesi :"+enerjiSeviyesi+" MW ");
}
    //Enerji üretimini azaltma metodu
public void enerjiAzalt(int miktar){
 if(miktar>enerjiSeviyesi){
       System.out.println("Hata: Enerji seviyesi negatif olamaz.");
     }
     else{
             enerjiSeviyesi-=miktar;
             System.out.println(miktar+ "MW enerji cikarildi. Yeni enerji seviyesi: "+ enerjiSeviyesi+ "MW");
             }
 
}
// ENERJİ KAYNAĞI TİPİNİ GÜNCELLEME METODU
public void kaynakTipiGuncelle(String yeniTip)
{
    kaynakTipi=yeniTip;
    System.out.println("Enerji kaynagi tipi: "+ yeniTip +" olarak guncellendi.");
}
public int getEnerjiSeviyesi(){
    return enerjiSeviyesi;
}
}