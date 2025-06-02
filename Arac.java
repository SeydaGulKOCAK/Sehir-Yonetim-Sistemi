
package com.mycompany.sehiryonetimsistemi;
public class Arac{
private boolean elektrikliMi;
    private int id;
    private String tip;
    private int kapasite;
    private int sarj;
  
    
public Arac (String tip, int kapasite, int sarj,boolean elektrikliMi ,int id )
{
this.tip=tip;
this.kapasite=kapasite;
this.sarj=sarj;
this.elektrikliMi=elektrikliMi;
this.id=id;
}
// ARAÇLARIN YOLCU SAYISINA BAKIP YOĞUNLUĞUNU DEĞERLENDİRİYORUZ
public  void kapasiteyiKontrolEt(){
    if(this.tip.equals("otobus"))
    {
        if(this.kapasite<=50)
            System.out.println("Kapasite kadar veya kapasiteden daha az yolcumuz var.");
        else
            System.out.println("MAALESEF...Otobus dolu...");
    }
    else if(this.tip.equals("elektrikli arac"))
    {
        if(this.kapasite<=10)
            System.out.println("Kapasite kadar veya kapasiteden daha az yolcumuz var.");
        else
            System.out.println("MAALESEF...ELEKTRIKLI ARAC DOLU...");
    }
   else if(this.tip.equals("motosiklet"))
   {    if(this.kapasite<=2)
                    System.out.println("Kapasite kadar veya kapasiteden daha az yolcumuz var.");
   
   else
           System.out.println("MAALESEF...MOTOSIKLET DOLU... ");
   }



}
//ŞARJ DURUMUNU KONTROL EDİYORUZ...
public void sarjDurumuKontrolEt(){
if(elektrikliMi)
{
    if(sarj<20)
        System.out.println("Sarj istasyonuna yonlendiriliyor...");
    else if(sarj>=20)
        System.out.println("Sarj orani yeterli...");
}
else
        System.out.println("MAALESEF...Cihaziniz elektrikli degil...");
}

public void aracBilgisi(){
    System.out.println("Arac tipi: "+ tip +", kapasite"+ kapasite +", şarj seviyesi: "+sarj);
}
}


