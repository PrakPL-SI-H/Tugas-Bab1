package PL_SoalLap1;

public class Data {

    public String name;
    public String nim;
    public String jurusan;
    public double ipk;
    public String codemat;
    public String namemat;
public int ipks;
    public void nama() {
        String nama = name;

    }

    public void nims() {

        String nims = nim;
    }

    public double ipksks() {
        int ipksks = ipks;
        if (ipks >= 22 && ipk<= 24) {
            System.out.println("Dapat mengambil :"+ipks +" SKS");
        } else if (ipks >= 19 && ipks <= 21) {
            System.out.println("Dapat mengambil :"+ipks +" SKS");
        } else if (ipks>= 12 && ipks<= 15) {
            System.out.println("Dapat mengambil :"+ipks +" SKS");}
        else if (ipks <12){
            System.out.println("Dapat mengambil :"+ipks +" SKS");
        }
        else {
            System.out.println("Wrong");
        }
        return ipks;
    }

    public double ipks() {
        double ipks = ipk;
        if (ipk >= 3.00 && ipk <=4.00) {
            System.out.println("Valid");
        } else if (ipk >= 2.50 && ipk <= 2.99) {
            System.out.println("Valid" );
        } else if (ipk >= 2.00 && ipk <= 2.49) {
            System.out.println("Valid" );
        } else if (ipk >= 1.50 && ipk <= 1.99) {
            System.out.println("Valid");
        } else if (ipk < 1.50) {
            System.out.println("Valid" );
        } else {
            System.out.println("Tidak Sesuai :" );
        }
        return ipk;
    }

    public void jurusans() {
        String jurusans = jurusan;
     
    }

public void displaymessage(){
        System.out.println();
        System.out.println("Mahasiswa yang Bernama : "+name);
        System.out.println("Dengan NIM :"+nim);
        System.out.println("Jurusan :"+jurusan);
  
    
    }

    
}
