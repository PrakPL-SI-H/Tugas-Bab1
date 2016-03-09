public class SiamMahasiswa {
    String nama, nim, jurusan;
    double ip;
    int indeks = 0;
    
    SiamMatkul x[] = new SiamMatkul [10];
    
    public String getNama(){
      return nama;
                  }
    
    public void setNama(String nama){
        this.nama = nama;
               }
    
    public String getNim(){
      return nim;
            }
    
    public void setNim(String nim){
      this.nim = nim;
               }
    
      public String getJurusan(){
      return jurusan;
            }
      
      public void setJurusan(String jurusan){
        this.jurusan = jurusan;
               }
    
      public double getIP(){
      return ip;
            }
      
      public void setip(double ip){
        this.ip = ip;
               }
      
      public void setMatkul(String kode) {
          SiamMatkul y = new SiamMatkul(kode);
          x[indeks] = y;
          indeks++;
       }

      void getMatkul (){
          for (int i = 0; i < indeks; i++) {
              System.out.print("Kode mata kuliah  : "+x[i].kodematkul+"\n");
              System.out.print("Mata kuliah       : "+x[i].namamatkul+"\n");
              System.out.print("Jumlah SKS        : "+x[i].sks+"\n\n");
          }
      }
}
