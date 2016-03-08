//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H
package mainsiam;

public class Siam {

    int i;
    String namamhs[] = new String[99];
    String nimmhs[] = new String[99];
    double ip[] = new double[99];
    String jurusan[] = new String[99];
    int kodematkul[] = new int[99];
    String namamatkul[] = new String[99];
    int jmlhsks[] = new int[99];
    String ceknamamhs;
    String ceknimmhs;
    String ceknamamhs2;
    String ceknimmhs2;

    void daftarSiam(int i, String namamhs, String nimmhs, double ip, String jurusan) {
        this.namamhs[i] = namamhs;
        this.nimmhs[i] = nimmhs;
        this.ip[i] = ip;
        this.jurusan[i] = jurusan;
    }

    void loginSiam(int i, int kodematkul, String namamatkul, int jmlhsks) {
        for (int a = 0; a < 100; a++) {
            if (namamhs[a] == ceknamamhs && nimmhs[a] == ceknimmhs) {
                i = a;
                System.out.println("Selamat datang " + this.namamhs[a]);
                this.kodematkul[i] = kodematkul;
                this.namamatkul[i] = namamatkul;
                this.jmlhsks[i] = jmlhsks;
            }
        }
    }

    void cetakSiam() {
        for (int a = 0; a < 100; a++) {
            if (namamhs[a] == ceknamamhs2 && nimmhs[a] == ceknimmhs2) {
                i = a;
                System.out.println("DATA MAHASISWA");
                System.out.println("Nama : "+namamhs[i]);
                System.out.println("NiIM : "+nimmhs[i]);
                System.out.println("IP : "+ip[i]);
                System.out.println("Jurusan : "+jurusan[i]);
                System.out.println("Kode matkul : "+kodematkul[i]);
                System.out.println("Nama matkul : "+namamatkul[i]);
                System.out.println("Jumlah sks : "+jmlhsks[i]);
            }

        }
    }
}