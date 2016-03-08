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
        
            System.out.println("=======================================");
            System.out.print("Masukkan Jumlah Mata Kuliah: ");
            int jml = input.nextInt();
            for (int i = 0 ; i<jml ; i++){
             System.out.print("Masukkan Mata Kuliah   : ");
             sistem.matkul = input.next();
             System.out.print("Masukkan Kode          : ");
             sistem.kodeMatkul = input.next();
             sistem.setMatkul(sistem.matkul, sistem.kodeMatkul);}
            
            System.out.print("Masukan IP              : ");
            sistem.IP = input.nextDouble();
            System.out.print("Masukan SKS             : ");
            sistem.SKS = input.nextDouble();
            sistem.setIP(sistem.IP, sistem.SKS);
        
        SIAM sistem1 = new SIAM();
        
            System.out.println("==SISTEM INFORMASI AKADEMIK MAHASISWA==");
            System.out.print("Masukkan Nama Mahasiswa: ");
            sistem1.nama = input.next();
            System.out.print("Masukkan NIM           : ");
            sistem1.nim = input.next();
            System.out.print("Masukkan Jurusan       : ");
            sistem1.jurusan = input.next();
            sistem1.setData(sistem1.nama, sistem1.nim,  sistem1.jurusan);
        
            System.out.println("=======================================");
            System.out.print("Masukkan Jumlah Mata Kuliah: ");
            jml = input.nextInt();
            for (int i = 0 ; i<jml ; i++){
             System.out.print("Masukkan Mata Kuliah   : ");
             sistem1.matkul = input.next();
             System.out.print("Masukkan Kode          : ");
             sistem1.kodeMatkul = input.next();
             sistem1.setMatkul(sistem1.matkul, sistem1.kodeMatkul);}
            
            System.out.print("Masukan IP              : ");
            sistem1.IP = input.nextDouble();
            System.out.print("Masukan SKS             : ");
            sistem1.SKS = input.nextDouble();
            sistem1.setIP(sistem1.IP, sistem1.SKS);
            
        
    }
    
}
