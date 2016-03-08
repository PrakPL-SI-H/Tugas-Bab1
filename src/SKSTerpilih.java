/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_jawaban_laporan;

/**
 *
 * @author TEGAR
 */
public class SKSTerpilih {
    public String matkul;
    public int SKS;
    public int jumlahSKS;
    public double IP;
    int SKS1=24;
    int SKS2=21;
    int SKS3=18;
    int SKS4=15;
    public double jumlahIP(){
           if (IP >3 && IP<=4){
               System.out.println("SKS yang bisa anda ambil semester ini adalah sebanyak 24 SKS");
           
           }else if(2.99<=IP && IP> 2.50){
                 System.out.println("SKS yang bisa anda ambil di semester ini adalah sebanyak 21 SKS");      
                       }
               else if (2.49<= IP && IP> 2.00){
                  System.out.println("SKS yang bisa anda ambil di semester ini adalah sebanyak 18 SKS ");
               }
               else if (1.99<= IP && IP> 1.50){
                   System.out.println("SKS yang bisa anda ambil di semester ini adalah sebanyak 15 sks");
               }
               else  {
                System.out.println("maaf,anda hanya bisa mengambil SKS kurang dari 12");
       }
           
       
           return IP;
               }
    
     public void MatKul(){
          System.out.println("DAFTAR MATA KULIAH YANG ADA DI SISTEM INFORMASI");
          System.out.println("MAT-KUL                            KODE          SKS");
          System.out.println("1.BAHASA INDONESIA                  001           3 ");
          System.out.println("2.PEMROGRAMAN LANJUT                002           5 ");
          System.out.println("3.SISTEM FUNGSIONAL BISNIS          003           4 ");
          System.out.println("4.SISTEM OPERASI                    004           4 ");
          System.out.println("5.INTERAKSI MANUSIA DENGAN KOMPUTER 005           3 ");
     }
          public double jumlahSKSToT(){
           if (IP >3 && IP<=4 && SKS <=24){
               System.out.println("SKS yang untuk ambil matakuliah semester ini tersisa "+(SKS1-SKS)+"SKS");
           
           }else if(2.99<=IP && IP> 2.50 && SKS <=21){
                 System.out.println("SKS yang untuk ambil matakuliah semester ini tersisa "+(SKS2-SKS)+"SKS");   
                       }
               else if (2.49<= IP && IP> 2.00 &&SKS <=18){
                  System.out.println("SKS yang untuk ambil matakuliah semester ini tersisa "+(SKS3-SKS)+"SKS");
               }
               else if (1.99<= IP && IP> 1.50 && SKS<=15){
                   System.out.println("SKS yang untuk ambil matakuliah semester ini tersisa "+(SKS4-SKS)+"SKS");
               }
               else  {
                System.out.println("maaf,anda tidak bisa mengambil SKS sebanyak itu");
       }
           
       
           return IP;
               }
               }


