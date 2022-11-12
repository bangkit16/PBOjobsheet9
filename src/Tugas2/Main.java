package Tugas2;

public class Main {
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        Manusia mns = new Manusia();

        mns.bernafas();
        mns.makan();

        dsn.makan();
        dsn.lembur();

        mhs.makan();
        mhs.tidur();

        
    }
}
