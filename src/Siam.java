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

    void cetakSiam(int a) {
        this.i = a;
        System.out.println("");
        System.out.println("DATA MAHASISWA");
        System.out.println("Nama : " + namamhs[i]);
        System.out.println("NIM : " + nimmhs[i]);
        System.out.println("IP : " + ip[i]);
        System.out.println("Jurusan : " + jurusan[i]);
        System.out.println("Kode matkul : " + kodematkul[i]);
        System.out.println("Nama matkul : " + namamatkul[i]);
        System.out.println("Jumlah sks : " + jmlhsks[i]);
        System.out.println("");
    }

}