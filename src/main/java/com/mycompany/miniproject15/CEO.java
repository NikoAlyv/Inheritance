/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miniproject15;

/**
 *
 * @author Nihat
 */
public class CEO extends Calisan{
    
    private String diller;
    public CEO(String ad,String soyad,int id,String diller){
    
    super(ad, soyad, id);
    this.diller =diller;
            }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster(); 
        System.out.println("Diller"+diller);
    }
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd()+isletim_sistemi+" isletim sistemini yukluyor.");
    }
    

}
