public class queueTransaksi {
    TransaksiPengisian[] transaksi;
    int front, rear, size, capacity;

    public queueTransaksi(int capacity) {
        this.capacity = capacity;
        transaksi = new TransaksiPengisian[capacity];
        front = size = 0;
        rear = -1;
    }

    public void enqueue(TransaksiPengisian item) {
        if (size == capacity) {
            System.out.println("Antrian Transaksi Penuh!");
            return;
        }
        rear = (rear + 1) % capacity;
        transaksi[rear] = item;
        size++;
    }

    public void tampilkanTransaksi() {
        if (size == 0) {
            System.out.println("Antrian Transaksi Kosong!");
            return;
        }
        System.out.println("Daftar Transaksi Pengisian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            transaksi[index].tampilkan();
        }
    }
}
