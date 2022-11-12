package Tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        System.out.println("Total Sudut : " + sg.totalSudut(100));
        System.out.println("Total Sudut : " + sg.totalSudut(100 , 20));
        System.out.println("Keliling : " + sg.keliling(10 , 20 , 30));
        System.out.println("Keliling : " + sg.keliling(10 ,40));
    }
}
