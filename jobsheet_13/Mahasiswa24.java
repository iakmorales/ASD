package jobsheet_13;

public class Mahasiswa24 {

    String nama;
    String nim;
    String kelas;
    double ipk;
    
    public Mahasiswa24() {
    }

    public Mahasiswa24(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM:" + this.nim + " " + "Nama: " + this.nama + " " 
        + "Kelas: " + this.kelas + " " 
        + "IPK: " + this.ipk);
    }
}