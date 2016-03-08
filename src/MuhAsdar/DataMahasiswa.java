package MuhAsdar;

public class DataMahasiswa {

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
}
