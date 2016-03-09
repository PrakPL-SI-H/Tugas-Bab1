package classdanobject.PraktikumPemLan;

import java.util.Scanner;

public class MainMobil {

    public static void main(String[] args) {
//instan objek bernama m1
        Scanner input = new Scanner(System.in);
        Mobil m1 = new Mobil();
        System.out.println("Input Mobil I");
        System.out.print("Masukkan merk mobil: ");
        m1.setManufaktur(input.nextLine());
        System.out.print("Masukkan plat nomor mobil: ");
        m1.setNoPlat(input.nextLine());
        System.out.print("Masukkan warna mobil: ");
        m1.setWarna(input.nextLine());
        System.out.print("Masukkan kecepatan mobil: ");
        int kec = input.nextInt();
        m1.setKecepatan(kec);
        m1.rubahKecepatan(kec);
        System.out.print("Masukkan waktu (dalam jam): ");
        double temp = input.nextDouble();
        m1.setWaktu(temp);
        m1.rubahSekon(temp);
        m1.hitungJarak(kec, temp);
        m1.displayMessage();
        System.out.println("=======================================");
//instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.println("Input Mobil II");
        System.out.print("Masukkan merk mobil: ");input.nextLine();
        m2.setManufaktur(input.nextLine());
        System.out.print("Masukkan plat nomor mobil: ");
        m2.setNoPlat(input.nextLine());
        System.out.print("Masukkan warna mobil: ");
        m2.setWarna(input.nextLine());
        System.out.print("Masukkan kecepatan mobil: ");
        kec = input.nextInt();
        m2.setKecepatan(kec);
        m2.rubahKecepatan(kec);
        System.out.print("Masukkan waktu (dalam jam): ");
        double temp2 = input.nextDouble();
        m2.setWaktu(temp2);
        m2.rubahSekon(temp2);
        m2.hitungJarak(kec, temp2);
        m2.displayMessage();
        System.out.println("=======================================");
//merubah warna dari objek m1
        System.out.print("Ganti warna mobil pertamamu: ");input.nextLine();
        m1.setWarna(input.nextLine());
//menampilkan hasil perubahan
        m1.displayMessage();
    }
}
