package jobsheet_11.TugasJB11;

public class QueueLinkedList {
    NodeMhs front;
    NodeMhs rear;
    int size;
    int capacity;

    public QueueLinkedList(int capacity) {
        this.front = null;
        this.rear = null;
        this.size = 0;
        this.capacity = capacity;
    }

    // Cek apakah antrian kosong
    public boolean isEmpty() {
        return front == null;
    }

    // Cek apakah antrian penuh
    public boolean isFull() {
        return size == capacity;
    }

    // Mengosongkan antrian
    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan!");
    }

    // Menambahkan mahasiswa ke antrian
    public void enqueue(MahasiswaTGS mahasiswa) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan mahasiswa baru.");
            return;
        }

        NodeMhs newNode = new NodeMhs(mahasiswa);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        size++;
        System.out.println("Mahasiswa " + mahasiswa.nama + " berhasil ditambahkan ke antrian.");
    }

    // Memanggil mahasiswa dari antrian
    public MahasiswaTGS dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa untuk dipanggil.");
            return null;
        }

        MahasiswaTGS mahasiswa = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }

        return mahasiswa;
    }

    // Menampilkan mahasiswa terdepan
    public MahasiswaTGS getFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa terdepan.");
            return null;
        }
        return front.data;
    }

    // Menampilkan mahasiswa paling akhir
    public MahasiswaTGS getRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa paling akhir.");
            return null;
        }
        return rear.data;
    }

    // Menampilkan jumlah mahasiswa yang masih mengantri
    public int getSize() {
        return size;
    }

    // Menampilkan semua mahasiswa dalam antrian
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\n=== DAFTAR MAHASISWA DALAM ANTRIAN ===");
        NodeMhs current = front;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.data);
            current = current.next;
            index++;
        }
        System.out.println("=====================================");
    }
}
