package kz.kaznu.aiganym;

public class Truba implements Instrument {
    private double diametr;

    public Truba(double diametr){
        this.diametr = diametr;
    }

    public double getDiametr(){
        return diametr;
    }

    public void play() {
        System.out.println("Играет труба c диаметром " + this.getDiametr());
    }
}
