package prakproglan;

public class Mahasiswa {

    public String nama;
    public String nim;
    public String jurusan;
    public double ip;
    
    
    public void ip(double s){
        if(4.0 > ip){
            System.out.println("Anda bisa mengambil maksimal 24 SKS");
    }
        else if(2.99 > ip && ip > 2.5){
            System.out.println("Anda bisa mengambil maksimal 21 SKS");
    }
        else if(2.00 > ip && ip < 2.49 ){
            System.out.println("Anda bisa mengambil maksimal 18 SKS");
        }
        else if(1.50 > ip && ip < 1.99){
            System.out.println("Anda bisa mengambil maksimal 15 SKS");
        }
        else if(1.50 < ip)
            System.out.println("Anda bisa mengambil maksimal 12 SKS");
}
}
