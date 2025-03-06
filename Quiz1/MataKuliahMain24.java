package Quiz1;
public class MataKuliahMain24 {
    public static void main(String[] args) {
        Dosen24[] dosenPengampu = new Dosen24[3];
        dosenPengampu[0] = new Dosen24("1234", "Budi", 2010, "S3", "Teknik Informatika");
        dosenPengampu[1] = new Dosen24("5678", "Ani", 2025, "S2", "Sistem Informasi");
        dosenPengampu[2] = new Dosen24("9101", "Cici", 2020, "S2", "Manajemen Informasi");
        
        MataKuliah24 MK1 = new MataKuliah24("MK001", "Algoritma Struktur Data", 3, dosenPengampu);
        MK1.tampilkanMataKuliah();
        MK1.ubahNamaMK("Basis Data");
        MK1.tampilkanMataKuliah();

        MataKuliah24 MK2 = new MataKuliah24("MK002", "Dasar Pemrogaman", 2, dosenPengampu);
        MK2.tampilkanMataKuliah();
        MK2.ubahSKS(1);
        MK2.tampilkanMataKuliah();

        MataKuliah24 MK3 = new MataKuliah24("MK003", "Pengenalan Sistem Informasi", 2, dosenPengampu);
        MK3.tampilkanMataKuliah();
        MK3.tambahDosen(new Dosen24("1112", "Dewi", 2015, "S1", "Sistem Informasi"));
        MK3.tampilkanMataKuliah();

    }
}
