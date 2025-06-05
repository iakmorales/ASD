package jobsheet_10;
public class AntrianKRS {
    MahasiswaKRS[] data;
    int front, rear, size, max;
    int totalDiproses = 0;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new MahasiswaKRS[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void menambahAntrian(MahasiswaKRS mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void panggilAntrian() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, belum bisa dipanggil.");
            return;
        }
        for (int i = 0; i < 2 && size > 0; i++) {
            MahasiswaKRS mhs = data[front];
            System.out.print("Memproses: ");
            mhs.tampil();
            front = (front + 1) % max;
            size--;
            totalDiproses++;
        }
    }

    public void tampilkanSemuaAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian:");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % max;
            data[idx].tampil();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size < 1) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < Math.min(2, size); i++) {
            int idx = (front + i) % max;
            data[idx].tampil();
        }
    }

    public void tampilkanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir:");
            data[rear].tampil();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void cetakJumlahProses() {
        System.out.println("Jumlah mahasiswa yang telah diproses: " + totalDiproses);
    }

    public void cetakBelumProses() {
        int sisa = 30 - totalDiproses;
        System.out.println("Sisa mahasiswa yang belum diproses (maks 30): " + sisa);
    }
}

