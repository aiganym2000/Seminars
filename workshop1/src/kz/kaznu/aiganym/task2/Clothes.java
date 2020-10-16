package kz.kaznu.aiganym.task2;

public abstract class Clothes {
    private String name;
    private Sizes size;
    private double cost;
    private String color;

    public Clothes(Sizes size, String color, double cost, String name) {
        this.size = size;
        this.color = color;
        this.cost = cost;
        this.name = name;
    }

    public Sizes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
