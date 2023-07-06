/* Fiby Naya Sari - Nadya Mahza Khairani 
227064516069 - 227064516102 */

package gaji;
public class Karyawan {
    String nip, nama, jk;
    int jmlHari, totalGaji;
    
    void karyawan(String nip, String nama, String jk){
        this.nip = nip;
        this.nama = nama;
        this.jk = jk;
        System.out.println("nip : " + nip);
        System.out.println("nama : " + nama);
        System.out.println("jenis kelamin : " +jk);
    }
    void absenKerja(){
        System.out.println("absen kerja : " + jmlHari);
    }
    void hitungGaji(){
        System.out.println("total gaji : " + totalGaji);
    }
    void hitungGaji(int jmlHari){
        this.jmlHari = jmlHari;
        System.out.println("jumlah hari : " + jmlHari);
        this.totalGaji = jmlHari * 50000;        
    }
}

class Dosen extends Karyawan{
    String gol;
    int jmlSks, upahPerSks;
    
    @Override 
    void hitungGaji(){
        int totalGaji = upahPerSks * jmlSks * jmlHari;
        System.out.println("total gaji dosen: " + totalGaji);
    }
}

class Staff extends Karyawan{
    
}