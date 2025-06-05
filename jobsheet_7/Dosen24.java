public class Dosen24 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    Dosen24(){

    }

    Dosen24(String kd, String name, String jk, int age){
        kode = kd;
        nama = name;
        this.jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode : "+ kode);
        System.out.println("Nama : "+ nama);
        System.out.println("Jenis Kelamin : "+ jenisKelamin);
        System.out.println("Usia : "+ usia);
    }
}
