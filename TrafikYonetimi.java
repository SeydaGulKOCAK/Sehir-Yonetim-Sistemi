
package com.mycompany.sehiryonetimsistemi;
public class TrafikYonetimi {
    private int trafikDurumu;
    
    public TrafikYonetimi(int trafikDurumu){
        this.trafikDurumu=trafikDurumu;
        }
    public void trafikTespit(){
        System.out.println("Su anki trafik yogunlugu: "+trafikDurumu );
    }
}

