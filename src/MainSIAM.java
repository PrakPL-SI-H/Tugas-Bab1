
import java.util.Scanner;

public class MainSIAM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SIAM m1 = new SIAM();
        System.out.print("Input Nama: ");
        m1.nama = in.nextLine();
        System.out.print("Input NIM: ");
        m1.nim = in.next();
        System.out.print("Input Jurusan: ");
        m1.jur = in.next();
        System.out.print("Input IP(semester lalu): ");
        m1.ip = in.nextDouble();
        m1.rangeSKS();
        System.out.println("Jumlah SKS yang dapat diambil : " + m1.min + "-" + m1.max + " SKS");
        for (int i = 0; i < 5; i++) {
            System.out.print("Input Mata Muliah: ");
            m1.matkul[i] = in.next();
            System.out.print("Kode Matkul: ");
            m1.kode[i] = in.next();
            System.out.print("SKS Matkul: ");
            m1.sksmatkul[i] = in.nextInt();
            m1.totalsks = m1.totalsks + m1.sksmatkul[i];
            if (m1.totalsks >= m1.min && m1.totalsks <= m1.max) {
                i=5;
            }
        }
        System.out.println("Data telah disimpan Terima kasih...");
        m1.cetakData();
        
        SIAM m2 = new SIAM();
        System.out.print("Input Nama: ");
        m2.nama = in.next();
        System.out.print("Input NIM: ");
        m2.nim = in.next();
        System.out.print("Input Jurusan: ");
        m2.jur = in.next();
        System.out.print("Input IP(semester lalu): ");
        m2.ip = in.nextDouble();
        m2.rangeSKS();
        System.out.println("Jumlah SKS yang dapat diambil : " + m2.min + "-" + m2.max + " SKS");
        for (int i = 0; i < 5; i++) {
            System.out.print("Input Mata Muliah: ");
            m2.matkul[i] = in.next();
            System.out.print("Kode Matkul: ");
            m2.kode[i] = in.next();
            System.out.print("SKS Matkul: ");
            m2.sksmatkul[i] = in.nextInt();
            m2.totalsks = m2.totalsks + m2.sksmatkul[i];
            if (m2.totalsks >= m2.min && m2.totalsks <= m2.max) {
                i=5;
            }
        }
        System.out.println("Data telah disimpan Terima kasih...");
        m2.cetakData();
        
        SIAM m3 = new SIAM();
        System.out.print("Input Nama: ");
        m3.nama = in.next();
        System.out.print("Input NIM: ");
        m3.nim = in.next();
        System.out.print("Input Jurusan: ");
        m3.jur = in.next();
        System.out.print("Input IP(semester lalu): ");
        m3.ip = in.nextDouble();
        m3.rangeSKS();
        System.out.println("Jumlah SKS yang dapat diambil : " + m3.min + "-" + m3.max + " SKS");
        for (int i = 0; i < 5; i++) {
            System.out.print("Input Mata Muliah: ");
            m3.matkul[i] = in.next();
            System.out.print("Kode Matkul: ");
            m3.kode[i] = in.next();
            System.out.print("SKS Matkul: ");
            m3.sksmatkul[i] = in.nextInt();
            m3.totalsks = m3.totalsks + m3.sksmatkul[i];
            if (m3.totalsks >= m3.min && m3.totalsks <= m3.max) {
                i=5;
            }
        }
        System.out.println("Data telah disimpan Terima kasih...");
        m3.cetakData();
    }
}
