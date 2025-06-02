
package com.mycompany.sehiryonetimsistemi;

public class Binalar {
    private String Tur;
    private int katSayi;
    private double enerjiVerimliligi;
    private boolean enerjiTasarrufuModu;
    
    public Binalar(String Tur, int katSayi, double enerjiVerimliligi,boolean enerjiTasarrufuModu)
    {
        this.Tur=Tur;
        this.katSayi=katSayi;
        this.enerjiVerimliligi=enerjiVerimliligi;
        this.enerjiTasarrufuModu=enerjiTasarrufuModu;
      
    }
    
  
    
    public String getTur(){
        return Tur;
       }
   public void setTur(String Tur)
   {
       this.Tur=Tur;
   }
    public int katSayi()
    {
        return katSayi;
    }
    public void setKatSayi( int katSayi ){
        this.katSayi=katSayi;
    }
    public double getEnerjiVerimliligi(){
        return enerjiVerimliligi;
    }
    public void setEnerjiVerimliligi(double enerjiVerimliligi)
    {
        this.enerjiVerimliligi=enerjiVerimliligi;
    }
    public boolean isEnerjiTasarrufuModu()
    {
        return enerjiTasarrufuModu;
    }
    public void enerjiTasarrufuModuAktifEt(){
        if("Akilli".equals(this.Tur)){
        this.enerjiTasarrufuModu=true;
        System.out.println("Enerji tasarrufu modu aktive edildi.");
}
    
        else{
            System.out.println("Bu bina akilli degil, enerji tasarrufu modu aktive edilemez.");
        }
    }
    
    
    
    public void enerjiVerimliligiRaporu(){
        if(enerjiVerimliligi>80)
            System.out.println("Enerji verimliligi: Yuksek (%"+ enerjiVerimliligi +")");
        else if(enerjiVerimliligi>50)
            System.out.println("Enerji verimliligi : Orta (%"+enerjiVerimliligi+")");
        else{
            System.out.println("Enerji verimliligi dusuk (%"+enerjiVerimliligi+")");
        }
    }
public void optimizeEnerjiVerimliligi(){
 
    if("Akilli".equals(this.Tur)){
            System.out.println("Asiri enerji tuketimi optimize ediliyor...");
           enerjiVerimliligi+=10;
            System.out.println("Yeni enerji verimliligi: %"+ enerjiVerimliligi);
    }
    else
    {
        System.out.println("Bu bina geleneksel optimizasyon yapilamaz.");
    }
}
}