
package OOPpraktikumBAB1;

public class siam2 {
    String nama,nim, jur, mk;
    int  jum, code, sks;
    float ip;
   
    public void aturData(String name, String NIM, String jurusan){
        nama = name;
        nim = NIM;
        jur = jurusan;
    }
    
    public void aturMataKuliah(String MatKul, int kode){
        mk = MatKul;
        code = kode;
    }
            
   public void aturIP(float IP, int SKS){
        ip = IP;
        sks = SKS;
       if ( IP >= 3.0 && SKS >= 22 ){
           System.out.println("data anda benar");
       }
       else if (IP >= 2.5 && IP < 3.0 && SKS < 22){
           System.out.println("data anda benar");
       }
       else if (IP >= 2.0 && IP < 2.5 && SKS < 19){
            System.out.println("data anda benar");
       }
       else if (IP >= 1.5 && IP < 2.0 && SKS < 16){
           System.out.println("data anda benar");
       }
       else if (IP < 1.5 && SKS < 12){
       System.out.println("data anda benar");
       }
       else 
           System.out.println("data anda salah");
   }
   
   
    
    
}
