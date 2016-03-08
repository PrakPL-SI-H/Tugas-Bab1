import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan Kecepatan Mobil Anda : ");
        int kec1 = in.nextInt();
        in.nextLine();
        m1.setKecepatan(kec1);
        System.out.print("Masukkan Manufaktur Mobil Anda : ");
        String man1 = in.nextLine();
        m1.setManufaktur(man1);
        System.out.print("Masukkan Nomer Plat Mobil Anda : ");
        String noplat1 = in.nextLine();
        m1.setNoPlat(noplat1);
        System.out.print("Masukkan Warna Mobil Anda : ");
        String war1 = in.nextLine();
        m1.setWarna(war1);
        m1.displayMessage();
        System.out.println("================");
        //instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukkan Kecepatan Mobil Anda : ");
        int kec2 = in.nextInt();
        in.nextLine();
        m2.setKecepatan(kec2);
        System.out.print("Masukkan Manufaktur Mobil Anda : ");
        String man2 = in.nextLine();
        m2.setManufaktur(man2);
        System.out.print("Masukkan Nomer Plat Mobil Anda : ");
        String noplat2 = in.nextLine();
        m2.setNoPlat(noplat2);
         System.out.print("Masukkan Warna Mobil Anda : ");
        String war2 = in.nextLine();
        m2.setWarna(war2);
        m2.displayMessage();
        System.out.println("================");
        //merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 di rubah menjadi warna apa? ");
        String war3 = in.nextLine();
        m1.setWarna(war3);
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
}
