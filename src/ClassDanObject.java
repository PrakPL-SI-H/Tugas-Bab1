package TugasPraktikum;
import java.util.Scanner;
class Mahasiswa {
    String nama, nim, jur;
    String matkul[] = new String[5];    
    String kode[] = new String [5];
    int sksmatkul[] = new int [5];
    int totalsks;
    double ip;
    int min, max;
    
    public void rangeSKS() {        
        if (ip > 3.5) {
            min = 22;
            max = 24;
        } else if (ip < 3.0) {
            min = 18;
            max = 20;
        } else {
            min = 20;
            max = 22;
        }
    }
    public void cetakData() {
        System.out.println("---------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jur);
        System.out.println("IP: " + ip);        
        System.out.println("Mata Kuliah [kode] (SKS): ");
        for (int i = 1; i < 5; i++) {
            System.out.println(matkul[i] + " [" + kode[i] + "] ("+sksmatkul[i]+")");
        }
        System.out.println("Jumlah SKS: " + totalsks);
        System.out.println("---------------------------------");
    }
}

public class ClassDanObject {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Mahasiswa m1 = new Mahasiswa();
        System.out.print("Input Nama: ");
        m1.nama = in.nextLine();
        System.out.print("Input NIM: ");
        m1.nim = in.next();
        System.out.print("Input Jurusan: ");
        m1.jur = in.next();
        System.out.print("Input IP(semester lalu): ");
        m1.ip = in.nextDouble();
        m1.rangeSKS();
        System.out.println("Jumlah SKS yang dapat diambil : "+m1.min+"-"+m1.max+" SKS");
        for(int i =0;i<5;i++){
            m1.totalsks=0;            
            System.out.print("Input Mata Muliah: ");
            m1.matkul[i]=in.next();
            System.out.print("Kode Matkul: ");
            m1.kode[i]=in.next();
            System.out.print("SKS Matkul: ");
            m1.sksmatkul[i]=in.nextInt();
            m1.totalsks += m1.sksmatkul[i];
            if (m1.totalsks>=m1.min&&m1.totalsks<=m1.max){
                break;
            }
        }
        System.out.println("Data telah disimpan Terima kasih...");
        m1.cetakData();
    }
}
