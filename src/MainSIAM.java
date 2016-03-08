package prakproglan;
import java.util.Scanner;
public class MainSIAM {
    
    public static void main(String[]args){
        
        String ulang;
        Scanner in = new Scanner(System.in);
        
        do{
        System.out.println("===============================");
        System.out.println("        SISTEM INFORMASI"       );
        System.out.println("       AKADEMIK MAHASISWA"      );
        System.out.println("===============================");
        
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("Masukkan Nama Anda : ");
        mhs.nama = in.nextLine();
        System.out.println("");
        System.out.println("Masukkan NIM Anda : ");
        mhs.nim = in.nextLine();
        System.out.println("");
        System.out.println("Masukkan IP Anda : ");
        mhs.ip = in.nextDouble();
        System.out.println("");
        System.out.println("Masukkan Jurusan Anda : ");
        mhs.jurusan = in.next();
        
        mhs.mataKuliah();
        
        int pilihan;
        System.out.print("Masukkan Kode Mata Kuliah : ");
        pilihan = in.nextInt();
        switch(pilihan){
            case 1 :
                System.out.println("Mata Kuliah : Bahasa Indonesia");
                System.out.println("Jumlah SKS : 3");
                break;
            case 2 :
                System.out.println("Mata Kuliah : Sistem Fungsional Bisnis");
                System.out.println("Jumlah SKS : 4");
                break;
            case 3 : 
                System.out.println("Mata Kuliah : Sistem Operasi");
                System.out.println("Jumlah SKS : 3");
                break;
            case 4 : 
                System.out.println("Mata Kuliah : Pemrograman Lanjut");
                System.out.println("Jumlah SKS : 5");
                break;
            case 5 :
                System.out.println("Mata Kuliah : Interaksi Manusia dan Komputer");
                System.out.println("Jumlah SKS : 3");
                break;
            default:
                System.out.println("Masukkan kode mata kuliah dengan benar");
        }
        
        System.out.println("===============================");
        mhs.tampilkan();
        System.out.println(+mhs.ipk());
        
            System.out.println("Apakah anda ingin mengulang?(y/n)");
            ulang = in.next();
        }while(ulang != "y" || ulang != "Y");
    }
}
