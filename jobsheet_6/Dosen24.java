package jobsheet_6;

public class Dosen24 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen24(){

    }

    Dosen24(String kd, String name, Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode : "+ kode);
        System.out.println("Nama : "+ nama);
        System.out.println("Jenis Kelamin : "+ jenisKelamin);
        System.out.println("Usia : "+ usia);
    }
}
