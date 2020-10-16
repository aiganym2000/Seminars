package kz.kaznu.aiganym.task2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new TShirt(Sizes.XS, "чёрный", 1500, "Футболка");
        clothes[1] = new Pants(Sizes.M, "красный", 5000, "Штаны");
        clothes[2] = new Skirt(Sizes.S, "фиолетовый", 2000, "Юбка");
        clothes[3] = new Tie(Sizes.L, "красный", 800, "Галстук");

        Atelie atelie = new Atelie();
        atelie.dressMan(clothes);
        atelie.dressWoman(clothes);
    }
}
