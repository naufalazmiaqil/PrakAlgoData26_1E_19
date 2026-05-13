package Jobsheet10;

public class AntrianLayanan19 {
    Mahasiswa19[] data;
    int front, rear, size, max;

    public AntrianLayanan19(int max) {
        this.max = max;
        this.data = new Mahasiswa19[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa19 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public Mahasiswa19 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian Kosong");
            return null;
        }

        Mahasiswa19 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatDepan() {
        if (!IsEmpty()) {
           System.out.println("antrian kosong");
    } else {
        System.out.print("Mahasiswa terdepan : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar ahasiswa dalam antrian : ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }
}