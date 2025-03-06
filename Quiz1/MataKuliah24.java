package Quiz1;

public class MataKuliah24 {
    public String kodeMK;
    public String namaMK;
    public int sks;
    public Dosen24[] dosenPengampu;

    public MataKuliah24(String kodeMK, String namaMK, int sks, Dosen24[] dosenPengampu) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    void tampilkanMataKuliah(){
        System.out.println("==================================");
        System.out.println("Data Mata Kuliah");
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS             : " + sks);
        System.out.println("Dosen Pengampu:");
            for (Dosen24 dosen : dosenPengampu) {
                dosen.tampilkanDosen();
            }
    }

    void ubahNamaMK(String namaMKBaru) {
        namaMK = namaMKBaru;
        System.out.println("Nama Mata Kuliah berhasil diubah");
    }

    void ubahSKS(int sksBaru) {
        if (sksBaru < 2) {
            System.out.println("SKS tidak boleh kurang dari 2");
            return;
        }
        sks = sksBaru;
        System.out.println("SKS berhasil diubah");
    }

    void tambahDosen(Dosen24 dosenBaru) {
        Dosen24[] dosenPengampuBaru = new Dosen24[dosenPengampu.length + 1];
        for (int i = 0; i < dosenPengampu.length; i++) {
            dosenPengampuBaru[i] = dosenPengampu[i];
        }
        dosenPengampuBaru[dosenPengampu.length] = dosenBaru;
        dosenPengampu = dosenPengampuBaru;
        System.out.println("Dosen berhasil ditambahkan");
    }

}
