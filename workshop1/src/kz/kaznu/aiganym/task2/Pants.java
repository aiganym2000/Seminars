package kz.kaznu.aiganym.task2;

public class Pants extends Clothes implements ManClothes, WomanClothes{
    public Pants(Sizes size, String color, double cost, String name) {
        super(size, color, cost, name);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина оделся");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина оделась");
    }
}
