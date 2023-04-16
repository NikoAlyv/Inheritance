/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniproject15;

import java.util.Scanner;

/**
 *
 * @author Nihat
 */
public class MiniProject15 {

    public static void main(String[] args) {

        /*
        Çalışanlar proqrami
        
        Çalişan adlı bir üst sinif
        
        Çalışan sinifindən törəyən "Ceo" adlı bir alt sinif
        Çalışan sinifindən törəyən "Yonetici" adlı bir alt sinif
        */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Calisanlar proqramina xos geldiniz..");
        
        String islemler = "islemler...\n"
                       +"1.Yazilimci islemleri\n"
                       +"2.Yonetici islemleri\n"
                       +"Cixis ucun q'a basin";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");
        
        while(true){
            System.out.print("Islemi daxil edin:");
            String islem = scan.nextLine();
            if(islem.equals("q")){
                System.out.println("Proqramdan cixilir......");
                break;
            }
            else if(islem.equals("1")){
                CEO ceo = new CEO("Nihad", "Aliyev", 07,"Java,CSS ");
                String Yazilimci_islem = "1.Format at\n"
                                      +"2.Bilgileri goster\n"
                                      +"Cixis ucun q'a basin";
                System.out.println("**********************************");
                System.out.println(Yazilimci_islem);
                System.out.println("**********************************");
                while(true){
                    System.out.print("Islemi daxil edin:");
                    String y_islem =scan.nextLine();
                    
                    
                    if(y_islem.equals("q")){
                        System.out.println("Yazilim classindan cixilir...");
                        break;
                    }
                    else if(y_islem.equals("1")){
                        System.out.print("Isletim sistemini daxil edin:");
                        String isletim_sistemi= scan.nextLine();
                       ceo.formatAt(isletim_sistemi);
                    }
                    else if(y_islem.equals("2")){
                        ceo.bilgileri_goster();
                    }
                    else{
                        System.out.println("Yanlis yazilimci islemi...");
                        
                    }
                }
                
            }
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Xudu","Aliyev",2,100);
                
                String emeller = "Yonetici emelleri\n"
                               +"1.Zam_yap \n"
                               +"2.bilgileri_goster\n"
                               +"Cixis ucun q'a basin";
                
                     System.out.println("**********************************");   
                     System.out.println(emeller);
                     System.out.println("**********************************");
                     
                     while(true){
                    System.out.print("Yonetici islemini daxil edin:");
                    String emel = scan.nextLine();
                    if(emel.equals("q")){
                        System.out.println("Proqramdan cixilir...");
                        break;
                    }
                    else if(emel.equals("1")){
                        System.out.print("Zam miqdarini daxil edin:");
                        int zam_miqdari = scan.nextInt();
                        yonetici.zam_yap(zam_miqdari);
                    }
                    else if(emel.equals("2")){
                        yonetici.bilgileri_goster();
                    }
                    else{
                        System.out.println("Yanlis islem.....");
                       
                    }
                }
                
                
            }
            else{
                System.out.println("Gecersiz islem");
            }
        }
      
        
    }
}
