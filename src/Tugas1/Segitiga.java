package Tugas1;

public class Segitiga {
    private int sudut = 180;

    public int totalSudut(int sudutA){
        return sudut - sudutA;
    }
    public int totalSudut(int sudutA , int sudutB){
        return sudut - (sudutA + sudutB);
    }
    public int keliling(int sudutA , int sudutB, int sudutC){
        return sudutA + sudutB + sudutC;
    }
    public double keliling(int sudutA , int sudutB){
        double c = (sudutA * sudutA) + (sudutB * sudutB) ;
        return sudutA + sudutB + Math.sqrt(c) ;
    }
}
