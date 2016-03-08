package pratikum1;
public class dataMhs {
    public dataMatKul[] matakuliah = new dataMatKul[25];
    public String NIM;
    public String nama;
    public String jurusan;
    public double IP;
    public int sksmax;
    public int sksmin;
    public int sksskrg;
    public int jlhMatKul;
    dataMhs(String NIM, String nama, String jurusan, double IP){
        this.NIM = NIM;
        this.nama = nama;
        this.jurusan = jurusan;
        this.IP = IP;
        if (IP >= 3.00 && IP <=4) {
            this.sksmin = 22;
            this.sksmax = 24;
        }
        else if (IP >= 2.50) {
            this.sksmin = 19;
            this.sksmax = 21;
        }
        else if (IP >= 2.00) {
            this.sksmin = 16;
            this.sksmax = 18;
        }
        else if (IP >= 1.50) {
            this.sksmin = 12;
            this.sksmax = 15;
        }
        else {
            this.sksmin = 1;
            this.sksmax = 12;
        }
    }
    public void buatmatkul(int id, String kode, int sks, String nama){
        sksskrg += sks;
        if (sksskrg < sksmax) {
            matakuliah[jlhMatKul] = new dataMatKul(kode,sks,nama);
            jlhMatKul++; 
            System.out.println("Mata Kuliah "+ nama +" ("+sks+" SKS) dapat ditambahkan! ");
            System.out.println("Sisa SKS : "+ (sksmax-sksskrg));
        }
        else {
            sksskrg -= sks;
            System.out.println("Mata Kuliah "+ nama +" ("+sks+" SKS) tidak dapat ditambahkan! ");
            System.out.println("ERROR! Sisa SKS tidak mencukupi! (Sisa SKS :"+ (sksmax-sksskrg)+")");
        }
}
    public void displayMessage(){
        String table = "| %-6s | %-28s | %5s      | %n";
        System.out.println("Nama : "+ nama);
        System.out.println("NIM  : "+ NIM);
        System.out.println("Fakultas : "+ jurusan);
        System.out.println("IP : "+IP);
        System.out.println("SKS Maksimal : "+sksmax);
        System.out.println("Jumlah SKS yang diambil : "+sksskrg);
        System.out.println("\n");
        System.out.println("==================== DAFTAR MATA KULIAH ====================");
        System.out.printf("|  Kode  |       Nama Mata Kuliah       | Jumlah SKS |\n");
        System.out.printf("+--------+------------------------------+------------+\n");
        for (int i = 0; i < jlhMatKul; i++) {
            System.out.printf(table, matakuliah[i].KODEmatkul, matakuliah[i].NAMAmatkul, matakuliah[i].jlhSKS);
        }
        System.out.printf("+--------+------------------------------+------------+\n");
        System.out.println(" ");
    }
}