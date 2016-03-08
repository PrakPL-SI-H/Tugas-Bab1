package prakproglan;

public class Mahasiswa {

    public String nama;
    public String nim;
    public String jurusan;
    public double ip;
    
    
    public double ipk(){
        if(4.0 >= ip && ip >= 3.0){
            System.out.println("Anda bisa mengambil maksimal 24 SKS");
    }
        else if(2.99 >= ip && ip >= 2.5){
            System.out.println("Anda bisa mengambil maksimal 21 SKS");
    }
        else if(2.00 >= ip && ip <= 2.49 ){
            System.out.println("Anda bisa mengambil maksimal 18 SKS");
        }
        else if(1.50 >= ip && ip <= 1.99){
            System.out.println("Anda bisa mengambil maksimal 15 SKS");
        }
        else if(1.50 < ip){
            System.out.println("Anda bisa mengambil maksimal 12 SKS");
    }
        System.out.print("Dengan IP ");
        return ip;
    }
    
    public void mataKuliah(){
        System.out.println("      Mata Kuliah          | Kode Mata Kuliah |");
        System.out.println("1. Bahasa Indonesia        |         1        |");
        System.out.println("2. Sistem Fungsional Bisnis|         2        |");
        System.out.println("3. Sistem Operasi          |         3        |");
        System.out.println("4. Pemrograman Lanjut      |         4        |");
        System.out.println("5. IMK                     |         5        |");
    }
    
    public void tampilkan(){
        System.out.println("");
        System.out.println("Mahasiswa bernama "+nama);
        System.out.println("Dengan NIM "+nim);
    }
}
