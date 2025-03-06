package Quiz1;

public class Dosen24 {
    public String nidn;
    public String nama;
    public int tahunMasuk;
    public String jenjangPendidikan;
    public String prodi;

    public Dosen24(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }

    void tampilkanDosen() {
        System.out.println("-----------------------------");
        System.out.println("Data Dosen");
        System.out.println("NIDN               : " + nidn);
        System.out.println("Nama               : " + nama);
        System.out.println("Tahun Masuk        : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Program Studi      :" + prodi);
        System.out.println("-----------------------------");
    }

    void ubahProdi(String prodiBaru) {
        prodi = prodiBaru;
        System.out.println("Prodi berhasil diubah");
    }

    void ubahPendidikan(String jenjangPendidikanBaru) {
        jenjangPendidikan = jenjangPendidikanBaru;
        System.out.println("Jenjang pendidikan berhasil diubah");
    }
}
