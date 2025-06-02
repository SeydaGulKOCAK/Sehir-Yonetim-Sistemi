
package com.mycompany.sehiryonetimsistemi;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class EnerjiYonetimimDogruOlanBu {
    
    
    
    

    private Map<String, EnerjiKaynagi> enerjiKaynaklari;

    // Constructor
     public EnerjiYonetimimDogruOlanBu (){
        enerjiKaynaklari = new HashMap<>();
    }

    public void enerjiKaynakEkle(EnerjiKaynagi enerjiKaynagi) {
        String id = UUID.randomUUID().toString(); // BUNUN AMACI BENZERSİZ BİR KİMLİK OLUŞTURMAK.
        enerjiKaynaklari.put(id, enerjiKaynagi);
        System.out.println("Yeni enerji kaynagi eklendi. ID: " + id);
    }

    public void enerjiKaynaklariniListele() {
        if (enerjiKaynaklari.isEmpty()) {
            System.out.println("Kayitli enerji kaynagi bulunamiyor.");
        } else {
            System.out.println("Enerji kaynaklari:");
            for (Map.Entry<String, EnerjiKaynagi> entry : enerjiKaynaklari.entrySet()) { // dönen anahtar değer çiftlerini dolaşmak için kullanılan gelişmiş bir for döngüsü yapısı
                System.out.println("ID: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    public void enerjiKaynakSil(String id) {
        EnerjiKaynagi silinenKaynak = enerjiKaynaklari.remove(id);
        if (silinenKaynak != null) {
            System.out.println("Enerji kaynagi silindi. " + silinenKaynak);
        } else {
            System.out.println("HATA: Gecersiz ID.");
        }
    }

    public void toplamEnerjiSeviyesi() {
        int toplam = 0;
        for (EnerjiKaynagi kaynak : enerjiKaynaklari.values()) {
            toplam += kaynak.getEnerjiSeviyesi();
        }
        System.out.println("Toplam enerji seviyesi: " + toplam + " MW");
    }
}

    
    

