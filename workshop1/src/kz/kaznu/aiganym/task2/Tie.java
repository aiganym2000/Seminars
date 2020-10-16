package kz.kaznu.aiganym.task2;

public class Tie extends Clothes implements ManClothes{
    public Tie(Sizes size, String color, double cost, String name) {
        super(size, color, cost, name);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина оделся");
    }
}
