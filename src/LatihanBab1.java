import java.util.Scanner;



public class LatihanBab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        
    }
    //class yang akan digunakan dalam main methd
    class SIAM{
    //atribute dari kelas
    String nama,nim,kodematkul,matkul;
    double IP,SKS;
    //method untuk inisialisasi paramater dengan atribute
    public void NrBioD (String nama, String nim){
        this.nama = nama;
        this.nim = nim;     
    }
    //method untuk inisialisasi paramater dengan atribute
    public void NrMatkul (String Kode, String Matkul){
        this.kodematkul = Kode;
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
}
