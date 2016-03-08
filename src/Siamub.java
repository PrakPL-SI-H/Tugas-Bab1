package Pemlan;
public class Siamub {
    public String nama;
    public long nim;
    public String programStudi;
    public byte sksMin, sksMaks;
    public float ip;
    public MataKuliah inMataKuliah;

    public void sksDapatDiambil() {
        if (ip < 1.50 && ip >= 0) {
            sksMin = 0;
            sksMaks = 11;
             System.out.println("**  Peraturan terkait IP : Anda boleh mengambil <12 SKS    **");
        } else if (ip < 2.00) {
            sksMin = 12;
            sksMaks = 15;
            System.out.println("**  Peraturan terkait IP : Anda boleh mengambil 12-15 SKS  **");
        } else if (ip < 2.50) {
            sksMin = 16;
            sksMaks = 18;
            System.out.println("**  Peraturan terkait IP : Anda boleh mengambil 16-18 SKS  **");
        } else if (ip < 3) {
            sksMin = 19;
            sksMaks = 21;
            System.out.println("**  Peraturan terkait IP : Anda boleh mengambil 19-21 SKS  **");
        } else if (ip <= 4) {
            sksMin = 22;
            sksMaks = 24;
            System.out.println("**  Peraturan terkait IP : Anda boleh mengambil 22-24 SKS  **");
        }
    }
}
