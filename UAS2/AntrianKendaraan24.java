package UAS2;

public class AntrianKendaraan24 {
    NodeKendaraan24 head, tail;

    boolean isEmpty() {
       return head == null;
    }

    public void tambahAntrianK(Kendaraan24 data) {
        NodeKendaraan24 newNode = new NodeKendaraan24(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public Kendaraan24 layaniKendaraan(){
        if (isEmpty()) {
            System.out.println(">> Antrian kosong, tidak ada kendaraan yang bisa dilayani.");
            return null;
        }
        Kendaraan24  data = head.data;
        head = head.next;
        if (head == null) {
            tail = null; 
        }
        return data;
    }

    public void tampilkanAntrianK(){
        if (isEmpty()) {
            System.out.println(">> Antrian kosong.");
            return;
        }
        NodeKendaraan24 current = head;
        while (current != null) {
            System.out.println("Plat Nomor: " + current.data.platNomor);
            System.out.println("Tipe: " + current.data.tipe);
            System.out.println("Merk: " + current.data.merk);
            System.out.println();
            current = current.next;
        }
    }

    public int jumlahAntrianK() {
        int count = 0;
        NodeKendaraan24 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
