package kz.kaznu.aiganym;

public class Drum implements Instrument {
    private int size;

    public Drum(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public  void play() {
        System.out.println("Играет барабан c размером " + this.getSize());
    }
}
