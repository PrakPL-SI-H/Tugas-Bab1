package PraktikumSIH;
import java.util.Scanner;
public class MainSIAM {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        SIAM mhs1 = new SIAM();
        for (int i=0; i<3; i++) {
            System.out.print("Nama              :");
            String nama = in.next();
            System.out.print("NIM               :");
            double nim = in.nextDouble();
            System.out.print("Jurusan           :");
            String jurusan = in.next();
            System.out.print("IP                :");
            double ip = in.nextDouble();
            System.out.print("Kode Mata Kuliah  :");
            String km = in.next();
            mhs1.setNama(nama);
            mhs1.setNIM(nim);
            mhs1.setJurusan(jurusan);
            mhs1.setIP(ip);
            mhs1.setKodematkul(km);
            mhs1.displayData();
        }
    }
}
