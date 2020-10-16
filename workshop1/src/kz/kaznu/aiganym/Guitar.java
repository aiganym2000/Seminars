package kz.kaznu.aiganym;

public class Guitar implements Instrument {
    private int cordNumber;

    public Guitar(int cordNumber) {
        this.cordNumber = cordNumber;
    }

    public int getCordNumber() {
        return cordNumber;
    }

    public void play() {
        System.out.println("Играет гитара c количеством струн " + this.getCordNumber());
    }
}
