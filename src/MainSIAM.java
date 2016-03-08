package prakproglan;
import java.util.Scanner;
public class MainSIAM {
    
    public static void main(String[]args){
        
        String nim;
        int passwd;
        Scanner in = new Scanner(System.in);
        
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
        
        
        
        
        
        
    }
}
