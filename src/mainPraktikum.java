package cidro;
import java.util.Scanner;
public class mainPraktikum {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        praktikum mhs1 = new praktikum();
        System.out.println("====SELAMAT DATANG DI SIAM====");
        for (int i=0; i<3; i++) {
            System.out.print("Nama        :");
            String nama = in.next();
            System.out.print("NIM         :");
            String nim = in.next();
            System.out.print("Jurusan     :");
            String jurusan = in.next();
            System.out.print("IP          :");
            double ip = in.nextDouble();
            System.out.print("Mata Kuliah :");
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
