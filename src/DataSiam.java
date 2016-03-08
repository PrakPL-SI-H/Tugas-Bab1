package PL_SoalLap1;

import java.util.Scanner;

public class DataSiam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data Datax = new Data();
        daftarmatkul daf = new daftarmatkul();
        System.out.println("=== SIAM AMBANG ===");
        System.out.println("Masukan Nama : ");
        Datax.name = in.nextLine();
        System.out.println();
        System.out.println("Masukan NIM   : ");
        Datax.nim = in.nextLine();
        System.out.println();
        System.out.println("Masukan IP   : ");
        Datax.ipk = in.nextDouble();
        Datax.ipks();
        System.out.println();
        System.out.println("Masukan Jumlah SKS yang diambil : ");
        Datax.ipks = in.nextInt();
        Datax.ipksks();
        System.out.println();
        System.out.println("Jurusan :");
        Datax.jurusan = in.nextLine();
        Datax.jurusan = in.nextLine();
        System.out.println();
        String namakul[][] = new String[5][5];
        namakul[0][0] = "Nama Matkul";
        namakul[0][1] = "Kode Matkul";
        namakul[1][0] = "Pemrogaman Lanjut";
        namakul[1][1] = "1";
        namakul[2][0] = "Sistem Operasi";
        namakul[2][1] = "2";
        namakul[3][0] = "Interaksi Manusia dan Komputer";
        namakul[3][1] = "3";
        namakul[4][0] = "Sistem Fungsional dan Bisnis";
        namakul[4][1] = "4";

        System.out.println(namakul[0][0] + "                      || " + namakul[0][1]);
        System.out.println(namakul[1][0] + "                || " + "    " + namakul[1][1]);
        System.out.println(namakul[2][0] + "                   || " + "    " + namakul[2][1]);
        System.out.println(namakul[3][0] + "   || " + "    " + namakul[3][1]);
        System.out.println(namakul[4][0] + "     || " + "    " + namakul[4][1]);

        System.out.println();
        System.out.print("Kode Mata Kuliah : ");
        daf.kodee = in.nextInt();
        daf.kodee();
        System.out.print("Jumlah SKS : ");
        daf.sks();
        System.out.println("====================================================");

        Datax.displaymessage();
        System.out.println("Maka Dengan IPK " + Datax.ipk + " ,Dapat Mengambil :" + Datax.ipks + "SKS");
        System.out.println("");
        System.out.println("====================================================");
        Data Datay = new Data();

        System.out.println("Masukan Nama : ");
        Datay.name = in.nextLine();
        Datay.name = in.nextLine();
        System.out.println();
        System.out.println("Masukan NIM   : ");
        Datay.nim = in.nextLine();
        System.out.println();
        System.out.println("Masukan IP   : ");
        Datay.ipk = in.nextDouble();
        Datay.ipks();
        System.out.println();
        System.out.println("Masukan Jumlah SKS yang diambil : ");
        Datay.ipks = in.nextInt();
        Datay.ipksks();
        System.out.println();
        System.out.println("Jurusan :");
        Datay.jurusan = in.nextLine();
        Datay.jurusan = in.nextLine();
        System.out.println();

        namakul[0][0] = "Nama Matkul";
        namakul[0][1] = "Kode Matkul";
        namakul[1][0] = "Pemrogaman Lanjut";
        namakul[1][1] = "1";
        namakul[2][0] = "Sistem Operasi";
        namakul[2][1] = "2";
        namakul[3][0] = "Interaksi Manusia dan Komputer";
        namakul[3][1] = "3";
        namakul[4][0] = "Sistem Fungsional dan Bisnis";
        namakul[4][1] = "4";

        System.out.println(namakul[0][0] + "                      || " + namakul[0][1]);
        System.out.println(namakul[1][0] + "                || " + "    " + namakul[1][1]);
        System.out.println(namakul[2][0] + "                   || " + "    " + namakul[2][1]);
        System.out.println(namakul[3][0] + "   || " + "    " + namakul[3][1]);
        System.out.println(namakul[4][0] + "     || " + "    " + namakul[4][1]);

        System.out.println();
        System.out.print("Kode Mata Kuliah : ");
        daf.kodee = in.nextInt();
        daf.kodee();
        System.out.print("Jumlah SKS : ");
        daf.sks();
        System.out.println("====================================================");

        Datay.displaymessage();
        System.out.println("Maka Dengan IPK " + Datay.ipk + " ,Dapat Mengambil :" + Datay.ipks + "SKS");
        System.out.println("");
        System.out.println("====================================================");
        Data Dataz = new Data();

        System.out.println("Masukan Nama : ");
        Dataz.name = in.nextLine();
        Dataz.name = in.nextLine();
        System.out.println();
        System.out.println("Masukan NIM   : ");
        Dataz.nim = in.nextLine();
        System.out.println();
        System.out.println("Masukan IP   : ");
        Dataz.ipk = in.nextDouble();
        Dataz.ipks();
        System.out.println();
        System.out.println("Masukan Jumlah SKS yang diambil : ");
        Dataz.ipks = in.nextInt();
        Dataz.ipksks();
        System.out.println();
        System.out.println("Jurusan :");
        Dataz.jurusan = in.nextLine();
        Dataz.jurusan = in.nextLine();
        System.out.println();

        namakul[0][0] = "Nama Matkul";
        namakul[0][1] = "Kode Matkul";
        namakul[1][0] = "Pemrogaman Lanjut";
        namakul[1][1] = "1";
        namakul[2][0] = "Sistem Operasi";
        namakul[2][1] = "2";
        namakul[3][0] = "Interaksi Manusia dan Komputer";
        namakul[3][1] = "3";
        namakul[4][0] = "Sistem Fungsional dan Bisnis";
        namakul[4][1] = "4";

        System.out.println(namakul[0][0] + "                      || " + namakul[0][1]);
        System.out.println(namakul[1][0] + "                || " + "    " + namakul[1][1]);
        System.out.println(namakul[2][0] + "                   || " + "    " + namakul[2][1]);
        System.out.println(namakul[3][0] + "   || " + "    " + namakul[3][1]);
        System.out.println(namakul[4][0] + "     || " + "    " + namakul[4][1]);

        System.out.println();
        System.out.print("Kode Mata Kuliah : ");
        daf.kodee = in.nextInt();
        daf.kodee();
        System.out.print("Jumlah SKS : ");
        daf.sks();
        System.out.println("====================================================");

        Dataz.displaymessage();
        System.out.println("Maka Dengan IPK " + Dataz.ipk + " ,Dapat Mengambil :" + Dataz.ipks + "SKS");
    }

}
