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
public class DataMahasiswa {
   public String nama;
   public String NIM;
   public double IP;
   public String jurusan;
 

   
  public void displaymessage(){
            System.out.println("nama anda    : "+nama);
            System.out.println("NIM anda     : "+NIM);
            System.out.println("IP anda      : "+IP);
           
            System.out.println("jurusan anda : "+jurusan);
  }    
       public double jumlahIP(){
           if (IP >3 && IP<=4){
               System.out.println("SKS yang bisa anda ambil semester ini adalah sebanyak 24 SKS");
           
           }else if(2.99<=IP && IP> 2.50){
                 System.out.println("SKS yang bisa anda ambil di semester ini adalah sebanyak 19 sampai 21 SKS");      
                       }
               else if (2.49<= IP && IP> 2.00){
                  System.out.println("SKS yang bisa anda ambil di semester ini adalah sebanyak 16-18 SKS ");
               }
               else if (1.99<= IP && IP> 1.50){
                   System.out.println("SKS yang bisa anda ambil di semester ini adalah sebanyak 12-15 sks");
               }
               else  {
                System.out.println("maaf,anda hanya bisa mengambil SKS kurang dari 12");
       }
           
       
           return IP;
               }
      public void MatKul(){
          System.out.println("DAFTAR MATA KULIAH YANG ADA DI SISTEM INFORMASI");
          System.out.println("MAT-KUL                            KODE ");
          System.out.println("1.BAHASA INDONESIA                  001 ");
          System.out.println("2.PEMROGRAMAN LANJUT                002 ");
          System.out.println("3.SISTEM FUNGSIONAL BISNIS          003 ");
          System.out.println("4.SISTEM OPERASI                    004 ");
          System.out.println("5.INTERAKSI MANUSIA DENGAN KOMPUTER 005 ");
      }
    
    }
           

 

     
  
   
   
   

