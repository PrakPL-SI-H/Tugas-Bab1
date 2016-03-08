
package prakpemlan1;
import java.util.Scanner;
public class mainPraktikum1 {

    public static void main(String[] args) {
    
   

        Scanner in = new Scanner (System.in);
        Praktikum1 mhs1 = new Praktikum1();
        
        for (int i=0; i<3; i++) {
            System.out.println("SELAMAT DATANG DI SIAM");
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
            mhs1.aturNama(nama);
            mhs1.aturNIM(nim);
            mhs1.aturJurusan(jurusan);
            mhs1.aturIP(ip);
            mhs1.aturKodematkul(km);
            mhs1.displayData();
        }
    }
}
