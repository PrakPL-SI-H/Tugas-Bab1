package PL_SoalLap1;

public class daftarmatkul {

    public int kodee;

    public int sks() {

        if (kodee == 1) {
            System.out.println("5");
        } else if (kodee == 2) {
            System.out.println("4");
        } else if (kodee == 3) {
            System.out.println("3");
        } else if (kodee == 4) {
            System.out.println("2");
        } else {
            System.out.println("Wrong");
        }
        return kodee;
    }

    public int kodee() {

        if (kodee == 1) {
            System.out.println("Pemrogaman Lanjut ");
        } else if (kodee == 2) {
            System.out.println("Sistem Operasi");
        } else if (kodee == 3) {
            System.out.println("Interaksi Manusia dan Komputer");
        } else if (kodee == 4) {
            System.out.println("Sistem Fungsional dan Bisnis");
        } else {
            System.out.println("Wrong");
        }
        return kodee;
    }

}
