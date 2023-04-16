/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject15;

/**
 *
 * @author Nihat
 */
public class Yonetici extends Calisan{
private int sorumlu_kisi_sayi;
    public Yonetici(String ad,String soyad,int id,int sorumlu_kisi_sayi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayi = sorumlu_kisi_sayi;
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("Sorumlu kisilerin sayi:"+sorumlu_kisi_sayi);
    }
    public void zam_yap(int zam_miqdar){
        System.out.println(getAd()+" calisanlara "+zam_miqdar+" zam yap");
    }
    
}
