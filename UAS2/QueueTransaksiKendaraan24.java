package UAS2;

public class QueueTransaksiKendaraan24 {
    TransaksiPengisian24[] transaksiBBM;
    int front, rear, size;

    public QueueTransaksiKendaraan24(int capacity) {
        transaksiBBM = new TransaksiPengisian24[capacity];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == transaksiBBM.length;
    }

    public void enqueue(TransaksiPengisian24 data) {
        if (isFull()){
            System.out.println(">> Riwayat transaksi penuh, tidak bisa menambah transaksi baru.");
            return;
        } 
        if  (rear == transaksiBBM.length - 1) {
            rear = -1;
        } 
        transaksiBBM[++rear] = data;
        size++;
        if (front == -1) {
            front = 0;
        }
    }

    public void tampilkanTransaksi(){
        if (isEmpty()) {
            System.out.println("Daftar transaksi kosong.");
            return;
        }
        System.out.println("-- Daftar Transaksi --");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % transaksiBBM.length;
            transaksiBBM[index].tampilkanTransaksiPengisian();
        }
    }


}
