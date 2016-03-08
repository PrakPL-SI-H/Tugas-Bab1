package MuhAsdar;

public class DataMahasiswa {

    MataKuliah krsmhs = new MataKuliah();
    String username;
    String mhs[][] = {{"Muh. Asdar", "155150400111130", "Sistem Informasi"},
    {"Tom Cruise", "155150400111131", "Sistem Informasi"},
    {"Katy Perry", "155150400111132", "Sistem Informasi"},
    {"Kate Middleteon", "15515040011133", "Sistem Informasi"}};

    public void showData() {
        System.out.println("\tData Mahasiswa");
        for (int i = 0; i < mhs.length; i++) {
            if (username.equals(mhs[i][1])) {
                System.out.println("Nama    = " + mhs[i][0]);
                System.out.println("Nim     = " + mhs[i][1]);
                System.out.println("Jurusan = " + mhs[i][2]);
            }
        }
    }

    public void showKrs() {
        System.out.println("\tKaertu Rencana Studi");
        System.out.println("No  Kode   Nama Mata Kuliah\t\t SKS");
        for (int i = 0; i < 5; i++) {
            if (krsmhs.matkulambil[i].equalsIgnoreCase(krsmhs.matkul[i][0])) {
                System.out.printf((i + 1) + "   %-7s%-30s %s\n", krsmhs.matkul[i][0], krsmhs.matkul[i][1], krsmhs.sksmatkul[i]);
            }
        }
    }
}
