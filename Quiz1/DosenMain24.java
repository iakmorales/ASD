package Quiz1;
public class DosenMain24 {
    public static void main(String[] args) {
        Dosen24 dosen1 = new Dosen24("1234", "Budi", 2010, "S3", "Teknik Informatika");
        dosen1.tampilkanDosen();
        dosen1.ubahProdi("Sistem Informasi");
        dosen1.tampilkanDosen();

        Dosen24 dosen2 = new Dosen24("5678", "Ani", 2025, "S1", "Sistem Informasi");
        dosen2.tampilkanDosen();
        dosen2.ubahPendidikan("S2");
        dosen2.tampilkanDosen();

        Dosen24 dosen3 = new Dosen24("9101", "Cici", 2020, "S2", "Manajemen Informasi");
        dosen3.tampilkanDosen();
    }
}
