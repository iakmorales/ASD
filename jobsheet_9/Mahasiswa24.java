package jobsheet_9;

public class Mahasiswa24 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa24(){

    }

    Mahasiswa24(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
