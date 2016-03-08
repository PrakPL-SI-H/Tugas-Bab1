package Modul1_Bab1;

public class MataKuliah {

    String matkulambil [];
    float ip;
    int bebansks[] = new int[2];
    int sksambil = 0;
    String matkul[][] = {{"PL", "Pemrograman Lanjut"},
    {"IMK", "Interaksi Manusia & Komputer"},
    {"SO", "Sistem Operasi"},
    {"SFB", "Sistem Fungsional Bisnis"},
    {"BI", "Bahasa Indo"}};
    int sksmatkul[] = {5, 3, 4, 4, 3};

    public void daftarMatkul() {
        System.out.println("\t Daftar Mata Kuliah");
        System.out.println("No  Kode   Nama Mata Kuliah\t\t SKS");
        for (int i = 0; i < matkul.length; i++) {
            System.out.printf((i + 1) + "   %-7s%-30s %s\n", matkul[i][0], matkul[i][1], matkul[i][2]);
        }
    }

    public void setSks() {
        if (ip >= 3.00) {
            bebansks[0] = 22;
            bebansks[1] = 24;
            System.out.println("");
        } else if (ip >= 2.50) {
            bebansks[0] = 19;
            bebansks[1] = 21;
        } else if (ip >= 2.00) {
            bebansks[0] = 16;
            bebansks[1] = 18;
        } else if (ip >= 1.50) {
            bebansks[0] = 12;
            bebansks[1] = 25;
        } else {
            bebansks[0] = 0;
            bebansks[1] = 11;
        }
    }
    
    public void pilihMatkul(String kode, int i) {
            System.out.println("Masukan Kode Matkul " + i + " = ");
            matkulambil [i] = kode;
        }
    }

