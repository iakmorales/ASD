package jobsheet_10;

public class MahasiswaKRS {
    String nim;
    String nama;

    public MahasiswaKRS(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void tampil() {
        System.out.println("NIM : " + nim + ", Nama : " + nama);
    }
}
