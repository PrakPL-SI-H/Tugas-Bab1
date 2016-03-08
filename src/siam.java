import java.util.Scanner;

public class siam {

    Scanner input = new Scanner(System.in);

    private String nama;
    private String nim;
    private double ip;
    private String jurusan;

    public void biodata() {
System.out.print("Nama        : ");
nama = input.nextLine();
System.out.print("NIM         : ");
nim = input.nextLine();
for (;;) {
System.out.print("IP terakhir : ");
ip = input.nextDouble();
            if (ip< 0 | ip> 4) {
System.out.println("Andasalahmemasukkan IP!");
            } else {
                break;
            }
        }
System.out.print("Jurusan     : ");
jurusan = input.nextLine();
jurusan = input.nextLine();
System.out.println();
    }

    private String namamatkul;
    private String kodematkul;
    private intsks;

    public void isisks() {
        if (ip>= 3) {
System.out.println("Jumlahbeban SKS : 22-24");
intjmlhsks = 0;
            for (int a = 1;; a++) {
jmlhsks = sks + jmlhsks;
                if (jmlhsks>= 0 &&jmlhsks< 22) {
                    if (jmlhsks == 0) {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
                    } else {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
namamatkul = input.nextLine();
                    }
System.out.print("KodeMatkul : ");
kodematkul = input.nextLine();
System.out.print("SKS Matkul  : ");
sks = input.nextInt();
                } else if (jmlhsks>= 22 &&jmlhsks<= 24) {
System.out.println("Jumlah SKS yang diambil : " + jmlhsks);
                    break;
                } else {
System.out.println("Andasalahmemasukkanjumlahsks");
                    break;
                }
            }
System.out.println("============================");
        }
        if (ip>= 2.5 &ip< 3) {
System.out.println("Jumlahbeban SKS : 19-21");
intjmlhsks = 0;
            for (int a = 1;; a++) {
jmlhsks = sks + jmlhsks;
                if (jmlhsks>= 0 &&jmlhsks< 19) {
                    if (jmlhsks == 0) {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
                    } else {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
namamatkul = input.nextLine();
                    }
System.out.print("KodeMatkul : ");
kodematkul = input.nextLine();
System.out.print("SKS Matkul  : ");
sks = input.nextInt();
                } else if (jmlhsks>= 19 &&jmlhsks<= 21) {
System.out.println("Jumlah SKS yang diambil : " + jmlhsks);
                    break;
                } else {
System.out.println("Andasalahmemasukkanjumlahsks");
                    break;
                }
            }
System.out.println("============================");
        }
        if (ip>= 2 &ip< 2.5) {
System.out.println("Jumlahbeban SKS : 15-18");
intjmlhsks = 0;
            for (int a = 1;; a++) {
jmlhsks = sks + jmlhsks;
                if (jmlhsks>= 0 &&jmlhsks< 15) {
                    if (jmlhsks == 0) {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
                    } else {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
namamatkul = input.nextLine();
                    }
System.out.print("KodeMatkul : ");
kodematkul = input.nextLine();
System.out.print("SKS Matkul  : ");
sks = input.nextInt();
                } else if (jmlhsks>= 15 &&jmlhsks<= 18) {
System.out.println("Jumlah SKS yang diambil : " + jmlhsks);
                    break;
                } else {
System.out.println("Andasalahmemasukkanjumlahsks");
                    break;
                }
            }
System.out.println("============================");
        }
        if (ip>= 1.5 &ip< 2) {
System.out.println("Jumlahbeban SKS : 12-14");
intjmlhsks = 0;
            for (int a = 1;; a++) {
jmlhsks = sks + jmlhsks;
                if (jmlhsks>= 0 &&jmlhsks< 12) {
                    if (jmlhsks == 0) {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
                    } else {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
namamatkul = input.nextLine();
                    }
System.out.print("KodeMatkul : ");
kodematkul = input.nextLine();
System.out.print("SKS Matkul  : ");
sks = input.nextInt();
                } else if (jmlhsks>= 12 &&jmlhsks<= 14) {
System.out.println("Jumlah SKS yang diambil : " + jmlhsks);
                    break;
                } else {
System.out.println("Andasalahmemasukkanjumlahsks");
                    break;
                }
            }
System.out.println("============================");
        }
        if (ip< 1.5) {
System.out.println("Jumlahbeban SKS : <= 12");
intjmlhsks = 0;
            for (int a = 1;; a++) {
jmlhsks = sks + jmlhsks;
                if (jmlhsks>= 0 &&jmlhsks< 10) {
                    if (jmlhsks == 0) {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
                    } else {
System.out.print("NamaMatKul : ");
namamatkul = input.nextLine();
namamatkul = input.nextLine();
                    }
System.out.print("KodeMatkul : ");
kodematkul = input.nextLine();
System.out.print("SKS Matkul  : ");
sks = input.nextInt();
                } else if (jmlhsks>= 10 &&jmlhsks<= 12) {
System.out.println("Jumlah SKS yang diambil : " + jmlhsks);
                    break;
                } else {
System.out.println("Andasalahmemasukkanjumlahsks");
                    break;
                }
            }
System.out.println("============================");
        }
    }
}
