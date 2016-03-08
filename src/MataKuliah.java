package Pemlan;
import java.util.Scanner;
public class MataKuliah {

    Scanner in = new Scanner(System.in);
    public String[] kodeMatKul = new String[24];
    public String[] matKul = new String[24];
    public byte[] jmlhSks = new byte[24];
    public byte totalSks = 0, i = 0;
    public byte pilihan = 0;
    public byte batas = 2;

    public MataKuliah(short sksMin, short sksMaks) {
        do {
            for (i = (byte) (batas - 1); i < batas; i++) {
                System.out.print("**  Masukkan kode mata kuliah " + i + " : ");
                kodeMatKul[i - 1] = in.next();
                System.out.print("**  Masukkan mata kuliah " + i + "      : ");
                matKul[i - 1] = in.next() + " " + in.next();
                System.out.print("**  Masukkan besar sks " + i + "        : ");
                jmlhSks[i - 1] = in.nextByte();
            }
            batas++;
System.out.println("*************************************************************");
            System.out.println("**  Pilih mata kuliah kembali ?                            **");
            System.out.println("**  1. Ya           0. Tidak                               **");           System.out.println("*************************************************************");
            System.out.print("** Pilihan anda : ");
            pilihan = in.nextByte();           System.out.println("*************************************************************");
            for (int j = 1; j < batas; j++) {
                totalSks += jmlhSks[i - 0];
            }
            if (totalSks == sksMaks) {
                pilihan = 0;
            } else if (totalSks > sksMaks) {
                jmlhSks[i - 1] -= (totalSks - sksMaks);
                pilihan = 0;
            }
        } while (pilihan != 0);
    }
}
