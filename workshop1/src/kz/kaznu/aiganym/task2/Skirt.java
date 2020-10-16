package kz.kaznu.aiganym.task2;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(Sizes size, String color, double cost, String name) {
        super(size, color, cost, name);
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина оделась");
    }
}
