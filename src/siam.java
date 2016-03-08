
public class siam {
    private String nama;
    private String nim;
    private double ip ;
    private String sks;
    private String jurusan;
    private String kode;
    public void setNama (String name){
        nama = name;
    }
    public void setNim (String n){
        nim = n;
    }
    public void setIp(double i){
        ip=i;
        if (ip >= 3.00&&ip<=4.00){
            sks="22-24";
        }
        else if(ip >=2.50 && ip<=2.99){
            sks="19-21";
        }
        else if(ip>=2.00&&ip<=2.49){
            sks="16-18";
        }
        else if (ip>=1.50&&ip<=1.99){
            sks="12-19";
        }
        else if(ip<1.50){
            sks="kurang dari 12";
        }
        else{
            System.out.println("IP yang diinputkan salah");
        }
   
        
    } public void setJurusan(String j){
        jurusan = j;
    }
    public void setKode(String code){
        kode=code;
        if (code.equals("IFK5002")){
            kode="Pemrograman Lanjut";
        }
        else if("SIF15103".equals(code)){
            kode = "Sistem Fungsional Bisnis";
        }
        else if("PTI15005".equals(code)){
            kode="Interaksi Manusia dan Komputer";
        }
        else if ("PTI15008".equals(code)){
            kode = "Sistem Operasi";
        }
        else if ("UNG4008".equals(code)){
            kode="Bahsa Indonesia";
        }
        else{
            System.out.println("Kode mata kuliah tidak terdaftar,periksa kembali !");
        }
    }
    public void tampilkan(){
        System.out.println(" ");
        System.out.println("=======================================");
        System.out.println("Nama              :"+nama);
        System.out.println("NIM               :"+nim);
        System.out.println("Jurusan           :"+jurusan);
        System.out.println("Nilai IP          :"+ip);
        System.out.println("Mata kuliah       :"+kode);
        System.out.println("Beban Studi(sks)  :"+sks);
        
        
    }
    public void daftarKode(){
        System.out.println("MATA KUIAH                     | KODE");
        System.out.println("-------------------------------+-------------");
        System.out.println("Pemrograman Lanjut             | IFK150001");
        System.out.println("Sistem Fungsional Bisnis       | SIF15103");
        System.out.println("Interaksi Manusia dan Komputer | PTI15005");
        System.out.println("Sistem Operasi                 | PTI15008");
        System.out.println("Bahasa Indonesia               | UNG4008");
    }
    
    
}
