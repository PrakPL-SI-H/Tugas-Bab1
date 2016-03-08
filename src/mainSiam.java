
import java.util.Scanner;

public class mainSiam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        siam s = new siam();
        s.daftarKode();
        System.out.println("  ");

        siam s1 = new siam();
        System.out.print("Masukkan Nama :");
        s1.setNama(in.nextLine());
        System.out.print("Masukkan NIM :");
        s1.setNim(in.nextLine());
        System.out.print("Masukkan Jurusan :");
        s1.setJurusan(in.nextLine());
        System.out.print("Masukkan Kode Mata Kuliah : ");
        s1.setKode(in.nextLine());
        System.out.print("Masukkan nilai IP :");
        s1.setIp(in.nextDouble());
        s1.tampilkan();
        System.out.println(" ");
        siam s2 = new siam();
        System.out.print("Masukkan Nama :");
        s2.setNama(in.nextLine());
        System.out.print("Masukkan NIM :");
        s2.setNim(in.nextLine());
        System.out.print("Masukkan Jurusan :");
        s2.setJurusan(in.nextLine());
        System.out.print("Masukkan Kode Mata Kuliah : ");
        s2.setKode(in.nextLine());
        System.out.print("Masukkan nilai IP :");
        s2.setIp(in.nextDouble());
        s2.tampilkan();
        System.out.println("  ");
        siam s3 = new siam();
        System.out.print("Masukkan Nama :");
        s3.setNama(in.nextLine());
        System.out.print("Masukkan NIM :");
        s3.setNim(in.nextLine());
        System.out.print("Masukkan Jurusan :");
        s3.setJurusan(in.nextLine());
        System.out.print("Masukkan Kode Mata Kuliah : ");
        s3.setKode(in.nextLine());
        System.out.print("Masukkan nilai IP :");
        s3.setIp(in.nextDouble());
        s3.tampilkan();

    }

}
