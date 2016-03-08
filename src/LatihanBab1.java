import java.util.Scanner;
class SIAM{
    String nama, nim, jurusan, kodeMatkul, matkul;;
    double IP, SKS;
    
    public void setData( String Nama, String Nim, String Jurusan ){
        Nama = nama;
        Nim = nim;
        Jurusan = jurusan;
    }
    public void setMatkul ( String Kode, String Matkul){
        Kode = kodeMatkul;
        Matkul = matkul;
    }
    public void setIP ( double IndexPres, double jmlSKS ){
        IndexPres = IP;
        jmlSKS = SKS;
        if ( IndexPres >=3.0 && jmlSKS >= 22  ){
            System.out.println("Valid");
        }
        else if ( IndexPres >=2.5 && IndexPres <3.0 && jmlSKS <= 19  ){
            System.out.println("Valid");
        }
        else if ( IndexPres >=2.0 && IndexPres <2.5 && jmlSKS <= 16  ){
            System.out.println("Valid");
        }
        else if ( IndexPres >=1.5 && IndexPres <2.0 && jmlSKS <= 12  ){
            System.out.println("Valid");
        }
        else if ( IndexPres <1.5 && jmlSKS <12  ){
            System.out.println("Valid");
        }
        else {
            System.out.println("Tidak Valid");
        }
    }
}
public class LatihanBab1 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SIAM sistem = new SIAM();
        
            System.out.println("==SISTEM INFORMASI AKADEMIK MAHASISWA==");
            System.out.print("Masukkan Nama Mahasiswa: ");
            sistem.nama = input.next();
            System.out.print("Masukkan NIM           : ");
            sistem.nim = input.next();
            System.out.print("Masukkan Jurusan       : ");
            sistem.jurusan = input.next();
            sistem.setData(sistem.nama, sistem.nim,  sistem.jurusan);
        
        
    }
    
}
