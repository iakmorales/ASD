package jobsheet_9;

public class StackTugasMahasiswa24 {
    Mahasiswa24[] stack;
    int top;
    int size;

    public StackTugasMahasiswa24(int size) {
        this.size = size;
        stack = new Mahasiswa24[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa24 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa24 pop() {
        if (!isEmpty()) {
            Mahasiswa24 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa24 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
     if (top == -1) {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return;
    } else {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas );
        }
        System.out.println("");
    }
      
    }

    public void peekBottom() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa yang pertama mengumpulkan tugas adalah " + stack[0].nama);
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
        }
        
    }

    public int getSize() {
        return top + 1;
    }

    public String konversiDesimalKeBiner(int nilai){
        StackKonversi24 stack = new StackKonversi24();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
