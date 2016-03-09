package OOPpraktikumBAB1;
import java.util.Scanner;
public class siam1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         
         //orang pertama
         siam2 sam = new siam2();
         
         System.out.println("=<SISTEM INFORMASI AKADEMIK MAHASISWA>=");
         System.out.print("Nama Mahasiswa : ");
         sam.nama = in.nextLine();
         System.out.print("NIM : ");
         sam.nim = in.nextInt();
         System.out.print("Jurusan : ");
         sam.jur = in.nextLine();
         sam.aturData(sam.nama, sam.nim, sam.jur);
         
         System.out.println("===============================");
         System.out.print("Jumlah Mata Kuliah : ");
         sam.jum = in.nextInt();
         
         for (int i=0 ; i<sam.jum ; i++){
             System.out.print("Mata Kuliah : ");
             sam.mk = in.next();
             System.out.print("Kode        : ");
             sam.code = in.nextInt();
         }
         sam.aturMataKuliah(sam.mk, sam.code);
         
         System.out.print("IP       : ");
         sam.ip = in.nextFloat();
         System.out.print("SKS      : ");
         sam.sks = in.nextInt();
         sam.aturIP(sam.ip,sam.sks);
         
         //orang kedua
         siam2 sam2 = new siam2();
         
         System.out.println("=<SISTEM INFORMASI AKADEMIK MAHASISWA");
         System.out.print("Nama Mahasiswa : ");
         sam2.nama = in.nextLine();
         System.out.print("NIM : ");
         sam2.nim = in.nextInt();
         System.out.print("Jurusan : ");
         sam2.jur = in.next();
         sam2.aturData(sam2.nama, sam2.nim, sam2.jur);
         
         System.out.println("===============================");
         System.out.print("Jumlah Mata Kuliah : ");
         sam2.jum = in.nextInt();
         
         for (int i=0 ; i<sam2.jum ; i++){
             System.out.print("Mata Kuliah : ");
             sam2.mk = in.next();
             System.out.print("Kode        : ");
             sam2.code = in.nextInt();
         }
         sam2.aturMataKuliah(sam2.mk, sam2.code);
         
         System.out.print("IP       : ");
         sam2.ip = in.nextFloat();
         System.out.print("SKS      : ");
         sam2.sks = in.nextInt();
         sam2.aturIP(sam2.ip,sam2.sks);
         
         //orang ketiga
         siam2 sam3 = new siam2();
         
         System.out.println("=<SISTEM INFORMASI AKADEMIK MAHASISWA");
         System.out.print("Nama Mahasiswa : ");
         sam3.nama = in.nextLine();
         System.out.print("NIM : ");
         sam3.nim = in.nextInt();
         System.out.print("Jurusan : ");
         sam3.jur = in.next();
         sam3.aturData(sam3.nama, sam3.nim, sam3.jur);
         
         System.out.println("===============================");
         System.out.print("Jumlah Mata Kuliah : ");
         sam3.jum = in.nextInt();
         
         for (int i=0 ; i<sam3.jum ; i++){
             System.out.print("Mata Kuliah : ");
             sam3.mk = in.next();
             System.out.print("Kode        : ");
             sam3.code = in.nextInt();
         }
         sam.aturMataKuliah(sam3.mk, sam3.code);
         
         System.out.print("IP       : ");
         sam3.ip = in.nextFloat();
         System.out.print("SKS      : ");
         sam3.sks = in.nextInt();
         sam3.aturIP(sam3.ip,sam3.sks);
    }
}
