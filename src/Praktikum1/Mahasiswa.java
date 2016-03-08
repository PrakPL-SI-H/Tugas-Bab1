
package Praktikum1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setIpk(int ipk){
        this.ipk = ipk;
    }
    public double getIpk(){
        return ipk;
    }
    public void printData(){
        System.out.println("Nama            = "+nama);
        System.out.println("Nim             = "+nim);
        System.out.println("jurusan         = "+jurusan);
        System.out.println("ipk             = "+ipk);
    }
}
