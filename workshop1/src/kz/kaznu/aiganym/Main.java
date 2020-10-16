package kz.kaznu.aiganym;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Drum(100);
        instruments[1] = new Truba(10);
        instruments[2] = new Guitar(6);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
