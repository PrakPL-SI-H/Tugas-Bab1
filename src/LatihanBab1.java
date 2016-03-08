import java.util.Scanner;        
    //class yang akan digunakan dalam main methd
    class SIAM{
    //atribute dari kelas
    String nama,nim,jurusan, kode,matkul;
    double IP,SKS;
    //method untuk inisialisasi paramater dengan atribute
    public void NrBioD (String nama, String nim, String Jurusan){
        this.nama = nama;
        this.nim = nim;     
        this.jurusan = Jurusan;
    }
    //method untuk inisialisasi paramater dengan atribute
    public void NrMatkul (String Kode, String Matkul){
        this.kode = Kode;
        this.matkul = Matkul;
    }
    //method untuk inisialisasi paramater dengan atribute 
    
    public void NrIP (double ip, double sks){
        this.IP = ip;
        this.SKS = sks;
    //seleksi kondisi untuk digunakan pada main method    
     if ( ip >=3.0 && sks >= 22  ){
            System.out.println("Valid");        }
        else if ( ip >=2.5 && ip <3.0 && sks <= 19  ){
            System.out.println("Valid");        }
        else if ( ip >=2.0 && ip <2.5 && sks <= 16  ){
            System.out.println("Valid");        }
        else if ( ip >=1.5 && ip <2.0 && sks <= 12  ){
            System.out.println("Valid");        }
        else if ( ip <1.5 && sks <12  ){
            System.out.println("Valid");        }
        else {
            System.out.println("Tidak Valid");
    }
            }
    }

public class LatihanBab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //inisialisasi obect Profile1 dalam class SIAM
        SIAM Profile1 = new SIAM ();
        //sistem perulangan untuk memasukkan 3 data mahasiswa
        for(int i=0; i<3; i++){        
        //Syntax untuk memasukkan data diri
        System.out.println("--====Selamat Datang Di SIAM(Sistem Informasi Akdamik Mahasiswa)====--");
        System.out.print("Masukkan Nama              : ");
        Profile1.nama=in.next();
        System.out.print("Masukkan NIM               : ");
        Profile1.nim = in.next();
        System.out.print("Masukka Jurusan            : ");
        Profile1.jurusan = in.next();         
        System.out.println();
        System.out.print("Masukkan IP Semester lalu : ");
        Profile1.IP = in.nextDouble();
        //Syntax untuk memasukkan informasi Mata Kuliah
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int Matkul = in.nextInt();
        for (int n = 0 ; n<Matkul ; n++){      
        System.out.print("Masukkan Mata Kuliah       : ");
        Profile1.matkul = in.next();
        System.out.print("Masukkan Kode              : ");
        Profile1.kode = in.next();  
        }
        System.out.print("Masukkan SKS                : ");    
        Profile1.SKS = in.nextDouble();     
        Profile1.NrIP(Profile1.IP, Profile1.SKS);
        System.out.println();  
        }
    }
}
